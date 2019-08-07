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
@Table(name = "auth_sms_in", indexes = {
		@Index(name = "auth_sms_in_sender_cli_IX", columnList = "sender_cli", unique = true) })
public class Auth_Sms_In implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655270359309831878L;
	@Id
	@Column(name = "sender_cli", unique = true, nullable = false, length = 30)
	private String senderCli;
	@Column(name = "receiver_cli", nullable = false, length = 30)
	private String receiverCli;
	@Column(name = "expected_message_text", length = 150)
	private String expectedMessageText;
	@Column(name = "client_request_params")
	private String clientRequestParams;
	@Column(name = "client_request_ts", nullable = false)
	private Timestamp clientRequestTs;
	@Column(name = "inbound_message_text", length = 150)
	private String inboundMessageText;
	@Column(name = "inbound_sms_ts")
	private Timestamp inboundSmsTs;

	/** Default constructor. */
	public Auth_Sms_In() {
		super();
	}

	/**
	 * Access method for senderCli.
	 *
	 * @return the current value of senderCli
	 */
	public String getSenderCli() {
		return senderCli;
	}

	/**
	 * Setter method for senderCli.
	 *
	 * @param aSenderCli the new value for senderCli
	 */
	public void setSenderCli(String aSenderCli) {
		senderCli = aSenderCli;
	}

	/**
	 * Access method for receiverCli.
	 *
	 * @return the current value of receiverCli
	 */
	public String getReceiverCli() {
		return receiverCli;
	}

	/**
	 * Setter method for receiverCli.
	 *
	 * @param aReceiverCli the new value for receiverCli
	 */
	public void setReceiverCli(String aReceiverCli) {
		receiverCli = aReceiverCli;
	}

	/**
	 * Access method for expectedMessageText.
	 *
	 * @return the current value of expectedMessageText
	 */
	public String getExpectedMessageText() {
		return expectedMessageText;
	}

	/**
	 * Setter method for expectedMessageText.
	 *
	 * @param aExpectedMessageText the new value for expectedMessageText
	 */
	public void setExpectedMessageText(String aExpectedMessageText) {
		expectedMessageText = aExpectedMessageText;
	}

	/**
	 * Access method for clientRequestParams.
	 *
	 * @return the current value of clientRequestParams
	 */
	public String getClientRequestParams() {
		return clientRequestParams;
	}

	/**
	 * Setter method for clientRequestParams.
	 *
	 * @param aClientRequestParams the new value for clientRequestParams
	 */
	public void setClientRequestParams(String aClientRequestParams) {
		clientRequestParams = aClientRequestParams;
	}

	/**
	 * Access method for clientRequestTs.
	 *
	 * @return the current value of clientRequestTs
	 */
	public Timestamp getClientRequestTs() {
		return clientRequestTs;
	}

	/**
	 * Setter method for clientRequestTs.
	 *
	 * @param aClientRequestTs the new value for clientRequestTs
	 */
	public void setClientRequestTs(Timestamp aClientRequestTs) {
		clientRequestTs = aClientRequestTs;
	}

	/**
	 * Access method for inboundMessageText.
	 *
	 * @return the current value of inboundMessageText
	 */
	public String getInboundMessageText() {
		return inboundMessageText;
	}

	/**
	 * Setter method for inboundMessageText.
	 *
	 * @param aInboundMessageText the new value for inboundMessageText
	 */
	public void setInboundMessageText(String aInboundMessageText) {
		inboundMessageText = aInboundMessageText;
	}

	/**
	 * Access method for inboundSmsTs.
	 *
	 * @return the current value of inboundSmsTs
	 */
	public Timestamp getInboundSmsTs() {
		return inboundSmsTs;
	}

	/**
	 * Setter method for inboundSmsTs.
	 *
	 * @param aInboundSmsTs the new value for inboundSmsTs
	 */
	public void setInboundSmsTs(Timestamp aInboundSmsTs) {
		inboundSmsTs = aInboundSmsTs;
	}

	@Override
	public String toString() {
		return "Auth_Sms_In [senderCli=" + senderCli + ", receiverCli=" + receiverCli + ", expectedMessageText="
				+ expectedMessageText + ", clientRequestParams=" + clientRequestParams + ", clientRequestTs="
				+ clientRequestTs + ", inboundMessageText=" + inboundMessageText + ", inboundSmsTs=" + inboundSmsTs
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
