package eyecon.db.api.service;

import java.util.List;

import eyecon.db.api.entities.Contacts;

public interface IContactsService {

	void updateColumnFreshPicFrom(Contacts contact);

	void addContact(Contacts contact);

	List<Contacts> getAllContacts();

	Contacts getByCli(String cli);

	Contacts getByCliAndContact(String cli, String contact);
	
	String delete(String cli);

	String deleteByCliAndContact(String cli, String cliContact); 
}
