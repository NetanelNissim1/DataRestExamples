// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "good_uc_name_tokens_old", indexes = {
		@Index(name = "good_uc_name_tokens_old_name_token_IX", columnList = "name_token", unique = true) })
public class Good_Uc_Name_Tokens_Old implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3184712244612988164L;
	@Id
	@Column(name = "name_token", unique = true, nullable = false, length = 40)
	private String nameToken;

	/** Default constructor. */
	public Good_Uc_Name_Tokens_Old() {
		super();
	}

	/**
	 * Access method for nameToken.
	 *
	 * @return the current value of nameToken
	 */
	public String getNameToken() {
		return nameToken;
	}

	/**
	 * Setter method for nameToken.
	 *
	 * @param aNameToken the new value for nameToken
	 */
	public void setNameToken(String aNameToken) {
		nameToken = aNameToken;
	}

	@Override
	public String toString() {
		return "Good_Uc_Name_Tokens_Old [nameToken=" + nameToken + "]";
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
