package eyecon.db.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Picmatch;

public interface PicmatchRepository extends CrudRepository<Picmatch, String> {

	List<Picmatch> findByCli(String cli);

	List<Picmatch> findByCliAndStype(String cli, int stype);

	Picmatch findByCliAndStypeAndSid(String cli, int stype, String sid);
}
