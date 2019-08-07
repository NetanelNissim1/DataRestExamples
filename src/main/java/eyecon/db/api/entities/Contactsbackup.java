// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "contactsbackup", indexes = {
		@Index(name = "contactsbackupPrimary", columnList = "cli,contact", unique = true) })
public class Contactsbackup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8384638361225691509L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 30)
	private String contact;
	@Column(name = "contact_name", length = 191)
	private String contactName;
	@Column(name = "contact_lang", length = 10)
	private String contactLang;
	@Column(length = 200)
	private String tag;

	/** Default constructor. */
	public Contactsbackup() {
		super();
	}

	/**
	 * Access method for cli.
	 *
	 * @return the current value of cli
	 */
	public String getCli() {
		return cli;
	}

	/**
	 * Setter method for cli.
	 *
	 * @param aCli the new value for cli
	 */
	public void setCli(String aCli) {
		cli = aCli;
	}

	/**
	 * Access method for contact.
	 *
	 * @return the current value of contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * Setter method for contact.
	 *
	 * @param aContact the new value for contact
	 */
	public void setContact(String aContact) {
		contact = aContact;
	}

	/**
	 * Access method for contactName.
	 *
	 * @return the current value of contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * Setter method for contactName.
	 *
	 * @param aContactName the new value for contactName
	 */
	public void setContactName(String aContactName) {
		contactName = aContactName;
	}

	/**
	 * Access method for contactLang.
	 *
	 * @return the current value of contactLang
	 */
	public String getContactLang() {
		return contactLang;
	}

	/**
	 * Setter method for contactLang.
	 *
	 * @param aContactLang the new value for contactLang
	 */
	public void setContactLang(String aContactLang) {
		contactLang = aContactLang;
	}

	/**
	 * Access method for tag.
	 *
	 * @return the current value of tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * Setter method for tag.
	 *
	 * @param aTag the new value for tag
	 */
	public void setTag(String aTag) {
		tag = aTag;
	}

	@Override
	public String toString() {
		return "Contactsbackup [cli=" + cli + ", contact=" + contact + ", contactName=" + contactName + ", contactLang="
				+ contactLang + ", tag=" + tag + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
