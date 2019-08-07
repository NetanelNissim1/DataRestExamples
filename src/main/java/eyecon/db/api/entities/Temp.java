// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "temp", indexes = { @Index(name = "tempPrimary", columnList = "ip,cid", unique = true) })
public class Temp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5667491774268193325L;
	@Id
	@Column(nullable = false, length = 15)
	private String ip;
	@Id
	@Column(nullable = false, length = 36)
	private String cid;

	/** Default constructor. */
	public Temp() {
		super();
	}

	/**
	 * Access method for ip.
	 *
	 * @return the current value of ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Setter method for ip.
	 *
	 * @param aIp the new value for ip
	 */
	public void setIp(String aIp) {
		ip = aIp;
	}

	/**
	 * Access method for cid.
	 *
	 * @return the current value of cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * Setter method for cid.
	 *
	 * @param aCid the new value for cid
	 */
	public void setCid(String aCid) {
		cid = aCid;
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

	@Override
	public String toString() {
		return "Temp [ip=" + ip + ", cid=" + cid + "]";
	}

}
