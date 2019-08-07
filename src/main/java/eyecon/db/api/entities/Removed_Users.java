// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "removed_users")
public class Removed_Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2413807150382523189L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Column(name = "event_source", nullable = false, precision = 3)
	private short eventSource;
	@Column(nullable = false)
	private Timestamp timestamp;

	/** Default constructor. */
	public Removed_Users() {
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
	 * Access method for eventSource.
	 *
	 * @return the current value of eventSource
	 */
	public short getEventSource() {
		return eventSource;
	}

	/**
	 * Setter method for eventSource.
	 *
	 * @param aEventSource the new value for eventSource
	 */
	public void setEventSource(short aEventSource) {
		eventSource = aEventSource;
	}

	/**
	 * Access method for timestamp.
	 *
	 * @return the current value of timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * Setter method for timestamp.
	 *
	 * @param aTimestamp the new value for timestamp
	 */
	public void setTimestamp(Timestamp aTimestamp) {
		timestamp = aTimestamp;
	}

	@Override
	public String toString() {
		return "Removed_Users [cli=" + cli + ", eventSource=" + eventSource + ", timestamp=" + timestamp + "]";
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
