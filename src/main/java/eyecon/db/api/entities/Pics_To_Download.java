// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "pics_to_download", indexes = {
		@Index(name = "pics_to_download_cli_IX", columnList = "cli", unique = true) })
public class Pics_To_Download implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881476697853176946L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(name = "big_pic_url", nullable = false, length = 300)
	private String bigPicUrl;
	@Column(nullable = false, length = 3)
	private boolean status;

	/** Default constructor. */
	public Pics_To_Download() {
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
		return "Pics_To_Download [cli=" + cli + ", bigPicUrl=" + bigPicUrl + ", status=" + status + "]";
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
