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
import life.liquide.pages.AddCoinsPage;
import life.liquide.pages.AskLimoPage;

public class AddCoinsTest extends BaseMobileAutomationTest{

	private AddCoinsPage addCoins = null;
	private static final Logger logger = Logger.getLogger(AddCoinsTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.addCoins= new AddCoinsPage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Verify Add Coins")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Add Coins funtionality")
	@Story("Asking Limo about stock")
	public void AddCoins() throws InterruptedException {
		logger.info("Starting of AddCoins method");
		addCoins.clickOnLimoIcon();

		Assert.assertEquals(addCoins.textLimo(), expectedAssertionsProp.getProperty("iamlimo.txt"));
		System.out.println(" Hi, I am LiMo! is expected – Assert passed");

		addCoins.clickOnAskLimoButton();
		
		Assert.assertEquals(addCoins.insufficientCoinsPopUp(), expectedAssertionsProp.getProperty("insufficientcoins.txt"));
		System.out.println("Looks like you have insufficient coins!  is expected – Assert passed");

		addCoins.clickOnAddCoinsToContinue();
		
		Assert.assertEquals(addCoins.textAddcoins(), expectedAssertionsProp.getProperty("addcoins.txt"));
		System.out.println("Add Coins  is expected – Assert passed");

		Assert.assertEquals(addCoins.textCoinsTopUp(), expectedAssertionsProp.getProperty("coinstopup.txt"));
		System.out.println("Select coin amount to top up is expected – Assert passed");
		
		addCoins.clickOnImgCardTopUpCoins();

		addCoins.clickOnPayButton();
		
		logger.info("Ending of AddCoins method");
	}
	@Test(priority = 2, description = "Verify update email")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Updating funtionality")
	@Story("Updating the existing email with new email")
	public void updateEmailId() throws InterruptedException {
		logger.info("Starting of updateEmailId method");
	
		Assert.assertEquals(addCoins.textHaveYouUpdatedEmail(), expectedAssertionsProp.getProperty("haveyouupdatedemail.txt"));
		System.out.println("Hey N! Have you updated your email is expected – Assert passed");

		addCoins.enterEmailId(testDataProp.getProperty("emailid"));
		
		addCoins.clickOnUpdateEmail();
		
		logger.info("Ending of updateEmailId method");
	}
	
	@Test(priority = 3, description = "Verify Payment")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying Payment funtionality")
	@Story("Payment for the add coins")
	public void RazoparyPayment() {
		logger.info("Starting of RazoparyPayment method");
		
		Assert.assertEquals(addCoins.textCardsAndMore(), expectedAssertionsProp.getProperty("cardsandmore.txt"));
		System.out.println("Cards, UPI & More is expected – Assert passed");
		
        addCoins.clickOnNetBankingButton();
        
        Assert.assertEquals(addCoins.textSelectBank(), expectedAssertionsProp.getProperty("selectbank.txt"));
		System.out.println("Select Bank is expected – Assert passed");  
	
		addCoins.clickOnNetBankingimgcard();
		
		addCoins.clickOnPayNowRazopary();
		
		Assert.assertEquals(addCoins.textWelcomeRazorpay(), expectedAssertionsProp.getProperty("razpay.txt"));
		System.out.println("Welcome to Razorpay Software Private Ltd Bank is expected – Assert passed");  
		
		addCoins.clickOnSuccessButton();
		
		Assert.assertEquals(addCoins.textCoinsAddedPopUp(), expectedAssertionsProp.getProperty("coinsaddedsuccess.txt"));
		System.out.println("Coins were added successfully! is expected – Assert passed");  
		
		addCoins.clickOnGotItButton();
		
		logger.info("Ending of RazoparyPayment method");
	}
	
	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}

