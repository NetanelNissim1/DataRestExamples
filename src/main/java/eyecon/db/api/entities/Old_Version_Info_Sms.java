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
@Table(name = "old_version_info_sms", indexes = {
		@Index(name = "old_version_info_sms_cli_IX", columnList = "cli", unique = true) })
public class Old_Version_Info_Sms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7584877092682677358L;
	@Id
	@Column(unique = true, nullable = false, precision = 20)
	private long cli;
	@Column(name = "last_update", nullable = false)
	private Timestamp lastUpdate;
	@Column(name = "client_ver_string", length = 50)
	private String clientVerString;
	@Column(name = "sms_provider_id", precision = 10)
	private int smsProviderId;
	@Column(name = "sms_id", length = 40)
	private String smsId;

	/** Default constructor. */
	public Old_Version_Info_Sms() {
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
	 * Access method for clientVerString.
	 *
	 * @return the current value of clientVerString
	 */
	public String getClientVerString() {
		return clientVerString;
	}

	/**
	 * Setter method for clientVerString.
	 *
	 * @param aClientVerString the new value for clientVerString
	 */
	public void setClientVerString(String aClientVerString) {
		clientVerString = aClientVerString;
	}

	/**
	 * Access method for smsProviderId.
	 *
	 * @return the current value of smsProviderId
	 */
	public int getSmsProviderId() {
		return smsProviderId;
	}

	/**
	 * Setter method for smsProviderId.
	 *
	 * @param aSmsProviderId the new value for smsProviderId
	 */
	public void setSmsProviderId(int aSmsProviderId) {
		smsProviderId = aSmsProviderId;
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

	@Override
	public String toString() {
		return "Old_Version_Info_Sms [cli=" + cli + ", lastUpdate=" + lastUpdate + ", clientVerString="
				+ clientVerString + ", smsProviderId=" + smsProviderId + ", smsId=" + smsId + "]";
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
