// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "fbnopics", indexes = { @Index(name = "fbnopics_cli_IX", columnList = "cli", unique = true) })
public class Fbnopics implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3386930386626875830L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;

	/** Default constructor. */
	public Fbnopics() {
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

	@Override
	public String toString() {
		return "Fbnopics [cli=" + cli + "]";
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
