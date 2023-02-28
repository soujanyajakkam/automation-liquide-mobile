package life.liquide.test;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.loginPage;

@Epic("User Login")
@Feature("LoginTest")
public class LoginNegativeTest extends BaseMobileAutomationTest {
	private loginPage loginpage = null;
	private static final Logger logger = Logger.getLogger(LogInTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");
		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.loginpage = new loginPage(this.getMobileDriver(udid));
		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verifying Login with Invalid Data")

	@Parameters({ "devicename" })

	@Description("Test Description: Verifying Login with Invalid Data")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Verifying Login with Invalid Data")
	public void testLoginNegativeFlow() throws InterruptedException {
		logger.info("Starting of testLoginNegativeFlow method");
		loginpage.clickOnGetStartedButton();
		/*
		 * Assert.assertEquals(loginpage.getEnterPhoneNumberScreen(),
		 * expectedAssertionsProp.getProperty("Enteryourphonenumber.text"));
		 * System.out.println(" Enter your phone number is expected – Assert passed");
		 */	
		loginpage.enterMobileNumber(testDataProp.getProperty("PhoneNumberSpecial"));
		loginpage.clearData();
		loginpage.enterMobileNumber(testDataProp.getProperty("PhoneNumberSpaces"));
		loginpage.clearData();
		
		loginpage.clickOnCountryDropdown();
		/*
		 * Assert.assertEquals(loginpage.textSelectCountry(),expectedAssertionsProp.
		 * getProperty("selectcountry.txt"));
		 * System.out.println(" Select your country text is expected – Assert passed");
		 */
		loginpage.clickOnAustrilaCountry();
		loginpage.clickOnSelectButton();
		loginpage.enterMobileNumber(testDataProp.getProperty("miscombinationOfContryCode&Mobilenumber"));
		loginpage.clickOnAcceptCheckBox();
		loginpage.clickOnSendOtpButton();
		loginpage.clickOnAlertButton();

		loginpage.clickOnCountryDropdown();
		/*
		 * Assert.assertEquals(loginpage.textSelectCountry(),expectedAssertionsProp.
		 * getProperty("selectcountry.txt"));
		 * System.out.println(" Select your country text is expected – Assert passed");
		 */loginpage.clickOnCanadaCountry();
		loginpage.clickOnSelectButton();
		loginpage.enterMobileNumber(testDataProp.getProperty("miscombinationOfContryCode&Mobilenumber"));
		loginpage.clickOnSendOtpButton();
		loginpage.clickOnAlertButton();

		loginpage.clickOnCountryDropdown();
		/*
		 * Assert.assertEquals(loginpage.textSelectCountry(),expectedAssertionsProp.
		 * getProperty("selectcountry.txt"));
		 * System.out.println(" Select your country text is expected – Assert passed");
		 */	
		loginpage.clickOnUnitedArabCountry();;
		loginpage.clickOnSelectButton();
		loginpage.enterMobileNumber(testDataProp.getProperty("miscombinationOfContryCode&Mobilenumber"));
		loginpage.clickOnSendOtpButton();
		loginpage.clickOnAlertButton();
		
		loginpage.clickOnCountryDropdown();
		/*
		 * Assert.assertEquals(loginpage.textSelectCountry(),expectedAssertionsProp.
		 * getProperty("selectcountry.txt"));
		 * System.out.println(" Select your country text is expected – Assert passed");
		 */	loginpage.clickOnAmericACountry();
		loginpage.clickOnSelectButton();
		loginpage.enterMobileNumber(testDataProp.getProperty("miscombinationOfContryCode&Mobilenumber"));
		loginpage.clickOnSendOtpButton();
		loginpage.clickOnAlertButton();
		
		loginpage.clickOnCountryDropdown();
		/*
		 * Assert.assertEquals(loginpage.textSelectCountry(),expectedAssertionsProp.
		 * getProperty("selectcountry.txt"));
		 * System.out.println(" Select your country text is expected – Assert passed");
		 */
		loginpage.clickOnIndiaCountry();
		loginpage.clickOnSelectButton();
		loginpage.enterMobileNumber(testDataProp.getProperty("Number"));
		loginpage.clickOnSendOtpButton();
		loginpage.clickOnAlertButton();
		
		loginpage.enterMobileNumber(testDataProp.getProperty("validNumber"));
		loginpage.clearData();
		loginpage.enterMobileNumber(testDataProp.getProperty("validNumber"));
		loginpage.clickOnSendOtpButton();
		loginpage.InvalidOTP();
		
		logger.info("Ending of testLoginNegativeFlow method");
	}

}
