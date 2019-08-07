// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "totally_new_names_for_fb_search", indexes = {
		@Index(name = "totally_new_names_for_fb_search_cli_IX", columnList = "cli", unique = true) })
public class Totally_New_Names_For_Fb_Search implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4189834061715074117L;
	@Id
	@Column(unique = true, nullable = false, precision = 19)
	private long cli;

	/** Default constructor. */
	public Totally_New_Names_For_Fb_Search() {
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
		return "Totally_New_Names_For_Fb_Search [cli=" + cli + "]";
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
