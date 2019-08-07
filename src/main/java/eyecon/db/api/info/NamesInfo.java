package eyecon.db.api.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class NamesInfo {

	@JsonInclude(Include.NON_NULL)
	private String cli;
	@JsonInclude(Include.NON_NULL)
	private String name;
	@JsonInclude(Include.NON_NULL)
	private String lang;
	@JsonInclude(Include.NON_NULL)
	private int chosenByType;
	private int quantity;
	@JsonInclude(Include.NON_NULL)
	private boolean hide;
	@JsonInclude(Include.NON_NULL)
	private boolean status;

	/**
	 * @return the cli
	 */
	public String getCli() {
		return cli;
	}

	/**
	 * @param cli the cli to set
	 */
	public void setCli(String cli) {
		this.cli = cli;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 * @return the chosenByType
	 */
	public int getChosenByType() {
		return chosenByType;
	}

	/**
	 * @param chosenByType the chosenByType to set
	 */
	public void setChosenByType(int chosenByType) {
		this.chosenByType = chosenByType;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the hide
	 */
	public boolean isHide() {
		return hide;
	}

	/**
	 * @param hide the hide to set
	 */
	public void setHide(boolean hide) {
		this.hide = hide;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "NamesInfo [cli=" + cli + ", name=" + name + ", lang=" + lang + ", chosenByType=" + chosenByType
				+ ", quantity=" + quantity + ", hide=" + hide + ", status=" + status + "]";
	}

}
