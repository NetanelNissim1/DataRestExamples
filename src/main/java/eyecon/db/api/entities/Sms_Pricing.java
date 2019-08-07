// Generated with g9.

package eyecon.db.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "sms_pricing", indexes = {
		@Index(name = "smsPricingPrimary", columnList = "provider_id,cc,carrier", unique = true) })
public class Sms_Pricing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8225965111808545229L;
	@Id
	@Column(name = "provider_id", nullable = false, precision = 10)
	private int providerId;
	@Id
	@Column(nullable = false, length = 5)
	private String cc;
	@Id
	@Column(nullable = false, length = 100)
	private String carrier;
	@Column(nullable = false, precision = 10, scale = 6)
	private BigDecimal price;

	/** Default constructor. */
	public Sms_Pricing() {
		super();
	}

	/**
	 * Access method for providerId.
	 *
	 * @return the current value of providerId
	 */
	public int getProviderId() {
		return providerId;
	}

	/**
	 * Setter method for providerId.
	 *
	 * @param aProviderId the new value for providerId
	 */
	public void setProviderId(int aProviderId) {
		providerId = aProviderId;
	}

	/**
	 * Access method for cc.
	 *
	 * @return the current value of cc
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * Setter method for cc.
	 *
	 * @param aCc the new value for cc
	 */
	public void setCc(String aCc) {
		cc = aCc;
	}

	/**
	 * Access method for carrier.
	 *
	 * @return the current value of carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * Setter method for carrier.
	 *
	 * @param aCarrier the new value for carrier
	 */
	public void setCarrier(String aCarrier) {
		carrier = aCarrier;
	}

	/**
	 * Access method for price.
	 *
	 * @return the current value of price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Setter method for price.
	 *
	 * @param aPrice the new value for price
	 */
	public void setPrice(BigDecimal aPrice) {
		price = aPrice;
	}

	@Override
	public String toString() {
		return "Sms_Pricing [providerId=" + providerId + ", cc=" + cc + ", carrier=" + carrier + ", price=" + price
				+ "]";
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
