package eyecon.db.api.service;

import java.util.List;
import eyecon.db.api.entities.Picapprovals;

public interface IPicapprovalsService {

	List<Picapprovals> getAllPicapprovals();

	List<Picapprovals> getByCli(String cli);

	List<Picapprovals> getByCliAndContact(String cli, String contact);

	Picapprovals getByCliAndContactAndTag(String cli, String contact, String tag);

	String delete(String cli);

	String deleteByCliAndContact(String cli, String contact);

	String deleteByCliAndContactAndTag(String cli, String contact, String tag);

	void addPicapproval(Picapprovals picapproval);
}
