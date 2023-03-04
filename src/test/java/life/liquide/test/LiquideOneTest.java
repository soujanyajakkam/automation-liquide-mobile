package life.liquide.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import life.liquide.apiCreation.CreationAPI;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.LiquideOnePage;

@Epic("Convert to LiquideOne")
@Feature("Convert to LiquideOne Test")
public class LiquideOneTest extends BaseMobileAutomationTest {

	private LiquideOnePage LiquideOne = null;
	private final Logger logger = Logger.getLogger(LiquideOneTest.class.getName());
	private CreationAPI createapi = new CreationAPI();
	private SignupTest signuptest = new SignupTest();

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.LiquideOne = new LiquideOnePage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verifying Liquide One funtionality")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Purchasing Liquide One funtionality")
	@Story("Verifying Purchasing Liquide One")
	public void LiquideOne() throws InterruptedException {
		logger.info("Starting of LiquideOne method");

		LiquideOne.clickOnLiquideOneImagecard();

		Assert.assertEquals(LiquideOne.textLiquideOne(), expectedAssertionsProp.getProperty("Liquideone.txt"));

		System.out.println(" Hi,Liquide One text is expected – Assert passed");

		LiquideOne.clickSelectPlanButton();
		Assert.assertEquals(LiquideOne.textSelectplan(), expectedAssertionsProp.getProperty("selectplan.txt"));

		System.out.println(" Hi,Select plan text is expected – Assert passed");
		Thread.sleep(2000);
		LiquideOne.clickOnCardAmount();
		LiquideOne.clickOnProceedButton();
		LiquideOne.clickSwitchPlanButton();
		LiquideOne.clickOnProceed999Button();
		LiquideOne.clickOnPayButton();
		LiquideOne.clickOnNetBankingImageCard();
		LiquideOne.clickYesBankImageCard();
		LiquideOne.clickOnPayNowButton();

		LiquideOne.clickSuccessButton();

		LiquideOne.clickExploreButton();
		Thread.sleep(4000);

		logger.info("Ending of LiquideOne method");
	}

	/*
	 * @Test(priority = 2, description =
	 * "Verifying Liquide One funtionality using enough Coins")
	 * 
	 * @Parameters({ "devicename" })
	 * 
	 * @Description("Test Description: Verifying Purchasing Liquide One funtionality using enough Coins"
	 * )
	 * 
	 * @Story("Verifying Purchasing Liquide One") public void
	 * liquideOneConvertionUsingCoins() throws InterruptedException {
	 * logger.info("Starting of liquideOneConvertionUsingCoins method");
	 * 
	 * //LiquideOne.clickOnLiquideOneImagecard();
	 * 
	 * Assert.assertEquals(LiquideOne.textLiquideOne(),
	 * expectedAssertionsProp.getProperty("Liquideone.txt"));
	 * 
	 * System.out.println(" Hi,Liquide One text is expected – Assert passed");
	 * 
	 * LiquideOne.clickSelectPlanButton();
	 * Assert.assertEquals(LiquideOne.textSelectplan(),
	 * expectedAssertionsProp.getProperty("selectplan.txt"));
	 * 
	 * System.out.println(" Hi,Select plan text is expected – Assert passed");
	 * Thread.sleep(2000); LiquideOne.clickOnCardAmount();
	 * LiquideOne.clickOnProceedButton(); LiquideOne.clickSwitchPlanButton();
	 * LiquideOne.clickOnProceed999Button(); LiquideOne.clickOnUseCoinsButton();
	 * LiquideOne.clickOnPay0Button(); LiquideOne.clickExploreButton();
	 * 
	 * Thread.sleep(4000);
	 * logger.info("Ending of liquideOneConvertionUsingCoins method"); }
	 */
	/*
	 * @Test(priority = 3, description =
	 * "Verifying Liquide One funtionality using CouponCode")
	 * 
	 * @Parameters({ "devicename" })
	 * 
	 * @Description("Test Description: Verifying Purchasing Liquide One funtionality using CouponCode"
	 * )
	 * 
	 * @Story("Verifying Purchasing Liquide One") public void
	 * liquideOneConvertionUsingCouponCode() throws InterruptedException {
	 * logger.info("Starting of liquideOneConvertionUsingCouponCode method");
	 * 
	 * //LiquideOne.clickOnLiquideOneImagecard();
	 * 
	 * Assert.assertEquals(LiquideOne.textLiquideOne(),
	 * expectedAssertionsProp.getProperty("Liquideone.txt"));
	 * 
	 * System.out.println(" Hi,Liquide One text is expected – Assert passed");
	 * 
	 * LiquideOne.clickSelectPlanButton();
	 * Assert.assertEquals(LiquideOne.textSelectplan(),
	 * expectedAssertionsProp.getProperty("selectplan.txt"));
	 * 
	 * System.out.println(" Hi,Select plan text is expected – Assert passed");
	 * Thread.sleep(2000); LiquideOne.clickOnCardAmount();
	 * LiquideOne.clickOnProceedButton(); LiquideOne.clickSwitchPlanButton();
	 * LiquideOne.clickOnProceed999Button(); LiquideOne.clickOnApplyCoupon();
	 * LiquideOne.clickOnCouponCode(); LiquideOne.clickOnYayThanksButton();
	 * LiquideOne.clickOnPayButton();
	 * 
	 * LiquideOne.enterEmailId(testDataProp.getProperty("emailid"));
	 * 
	 * LiquideOne.clickOnUpdateEmail();
	 * 
	 * LiquideOne.clickOnNetBankingImageCard(); LiquideOne.clickYesBankImageCard();
	 * LiquideOne.clickOnPayNowButton(); LiquideOne.clickSuccessButton();
	 * 
	 * LiquideOne.clickExploreButton();
	 * 
	 * Thread.sleep(4000);
	 * logger.info("Ending of liquideOneConvertionUsingCouponCode method"); }
	 **/
	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
