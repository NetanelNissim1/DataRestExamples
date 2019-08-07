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
@Table(name = "tokens", indexes = { @Index(name = "tokensPrimary", columnList = "cli,stype,sid", unique = true) })
public class Tokens implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2954691005516685971L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, precision = 10)
	private int stype;
	@Id
	@Column(nullable = false, length = 30)
	private String sid;
	@Column(nullable = false, length = 300)
	private String token;
	@Column(length = 3)
	private boolean inuse;
	@Column(name = "last_used", nullable = false)
	private Timestamp lastUsed;
	@Column(nullable = false)
	private Timestamp added;

	/** Default constructor. */
	public Tokens() {
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
	 * Access method for stype.
	 *
	 * @return the current value of stype
	 */
	public int getStype() {
		return stype;
	}

	/**
	 * Setter method for stype.
	 *
	 * @param aStype the new value for stype
	 */
	public void setStype(int aStype) {
		stype = aStype;
	}

	/**
	 * Access method for sid.
	 *
	 * @return the current value of sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * Setter method for sid.
	 *
	 * @param aSid the new value for sid
	 */
	public void setSid(String aSid) {
		sid = aSid;
	}

	/**
	 * Access method for token.
	 *
	 * @return the current value of token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Setter method for token.
	 *
	 * @param aToken the new value for token
	 */
	public void setToken(String aToken) {
		token = aToken;
	}

	/**
	 * Access method for inuse.
	 *
	 * @return true if and only if inuse is currently true
	 */
	public boolean getInuse() {
		return inuse;
	}

	/**
	 * Setter method for inuse.
	 *
	 * @param aInuse the new value for inuse
	 */
	public void setInuse(boolean aInuse) {
		inuse = aInuse;
	}

	/**
	 * Access method for lastUsed.
	 *
	 * @return the current value of lastUsed
	 */
	public Timestamp getLastUsed() {
		return lastUsed;
	}

	/**
	 * Setter method for lastUsed.
	 *
	 * @param aLastUsed the new value for lastUsed
	 */
	public void setLastUsed(Timestamp aLastUsed) {
		lastUsed = aLastUsed;
	}

	/**
	 * Access method for added.
	 *
	 * @return the current value of added
	 */
	public Timestamp getAdded() {
		return added;
	}

	/**
	 * Setter method for added.
	 *
	 * @param aAdded the new value for added
	 */
	public void setAdded(Timestamp aAdded) {
		added = aAdded;
	}

	@Override
	public String toString() {
		return "Tokens [cli=" + cli + ", stype=" + stype + ", sid=" + sid + ", token=" + token + ", inuse=" + inuse
				+ ", lastUsed=" + lastUsed + ", added=" + added + "]";
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
