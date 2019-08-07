package eyecon.db.api.info;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserInfo {

	@JsonInclude(Include.NON_NULL)
	private String clientId;
	private String gRegId;
	private String aRegId;
	@JsonInclude(Include.NON_NULL)
	private String cli;
	private String deviceName;
	private String os;
	private int osType;
	private String clientVer;
	@JsonInclude(Include.NON_NULL)
	private int clientVerIncrement;
	@JsonInclude(Include.NON_NULL)
	private Timestamp creationTime;
	@JsonInclude(Include.NON_NULL)
	private Timestamp lastJoinTime;
	private String creationIp;
	private String blockingReason;
	private int nUnviewPics;
	private String userLang;
	private boolean anythingNew;
	private String cliCc;
	private int nlikes;
	private String advId;
	private String publicId;	
	private boolean is_same_device_name;
	private boolean is_first_rejoin;
	private long last_join_time;
	
	/**
	 * @return the is_same_device_name
	 */
	public boolean isIs_same_device_name() {
		return is_same_device_name;
	}
	/**
	 * @param is_same_device_name the is_same_device_name to set
	 */
	public void setIs_same_device_name(boolean is_same_device_name) {
		this.is_same_device_name = is_same_device_name;
	}
	/**
	 * @return the is_first_rejoin
	 */
	public boolean isIs_first_rejoin() {
		return is_first_rejoin;
	}
	/**
	 * @param is_first_rejoin the is_first_rejoin to set
	 */
	public void setIs_first_rejoin(boolean is_first_rejoin) {
		this.is_first_rejoin = is_first_rejoin;
	}
	/**
	 * @return the last_join_time
	 */
	public long getLast_join_time() {
		return last_join_time;
	}
	/**
	 * @param last_join_time the last_join_time to set
	 */
	public void setLast_join_time(long last_join_time) {
		this.last_join_time = last_join_time;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the gRegId
	 */
	public String getgRegId() {
		return gRegId;
	}
	/**
	 * @param gRegId the gRegId to set
	 */
	public void setgRegId(String gRegId) {
		this.gRegId = gRegId;
	}
	/**
	 * @return the aRegId
	 */
	public String getaRegId() {
		return aRegId;
	}
	/**
	 * @param aRegId the aRegId to set
	 */
	public void setaRegId(String aRegId) {
		this.aRegId = aRegId;
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
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}
	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}
	/**
	 * @return the osType
	 */
	public int getOsType() {
		return osType;
	}
	/**
	 * @param osType the osType to set
	 */
	public void setOsType(int osType) {
		this.osType = osType;
	}
	/**
	 * @return the clientVer
	 */
	public String getClientVer() {
		return clientVer;
	}
	/**
	 * @param clientVer the clientVer to set
	 */
	public void setClientVer(String clientVer) {
		this.clientVer = clientVer;
	}
	/**
	 * @return the clientVerIncrement
	 */
	public int getClientVerIncrement() {
		return clientVerIncrement;
	}
	/**
	 * @param clientVerIncrement the clientVerIncrement to set
	 */
	public void setClientVerIncrement(int clientVerIncrement) {
		this.clientVerIncrement = clientVerIncrement;
	}
	/**
	 * @return the creationTime
	 */
	public Timestamp getCreationTime() {
		return creationTime;
	}
	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	/**
	 * @return the lastJoinTime
	 */
	public Timestamp getLastJoinTime() {
		return lastJoinTime;
	}
	/**
	 * @param lastJoinTime the lastJoinTime to set
	 */
	public void setLastJoinTime(Timestamp lastJoinTime) {
		this.lastJoinTime = lastJoinTime;
	}
	/**
	 * @return the creationIp
	 */
	public String getCreationIp() {
		return creationIp;
	}
	/**
	 * @param creationIp the creationIp to set
	 */
	public void setCreationIp(String creationIp) {
		this.creationIp = creationIp;
	}
	/**
	 * @return the blockingReason
	 */
	public String getBlockingReason() {
		return blockingReason;
	}
	/**
	 * @param blockingReason the blockingReason to set
	 */
	public void setBlockingReason(String blockingReason) {
		this.blockingReason = blockingReason;
	}
	/**
	 * @return the nUnviewPics
	 */
	public int getnUnviewPics() {
		return nUnviewPics;
	}
	/**
	 * @param nUnviewPics the nUnviewPics to set
	 */
	public void setnUnviewPics(int nUnviewPics) {
		this.nUnviewPics = nUnviewPics;
	}
	/**
	 * @return the userLang
	 */
	public String getUserLang() {
		return userLang;
	}
	/**
	 * @param userLang the userLang to set
	 */
	public void setUserLang(String userLang) {
		this.userLang = userLang;
	}
	/**
	 * @return the anythingNew
	 */
	public boolean isAnythingNew() {
		return anythingNew;
	}
	/**
	 * @param anythingNew the anythingNew to set
	 */
	public void setAnythingNew(boolean anythingNew) {
		this.anythingNew = anythingNew;
	}
	/**
	 * @return the cliCc
	 */
	public String getCliCc() {
		return cliCc;
	}
	/**
	 * @param cliCc the cliCc to set
	 */
	public void setCliCc(String cliCc) {
		this.cliCc = cliCc;
	}
	/**
	 * @return the nlikes
	 */
	public int getNlikes() {
		return nlikes;
	}
	/**
	 * @param nlikes the nlikes to set
	 */
	public void setNlikes(int nlikes) {
		this.nlikes = nlikes;
	}
	/**
	 * @return the advId
	 */
	public String getAdvId() {
		return advId;
	}
	/**
	 * @param advId the advId to set
	 */
	public void setAdvId(String advId) {
		this.advId = advId;
	}
	/**
	 * @return the publicId
	 */
	public String getPublicId() {
		return publicId;
	}
	/**
	 * @param publicId the publicId to set
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}


}
