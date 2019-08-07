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
@Table(name = "ts_test_table", indexes = { @Index(name = "ts_test_table_id_IX", columnList = "id", unique = true) })
public class Ts_Test_Table implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -416487627211738574L;
	@Id
	@Column(unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "not_fractional_timestamp")
	private Timestamp notFractionalTimestamp;

	/** Default constructor. */
	public Ts_Test_Table() {
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
	 * Access method for notFractionalTimestamp.
	 *
	 * @return the current value of notFractionalTimestamp
	 */
	public Timestamp getNotFractionalTimestamp() {
		return notFractionalTimestamp;
	}

	/**
	 * Setter method for notFractionalTimestamp.
	 *
	 * @param aNotFractionalTimestamp the new value for notFractionalTimestamp
	 */
	public void setNotFractionalTimestamp(Timestamp aNotFractionalTimestamp) {
		notFractionalTimestamp = aNotFractionalTimestamp;
	}

	@Override
	public String toString() {
		return "Ts_Test_Table [id=" + id + ", notFractionalTimestamp=" + notFractionalTimestamp + "]";
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
