package eyecon.db.api.service;

import java.util.List;
import eyecon.db.api.entities.Users;

public interface IUserService {

	Users findByCli(String cli);

	Users findByClientId(String clientId);

	List<Users> findAll();

	Users findByCliCheckBlockUser(String cli, String device_name);

	void addUser(Users user);

	String delete(String clientId);

	void updateUserColumnNlikes(String cli);
	
	String toBeNotifyQuery(String cli);

}
