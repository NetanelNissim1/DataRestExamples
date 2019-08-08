package eyecon.db.api.models;

import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Srcpictype;

public interface SrcpictypeRepository extends CrudRepository<Srcpictype, String> {

//	@Modifying
//	@Query("insert into Srcpictype (cli, srcPictype) values (:cli,1)")
//	void saveSrcPicType(@Param("cli") String cli);
}
