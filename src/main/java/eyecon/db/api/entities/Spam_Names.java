// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "spam_names", indexes = { @Index(name = "spamNamesPrimary", columnList = "cli,name", unique = true) })
public class Spam_Names implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8734752146847586228L;
	@Id
	@Column(nullable = false, precision = 20)
	private long cli;
	@Id
	@Column(nullable = false, length = 191)
	private String name;
	@Column(length = 10)
	private String lang;
	@Column(nullable = false, precision = 10)
	private int rate;

	/** Default constructor. */
	public Spam_Names() {
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
	 * Access method for rate.
	 *
	 * @return the current value of rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * Setter method for rate.
	 *
	 * @param aRate the new value for rate
	 */
	public void setRate(int aRate) {
		rate = aRate;
	}

	@Override
	public String toString() {
		return "Spam_Names [cli=" + cli + ", name=" + name + ", lang=" + lang + ", rate=" + rate + "]";
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
