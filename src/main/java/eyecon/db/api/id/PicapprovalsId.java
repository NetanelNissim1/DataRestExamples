package eyecon.db.api.id;

import java.io.Serializable;

public class PicapprovalsId implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cli;
	private String contact;
	private String tag;

	public PicapprovalsId() {
	}

	public PicapprovalsId(String cli, String contact, String tag) {
		this.cli = cli;
		this.contact = contact;
		this.tag = tag;
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

}
