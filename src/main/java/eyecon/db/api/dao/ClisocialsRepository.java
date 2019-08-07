package eyecon.db.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Clisocials;

public interface ClisocialsRepository extends CrudRepository<Clisocials, String> {

	List<Clisocials> findByCli(String cli);

	List<Clisocials> findByCliAndStype(String cli, int stype);

	Clisocials findByCliAndStypeAndSid(String cli, int stype, String sid);

}
