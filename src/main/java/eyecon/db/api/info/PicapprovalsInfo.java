package eyecon.db.api.info;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PicapprovalsInfo {

	@JsonInclude(Include.NON_NULL)
	private String cli;
	@JsonInclude(Include.NON_NULL)
	private String contact;
	@JsonInclude(Include.NON_NULL)
	private String tag;
	private boolean isApproved;
	@JsonInclude(Include.NON_NULL)
	private Timestamp timestamp;

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

	/**
	 * @return the isApproved
	 */
	public boolean isApproved() {
		return isApproved;
	}

	/**
	 * @param isApproved the isApproved to set
	 */
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "PicapprovalsInfo [cli=" + cli + ", contact=" + contact + ", tag=" + tag + ", isApproved=" + isApproved
				+ ", timestamp=" + timestamp + "]";
	}

}
