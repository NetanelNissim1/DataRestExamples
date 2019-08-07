package eyecon.db.api.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ClisocialsInfo {

	@JsonInclude(Include.NON_NULL)
	private String cli;
	@JsonInclude(Include.NON_NULL)
	private int stype;
	@JsonInclude(Include.NON_NULL)
	private String sid;
	private boolean isPublished;
	private int validityRate;

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
	 * @return the stype
	 */
	public int getStype() {
		return stype;
	}

	/**
	 * @param stype the stype to set
	 */
	public void setStype(int stype) {
		this.stype = stype;
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the isPublished
	 */
	public boolean isPublished() {
		return isPublished;
	}

	/**
	 * @param isPublished the isPublished to set
	 */
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 * @return the validityRate
	 */
	public int getValidityRate() {
		return validityRate;
	}

	/**
	 * @param validityRate the validityRate to set
	 */
	public void setValidityRate(int validityRate) {
		this.validityRate = validityRate;
	}

	@Override
	public String toString() {
		return "ClisocialsInfo [cli=" + cli + ", stype=" + stype + ", sid=" + sid + ", isPublished=" + isPublished
				+ ", validityRate=" + validityRate + "]";
	}

}
