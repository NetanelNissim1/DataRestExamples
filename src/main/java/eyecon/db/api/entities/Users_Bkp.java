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
@Table(name = "users_bkp", indexes = { @Index(name = "users_bkp_client_id_IX", columnList = "client_id", unique = true),
		@Index(name = "users_bkp_cli_IX", columnList = "cli", unique = true),
		@Index(name = "users_bkp_public_id_IX", columnList = "public_id", unique = true) })
public class Users_Bkp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3338277642854475974L;
	@Id
	@Column(name = "client_id", unique = true, nullable = false, length = 50)
	private String clientId;
	@Column(name = "g_reg_id", length = 500)
	private String gRegId;
	@Column(name = "a_reg_id", length = 500)
	private String aRegId;
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(name = "device_name", length = 50)
	private String deviceName;
	@Column(length = 100)
	private String os;
	@Column(name = "os_type", precision = 10)
	private int osType;
	@Column(name = "client_ver", length = 50)
	private String clientVer;
	@Column(name = "client_ver_increment", nullable = false, precision = 10)
	private int clientVerIncrement;
	@Column(name = "creation_time", nullable = false)
	private Timestamp creationTime;
	@Column(name = "last_join_time", nullable = false)
	private Timestamp lastJoinTime;
	@Column(name = "creation_ip", length = 20)
	private String creationIp;
	@Column(name = "blocking_reason", length = 20)
	private String blockingReason;
	@Column(name = "n_unview_pics", precision = 10)
	private int nUnviewPics;
	@Column(name = "user_lang", length = 10)
	private String userLang;
	@Column(name = "anything_new", length = 3)
	private boolean anythingNew;
	@Column(name = "cli_cc", length = 3)
	private String cliCc;
	@Column(precision = 10)
	private int nlikes;
	@Column(name = "adv_id", length = 80)
	private String advId;
	@Column(name = "public_id", unique = true, length = 50)
	private String publicId;

	/** Default constructor. */
	public Users_Bkp() {
		super();
	}

	/**
	 * Access method for clientId.
	 *
	 * @return the current value of clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * Setter method for clientId.
	 *
	 * @param aClientId the new value for clientId
	 */
	public void setClientId(String aClientId) {
		clientId = aClientId;
	}

	/**
	 * Access method for gRegId.
	 *
	 * @return the current value of gRegId
	 */
	public String getGRegId() {
		return gRegId;
	}

	/**
	 * Setter method for gRegId.
	 *
	 * @param aGRegId the new value for gRegId
	 */
	public void setGRegId(String aGRegId) {
		gRegId = aGRegId;
	}

	/**
	 * Access method for aRegId.
	 *
	 * @return the current value of aRegId
	 */
	public String getARegId() {
		return aRegId;
	}

	/**
	 * Setter method for aRegId.
	 *
	 * @param aARegId the new value for aRegId
	 */
	public void setARegId(String aARegId) {
		aRegId = aARegId;
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
	 * Access method for deviceName.
	 *
	 * @return the current value of deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * Setter method for deviceName.
	 *
	 * @param aDeviceName the new value for deviceName
	 */
	public void setDeviceName(String aDeviceName) {
		deviceName = aDeviceName;
	}

	/**
	 * Access method for os.
	 *
	 * @return the current value of os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * Setter method for os.
	 *
	 * @param aOs the new value for os
	 */
	public void setOs(String aOs) {
		os = aOs;
	}

	/**
	 * Access method for osType.
	 *
	 * @return the current value of osType
	 */
	public int getOsType() {
		return osType;
	}

	/**
	 * Setter method for osType.
	 *
	 * @param aOsType the new value for osType
	 */
	public void setOsType(int aOsType) {
		osType = aOsType;
	}

	/**
	 * Access method for clientVer.
	 *
	 * @return the current value of clientVer
	 */
	public String getClientVer() {
		return clientVer;
	}

	/**
	 * Setter method for clientVer.
	 *
	 * @param aClientVer the new value for clientVer
	 */
	public void setClientVer(String aClientVer) {
		clientVer = aClientVer;
	}

	/**
	 * Access method for clientVerIncrement.
	 *
	 * @return the current value of clientVerIncrement
	 */
	public int getClientVerIncrement() {
		return clientVerIncrement;
	}

	/**
	 * Setter method for clientVerIncrement.
	 *
	 * @param aClientVerIncrement the new value for clientVerIncrement
	 */
	public void setClientVerIncrement(int aClientVerIncrement) {
		clientVerIncrement = aClientVerIncrement;
	}

	/**
	 * Access method for creationTime.
	 *
	 * @return the current value of creationTime
	 */
	public Timestamp getCreationTime() {
		return creationTime;
	}

	/**
	 * Setter method for creationTime.
	 *
	 * @param aCreationTime the new value for creationTime
	 */
	public void setCreationTime(Timestamp aCreationTime) {
		creationTime = aCreationTime;
	}

	/**
	 * Access method for lastJoinTime.
	 *
	 * @return the current value of lastJoinTime
	 */
	public Timestamp getLastJoinTime() {
		return lastJoinTime;
	}

	/**
	 * Setter method for lastJoinTime.
	 *
	 * @param aLastJoinTime the new value for lastJoinTime
	 */
	public void setLastJoinTime(Timestamp aLastJoinTime) {
		lastJoinTime = aLastJoinTime;
	}

	/**
	 * Access method for creationIp.
	 *
	 * @return the current value of creationIp
	 */
	public String getCreationIp() {
		return creationIp;
	}

	/**
	 * Setter method for creationIp.
	 *
	 * @param aCreationIp the new value for creationIp
	 */
	public void setCreationIp(String aCreationIp) {
		creationIp = aCreationIp;
	}

	/**
	 * Access method for blockingReason.
	 *
	 * @return the current value of blockingReason
	 */
	public String getBlockingReason() {
		return blockingReason;
	}

	/**
	 * Setter method for blockingReason.
	 *
	 * @param aBlockingReason the new value for blockingReason
	 */
	public void setBlockingReason(String aBlockingReason) {
		blockingReason = aBlockingReason;
	}

	/**
	 * Access method for nUnviewPics.
	 *
	 * @return the current value of nUnviewPics
	 */
	public int getNUnviewPics() {
		return nUnviewPics;
	}

	/**
	 * Setter method for nUnviewPics.
	 *
	 * @param aNUnviewPics the new value for nUnviewPics
	 */
	public void setNUnviewPics(int aNUnviewPics) {
		nUnviewPics = aNUnviewPics;
	}

	/**
	 * Access method for userLang.
	 *
	 * @return the current value of userLang
	 */
	public String getUserLang() {
		return userLang;
	}

	/**
	 * Setter method for userLang.
	 *
	 * @param aUserLang the new value for userLang
	 */
	public void setUserLang(String aUserLang) {
		userLang = aUserLang;
	}

	/**
	 * Access method for anythingNew.
	 *
	 * @return true if and only if anythingNew is currently true
	 */
	public boolean getAnythingNew() {
		return anythingNew;
	}

	/**
	 * Setter method for anythingNew.
	 *
	 * @param aAnythingNew the new value for anythingNew
	 */
	public void setAnythingNew(boolean aAnythingNew) {
		anythingNew = aAnythingNew;
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
	 * Access method for nlikes.
	 *
	 * @return the current value of nlikes
	 */
	public int getNlikes() {
		return nlikes;
	}

	/**
	 * Setter method for nlikes.
	 *
	 * @param aNlikes the new value for nlikes
	 */
	public void setNlikes(int aNlikes) {
		nlikes = aNlikes;
	}

	/**
	 * Access method for advId.
	 *
	 * @return the current value of advId
	 */
	public String getAdvId() {
		return advId;
	}

	/**
	 * Setter method for advId.
	 *
	 * @param aAdvId the new value for advId
	 */
	public void setAdvId(String aAdvId) {
		advId = aAdvId;
	}

	/**
	 * Access method for publicId.
	 *
	 * @return the current value of publicId
	 */
	public String getPublicId() {
		return publicId;
	}

	/**
	 * Setter method for publicId.
	 *
	 * @param aPublicId the new value for publicId
	 */
	public void setPublicId(String aPublicId) {
		publicId = aPublicId;
	}

	@Override
	public String toString() {
		return "Users_Bkp [clientId=" + clientId + ", gRegId=" + gRegId + ", aRegId=" + aRegId + ", cli=" + cli
				+ ", deviceName=" + deviceName + ", os=" + os + ", osType=" + osType + ", clientVer=" + clientVer
				+ ", clientVerIncrement=" + clientVerIncrement + ", creationTime=" + creationTime + ", lastJoinTime="
				+ lastJoinTime + ", creationIp=" + creationIp + ", blockingReason=" + blockingReason + ", nUnviewPics="
				+ nUnviewPics + ", userLang=" + userLang + ", anythingNew=" + anythingNew + ", cliCc=" + cliCc
				+ ", nlikes=" + nlikes + ", advId=" + advId + ", publicId=" + publicId + "]";
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
