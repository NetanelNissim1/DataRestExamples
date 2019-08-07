// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "history", indexes = { @Index(name = "history_cli_IX", columnList = "cli", unique = true) })
public class History implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1077919806239578794L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(nullable = false)
	private String events;

	/** Default constructor. */
	public History() {
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
	 * Access method for events.
	 *
	 * @return the current value of events
	 */
	public String getEvents() {
		return events;
	}

	/**
	 * Setter method for events.
	 *
	 * @param aEvents the new value for events
	 */
	public void setEvents(String aEvents) {
		events = aEvents;
	}

	@Override
	public String toString() {
		return "History [cli=" + cli + ", events=" + events + "]";
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
