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
@Table(name = "macs", indexes = { @Index(name = "macsPrimary", columnList = "cli,mac", unique = true) })
public class Macs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 560163725866518297L;
	@Id
	@Column(nullable = false, precision = 20)
	private long cli;
	@Id
	@Column(nullable = false, precision = 20)
	private long mac;
	@Column(nullable = false)
	private Timestamp ts;
	@Column(nullable = false, length = 3)
	private boolean type;

	/** Default constructor. */
	public Macs() {
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
	 * Access method for mac.
	 *
	 * @return the current value of mac
	 */
	public long getMac() {
		return mac;
	}

	/**
	 * Setter method for mac.
	 *
	 * @param aMac the new value for mac
	 */
	public void setMac(long aMac) {
		mac = aMac;
	}

	/**
	 * Access method for ts.
	 *
	 * @return the current value of ts
	 */
	public Timestamp getTs() {
		return ts;
	}

	/**
	 * Setter method for ts.
	 *
	 * @param aTs the new value for ts
	 */
	public void setTs(Timestamp aTs) {
		ts = aTs;
	}

	/**
	 * Access method for type.
	 *
	 * @return true if and only if type is currently true
	 */
	public boolean getType() {
		return type;
	}

	/**
	 * Setter method for type.
	 *
	 * @param aType the new value for type
	 */
	public void setType(boolean aType) {
		type = aType;
	}

	@Override
	public String toString() {
		return "Macs [cli=" + cli + ", mac=" + mac + ", ts=" + ts + ", type=" + type + "]";
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
