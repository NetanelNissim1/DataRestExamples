// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import eyecon.db.api.id.PicapprovalsId;

@Entity
@Table(name = "picapprovals", indexes = {
		@Index(name = "picapprovalsPrimary", columnList = "cli,contact,tag", unique = true) })
@IdClass(PicapprovalsId.class)
public class Picapprovals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6634411011956185110L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 30)
	private String contact;
	@Id
	@Column(nullable = false, length = 200)
	private String tag;
	@Column(name = "is_approved", nullable = false, length = 3)
	private boolean isApproved;
	@Column(nullable = false)
	private Timestamp timestamp;

	/** Default constructor. */
	public Picapprovals() {
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

	/**
	 * Access method for isApproved.
	 *
	 * @return true if and only if isApproved is currently true
	 */
	public boolean getIsApproved() {
		return isApproved;
	}

	/**
	 * Setter method for isApproved.
	 *
	 * @param aIsApproved the new value for isApproved
	 */
	public void setIsApproved(boolean aIsApproved) {
		isApproved = aIsApproved;
	}

	/**
	 * Access method for timestamp.
	 *
	 * @return the current value of timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * Setter method for timestamp.
	 *
	 * @param aTimestamp the new value for timestamp
	 */
	public void setTimestamp(Timestamp aTimestamp) {
		timestamp = aTimestamp;
	}

	@Override
	public String toString() {
		return "Picapprovals [cli=" + cli + ", contact=" + contact + ", tag=" + tag + ", isApproved=" + isApproved
				+ ", timestamp=" + timestamp + "]";
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
