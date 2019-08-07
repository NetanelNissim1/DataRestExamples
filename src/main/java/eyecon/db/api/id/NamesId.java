package eyecon.db.api.id;

import java.io.Serializable;

public class NamesId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cli;
	private String name;
	private String lang;
	private int chosenByType;

	
	
	public NamesId() {
	}

	public NamesId(String cli, String name, String lang, int chosenByType) {
		this.cli = cli;
		this.name = name;
		this.lang = lang;
		this.chosenByType = chosenByType;
	}

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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
