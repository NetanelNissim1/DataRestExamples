// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "srcpictype", indexes = { @Index(name = "srcpictype_cli_IX", columnList = "cli", unique = true) })
public class Srcpictype implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4909095142200230912L;
	@Id
	@Column(unique = true, nullable = false, length = 30)
	private String cli;
	@Column(name = "src_pictype", nullable = false, precision = 10)
	private int srcPictype;
	@Column(precision = 10)
	private int status;

	/** Default constructor. */
	public Srcpictype() {
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
	 * Access method for srcPictype.
	 *
	 * @return the current value of srcPictype
	 */
	public int getSrcPictype() {
		return srcPictype;
	}

	/**
	 * Setter method for srcPictype.
	 *
	 * @param aSrcPictype the new value for srcPictype
	 */
	public void setSrcPictype(int asrcPictype) {
		srcPictype = asrcPictype;
	}

	/**
	 * Access method for status.
	 *
	 * @return the current value of status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Setter method for status.
	 *
	 * @param aStatus the new value for status
	 */
	public void setStatus(int aStatus) {
		status = aStatus;
	}

	@Override
	public String toString() {
		return "Srcpictype [cli=" + cli + ", srcPictype=" + srcPictype + ", status=" + status + "]";
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
