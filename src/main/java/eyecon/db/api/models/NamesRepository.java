package eyecon.db.api.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Names;

public interface NamesRepository extends CrudRepository<Names, String> {

//	@Modifying
//	@Query("UPDATE Contacts c SET c.contactFreshPictype = :contactFreshPictype WHERE c.contact= :cli AND c.cli <> c.contact")
//	void saveColumnFreshPicFrom(@Param("cli") String cli, @Param("contactFreshPictype") int contactFreshPictype);
    
	List<Names> findByCli(String cli);
	
	List<Names> findByCliAndName(String cli, String name);
	
	Names findByCliAndNameAndLang(String cli, String name, String lang);
	
	Names findByCliAndNameAndLangAndChosenByType(String cli, String name, String lang, int chosenByType);
	
	//Contacts getOne(String cli, String contact);
}
