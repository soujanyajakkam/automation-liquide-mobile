package life.liquide.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.inject.spi.Element;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.InviteFriendPage;

@Epic("Invite Friend")
@Feature("InviteFriend Test")
public class InviteNowTest extends BaseMobileAutomationTest {
	private InviteFriendPage inviteFriend = null;
	private final Logger logger = Logger.getLogger(InviteNowTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.inviteFriend = new InviteFriendPage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verifying Inviting funtionality")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying inviting a friend funtionality")
	@Story("Inviting a friend")
	public void InviteFriend() throws InterruptedException {
		logger.info("Starting of InviteFriend method");

		
		 // inviteFriend.clickOnInviteNow();
		  
			/*
			 * Assert.assertEquals(inviteFriend.textInvite(),expectedAssertionsProp.
			 * getProperty("invite.txt"));
			 * System.out.println("Invite text is expected – Assert passed");
			 */
		
		inviteFriend.clickViewAllRewardsButton();

		/*
		 * Assert.assertEquals(inviteFriend.textScratchCard(),
		 * expectedAssertionsProp.getProperty("scratch.txt"));
		 * System.out.println("Scratch Cards text is expected – Assert passed");
		 */
		inviteFriend.clickOnScratchCardBackArrow();

		inviteFriend.clickOnCopyCodeButton();
		inviteFriend.clickOnInviteNowButton();
        inviteFriend.swipeup();
		Thread.sleep(10000);
        inviteFriend.enterEmailId(testDataProp.getProperty("email"));
        inviteFriend.clickOnSendButton();
        
		logger.info("Ending of InviteFriend method");
	}

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
