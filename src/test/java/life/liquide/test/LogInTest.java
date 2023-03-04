package life.liquide.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.loginPage;
import life.liquide.utils.TestUtil;
import life.liquide.utils.dataprovider;

@Epic("User Login")
@Feature("LoginTest")
public class LogInTest extends BaseMobileAutomationTest {

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

	@Test(priority = 1, description = "Verifying Welcome Page")

	@Parameters({ "devicename" })

	@Description("Test Description: Verifying Welcome Page")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Verifying Welcome page")
	public void testLogin() throws InterruptedException {
		logger.info("Starting of testLogin method");
		Thread.sleep(10000);
		loginpage.clickOnGetStartedButton();
		Assert.assertEquals(loginpage.getEnterPhoneNumberScreen(),
				expectedAssertionsProp.getProperty("Enteryourphonenumber.text"));
		System.out.println(" Enter your phone number text is expected – Assert passed");
		loginpage.enterMobileNumber(testDataProp.getProperty("PhoneNumber"));
		loginpage.clickOnAcceptCheckBox();

		loginpage.clickOnSendOtpButton();
		loginpage.txtOTpFirstIndex();
		Thread.sleep(1000); // loginpage.txtOTpFirstIndex();
		// loginpage.clickOnButtonLogOut();
		logger.info("Ending of testLogin method");
	}

	/*
	 * @DataProvider public Object[][] getLoginData(){ Object
	 * data=dataprovider.getTestData("Login"); return (Object[][]) data; }
	 * 
	 * @Test(dataProvider="getLoginData") public void loginTest(String
	 * mobilenumber,String Otp) throws InterruptedException {
	 * loginpage.clickOnGetStartedButton(); driver.findElement(By.
	 * xpath("//android.widget.EditText[@text = '000 000 0000']")).sendKeys(
	 * mobilenumber);
	 * 
	 * loginpage.clickOnAcceptCheckBox(); loginpage.clickOnSendOtpButton();
	 * driver.findElement(AppiumBy.xpath(
	 * "//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).sendKeys(Otp)
	 * ;
	 * 
	 * }
	 */

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");
		this.quitMobileDriver(udid);
		logger.info("Ending of quitDriver method");
	}
}
