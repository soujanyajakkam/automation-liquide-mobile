package life.liquide.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.AddBrokerPage;

@Epic("Adding Broker")
@Feature("Adding Broker Account")
public class AddBrokerTest extends BaseMobileAutomationTest {

	private AddBrokerPage addBroker = null;

	private static final Logger logger = Logger.getLogger(AddBrokerTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {

		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.addBroker = new AddBrokerPage(this.getMobileDriver(udid));

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

		addBroker.impicitWait();
		addBroker.addBroker();
		addBroker.connectBroker();

		logger.info("Ending of connectBrokerAccount method");
	}

	@Test(priority = 2, description = "Switching to Brokoer Account")
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	@Description("Test Description: Verifying  Add Broker")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Switching to Broker Account Web View")
	public void switchingToBrokerAccount(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of switchingToBrokerAccount method");

		addBroker.enterToken(testDataProp.getProperty("token"));
		addBroker.clickOnGenerateOTp();
		addBroker.getOTPFromMessages();
		initClass(deviceName, udid, platformName, platformVersion, appPackage, appActivity);
		Thread.sleep(1);

		addBroker.enterUserOTP();

		addBroker.clickOnVerify();

		addBroker.enterUserPinNumber(testDataProp.getProperty("pinnumber"));

		addBroker.clickOnSubmitButton();
		
		addBroker.clickOnYesBehind();
	    
		logger.info("Ending of switchingToBrokerAccount method");
	}
	
	  @AfterClass
	  
	  @Parameters({ "deviceName", "udid" }) public void quitDriver(String
	  deviceName, String udid) { logger.info("Starting of quitDriver method");
	  
	  this.quitMobileDriver(udid);
	  
	  logger.info("Ending of quitDriver method"); }
	 
}
