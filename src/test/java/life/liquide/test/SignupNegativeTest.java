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
import life.liquide.pages.SignupNegativePage;



	@Epic("User Signup")
	@Feature("SignupTest")
	public class SignupNegativeTest extends BaseMobileAutomationTest {
		private SignupNegativePage signupNegative = null;
		private static final Logger logger = Logger.getLogger(SignupNegativeTest.class.getName());

		@BeforeClass
		@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
		public void initClass(String deviceName, String udid, String platformName, String platformVersion,
				String appPackage, String appActivity) throws Exception {
			logger.info("Starting of initClass method in LandingPage");
			MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
					platformVersion, appPackage, appActivity);
			this.initMobileDriver(mobileConfigurationVO);
			this.signupNegative = new SignupNegativePage(this.getMobileDriver(udid));
			logger.info("Ending of initClass method in LandingPage");
		}

	/*@Test(priority = 1, description = "Verifying SignUp with Invalid Data")

		@Parameters({ "devicename" })

		@Description("Test Description: Verifying SignUp with Invalid Data")

		@Severity(SeverityLevel.BLOCKER)

		@Story("Verifying SignUp with Invalid Data")
		public void testSignUp() throws InterruptedException {
			logger.info("Starting of testSignUp method");
			signupNegative.clickOnGetStartedButton();
			
		    Assert.assertEquals(signupNegative.getEnterPhoenNumberScreen(),expectedAssertionsProp.getProperty("Enteryourphonenumber.text"));
			System.out.println(" Enter your phone number is expected – Assert passed");
			 	
			signupNegative.enterMobileNumber(testDataProp.getProperty("PhoneNumberNumerics"));
			signupNegative.clearData();
			signupNegative.enterMobileNumber(testDataProp.getProperty("PhoneNumberSpecial"));
			signupNegative.clearData();
			
			signupNegative.clickOnCountryDropdown();
			signupNegative.clickOnAustrilaCountry();
			signupNegative.clickOnSelectButton();
			signupNegative.enterMobileNumber(testDataProp.getProperty("miscombinationOfContryCode&Mobilenumber"));
			signupNegative.clickOnAcceptCheckBox();
			signupNegative.clickOnSendOtpButton();
			signupNegative.clickOnAlertButton();

			signupNegative.clickOnCountryDropdown();
			
			signupNegative.clickOnIndiaCountry();
			signupNegative.clickOnSelectButton();
			signupNegative.enterMobileNumber(testDataProp.getProperty("validNumber"));
			signupNegative.clickOnSendOtpButton();
			signupNegative.InvalidOTP();
			signupNegative.clickOnAlertButton();
			
			signupNegative.enterMobileNumber(testDataProp.getProperty("validNumber"));
			signupNegative.clickOnSendOtpButton();
			signupNegative.InvalidOTP1();
			signupNegative.clickOnAlertButton();
			
			
			logger.info("Ending of testSignUp method");
		}*/
		@Test(priority = 2, description = "Verifying SignUp with Invalid Data")

		@Parameters({ "devicename" })

		@Description("Test Description: Verifying SignUp with Invalid Data")

		@Severity(SeverityLevel.BLOCKER)

		@Story("Verifying SignUp with Invalid Data")
		public void enterInvalidDetails() throws InterruptedException {
			logger.info("Starting of enterInvalidDetails method");

			Assert.assertEquals(signupNegative.threeStepsAwayScreen(),expectedAssertionsProp.getProperty("threestepsaway.txt"));
			System.out.println("Awesome is expected – Assert passed");
			signupNegative.enterName(testDataProp.getProperty("AlphaNumericName"));
			driver.hideKeyboard();
			signupNegative.setAge();
			signupNegative.clickOnGenderButton();
			signupNegative.clickOnProccedButton();
			Assert.assertEquals(signupNegative.popUpPleaseEnterValidName(),expectedAssertionsProp.getProperty("pleasenetervalidname.txt"));
			System.out.println("Please enter a valid name is expected – Assert passed");
			signupNegative.okButton();
			
			signupNegative.clickOnName();
			
			signupNegative.enterName(testDataProp.getProperty("ValidName"));
			signupNegative.clickOnProccedButton();
			
			Assert.assertEquals(signupNegative.perfectTellusScreen(), expectedAssertionsProp.getProperty("perfecttellus.text"));
			System.out.println("Perfect! tell us is expected – Assert passed");
			signupNegative.clickOnBlackSpace();
			signupNegative.clickOnProccedButton();

			signupNegative.selectProfileButton();
			Assert.assertEquals(signupNegative.setYearsScreen(), expectedAssertionsProp.getProperty("yearsofexperience.txt"));
			System.out.println("years of experience in stock investment? is expected – Assert passed");
			signupNegative.clickOnBlackSpace();
			signupNegative.clickOnProccedButton();
			
			signupNegative.selectYearButton();
			Assert.assertEquals(signupNegative.referralScreen(), expectedAssertionsProp.getProperty("referral.txt"));
			System.out.println(" Do you have an Invite? is expected – Assert passed");

		/*	signupNegative.enterReferralCode(testDataProp.getProperty("inactivecode"));
			signupNegative.clickOnSubmitButton();
			
			signupNegative.enterReferralCode(testDataProp.getProperty("invalidReferral"));
			signupNegative.clickOnSubmitButton();
			
			signupNegative.enterReferralCode(testDataProp.getProperty("spacesReferral"));
			signupNegative.clickOnSubmitButton();
			
			signupNegative.enterReferralCode(testDataProp.getProperty("emptyReferral"));
			signupNegative.clickOnSubmitButton();*/
			
			logger.info("Ending of enterInvalidDetails method");
		
		}
	}
