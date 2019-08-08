package eyecon.db.api.id;

import java.io.Serializable;

public class PicmatchId implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cli;
	private int stype;
	private String sid;

	public PicmatchId() {
	}

	public PicmatchId(String cli, int stype, String sid) {
		this.cli = cli;
		this.stype = stype;
		this.sid = sid;
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
