// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "temp_clis2", indexes = { @Index(name = "temp_clis2_cli_IX", columnList = "cli", unique = true) })
public class Temp_Clis2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2151241647654288471L;
	@Id
	@Column(unique = true, nullable = false, precision = 19)
	private long cli;

	/** Default constructor. */
	public Temp_Clis2() {
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Temp_Clis2 [cli=" + cli + "]";
	}

}
