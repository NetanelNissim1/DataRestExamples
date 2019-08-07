// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "spam_all", indexes = { @Index(name = "spamAllPrimary", columnList = "cc,cli", unique = true) })
public class Spam_all implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4795435727093040428L;

	@Id
	@Column(nullable = false, length = 8)
	private String cc;
	@Id
	@Column(nullable = false, precision = 20)
	private long cli;

	/** Default constructor. */
	public Spam_all() {
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

	@Override
	public String toString() {
		return "Spam_all [cc=" + cc + ", cli=" + cli + "]";
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
