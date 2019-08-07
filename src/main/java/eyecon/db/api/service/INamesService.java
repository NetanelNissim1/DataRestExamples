package eyecon.db.api.service;

import java.util.List;
import eyecon.db.api.entities.Names;

public interface INamesService {

	void addName(Names name);

	List<Names> getAllNames();

	List<Names> getByCli(String cli);

	String delete(String cli);

	String deleteByCliAndName(String cli, String name);
}
