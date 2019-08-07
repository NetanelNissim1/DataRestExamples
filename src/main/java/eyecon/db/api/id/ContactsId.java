package eyecon.db.api.id;

import java.io.Serializable;

public class ContactsId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cli;
	private String contact;

	public ContactsId() {
	}

	public ContactsId(String cli, String contact) {

		this.cli = cli;
		this.contact = contact;
	}

	/**
	 * @return the cli
	 */
	public String getCli() {
		return cli;
	}

	/**
	 * @param cli the cli to set
	 */
	public void setCli(String cli) {
		this.cli = cli;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
