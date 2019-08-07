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
@Table(name = "sync_data2", indexes = { @Index(name = "syncData2Primary", columnList = "cli,email", unique = true) })
public class Sync_Data2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6587407706797701160L;
	@Id
	@Column(nullable = false, precision = 20)
	private long cli;
	@Id
	@Column(nullable = false, length = 254)
	private String email;
	@Column(name = "f_status", length = 3)
	private boolean fStatus;
	@Column(name = "last_update")
	private Timestamp lastUpdate;

	/** Default constructor. */
	public Sync_Data2() {
		super();
	}

	/**
	 * Access method for cli.
	 *
	 * @return the current value of cli
	 */
	public long getCli() {
		return cli;
	}

	/**
	 * Setter method for cli.
	 *
	 * @param aCli the new value for cli
	 */
	public void setCli(long aCli) {
		cli = aCli;
	}

	/**
	 * Access method for email.
	 *
	 * @return the current value of email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for email.
	 *
	 * @param aEmail the new value for email
	 */
	public void setEmail(String aEmail) {
		email = aEmail;
	}

	/**
	 * Access method for fStatus.
	 *
	 * @return true if and only if fStatus is currently true
	 */
	public boolean getFStatus() {
		return fStatus;
	}

	/**
	 * Setter method for fStatus.
	 *
	 * @param aFStatus the new value for fStatus
	 */
	public void setFStatus(boolean aFStatus) {
		fStatus = aFStatus;
	}

	/**
	 * Access method for lastUpdate.
	 *
	 * @return the current value of lastUpdate
	 */
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Setter method for lastUpdate.
	 *
	 * @param aLastUpdate the new value for lastUpdate
	 */
	public void setLastUpdate(Timestamp aLastUpdate) {
		lastUpdate = aLastUpdate;
	}

	@Override
	public String toString() {
		return "Sync_Data2 [cli=" + cli + ", email=" + email + ", fStatus=" + fStatus + ", lastUpdate=" + lastUpdate
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
