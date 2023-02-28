package life.liquide.test;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.AskLimoPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Asking Limo for the Stock Details")
@Feature("Ask Limo Test")
public class AskLimoTest extends BaseMobileAutomationTest {

	private AskLimoPage askLimo = null;
	private static final Logger logger = Logger.getLogger(AskLimoTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.askLimo = new AskLimoPage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verifying AskLImo funtionality")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying AskLImo funtionality")
	@Story("Asking Limo about stock")
	public void AskLimo() throws InterruptedException {
		logger.info("Starting of AskLimo method");

		askLimo.impicitWait();
		askLimo.clickOnLimoIcon();

		Assert.assertEquals(askLimo.textLimo(), expectedAssertionsProp.getProperty("iamlimo.txt"));
		System.out.println(" Hi, I am LiMo! is expected – Assert passed");

		askLimo.clickOnAskLimoButton();

		Assert.assertEquals(askLimo.textQuestion(), expectedAssertionsProp.getProperty("question.txt"));
		System.out.println("1.Which stock should LiMo help you with? is expected – Assert passed");
		
		askLimo.clickOnSearchIcon();
		askLimo.enterStockName(testDataProp.getProperty("searchstock"));
		askLimo.clickOnAppearedStock();
		askLimo.clickOnOwnThisStockAlredy();
		askLimo.clickOnInvestPeriod();
		askLimo.enterAdditionalInformation(testDataProp.getProperty("addtionalinfo"));
		
		driver.hideKeyboard();
		
		askLimo.clickOnSubmit();
		
        Assert.assertEquals(askLimo.screenAfterSubmit(), expectedAssertionsProp.getProperty("limo.txt"));
 		System.out.println("Limo screen expected – Assert passed");

 		askLimo.screenResult();
 		Thread.sleep(20000);
		logger.info("Ending of AskLimo method");
	}

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
