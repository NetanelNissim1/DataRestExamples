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
@Table(name = "spam_per_cc_last_update", indexes = {
		@Index(name = "spam_per_cc_last_update_cc_IX", columnList = "cc", unique = true) })
public class Spam_Per_Cc_Last_Update implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8242394394698267420L;
	@Id
	@Column(unique = true, nullable = false, length = 8)
	private String cc;
	@Column(nullable = false)
	private Timestamp updated;

	/** Default constructor. */
	public Spam_Per_Cc_Last_Update() {
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
		return "Spam_Per_Cc_Last_Update [cc=" + cc + ", updated=" + updated + "]";
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
