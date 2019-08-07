// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "draftnames", indexes = {
		@Index(name = "draftnamesPrimary", columnList = "cli,name,stype", unique = true) })
public class Draftnames implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5859757001560991448L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 191)
	private String name;
	@Id
	@Column(nullable = false, precision = 10)
	private int stype;
	@Column(nullable = false, length = 10)
	private String lang;
	@Column(nullable = false, length = 254)
	private String sid;

	/** Default constructor. */
	public Draftnames() {
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
	 * Access method for stype.
	 *
	 * @return the current value of stype
	 */
	public int getStype() {
		return stype;
	}

	/**
	 * Setter method for stype.
	 *
	 * @param aStype the new value for stype
	 */
	public void setStype(int aStype) {
		stype = aStype;
	}

	/**
	 * Access method for lang.
	 *
	 * @return the current value of lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Setter method for lang.
	 *
	 * @param aLang the new value for lang
	 */
	public void setLang(String aLang) {
		lang = aLang;
	}

	/**
	 * Access method for sid.
	 *
	 * @return the current value of sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * Setter method for sid.
	 *
	 * @param aSid the new value for sid
	 */
	public void setSid(String aSid) {
		sid = aSid;
	}

	@Override
	public String toString() {
		return "Draftnames [cli=" + cli + ", name=" + name + ", stype=" + stype + ", lang=" + lang + ", sid=" + sid
				+ "]";
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
