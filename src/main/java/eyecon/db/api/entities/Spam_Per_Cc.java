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
@Table(name = "spam_per_cc", indexes = { @Index(name = "spamPerCcPrimary", columnList = "cc,cli", unique = true) })
public class Spam_Per_Cc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 308117237166660325L;
	@Id
	@Column(nullable = false, length = 8)
	private String cc;
	@Id
	@Column(nullable = false, precision = 20)
	private long cli;
	@Column(nullable = false)
	private Timestamp updated;

	/** Default constructor. */
	public Spam_Per_Cc() {
		super();
	}

	/**
	 * Access method for cc.
	 *
	 * @return the current value of cc
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * Setter method for cc.
	 *
	 * @param aCc the new value for cc
	 */
	public void setCc(String aCc) {
		cc = aCc;
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
	 * Access method for updated.
	 *
	 * @return the current value of updated
	 */
	public Timestamp getUpdated() {
		return updated;
	}

	/**
	 * Setter method for updated.
	 *
	 * @param aUpdated the new value for updated
	 */
	public void setUpdated(Timestamp aUpdated) {
		updated = aUpdated;
	}

	@Override
	public String toString() {
		return "Spam_Per_Cc [cc=" + cc + ", cli=" + cli + ", updated=" + updated + "]";
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
