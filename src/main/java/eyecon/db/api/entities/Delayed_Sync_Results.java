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
@Table(name = "delayed_sync_results", indexes = {
		@Index(name = "delayedSyncResultsPrimary", columnList = "cli,sync_type_code", unique = true) })
public class Delayed_Sync_Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3767733554309151666L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(name = "sync_type_code", nullable = false, precision = 10)
	private int syncTypeCode;
	@Column(name = "time_to_free", nullable = false)
	private Timestamp timeToFree;
	@Column(nullable = false)
	private String data;

	/** Default constructor. */
	public Delayed_Sync_Results() {
		super();
	}

	/**
	 * Access method for cli.
	 *
	 * @return the current value of cli
	 */
	public String getCli() {
		return cli;
	}

	/**
	 * Setter method for cli.
	 *
	 * @param aCli the new value for cli
	 */
	public void setCli(String aCli) {
		cli = aCli;
	}

	/**
	 * Access method for syncTypeCode.
	 *
	 * @return the current value of syncTypeCode
	 */
	public int getSyncTypeCode() {
		return syncTypeCode;
	}

	/**
	 * Setter method for syncTypeCode.
	 *
	 * @param aSyncTypeCode the new value for syncTypeCode
	 */
	public void setSyncTypeCode(int aSyncTypeCode) {
		syncTypeCode = aSyncTypeCode;
	}

	/**
	 * Access method for timeToFree.
	 *
	 * @return the current value of timeToFree
	 */
	public Timestamp getTimeToFree() {
		return timeToFree;
	}

	/**
	 * Setter method for timeToFree.
	 *
	 * @param aTimeToFree the new value for timeToFree
	 */
	public void setTimeToFree(Timestamp aTimeToFree) {
		timeToFree = aTimeToFree;
	}

	/**
	 * Access method for data.
	 *
	 * @return the current value of data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Setter method for data.
	 *
	 * @param aData the new value for data
	 */
	public void setData(String aData) {
		data = aData;
	}

	@Override
	public String toString() {
		return "Delayed_Sync_Results [cli=" + cli + ", syncTypeCode=" + syncTypeCode + ", timeToFree=" + timeToFree
				+ ", data=" + data + "]";
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
