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
@Table(name = "spam_activity", indexes = {
		@Index(name = "spamActivityPrimary", columnList = "spammer_cli,user_cc,user_cli", unique = true) })
public class Spam_Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8530839465887431517L;
	@Id
	@Column(name = "spammer_cli", nullable = false, precision = 20)
	private long spammerCli;
	@Id
	@Column(name = "user_cc", nullable = false, length = 8)
	private String userCc;
	@Id
	@Column(name = "user_cli", nullable = false, precision = 20)
	private long userCli;
	@Column(name = "last_call", nullable = false)
	private Timestamp lastCall;
	@Column(name = "n_calls", nullable = false, precision = 10)
	private int nCalls;

	/** Default constructor. */
	public Spam_Activity() {
		super();
	}

	/**
	 * Access method for spammerCli.
	 *
	 * @return the current value of spammerCli
	 */
	public long getSpammerCli() {
		return spammerCli;
	}

	/**
	 * Setter method for spammerCli.
	 *
	 * @param aSpammerCli the new value for spammerCli
	 */
	public void setSpammerCli(long aSpammerCli) {
		spammerCli = aSpammerCli;
	}

	/**
	 * Access method for userCc.
	 *
	 * @return the current value of userCc
	 */
	public String getUserCc() {
		return userCc;
	}

	/**
	 * Setter method for userCc.
	 *
	 * @param aUserCc the new value for userCc
	 */
	public void setUserCc(String aUserCc) {
		userCc = aUserCc;
	}

	/**
	 * Access method for userCli.
	 *
	 * @return the current value of userCli
	 */
	public long getUserCli() {
		return userCli;
	}

	/**
	 * Setter method for userCli.
	 *
	 * @param aUserCli the new value for userCli
	 */
	public void setUserCli(long aUserCli) {
		userCli = aUserCli;
	}

	/**
	 * Access method for lastCall.
	 *
	 * @return the current value of lastCall
	 */
	public Timestamp getLastCall() {
		return lastCall;
	}

	/**
	 * Setter method for lastCall.
	 *
	 * @param aLastCall the new value for lastCall
	 */
	public void setLastCall(Timestamp aLastCall) {
		lastCall = aLastCall;
	}

	/**
	 * Access method for nCalls.
	 *
	 * @return the current value of nCalls
	 */
	public int getNCalls() {
		return nCalls;
	}

	/**
	 * Setter method for nCalls.
	 *
	 * @param aNCalls the new value for nCalls
	 */
	public void setNCalls(int aNCalls) {
		nCalls = aNCalls;
	}

	@Override
	public String toString() {
		return "Spam_Activity [spammerCli=" + spammerCli + ", userCc=" + userCc + ", userCli=" + userCli + ", lastCall="
				+ lastCall + ", nCalls=" + nCalls + "]";
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
