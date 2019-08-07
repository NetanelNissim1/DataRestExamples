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
@Table(name = "ts_test_table2", indexes = { @Index(name = "ts_test_table2_id_IX", columnList = "id", unique = true) })
public class Ts_Test_Table2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6868667766102213115L;
	@Id
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "some_data", nullable = false, length = 10)
	private String someData;
	@Column(name = "fractional_timestamp")
	private Timestamp fractionalTimestamp;

	/** Default constructor. */
	public Ts_Test_Table2() {
		super();
	}

	/**
	 * Access method for id.
	 *
	 * @return the current value of id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter method for id.
	 *
	 * @param aId the new value for id
	 */
	public void setId(int aId) {
		id = aId;
	}

	/**
	 * Access method for someData.
	 *
	 * @return the current value of someData
	 */
	public String getSomeData() {
		return someData;
	}

	/**
	 * Setter method for someData.
	 *
	 * @param aSomeData the new value for someData
	 */
	public void setSomeData(String aSomeData) {
		someData = aSomeData;
	}

	/**
	 * Access method for fractionalTimestamp.
	 *
	 * @return the current value of fractionalTimestamp
	 */
	public Timestamp getFractionalTimestamp() {
		return fractionalTimestamp;
	}

	/**
	 * Setter method for fractionalTimestamp.
	 *
	 * @param aFractionalTimestamp the new value for fractionalTimestamp
	 */
	public void setFractionalTimestamp(Timestamp aFractionalTimestamp) {
		fractionalTimestamp = aFractionalTimestamp;
	}

	@Override
	public String toString() {
		return "Ts_Test_Table2 [id=" + id + ", someData=" + someData + ", fractionalTimestamp=" + fractionalTimestamp
				+ "]";
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
