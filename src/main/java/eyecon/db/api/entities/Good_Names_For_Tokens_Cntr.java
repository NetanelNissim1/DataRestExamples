// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "good_names_for_tokens_cntr", indexes = {
		@Index(name = "good_names_for_tokens_cntr_val_IX", columnList = "val", unique = true) })
public class Good_Names_For_Tokens_Cntr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5392884269836470093L;
	@Id
	@Column(unique = true, nullable = false, length = 45)
	private String val;
	@Column(nullable = false, precision = 10)
	private int cntr;

	/** Default constructor. */
	public Good_Names_For_Tokens_Cntr() {
		super();
	}

	/**
	 * Access method for val.
	 *
	 * @return the current value of val
	 */
	public String getVal() {
		return val;
	}

	/**
	 * Setter method for val.
	 *
	 * @param aVal the new value for val
	 */
	public void setVal(String aVal) {
		val = aVal;
	}

	/**
	 * Access method for cntr.
	 *
	 * @return the current value of cntr
	 */
	public int getCntr() {
		return cntr;
	}

	/**
	 * Setter method for cntr.
	 *
	 * @param aCntr the new value for cntr
	 */
	public void setCntr(int aCntr) {
		cntr = aCntr;
	}

	@Override
	public String toString() {
		return "Good_Names_For_Tokens_Cntr [val=" + val + ", cntr=" + cntr + "]";
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
