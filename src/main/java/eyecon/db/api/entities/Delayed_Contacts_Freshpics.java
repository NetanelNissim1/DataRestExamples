// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "delayed_contacts_freshpics", indexes = {
		@Index(name = "delayedContactsFreshpicsPrimary", columnList = "cli,contact", unique = true) })
public class Delayed_Contacts_Freshpics implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6458268638489811360L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 30)
	private String contact;
	@Column(name = "contact_fresh_pictype", nullable = false, precision = 10)
	private int contactFreshPictype;
	@Column(name = "ts_to_take_off", nullable = false)
	private Timestamp tsToTakeOff;

	/** Default constructor. */
	public Delayed_Contacts_Freshpics() {
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
	 * Access method for contactFreshPictype.
	 *
	 * @return the current value of contactFreshPictype
	 */
	public int getContactFreshPictype() {
		return contactFreshPictype;
	}

	/**
	 * Setter method for contactFreshPictype.
	 *
	 * @param aContactFreshPictype the new value for contactFreshPictype
	 */
	public void setContactFreshPictype(int aContactFreshPictype) {
		contactFreshPictype = aContactFreshPictype;
	}

	/**
	 * Access method for tsToTakeOff.
	 *
	 * @return the current value of tsToTakeOff
	 */
	public Timestamp getTsToTakeOff() {
		return tsToTakeOff;
	}

	/**
	 * Setter method for tsToTakeOff.
	 *
	 * @param aTsToTakeOff the new value for tsToTakeOff
	 */
	public void setTsToTakeOff(Timestamp aTsToTakeOff) {
		tsToTakeOff = aTsToTakeOff;
	}

	@Override
	public String toString() {
		return "Delayed_Contacts_Freshpics [cli=" + cli + ", contact=" + contact + ", contactFreshPictype="
				+ contactFreshPictype + ", tsToTakeOff=" + tsToTakeOff + "]";
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
