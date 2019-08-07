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
@Table(name = "auth_sms_delivery", indexes = {
		@Index(name = "authSmsDeliveryIsFinal_cli", columnList = "is_final_status,cli"),
		@Index(name = "authSmsDeliveryPrimary", columnList = "provider_id,sms_id", unique = true) })
public class Auth_Sms_Delivery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 884343730365559784L;
	@Id
	@Column(name = "provider_id", nullable = false, precision = 10)
	private int providerId;
	@Id
	@Column(name = "sms_id", nullable = false, length = 40)
	private String smsId;
	@Column(nullable = false, precision = 19)
	private long cli;
	@Column(name = "cli_cc", nullable = false, length = 5)
	private String cliCc;
	@Column(nullable = false, length = 3)
	private boolean status;
	@Column(name = "is_final_status", nullable = false, length = 3)
	private boolean isFinalStatus;
	@Column(nullable = false)
	private Timestamp created;
	@Column(name = "last_update", nullable = false)
	private Timestamp lastUpdate;
	@Column(length = 300)
	private String description;

	/** Default constructor. */
	public Auth_Sms_Delivery() {
		super();
	}

	/**
	 * Access method for providerId.
	 *
	 * @return the current value of providerId
	 */
	public int getProviderId() {
		return providerId;
	}

	/**
	 * Setter method for providerId.
	 *
	 * @param aProviderId the new value for providerId
	 */
	public void setProviderId(int aProviderId) {
		providerId = aProviderId;
	}

	/**
	 * Access method for smsId.
	 *
	 * @return the current value of smsId
	 */
	public String getSmsId() {
		return smsId;
	}

	/**
	 * Setter method for smsId.
	 *
	 * @param aSmsId the new value for smsId
	 */
	public void setSmsId(String aSmsId) {
		smsId = aSmsId;
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
	 * Access method for cliCc.
	 *
	 * @return the current value of cliCc
	 */
	public String getCliCc() {
		return cliCc;
	}

	/**
	 * Setter method for cliCc.
	 *
	 * @param aCliCc the new value for cliCc
	 */
	public void setCliCc(String aCliCc) {
		cliCc = aCliCc;
	}

	/**
	 * Access method for status.
	 *
	 * @return true if and only if status is currently true
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * Setter method for status.
	 *
	 * @param aStatus the new value for status
	 */
	public void setStatus(boolean aStatus) {
		status = aStatus;
	}

	/**
	 * Access method for isFinalStatus.
	 *
	 * @return true if and only if isFinalStatus is currently true
	 */
	public boolean getIsFinalStatus() {
		return isFinalStatus;
	}

	/**
	 * Setter method for isFinalStatus.
	 *
	 * @param aIsFinalStatus the new value for isFinalStatus
	 */
	public void setIsFinalStatus(boolean aIsFinalStatus) {
		isFinalStatus = aIsFinalStatus;
	}

	/**
	 * Access method for created.
	 *
	 * @return the current value of created
	 */
	public Timestamp getCreated() {
		return created;
	}

	/**
	 * Setter method for created.
	 *
	 * @param aCreated the new value for created
	 */
	public void setCreated(Timestamp aCreated) {
		created = aCreated;
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

	/**
	 * Access method for description.
	 *
	 * @return the current value of description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter method for description.
	 *
	 * @param aDescription the new value for description
	 */
	public void setDescription(String aDescription) {
		description = aDescription;
	}

	@Override
	public String toString() {
		return "Auth_Sms_Delivery [providerId=" + providerId + ", smsId=" + smsId + ", cli=" + cli + ", cliCc=" + cliCc
				+ ", status=" + status + ", isFinalStatus=" + isFinalStatus + ", created=" + created + ", lastUpdate="
				+ lastUpdate + ", description=" + description + "]";
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
