// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "temp_sd_id", indexes = { @Index(name = "temp_sd_id_ref_IX", columnList = "ref", unique = true) })
public class Temp_Sd_Id implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8576377332636275500L;
	@Id
	@Column(unique = true, nullable = false, length = 1)
	private String ref;
	@Column(nullable = false, precision = 20)
	private long id;

	/** Default constructor. */
	public Temp_Sd_Id() {
		super();
	}

	/**
	 * Access method for ref.
	 *
	 * @return the current value of ref
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Setter method for ref.
	 *
	 * @param aRef the new value for ref
	 */
	public void setRef(String aRef) {
		ref = aRef;
	}

	/**
	 * Access method for id.
	 *
	 * @return the current value of id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter method for id.
	 *
	 * @param aId the new value for id
	 */
	public void setId(long aId) {
		id = aId;
	}

	@Override
	public String toString() {
		return "Temp_Sd_Id [ref=" + ref + ", id=" + id + "]";
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
