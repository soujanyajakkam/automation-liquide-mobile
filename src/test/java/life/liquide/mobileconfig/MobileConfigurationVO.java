package life.liquide.mobileconfig;

public class MobileConfigurationVO {

	private String deviceName = null;
	private String udId = null;
	private String platformName = null;
	private String platformVersion = null;
	private String appPackage= null;
	private String appActivity= null;
	//private String clientApI=null;
	

	public MobileConfigurationVO(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) {
		this.deviceName = deviceName;
		this.udId = udid;
		this.platformName = platformName;
		this.platformVersion = platformVersion;
		this.appPackage= appPackage;
		this.appActivity=appActivity;
		//this.clientApI=clientApI;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getUdId() {
		return udId;
	}

	public void setUdid(String udId) {
		this.udId = udId;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}
	
	
	
	public String getAppPackage() {
		return appPackage;
		}
		
		public void setAppPackage(String appPackage) {
			this.appPackage= appPackage;
			}
		
		public String getAppActivity() {
			return appActivity;
		}
		
		public void setAppActivity(String appActivity) {
			this.appActivity= appActivity;
		}
		/*
		 * public String getClientApiKey() {
		 * 
		 * 
		 * return clientApI; }
		 * 
		 * public void setClientApiKey(String clientApiKey) { this.clientApI =
		 * clientApiKey; }
		 */

}
