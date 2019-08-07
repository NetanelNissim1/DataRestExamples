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
@Table(name = "notification_timestamp", indexes = {
		@Index(name = "notification_timestamp_cli_IX", columnList = "cli", unique = true) })
public class Notification_Timestamp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5508342226119462591L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(nullable = false)
	private Timestamp timestamp;
	@Column(name = "is_clicked")
	private Timestamp isClicked;
	@Column(name = "is_invalidated", length = 3)
	private boolean isInvalidated;

	/** Default constructor. */
	public Notification_Timestamp() {
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

	/**
	 * Access method for isClicked.
	 *
	 * @return the current value of isClicked
	 */
	public Timestamp getIsClicked() {
		return isClicked;
	}

	/**
	 * Setter method for isClicked.
	 *
	 * @param aIsClicked the new value for isClicked
	 */
	public void setIsClicked(Timestamp aIsClicked) {
		isClicked = aIsClicked;
	}

	/**
	 * Access method for isInvalidated.
	 *
	 * @return true if and only if isInvalidated is currently true
	 */
	public boolean getIsInvalidated() {
		return isInvalidated;
	}

	/**
	 * Setter method for isInvalidated.
	 *
	 * @param aIsInvalidated the new value for isInvalidated
	 */
	public void setIsInvalidated(boolean aIsInvalidated) {
		isInvalidated = aIsInvalidated;
	}

	@Override
	public String toString() {
		return "Notification_Timestamp [cli=" + cli + ", timestamp=" + timestamp + ", isClicked=" + isClicked
				+ ", isInvalidated=" + isInvalidated + "]";
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
