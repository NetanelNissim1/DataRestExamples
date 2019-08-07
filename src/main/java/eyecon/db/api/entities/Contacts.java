// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import eyecon.db.api.id.ContactsId;

@Entity
@IdClass(ContactsId.class)
@Table(name = "contacts", indexes = { @Index(name = "contactsPrimary", columnList = "cli,contact", unique = true) })
public class Contacts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3095072987067086865L;
	
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
	@Column(name = "contact_fresh_pictype", precision = 10)
	private int contactFreshPictype;
	@Column(name = "anything_new", length = 3)
	private boolean anythingNew;
	@Column(name = "had_pic", length = 3)
	private boolean hadPic;
	@Column(name = "can_talk_status", precision = 10)
	private int canTalkStatus;
	private String socialdata;
	@Column(length = 200)
	private String tag;

	/** Default constructor. */
	public Contacts() {
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
	 * Access method for anythingNew.
	 *
	 * @return true if and only if anythingNew is currently true
	 */
	public boolean getAnythingNew() {
		return anythingNew;
	}

	/**
	 * Setter method for anythingNew.
	 *
	 * @param aAnythingNew the new value for anythingNew
	 */
	public void setAnythingNew(boolean aAnythingNew) {
		anythingNew = aAnythingNew;
	}

	/**
	 * Access method for hadPic.
	 *
	 * @return true if and only if hadPic is currently true
	 */
	public boolean getHadPic() {
		return hadPic;
	}

	/**
	 * Setter method for hadPic.
	 *
	 * @param aHadPic the new value for hadPic
	 */
	public void setHadPic(boolean aHadPic) {
		hadPic = aHadPic;
	}

	/**
	 * Access method for canTalkStatus.
	 *
	 * @return the current value of canTalkStatus
	 */
	public int getCanTalkStatus() {
		return canTalkStatus;
	}

	/**
	 * Setter method for canTalkStatus.
	 *
	 * @param aCanTalkStatus the new value for canTalkStatus
	 */
	public void setCanTalkStatus(int aCanTalkStatus) {
		canTalkStatus = aCanTalkStatus;
	}

	/**
	 * Access method for socialdata.
	 *
	 * @return the current value of socialdata
	 */
	public String getSocialdata() {
		return socialdata;
	}

	/**
	 * Setter method for socialdata.
	 *
	 * @param aSocialdata the new value for socialdata
	 */
	public void setSocialdata(String aSocialdata) {
		socialdata = aSocialdata;
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
		return "Contacts [cli=" + cli + ", contact=" + contact + ", contactName=" + contactName + ", contactLang="
				+ contactLang + ", contactFreshPictype=" + contactFreshPictype + ", anythingNew=" + anythingNew
				+ ", hadPic=" + hadPic + ", canTalkStatus=" + canTalkStatus + ", socialdata=" + socialdata + ", tag="
				+ tag + "]";
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
