// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "cc_iso_3_to_2", indexes = { @Index(name = "cc_iso_3_to_2_cc3_IX", columnList = "cc3", unique = true) })
public class Cc_Iso_3_To_2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7244358113196675263L;
	@Id
	@Column(unique = true, nullable = false, length = 3)
	private String cc3;
	@Column(nullable = false, length = 2)
	private String cc2;

	/** Default constructor. */
	public Cc_Iso_3_To_2() {
		super();
	}

	/**
	 * Access method for cc3.
	 *
	 * @return the current value of cc3
	 */
	public String getCc3() {
		return cc3;
	}

	/**
	 * Setter method for cc3.
	 *
	 * @param aCc3 the new value for cc3
	 */
	public void setCc3(String aCc3) {
		cc3 = aCc3;
	}

	/**
	 * Access method for cc2.
	 *
	 * @return the current value of cc2
	 */
	public String getCc2() {
		return cc2;
	}

	/**
	 * Setter method for cc2.
	 *
	 * @param aCc2 the new value for cc2
	 */
	public void setCc2(String aCc2) {
		cc2 = aCc2;
	}

	@Override
	public String toString() {
		return "Cc_Iso_3_To_2 [cc3=" + cc3 + ", cc2=" + cc2 + "]";
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
