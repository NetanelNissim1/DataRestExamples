package eyecon.db.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eyecon.db.api.dao.ContactsRepository;
import eyecon.db.api.entities.Contacts;

@Service
public class ContactsService implements IContactsService {

	@Autowired
	private ContactsRepository contactsRepository;

	@Override
	public void updateColumnFreshPicFrom(Contacts contact) {
		// contactsRepository.saveColumnFreshPicFrom(contact.getCli(),
		// contact.getContactFreshPictype());

		// contactsRepository.save(contact);
	}

	@Override
	public void addContact(Contacts contact) {

		contactsRepository.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> list = new ArrayList<>();
		Iterable<Contacts> findAll = contactsRepository.findAll();
		for(Contacts con: findAll) {
			list.add(con);
			
		}
		return list;
	}

	@Override
	public Contacts getByCli(String cli) {
		return contactsRepository.findByCli(cli);
	}

	@Override
	public Contacts getByCliAndContact(String cli, String contact) {
		return contactsRepository.findByCliAndContact(cli, contact);
	}

	@Override
	public String delete(String cli) {
//		Contacts contact = contactsRepository.getOne(cli);
//		contactsRepository.delete(contact);
		return "deleted";
	}

	@Override
	public String deleteByCliAndContact(String cli, String cliContact) {
		Contacts contact = contactsRepository.findByCliAndContact(cli, cliContact);
		contactsRepository.delete(contact);
		return "deleted";
	}

}
