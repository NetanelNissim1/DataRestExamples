// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "spam_received_from_user", indexes = {
		@Index(name = "spam_received_from_user_cli_IX", columnList = "cli", unique = true) })
public class Spam_Received_From_User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3743985438517248467L;
	@Id
	@Column(unique = true, nullable = false, precision = 20)
	private long cli;

	/** Default constructor. */
	public Spam_Received_From_User() {
		super();
	}

	/**
	 * Access method for cli.
	 *
	 * @return the current value of cli
	 */
	public long getCli() {
		return cli;
	}

	/**
	 * Setter method for cli.
	 *
	 * @param aCli the new value for cli
	 */
	public void setCli(long aCli) {
		cli = aCli;
	}

	@Override
	public String toString() {
		return "Spam_Received_From_User [cli=" + cli + "]";
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
