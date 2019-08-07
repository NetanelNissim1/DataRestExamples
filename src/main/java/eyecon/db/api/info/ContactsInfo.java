package eyecon.db.api.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ContactsInfo {

	@JsonInclude(Include.NON_NULL)
	private String cli;
	@JsonInclude(Include.NON_NULL)
	private String contact;
	private String contactName;
	private String contactLang;
	private int contactFreshPictype;
	private boolean anythingNew;
	private boolean hadPic;
	private int canTalkStatus;
	private String socialdata;
	private String tag;

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

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * @return the contactLang
	 */
	public String getContactLang() {
		return contactLang;
	}

	/**
	 * @param contactLang the contactLang to set
	 */
	public void setContactLang(String contactLang) {
		this.contactLang = contactLang;
	}

	/**
	 * @return the contactFreshPictype
	 */
	public int getContactFreshPictype() {
		return contactFreshPictype;
	}

	/**
	 * @param contactFreshPictype the contactFreshPictype to set
	 */
	public void setContactFreshPictype(int contactFreshPictype) {
		this.contactFreshPictype = contactFreshPictype;
	}

	/**
	 * @return the anythingNew
	 */
	public boolean isAnythingNew() {
		return anythingNew;
	}

	/**
	 * @param anythingNew the anythingNew to set
	 */
	public void setAnythingNew(boolean anythingNew) {
		this.anythingNew = anythingNew;
	}

	/**
	 * @return the hadPic
	 */
	public boolean isHadPic() {
		return hadPic;
	}

	/**
	 * @param hadPic the hadPic to set
	 */
	public void setHadPic(boolean hadPic) {
		this.hadPic = hadPic;
	}

	/**
	 * @return the canTalkStatus
	 */
	public int getCanTalkStatus() {
		return canTalkStatus;
	}

	/**
	 * @param canTalkStatus the canTalkStatus to set
	 */
	public void setCanTalkStatus(int canTalkStatus) {
		this.canTalkStatus = canTalkStatus;
	}

	/**
	 * @return the socialdata
	 */
	public String getSocialdata() {
		return socialdata;
	}

	/**
	 * @param socialdata the socialdata to set
	 */
	public void setSocialdata(String socialdata) {
		this.socialdata = socialdata;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "ContactsInfo [cli=" + cli + ", contact=" + contact + ", contactName=" + contactName + ", contactLang="
				+ contactLang + ", contactFreshPictype=" + contactFreshPictype + ", anythingNew=" + anythingNew
				+ ", hadPic=" + hadPic + ", canTalkStatus=" + canTalkStatus + ", socialdata=" + socialdata + ", tag="
				+ tag + "]";
	}

}
