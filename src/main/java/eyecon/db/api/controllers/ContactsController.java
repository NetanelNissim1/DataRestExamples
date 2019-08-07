package eyecon.db.api.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import eyecon.db.api.entities.Contacts;
import eyecon.db.api.info.ContactsInfo;
import eyecon.db.api.service.IContactsService;

@RestController
@RequestMapping("contact")
public class ContactsController {

	private static final Logger log = LoggerFactory.getLogger(ContactsController.class);

	@Autowired
	private IContactsService contactsService;

	@PostMapping(value = "addContact")
	public ResponseEntity<Void> addContact(@RequestBody ContactsInfo contactInfo, UriComponentsBuilder builder) {

		Contacts contact = new Contacts();
		
		BeanUtils.copyProperties(contactInfo, contact);
		contactsService.addContact(contact);
		log.debug(contact.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("contact/addContact/{cli}").buildAndExpand(contact.getCli()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "contacts")
	public ResponseEntity<List<ContactsInfo>> getAllContact() {

		List<ContactsInfo> responseContactList = new ArrayList<>();
		List<Contacts> contactList = contactsService.getAllContacts();

		for (Contacts contact : contactList) {  
			ContactsInfo ob = new ContactsInfo();
			log.debug(contact.toString());
			// System.out.println(user.getCli());

			BeanUtils.copyProperties(contact, ob);
			responseContactList.add(ob);
		}

		return new ResponseEntity<List<ContactsInfo>>(responseContactList, HttpStatus.OK);
	}
	
	@GetMapping(value = "getContactByCli/{cli}")
	public ResponseEntity<ContactsInfo> getContactByCli(@PathVariable("cli") String cli) {

		Contacts contact = contactsService.getByCli(cli);
		ContactsInfo responseContact = new ContactsInfo();
		BeanUtils.copyProperties(contact, responseContact);
		log.debug(contact.toString());
		return new ResponseEntity<ContactsInfo>(responseContact, HttpStatus.OK);
	}
	
	@GetMapping(value = "getContactByCliAndContact/{cli}/{contact}")
	public ResponseEntity<ContactsInfo> findByCliAndContact(@PathVariable("cli") String cli,@PathVariable("contact") String cliContact) {

		Contacts contact = contactsService.getByCliAndContact(cli,cliContact);
		ContactsInfo responseContact = new ContactsInfo();
		BeanUtils.copyProperties(contact, responseContact);
		log.debug(contact.toString());
		return new ResponseEntity<ContactsInfo>(responseContact, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "deletebycli/{cli}")
	public String deleteContact(@PathVariable("cli") String cli) {
		return contactsService.delete(cli);
	}
	
	@DeleteMapping(value = "deletebycliandcontact/{cli}/{contact}")
	public String deleteContacts(@PathVariable("cli") String cli, @PathVariable("contact") String cliContact) {
		return contactsService.deleteByCliAndContact(cli, cliContact);
	}
}
