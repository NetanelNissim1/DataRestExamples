// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "users_registrations_statistics", indexes = {
		@Index(name = "users_registrations_statistics_day_IX", columnList = "day", unique = true) })
public class Users_Registrations_Statistics implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4091686267843723111L;
	@Id
	@Column(unique = true, nullable = false)
	private Date day;
	@Column(name = "android_cntr", nullable = false, precision = 10)
	private int androidCntr;
	@Column(name = "iphone_cntr", nullable = false, precision = 10)
	private int iphoneCntr;

	/** Default constructor. */
	public Users_Registrations_Statistics() {
		super();
	}

	/**
	 * Access method for day.
	 *
	 * @return the current value of day
	 */
	public Date getDay() {
		return day;
	}

	/**
	 * Setter method for day.
	 *
	 * @param aDay the new value for day
	 */
	public void setDay(Date aDay) {
		day = aDay;
	}

	/**
	 * Access method for androidCntr.
	 *
	 * @return the current value of androidCntr
	 */
	public int getAndroidCntr() {
		return androidCntr;
	}

	/**
	 * Setter method for androidCntr.
	 *
	 * @param aAndroidCntr the new value for androidCntr
	 */
	public void setAndroidCntr(int aAndroidCntr) {
		androidCntr = aAndroidCntr;
	}

	/**
	 * Access method for iphoneCntr.
	 *
	 * @return the current value of iphoneCntr
	 */
	public int getIphoneCntr() {
		return iphoneCntr;
	}

	/**
	 * Setter method for iphoneCntr.
	 *
	 * @param aIphoneCntr the new value for iphoneCntr
	 */
	public void setIphoneCntr(int aIphoneCntr) {
		iphoneCntr = aIphoneCntr;
	}

	@Override
	public String toString() {
		return "Users_Registrations_Statistics [day=" + day + ", androidCntr=" + androidCntr + ", iphoneCntr="
				+ iphoneCntr + "]";
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
