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
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;

import life.liquide.pages.ScreenersPage;

@Epic("Unlocking Screeners as a new user using coins")
@Feature("Unlocking Screeners")

public class ScreenersTest extends BaseMobileAutomationTest{	
	
		private ScreenersPage screeners = null;
		private final Logger logger = Logger.getLogger(InviteNowTest.class.getName());

		@BeforeClass
		@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
		public void initClass(String deviceName, String udid, String platformName, String platformVersion,
				String appPackage, String appActivity) throws Exception {
			logger.info("Starting of initClass method in LandingPage");

			MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
					platformVersion, appPackage, appActivity);
			this.initMobileDriver(mobileConfigurationVO);
			this.screeners = new ScreenersPage(this.getMobileDriver(udid));

			logger.info("Ending of initClass method in LandingPage");
		}

		@Test(priority = 1, description = "As a New user Unlocking the Screeners by paying coins")
		@Parameters({ "devicename" })
		@Description("Test Description: Verify Unlocking Screeners")
		@Story("Verify Unlocking Screeners")
		public void NewUserScreeners() throws InterruptedException {
			logger.info("Starting of NewUserScreeners method");
			
			screeners.clickOnMarketsTab();
			screeners.clickOnScreenersSection();
			/*
			 * Assert.assertEquals(screeners.textPremiumScreeners(),expectedAssertionsProp.
			 * getProperty("premium.txt"));
			 * System.out.println(" Hi,Premium Screeners! text is expected – Assert passed"
			 * );
			 */
             
			screeners.clickonBreakOut();
			Assert.assertEquals(screeners.TextGetAccess(),expectedAssertionsProp.getProperty("getaccess.txt"));
		    System.out.println(" Hi,Get access to all paid screeners for 7 days at text is expected – Assert passed");

		    screeners.clickOnButtonPay50CoinsInstead();
		    Assert.assertEquals(screeners.textBuyScreeners(),expectedAssertionsProp.getProperty("BuyScreeners.txt"));
		    System.out.println(" Hi,Buy Screeners text is expected – Assert passed");
		   
		    screeners.clickOnButtonPay50coins();
		    Assert.assertEquals(screeners.textAddCoins(),expectedAssertionsProp.getProperty("addcoins.txt"));
		    System.out.println(" Hi,Add Coins text is expected – Assert passed");
		   
		    screeners.clickOnbuttonPay50();
		    
		    screeners.ImagcardNetBanking();
		    screeners.clickOnOnebank();
		    screeners.clickonButtonPayNow();
		    
		    Assert.assertEquals(screeners.textRazorPay(),expectedAssertionsProp.getProperty("razorpay.txt"));
		    System.out.println(" Hi, Welcome to Razorpay Software Private Ltd Bank text is expected – Assert passed");
			
		    screeners.clickonbuttonSuccess();
		    
		    screeners.ImageCardBreakout();
		    
		    logger.info("Ending of NewUserScreeners method");
		}
		
		/*
		 * @Test(priority = 2, groups="Exsiting User", description =
		 * "As Exsiting user Unlocking the Screeners by using existing coins")
		 * 
		 * @Parameters({ "devicename" })
		 * 
		 * @Description("Test Description: Verify Unlocking Screeners")
		 * 
		 * @Story("Verify Unlocking Screeners as a existing user") public void
		 * ExsitingUser() throws InterruptedException {
		 * logger.info("Starting of ExsitingUser method");
		 * 
		 * //To Run this Second case you should 1st run the AddCoins Test Flow
		 * screeners.clickOnMarketsTab(); screeners.clickOnScreenersSection();
		 * Assert.assertEquals(screeners.textPremiumScreeners(),expectedAssertionsProp.
		 * getProperty("premium.txt"));
		 * System.out.println(" Hi,Premium Screeners! text is expected – Assert passed"
		 * );
		 * 
		 * screeners.clickonBreakOut();
		 * Assert.assertEquals(screeners.TextGetAccess(),expectedAssertionsProp.
		 * getProperty("getaccess.txt")); System.out.
		 * println(" Hi,Get access to all paid screeners for 7 days at text is expected – Assert passed"
		 * );
		 * 
		 * screeners.clickOnButtonPay50CoinsInstead();
		 * Assert.assertEquals(screeners.textBuyScreeners(),expectedAssertionsProp.
		 * getProperty("BuyScreeners.txt"));
		 * System.out.println(" Hi,Buy Screeners text is expected – Assert passed");
		 * 
		 * screeners.clickOnConfirmButton();
		 * 
		 * screeners.ImageCardBreakout();
		 * 
		 * logger.info("Ending of NewUserScreeners method"); }
		 */

		@AfterClass
		@Parameters({ "deviceName", "udid" })
		public void quitDriver(String deviceName, String udid) {
			logger.info("Starting of quitDriver method");

			this.quitMobileDriver(udid);

			logger.info("Ending of quitDriver method");
		}
	}


