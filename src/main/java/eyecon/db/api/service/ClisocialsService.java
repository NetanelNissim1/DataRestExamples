package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eyecon.db.api.dao.ClisocialsRepository;
import eyecon.db.api.entities.Clisocials;

@Service
public class ClisocialsService implements IClisocialsService {

	@Autowired
	private ClisocialsRepository clisocialsRepository;

	@Override
	public void addClisocial(Clisocials clisocial) {
		clisocialsRepository.save(clisocial);
	}

	@Override
	public List<Clisocials> getAllClisocials() {
		List<Clisocials> list = new ArrayList<>();
		clisocialsRepository.findAll().forEach(e -> list.add(e));

		return list;
	}

	@Override
	public List<Clisocials> getByCli(String cli) {
		List<Clisocials> list = new ArrayList<>();
		clisocialsRepository.findByCli(cli).forEach(e -> list.add(e));

		return list;
	}

	@Override
	public List<Clisocials> getByCliAndStype(String cli, int stype) {
		List<Clisocials> list = new ArrayList<>();
		clisocialsRepository.findByCliAndStype(cli, stype).forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Clisocials getByCliAndStypeAndSid(String cli, int stype, String sid) {

		return clisocialsRepository.findByCliAndStypeAndSid(cli, stype, sid);
	}

	@Override
	public String deleteByCli(String cli) {
		clisocialsRepository.deleteAll(clisocialsRepository.findByCli(cli));
		return "deleted";
	}

	@Override
	public String deleteByCliAndStype(String cli, int stype) {
		clisocialsRepository.deleteAll(clisocialsRepository.findByCliAndStype(cli, stype));
		return "deleted";
	}

	@Override
	public String deleteByCliAndStypeAndSid(String cli, int stype, String sid) {
		clisocialsRepository.delete(clisocialsRepository.findByCliAndStypeAndSid(cli, stype, sid));
		return "deleted";
	}

//	@Override
//	public void updateColumnFreshPicFrom(Contacts contact) {
//		// contactsRepository.saveColumnFreshPicFrom(contact.getCli(),
//		// contact.getContactFreshPictype());
//
//		// contactsRepository.save(contact);
//	}
//
//	@Override
//	public void addContact(Contacts contact) {
//
//		contactsRepository.save(contact);
//	}
//
//	@Override
//	public List<Contacts> getAllContacts() {
//		List<Contacts> list = new ArrayList<>();
//		Iterable<Contacts> findAll = contactsRepository.findAll();
//		for(Contacts con: findAll) {
//			list.add(con);
//			
//		}
//		return list;
//	}
//
//	@Override
//	public Contacts getByCli(String cli) {
//		return contactsRepository.findByCli(cli);
//	}
//
//	@Override
//	public Contacts getByCliAndContact(String cli, String contact) {
//		return contactsRepository.findByCliAndContact(cli, contact);
//	}
//
//	@Override
//	public String delete(String cli) {
////		Contacts contact = contactsRepository.getOne(cli);
////		contactsRepository.delete(contact);
//		return "deleted";
//	}
//
//	@Override
//	public String deleteByCliAndContact(String cli, String cliContact) {
//		Contacts contact = contactsRepository.findByCliAndContact(cli, cliContact);
//		contactsRepository.delete(contact);
//		return "deleted";
//	}

}
