package eyecon.db.api.models;

import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Contacts;

public interface ContactsRepository extends CrudRepository<Contacts, String> {

//	@Modifying
//	@Query("UPDATE Contacts c SET c.contactFreshPictype = :contactFreshPictype WHERE c.contact= :cli AND c.cli <> c.contact")
//	void saveColumnFreshPicFrom(@Param("cli") String cli, @Param("contactFreshPictype") int contactFreshPictype);
    
	Contacts findByCli(String cli);
	
	Contacts findByCliAndContact(String cli, String contact);
	
	//Contacts getOne(String cli);
	
	//Contacts getOne(String cli, String contact);
}
