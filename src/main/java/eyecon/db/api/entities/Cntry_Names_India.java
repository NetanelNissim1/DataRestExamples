// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "cntry_names_india", indexes = {
		@Index(name = "cntryNamesIndiaPrimary", columnList = "cli,name", unique = true) })
public class Cntry_Names_India implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3366574265994654555L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 191)
	private String name;
	@Column(nullable = false, length = 3)
	private boolean type;

	/** Default constructor. */
	public Cntry_Names_India() {
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
	 * Access method for name.
	 *
	 * @return the current value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * @param aName the new value for name
	 */
	public void setName(String aName) {
		name = aName;
	}

	/**
	 * Access method for type.
	 *
	 * @return true if and only if type is currently true
	 */
	public boolean getType() {
		return type;
	}

	/**
	 * Setter method for type.
	 *
	 * @param aType the new value for type
	 */
	public void setType(boolean aType) {
		type = aType;
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
		return "Cntry_Names_India [cli=" + cli + ", name=" + name + ", type=" + type + "]";
	}

}
