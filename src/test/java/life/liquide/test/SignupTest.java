package life.liquide.test;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.SignupPage;

@Epic("Sign Up")
@Feature("User Sign Up")
public class SignupTest extends BaseMobileAutomationTest {
	private SignupPage signuppage = null;
	private final Logger logger = Logger.getLogger(SignupTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		
		logger.info("Starting of initClass method in LandingPage");
		
		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.signuppage = new SignupPage(this.getMobileDriver(udid));
		
		logger.info("Ending of initClass method in LandingPage");
	}

	
	@Test(priority = 1, description = "Verifying Signup")
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	@Description("Test Description: Verifying Signup")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Signup")
	public void testSignUp(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		
		logger.info("Starting of testSignUp method");
		
		this.signuppage.clickOnGetStartedButton();
		Assert.assertEquals(signuppage.getEnterPhoenNumberScreen(),
				expectedAssertionsProp.getProperty("enteryourphonenumber.txt"));
		System.out.println(" Enter your phone number is expected – Assert passed");

		signuppage.enterMobileNumber(testDataProp.getProperty("phonenumber"));
		Thread.sleep(1000);

		signuppage.clickOnAcceptCheckBox();

		signuppage.clickOnSendOtpButton();
		Thread.sleep(1000);
		Assert.assertEquals(signuppage.enterOTPScreen(), expectedAssertionsProp.getProperty("enterotpsent.txt"));
		System.out.println(" Enter OTP sent to is expected – Assert passed");
			
		/*
		 * signuppage.getOTPFromMessages1(); Thread.sleep(5000);
		 * 
		 * initClass(deviceName, udid, platformName, platformVersion, appPackage,
		 * appActivity); Thread.sleep(1);
		 */
		signuppage.enterOTPFiled();

		Assert.assertEquals(signuppage.threeStepsAwayScreen(),
				expectedAssertionsProp.getProperty("threestepsaway.txt"));
		System.out.println("Awesome is expected – Assert passed");

		signuppage.enterName(testDataProp.getProperty("fullname"));

		driver.hideKeyboard();

		signuppage.setAge();

		signuppage.clickOnGenderButton();
		Assert.assertEquals(signuppage.perfectTellusScreen(), expectedAssertionsProp.getProperty("perfecttellus.text"));
		System.out.println("Perfect! tell us is expected – Assert passed");

		signuppage.selectProfileButton();

		Assert.assertEquals(signuppage.setYearsScreen(), expectedAssertionsProp.getProperty("yearsofexperience.txt"));
		System.out.println("years of experience in stock investment? is expected – Assert passed");

		signuppage.selectYearButton();

		Assert.assertEquals(signuppage.referralScreen(), expectedAssertionsProp.getProperty("referral.txt"));
		System.out.println(" Do you have an Invite? is expected – Assert passed");

		Thread.sleep(1000);
		signuppage.clickOnSkip();
		Assert.assertEquals(signuppage.weHaveSoMuchtoShow(), expectedAssertionsProp.getProperty("yesletdo.txt"));
		System.out.println("We have so much to show you! Would you like to take a tour? is expected – Assert passed");
		Thread.sleep(1000);
	}

	@Test(priority = 2, description = "Verifying Authentication Screeners")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Screeners")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verifying Screeners")
	public void testScreeners() throws InterruptedException {	
	logger.info("Starting of testScreeners method");
		
	signuppage.clickOnYesLetsDoItbutton();

	signuppage.clickOnExploreHowtheMarketDoingtoday();
	signuppage.clickOnGotitNextButtonFavouriteStocks();
	signuppage.clickOnGotitNextButtonExploreMarketToday();
	signuppage.clickOnGotitNextButtonGetPortfolioUpdates();
	Thread.sleep(1000);
	signuppage.clickOnGotitNextButtonLImo();
	signuppage.clickOnGotitNextButtonLGetPortfolioHealthCheckups();
	signuppage.clickOnGotitNextButtonMarketExpendition();
	signuppage.clickOnGotitNextButtonHelpYouInvest();
	signuppage.clickOnGotitNextButtonGetSmartSellAlerts();
	signuppage.clickOnGotitNextButtonInvestSecurly();
	signuppage.clickOnStartInvesting();
	signuppage.clickOnIwillDoItLater();
	
	//signuppage .clickOnButtonLogOut();
	Assert.assertEquals(signuppage.textGetStarted(), expectedAssertionsProp.getProperty("getstrted.txt"));
	System.out.println("Get Started is expected – Assert passed");
	
	logger.info("Ending of testScreeners method");
}

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");
		
		this.quitMobileDriver(udid);
		
		logger.info("Ending of quitDriver method");
	}
}
