// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import eyecon.db.api.id.NamesId;

@Entity
@Table(name = "names", indexes = {
		@Index(name = "namesPrimary", columnList = "cli,name,lang,chosen_by_type", unique = true) })
@IdClass(NamesId.class)
public class Names implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6512178960241960462L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Id
	@Column(nullable = false, length = 191)
	private String name;
	@Id
	@Column(nullable = false, length = 10)
	private String lang;
	@Id
	@Column(name = "chosen_by_type", nullable = false, precision = 10)
	private int chosenByType;
	@Column(precision = 10)
	private int quantity;
	@Column(nullable = false, length = 3)
	private boolean hide;
	@Column(nullable = false, length = 3)
	private boolean status;

	/** Default constructor. */
	public Names() {
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
	 * Access method for chosenByType.
	 *
	 * @return the current value of chosenByType
	 */
	public int getChosenByType() {
		return chosenByType;
	}

	/**
	 * Setter method for chosenByType.
	 *
	 * @param aChosenByType the new value for chosenByType
	 */
	public void setChosenByType(int aChosenByType) {
		chosenByType = aChosenByType;
	}

	/**
	 * Access method for quantity.
	 *
	 * @return the current value of quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter method for quantity.
	 *
	 * @param aQuantity the new value for quantity
	 */
	public void setQuantity(int aQuantity) {
		quantity = aQuantity;
	}

	/**
	 * Access method for hide.
	 *
	 * @return true if and only if hide is currently true
	 */
	public boolean getHide() {
		return hide;
	}

	/**
	 * Setter method for hide.
	 *
	 * @param aHide the new value for hide
	 */
	public void setHide(boolean aHide) {
		hide = aHide;
	}

	/**
	 * Access method for status.
	 *
	 * @return true if and only if status is currently true
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * Setter method for status.
	 *
	 * @param aStatus the new value for status
	 */
	public void setStatus(boolean aStatus) {
		status = aStatus;
	}

	@Override
	public String toString() {
		return "Names [cli=" + cli + ", name=" + name + ", lang=" + lang + ", chosenByType=" + chosenByType
				+ ", quantity=" + quantity + ", hide=" + hide + ", status=" + status + "]";
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
