// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "good_names_for_tokens", indexes = {
		@Index(name = "goodNamesForTokensPrimary", columnList = "rand,name", unique = true) })
public class Good_Names_For_Tokens implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3585133372402039728L;
	@Id
	@Column(nullable = false, length = 6)
	private String rand;
	@Id
	@Column(nullable = false, length = 191)
	private String name;

	/** Default constructor. */
	public Good_Names_For_Tokens() {
		super();
	}

	/**
	 * Access method for rand.
	 *
	 * @return the current value of rand
	 */
	public String getRand() {
		return rand;
	}

	/**
	 * Setter method for rand.
	 *
	 * @param aRand the new value for rand
	 */
	public void setRand(String aRand) {
		rand = aRand;
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

	@Override
	public String toString() {
		return "Good_Names_For_Tokens [rand=" + rand + ", name=" + name + "]";
	}

}
