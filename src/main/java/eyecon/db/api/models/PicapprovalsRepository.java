package eyecon.db.api.models;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import eyecon.db.api.entities.Picapprovals;

public interface PicapprovalsRepository extends CrudRepository<Picapprovals, String> {

	List<Picapprovals> findByCli(String cli);

	List<Picapprovals> findByCliAndContact(String cli, String contact);

	Picapprovals findByCliAndContactAndTag(String cli, String contact, String tag);
}
