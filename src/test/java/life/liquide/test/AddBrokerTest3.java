package life.liquide.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;

import life.liquide.pages.AddBrokerPage3;

public class AddBrokerTest3 extends BaseMobileAutomationTest {

	private AddBrokerPage3 addBroker2= null;

	private static final Logger logger = Logger.getLogger(AddBrokerTest3.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {

		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.addBroker2 = new AddBrokerPage3(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verifying Add Broker")
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	@Description("Test Description: Verifying  Add Broker")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Adding the Broker account")
	public void connectBrokerAccount(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of connectBrokerAccount method");

		Thread.sleep(30000);
		addBroker2.addBroker();
		Thread.sleep(20000);
		addBroker2.connectBroker();
		addBroker2.clickOnPortfolioHealthCard();
		logger.info("Ending of connectBrokerAccount method");
	}
  @AfterClass
	  
	  @Parameters({ "deviceName", "udid" }) public void quitDriver(String
	  deviceName, String udid) { logger.info("Starting of quitDriver method");
	  
	  this.quitMobileDriver(udid);
	  
	  logger.info("Ending of quitDriver method"); }
	 
}
