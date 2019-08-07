package eyecon.db.api.info;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PicmatchInfo {

	@JsonInclude(Include.NON_NULL)
	private String cli;
	private int nv;
	private int nx;
	private int nbad;
	@JsonInclude(Include.NON_NULL)
	private int stype;
	@JsonInclude(Include.NON_NULL)
	private String sid;
	private String smallPicUrl;
	private String bigPicUrl;
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
	 * @return the nv
	 */
	public int getNv() {
		return nv;
	}
	/**
	 * @param nv the nv to set
	 */
	public void setNv(int nv) {
		this.nv = nv;
	}
	/**
	 * @return the nx
	 */
	public int getNx() {
		return nx;
	}
	/**
	 * @param nx the nx to set
	 */
	public void setNx(int nx) {
		this.nx = nx;
	}
	/**
	 * @return the nbad
	 */
	public int getNbad() {
		return nbad;
	}
	/**
	 * @param nbad the nbad to set
	 */
	public void setNbad(int nbad) {
		this.nbad = nbad;
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
	 * @return the smallPicUrl
	 */
	public String getSmallPicUrl() {
		return smallPicUrl;
	}
	/**
	 * @param smallPicUrl the smallPicUrl to set
	 */
	public void setSmallPicUrl(String smallPicUrl) {
		this.smallPicUrl = smallPicUrl;
	}
	/**
	 * @return the bigPicUrl
	 */
	public String getBigPicUrl() {
		return bigPicUrl;
	}
	/**
	 * @param bigPicUrl the bigPicUrl to set
	 */
	public void setBigPicUrl(String bigPicUrl) {
		this.bigPicUrl = bigPicUrl;
	}
}
