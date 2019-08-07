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
@Table(name = "authentications", indexes = {
		@Index(name = "authentications_cli_IX", columnList = "cli", unique = true) })
public class Authentications implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2517782399238120135L;
	@Column(name = "auth_type", nullable = false, length = 6)
	private String authType;
	@Column(name = "send_attempt", nullable = false, length = 3)
	private boolean sendAttempt;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(nullable = false, length = 4)
	private String code;
	@Column(name = "code_check_attempt", nullable = false, length = 3)
	private boolean codeCheckAttempt;
	@Column(name = "last_sent_time", nullable = false)
	private Timestamp lastSentTime;
	@Column(name = "is_valid", nullable = false, length = 3)
	private boolean isValid;
	@Column(name = "client_ver_string", nullable = false, length = 50)
	private String clientVerString;

	/** Default constructor. */
	public Authentications() {
		super();
	}

	/**
	 * Access method for authType.
	 *
	 * @return the current value of authType
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * Setter method for authType.
	 *
	 * @param aAuthType the new value for authType
	 */
	public void setAuthType(String aAuthType) {
		authType = aAuthType;
	}

	/**
	 * Access method for sendAttempt.
	 *
	 * @return true if and only if sendAttempt is currently true
	 */
	public boolean getSendAttempt() {
		return sendAttempt;
	}

	/**
	 * Setter method for sendAttempt.
	 *
	 * @param aSendAttempt the new value for sendAttempt
	 */
	public void setSendAttempt(boolean aSendAttempt) {
		sendAttempt = aSendAttempt;
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
	 * Access method for code.
	 *
	 * @return the current value of code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter method for code.
	 *
	 * @param aCode the new value for code
	 */
	public void setCode(String aCode) {
		code = aCode;
	}

	/**
	 * Access method for codeCheckAttempt.
	 *
	 * @return true if and only if codeCheckAttempt is currently true
	 */
	public boolean getCodeCheckAttempt() {
		return codeCheckAttempt;
	}

	/**
	 * Setter method for codeCheckAttempt.
	 *
	 * @param aCodeCheckAttempt the new value for codeCheckAttempt
	 */
	public void setCodeCheckAttempt(boolean aCodeCheckAttempt) {
		codeCheckAttempt = aCodeCheckAttempt;
	}

	/**
	 * Access method for lastSentTime.
	 *
	 * @return the current value of lastSentTime
	 */
	public Timestamp getLastSentTime() {
		return lastSentTime;
	}

	/**
	 * Setter method for lastSentTime.
	 *
	 * @param aLastSentTime the new value for lastSentTime
	 */
	public void setLastSentTime(Timestamp aLastSentTime) {
		lastSentTime = aLastSentTime;
	}

	/**
	 * Access method for isValid.
	 *
	 * @return true if and only if isValid is currently true
	 */
	public boolean getIsValid() {
		return isValid;
	}

	/**
	 * Setter method for isValid.
	 *
	 * @param aIsValid the new value for isValid
	 */
	public void setIsValid(boolean aIsValid) {
		isValid = aIsValid;
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

	@Override
	public String toString() {
		return "Authentications [authType=" + authType + ", sendAttempt=" + sendAttempt + ", cli=" + cli + ", code="
				+ code + ", codeCheckAttempt=" + codeCheckAttempt + ", lastSentTime=" + lastSentTime + ", isValid="
				+ isValid + ", clientVerString=" + clientVerString + "]";
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
