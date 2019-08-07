// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;
import eyecon.db.api.id.ClisocialsId;

@Entity
@Table(name = "clisocials", indexes = {
		@Index(name = "clisocialsPrimary", columnList = "cli,stype,sid", unique = true) })
@IdClass(ClisocialsId.class)
public class Clisocials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6244536394926976705L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, precision = 10)
	private int stype;
	@Id
	@Column(nullable = false, length = 254)
	private String sid;
	@Column(name = "is_published", length = 3)
	private boolean isPublished;
	@Column(name = "validity_rate", nullable = false, precision = 10)
	private int validityRate;

	/** Default constructor. */
	public Clisocials() {
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
	 * Access method for isPublished.
	 *
	 * @return true if and only if isPublished is currently true
	 */
	public boolean getIsPublished() {
		return isPublished;
	}

	/**
	 * Setter method for isPublished.
	 *
	 * @param aIsPublished the new value for isPublished
	 */
	public void setIsPublished(boolean aIsPublished) {
		isPublished = aIsPublished;
	}

	/**
	 * Access method for validityRate.
	 *
	 * @return the current value of validityRate
	 */
	public int getValidityRate() {
		return validityRate;
	}

	/**
	 * Setter method for validityRate.
	 *
	 * @param aValidityRate the new value for validityRate
	 */
	public void setValidityRate(int aValidityRate) {
		validityRate = aValidityRate;
	}

	@Override
	public String toString() {
		return "Clisocials [cli=" + cli + ", stype=" + stype + ", sid=" + sid + ", isPublished=" + isPublished
				+ ", validityRate=" + validityRate + "]";
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
