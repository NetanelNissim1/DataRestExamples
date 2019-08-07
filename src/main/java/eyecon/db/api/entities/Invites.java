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
@Table(name = "invites", indexes = { @Index(name = "invites_invitee_IX", columnList = "invitee", unique = true) })
public class Invites implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4790102258256757754L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String invitee;
	@Column(nullable = false, length = 30)
	private String inviter;
	@Column(nullable = false)
	private Timestamp ts;
	@Column(name = "is_installed", length = 3)
	private boolean isInstalled;

	/** Default constructor. */
	public Invites() {
		super();
	}

	/**
	 * Access method for invitee.
	 *
	 * @return the current value of invitee
	 */
	public String getInvitee() {
		return invitee;
	}

	/**
	 * Setter method for invitee.
	 *
	 * @param aInvitee the new value for invitee
	 */
	public void setInvitee(String aInvitee) {
		invitee = aInvitee;
	}

	/**
	 * Access method for inviter.
	 *
	 * @return the current value of inviter
	 */
	public String getInviter() {
		return inviter;
	}

	/**
	 * Setter method for inviter.
	 *
	 * @param aInviter the new value for inviter
	 */
	public void setInviter(String aInviter) {
		inviter = aInviter;
	}

	/**
	 * Access method for ts.
	 *
	 * @return the current value of ts
	 */
	public Timestamp getTs() {
		return ts;
	}

	/**
	 * Setter method for ts.
	 *
	 * @param aTs the new value for ts
	 */
	public void setTs(Timestamp aTs) {
		ts = aTs;
	}

	/**
	 * Access method for isInstalled.
	 *
	 * @return true if and only if isInstalled is currently true
	 */
	public boolean getIsInstalled() {
		return isInstalled;
	}

	/**
	 * Setter method for isInstalled.
	 *
	 * @param aIsInstalled the new value for isInstalled
	 */
	public void setIsInstalled(boolean aIsInstalled) {
		isInstalled = aIsInstalled;
	}

	@Override
	public String toString() {
		return "Invites [invitee=" + invitee + ", inviter=" + inviter + ", ts=" + ts + ", isInstalled=" + isInstalled
				+ "]";
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
