package eyecon.db.api.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import eyecon.db.api.entities.Users;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends CrudRepository<Users, String> {

	Users getOne(String clientId);

	Users findByCli(String cli);

	Users findByClientId(String clientId);

//	// @Query("from Alien where tech=?1 order by aname")
//	// @Query("FROM Users WHERE cli=?1")
	@Query("SELECT u.clientId, u.osType, u.clientVerIncrement, u.blockingReason, unix_timestamp(u.lastJoinTime) AS last_join_time, (CASE WHEN u.deviceName=?2 THEN true ELSE false END) AS is_same_device_name, (CASE WHEN u.lastJoinTime=u.creationTime THEN true ELSE false END) AS is_first_rejoin FROM Users u WHERE u.cli=?1")
	public String findByCliCheckBlockUser(String cli, String device_name);

	@Query("UPDATE Users SET nlikes = 0 WHERE cli=?1")
	void updateUserColumnNlikes(String cli);

	@Query("SELECT t1.cli FROM Users t1 left join Contacts t2 on t1.cli = t2.cli where t2.contact =?1")
	String toBeNotifyQuery(String cli);
}
