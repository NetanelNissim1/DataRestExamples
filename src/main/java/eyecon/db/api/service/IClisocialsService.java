package eyecon.db.api.service;

import java.util.List;
import eyecon.db.api.entities.Clisocials;

public interface IClisocialsService {

	void addClisocial(Clisocials clisocial);

	List<Clisocials> getAllClisocials();

	List<Clisocials> getByCli(String cli);

	List<Clisocials> getByCliAndStype(String cli, int stype);

	Clisocials getByCliAndStypeAndSid(String cli, int stype, String sid);

	String deleteByCli(String cli);

	String deleteByCliAndStype(String cli, int stype);

	String deleteByCliAndStypeAndSid(String cli, int stype, String sid);

}
