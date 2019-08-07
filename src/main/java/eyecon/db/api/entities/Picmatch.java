// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import eyecon.db.api.id.PicmatchId;

@Entity
@Table(name = "picmatch", indexes = { @Index(name = "picmatchPrimary", columnList = "cli,stype,sid", unique = true) })
@IdClass(PicmatchId.class)
public class Picmatch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7354890518621299891L;
	@Id
	@Column(nullable = false, length = 30)
	private String cli;
	@Column(precision = 10)
	private int nv;
	@Column(precision = 10)
	private int nx;
	@Column(precision = 10)
	private int nbad;
	@Id
	@Column(nullable = false, precision = 10)
	private int stype;
	@Id
	@Column(nullable = false, length = 254)
	private String sid;
	@Column(name = "small_pic_url", nullable = false, length = 300)
	private String smallPicUrl;
	@Column(name = "big_pic_url", nullable = false, length = 300)
	private String bigPicUrl;

	/** Default constructor. */
	public Picmatch() {
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
	 * Access method for nv.
	 *
	 * @return the current value of nv
	 */
	public int getNv() {
		return nv;
	}

	/**
	 * Setter method for nv.
	 *
	 * @param aNv the new value for nv
	 */
	public void setNv(int aNv) {
		nv = aNv;
	}

	/**
	 * Access method for nx.
	 *
	 * @return the current value of nx
	 */
	public int getNx() {
		return nx;
	}

	/**
	 * Setter method for nx.
	 *
	 * @param aNx the new value for nx
	 */
	public void setNx(int aNx) {
		nx = aNx;
	}

	/**
	 * Access method for nbad.
	 *
	 * @return the current value of nbad
	 */
	public int getNbad() {
		return nbad;
	}

	/**
	 * Setter method for nbad.
	 *
	 * @param aNbad the new value for nbad
	 */
	public void setNbad(int aNbad) {
		nbad = aNbad;
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

	/**
	 * Access method for smallPicUrl.
	 *
	 * @return the current value of smallPicUrl
	 */
	public String getSmallPicUrl() {
		return smallPicUrl;
	}

	/**
	 * Setter method for smallPicUrl.
	 *
	 * @param aSmallPicUrl the new value for smallPicUrl
	 */
	public void setSmallPicUrl(String aSmallPicUrl) {
		smallPicUrl = aSmallPicUrl;
	}

	/**
	 * Access method for bigPicUrl.
	 *
	 * @return the current value of bigPicUrl
	 */
	public String getBigPicUrl() {
		return bigPicUrl;
	}

	/**
	 * Setter method for bigPicUrl.
	 *
	 * @param aBigPicUrl the new value for bigPicUrl
	 */
	public void setBigPicUrl(String aBigPicUrl) {
		bigPicUrl = aBigPicUrl;
	}

	@Override
	public String toString() {
		return "Picmatch [cli=" + cli + ", nv=" + nv + ", nx=" + nx + ", nbad=" + nbad + ", stype=" + stype + ", sid="
				+ sid + ", smallPicUrl=" + smallPicUrl + ", bigPicUrl=" + bigPicUrl + "]";
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
