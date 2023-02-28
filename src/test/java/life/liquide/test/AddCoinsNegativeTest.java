package life.liquide.test;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.AddCoinsNegativePage;

public class AddCoinsNegativeTest extends BaseMobileAutomationTest {

	private AddCoinsNegativePage addCoins = null;
	private static final Logger logger = Logger.getLogger(AddCoinsNegativePage.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.addCoins = new AddCoinsNegativePage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verify Add Coins")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Add Coins funtionality")
	@Story("Asking Limo about stock")
	public void AddCoins() throws InterruptedException {
		logger.info("Starting of AddCoins method");

		addCoins.clickOnimgcrdCoins();
		addCoins.clickOnAddCoinsButton();
		addCoins.clickOncardCoinsTopUp();
		addCoins.clickOnPayButton();

		addCoins.enterEmailId(testDataProp.getProperty("emptyemail"));

		addCoins.clickOnUpdateEmail();
		
		/*
		 * Assert.assertEquals(addCoins.textEmail(),
		 * expectedAssertionsProp.getProperty("alert.txt")); System.out.
		 * println("Please enter valid email address is expected – Assert passed");
		 */
		
		addCoins.clickOnButtonOk();
		
		addCoins.enterEmailId(testDataProp.getProperty("Aplhabetemail"));

		addCoins.clickOnUpdateEmail();

		/*
		 * Assert.assertEquals(addCoins.textEmail(),
		 * expectedAssertionsProp.getProperty("alert.txt")); System.out.
		 * println("Please enter valid email address is expected – Assert passed");
		 */		
		addCoins.clickOnButtonOk();
		
		addCoins.doubleClickOntextfiled();
		
		addCoins.enterEmailId(testDataProp.getProperty("Numericemail"));

		addCoins.clickOnUpdateEmail();

		/*
		 * Assert.assertEquals(addCoins.textEmail(),
		 * expectedAssertionsProp.getProperty("alert.txt")); System.out.
		 * println("Please enter valid email address is expected – Assert passed");
		 */
		
		addCoins.clickOnButtonOk();
		
		addCoins.doubleClickOntextfiled();
		
		addCoins.enterEmailId(testDataProp.getProperty("specialEmail"));

		addCoins.clickOnUpdateEmail();

		/*
		 * Assert.assertEquals(addCoins.textEmail(),
		 * expectedAssertionsProp.getProperty("alert.txt")); System.out.
		 * println("Please enter valid email address is expected – Assert passed");
		 */
		
		addCoins.clickOnButtonOk();
		
		addCoins.doubleClickOntextfiled();
		logger.info("Ending of AddCoins method");
	}

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
