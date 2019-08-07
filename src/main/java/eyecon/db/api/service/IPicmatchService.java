package eyecon.db.api.service;

import java.util.List;

import eyecon.db.api.entities.Picmatch;

public interface IPicmatchService {

	void updateColumnFreshPicFrom(Picmatch picmatch);

	List<Picmatch> getAllPicmatch();

	List<Picmatch> getByCli(String cli);

	List<Picmatch> getByCliAndStype(String cli, int stype);

	Picmatch getByCliAndStypeAndSid(String cli, int stype, String sid);

	String delete(String cli);

	String deleteByCliAndStype(String cli, int stype);

	String deleteByCliAndStypeAndSid(String cli, int stype, String sid);
	
	void addPicmatch(Picmatch picmatch);
}
