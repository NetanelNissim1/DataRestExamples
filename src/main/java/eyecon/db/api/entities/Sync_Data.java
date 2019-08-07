// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "sync_data", indexes = { @Index(name = "sync_data_id_IX", columnList = "id", unique = true),
		@Index(name = "syncDataCli_emailUnique", columnList = "cli,email", unique = true) })
public class Sync_Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3593877565727495880L;
	@Id
	@Column(unique = true, nullable = false, precision = 20)
	private long id;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 254)
	private String email;
	@Column(name = "g_status", nullable = false, length = 3)
	private boolean gStatus;
	@Column(name = "f_status", nullable = false, length = 3)
	private boolean fStatus;
	@Column(name = "vk_status", nullable = false, length = 3)
	private boolean vkStatus;
	@Column(name = "li_status", nullable = false, length = 3)
	private boolean liStatus;

	/** Default constructor. */
	public Sync_Data() {
		super();
	}

	/**
	 * Access method for id.
	 *
	 * @return the current value of id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter method for id.
	 *
	 * @param aId the new value for id
	 */
	public void setId(long aId) {
		id = aId;
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
	 * Access method for gStatus.
	 *
	 * @return true if and only if gStatus is currently true
	 */
	public boolean getGStatus() {
		return gStatus;
	}

	/**
	 * Setter method for gStatus.
	 *
	 * @param aGStatus the new value for gStatus
	 */
	public void setGStatus(boolean aGStatus) {
		gStatus = aGStatus;
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
	 * Access method for vkStatus.
	 *
	 * @return true if and only if vkStatus is currently true
	 */
	public boolean getVkStatus() {
		return vkStatus;
	}

	/**
	 * Setter method for vkStatus.
	 *
	 * @param aVkStatus the new value for vkStatus
	 */
	public void setVkStatus(boolean aVkStatus) {
		vkStatus = aVkStatus;
	}

	/**
	 * Access method for liStatus.
	 *
	 * @return true if and only if liStatus is currently true
	 */
	public boolean getLiStatus() {
		return liStatus;
	}

	/**
	 * Setter method for liStatus.
	 *
	 * @param aLiStatus the new value for liStatus
	 */
	public void setLiStatus(boolean aLiStatus) {
		liStatus = aLiStatus;
	}

	@Override
	public String toString() {
		return "Sync_Data [id=" + id + ", cli=" + cli + ", email=" + email + ", gStatus=" + gStatus + ", fStatus="
				+ fStatus + ", vkStatus=" + vkStatus + ", liStatus=" + liStatus + "]";
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
