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
import life.liquide.pages.AddBrokerPage2;

@Epic("Adding Broker")
@Feature("Adding Broker Account")
public class AddBrokerTest2 extends BaseMobileAutomationTest {

	private AddBrokerPage2 addBroker1 = null;

	private static final Logger logger = Logger.getLogger(AddBrokerTest2.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {

		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.addBroker1 = new AddBrokerPage2(this.getMobileDriver(udid));

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
        //addBroker1.impicitWait();
		addBroker1.addBroker();
		 Thread.sleep(000);
		 addBroker1.connectBroker();
		
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
		addBroker1.impicitWait();
		addBroker1.enterToken(testDataProp.getProperty("num"));
		
		addBroker1.clickOnGenerateOTp();
		
		addBroker1.getOTPFromMessages();
		
		initClass(deviceName, udid, platformName, platformVersion, appPackage, appActivity);
		Thread.sleep(1);

		addBroker1.enterUserOTP();

		addBroker1.clickOnVerify();

		addBroker1.enterUserPinNumber(testDataProp.getProperty("pin"));		
		
		logger.info("Ending of switchingToBrokerAccount method");
	}
	
	@Test(priority = 3, description = "Confirming the Broker")
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	@Description("Test Description: Confirming the Broker")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Confirming the Broker Account")
	public void confirmBrokerAccount() throws InterruptedException {
		{
			addBroker1.clickOnSubmitButton();
			
		}
	}
	  @AfterClass
	  
	  @Parameters({ "deviceName", "udid" }) public void quitDriver(String
	  deviceName, String udid) { 
		  
		  logger.info("Starting of quitDriver method");
	  
	  this.quitMobileDriver(udid);
	  
	  logger.info("Ending of quitDriver method"); }
	 
	 
}
