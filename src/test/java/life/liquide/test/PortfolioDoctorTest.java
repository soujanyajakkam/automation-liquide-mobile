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
import life.liquide.pages.PortfolioDoctorNegativePage;
import life.liquide.pages.PortfolioDoctorPage;

@Epic("Booking APpointment")
@Feature("Booking APpointment")
public class PortfolioDoctorTest extends BaseMobileAutomationTest {

	private PortfolioDoctorPage portfolio = null;
	private PortfolioDoctorNegativePage portfolioNegative = null;
	private final Logger logger = Logger.getLogger(PortfolioDoctorPage.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.portfolio = new PortfolioDoctorPage(this.getMobileDriver(udid));
		this.portfolioNegative = new PortfolioDoctorNegativePage(this.getMobileDriver(udid));
		logger.info("Ending of initClass method in LandingPage");
	}
	/*
	 * @Test(priority = 1, description =
	 * "Verifying AppointmentBooking funtionality")
	 * 
	 * @Parameters({ "devicename" })
	 * 
	 * @Description("Test Description: Verifying AppointmentBooking funtionality")
	 * 
	 * @Story("Verifying AppointmentBooking funtionality") public void
	 * PortfolioDoctorAppointmentBooking() throws InterruptedException {
	 * logger.info("Starting of PortfolioDoctorAppointmentBooking method");
	 * 
	 * portfolio.clickOnPortfolioReviewimgcard();
	 * Assert.assertEquals(portfolio.textSEBIExpertAdvisor(),
	 * expectedAssertionsProp.getProperty("sebi.txt")); System.out.
	 * println(" Your 1-on-1 with  SEBI registered investment advisor text is expected – Assert passed"
	 * );
	 * 
	 * portfolio.clickonBookAnAppointmentButton();
	 * Assert.assertEquals(portfolio.textLiquideDev(),
	 * expectedAssertionsProp.getProperty("liquidedev.txt"));
	 * System.out.println(" Liquide Dev text is expected – Assert passed");
	 * 
	 * portfolio.clickonAcceptCookiesButton(); portfolio.clickonOneSlot();
	 * portfolio.clickOnRequestBookingButton();
	 * 
	 * portfolio.clickOnPayButton(); portfolio.clickOnProceed999Button();
	 * portfolio.EnterCardDetails(testDataProp.getProperty("cardnum"),
	 * testDataProp.getProperty("cardexpiry"), testDataProp.getProperty("cvv"));
	 * portfolio.clickOnPayNowButton();
	 * 
	 * portfolio.clickOnPayWithoutSavingCard(); Thread.sleep(2000);
	 * 
	 * portfolio.clickSuccessButton(); Thread.sleep(2000);
	 * 
	 * portfolio.clickOkayButton(); Thread.sleep(2000);
	 * 
	 * portfolio.clicckOnBackArrowButton(); Thread.sleep(2000);
	 * 
	 * logger.info("Ending of PortfolioDoctorAppointmentBooking method"); }
	 */

	
	  @Test(priority = 2, description =
	  "Verifying AppointmentBooking as a Liquide one user funtionality")
	  
	  @Parameters({ "devicename" })
	  
	  @Description("Test Description: Verifying AppointmentBooking as a Liquide one user funtionality"
	  )
	  
	  @Story("Verifying AppointmentBooking as a Liquide one userfuntionality")
	  public void LiquideOneUserAppointmentBooking() throws InterruptedException {
	  logger.info("Starting of LiquideOneUserAppointmentBooking method");
	  
	  portfolio.clickOnPortfolioReviewimgcard();
	  Assert.assertEquals(portfolio.textSEBIExpertAdvisor(),
	  expectedAssertionsProp.getProperty("sebi.txt")); System.out.
	  println(" Your 1-on-1 with  SEBI registered investment advisor text is expected – Assert passed"
	  );
	  
	  portfolio.clickonBookAnAppointmentButton();
	  Assert.assertEquals(portfolio.textLiquideDev(),
	  expectedAssertionsProp.getProperty("liquidedev.txt"));
	  System.out.println(" Liquide Dev text is expected – Assert passed");
	  
	  portfolio.clickonAcceptCookiesButton(); portfolio.clickonOneSlot();
	  portfolio.clickOnRequestBookingButton(); portfolio.clicckOnConfirmButton();
	  portfolio.clickOkayButton(); portfolio.clicckOnBackArrowButton();
	  
	  logger.info("Ending of LiquideOneUserAppointmentBooking method"); }
	  
	  @Test(priority = 3, description =
	  "Checking the Negative Flow of the portfoliodoctor")
	  
	  @Parameters({ "devicename" })
	  
	  @Description("Test Description: Checking the Negative Flow of the portfoliodoctor"
	  )
	  
	  @Story(" Checking the Negative Flow of the portfoliodoctor") public void
	  NegativeFlow() throws InterruptedException {
	  logger.info("Starting of NegativeFlow method");
	  
	  portfolioNegative.clickOnPortfolioReviewimgcard();
	  Assert.assertEquals(portfolioNegative.textSEBIExpertAdvisor(),
	  expectedAssertionsProp.getProperty("sebi.txt")); System.out.
	  println(" Your 1-on-1 with  SEBI registered investment advisor text is expected – Assert passed"
	  );
	  
	  portfolioNegative.clickOnLiquideOneimgCrd();
	  portfolio.clickonBookAnAppointmentButton();
	  portfolio.clickonBookAnAppointmentButton();
	  Assert.assertEquals(portfolio.textLiquideDev(),
	  expectedAssertionsProp.getProperty("liquidedev.txt"));
	  System.out.println(" Liquide Dev text is expected – Assert passed");
	  
	  portfolio.clickonAcceptCookiesButton(); portfolio.clickonOneSlot();
	  portfolio.clickOnRequestBookingButton();
	  portfolioNegative.clickOnUploadPortfolio();
	  portfolioNegative.clickOnUpload(); portfolioNegative.uploadimages();
	  portfolioNegative.uploadDocuments();
	  portfolioNegative.uploadMultipleDocumentsAtaTime();
	  
	  logger.info("Ending of NegativeFlow method"); }
	 
	@Test(priority = 4, description = "Verifying AppointmentBooking funtionality when user have enough coins")

	@Parameters({ "devicename" })

	@Description("Test Description: Verifying AppointmentBooking funtionality when user have enough coins")

	@Story("Verifying AppointmentBooking funtionality when user have enough coins")
	public void PortfolioDoctorAppointmentBookingWithOnlyCoins() throws InterruptedException {
		logger.info("Starting of PortfolioDoctorAppointmentBookingWithOnlyCoins method");
		portfolio.AddCoins();

		portfolio.enterEmailId(testDataProp.getProperty("emailid"));
		portfolio.clickOnUpdateEmail();

		Assert.assertEquals(portfolio.textCardsAndMore(), expectedAssertionsProp.getProperty("cardsandmore.txt"));
		System.out.println("Cards, UPI & More is expected – Assert passed");

		portfolio.clickOnNetBankingButton();

		Assert.assertEquals(portfolio.textSelectBank(), expectedAssertionsProp.getProperty("selectbank.txt"));
		System.out.println("Select Bank is expected – Assert passed");

		portfolio.clickOnNetBankingimgcard();

		portfolio.clickOnPayNowRazopary();

		Assert.assertEquals(portfolio.textWelcomeRazorpay(), expectedAssertionsProp.getProperty("razpay.txt"));
		System.out.println("Welcome to Razorpay Software Private Ltd Bank is expected – Assert passed");

		portfolio.clickOnSuccessButton();

		/*
		 * Assert.assertEquals(portfolio.textCoinsAddedPopUp(),
		 * expectedAssertionsProp.getProperty("coinsaddedsuccess.txt")); System.out.
		 * println("Coins were added successfully! is expected – Assert passed");
		 * 
		 * portfolio.clickOnGotItButton();
		 */
		portfolio.clickOnBackArrowButton();
		
		portfolio.clickOnPortfolioReviewimgcard();
		Assert.assertEquals(portfolio.textSEBIExpertAdvisor(), expectedAssertionsProp.getProperty("sebi.txt"));
		System.out.println(" Your 1-on-1 with  SEBI registered investment advisor text is expected – Assert passed");

		portfolio.clickonBookAnAppointmentButton();
		Assert.assertEquals(portfolio.textLiquideDev(), expectedAssertionsProp.getProperty("liquidedev.txt"));
		System.out.println(" Liquide Dev text is expected – Assert passed");

		portfolio.clickonAcceptCookiesButton();
		portfolio.clickonOneSlot();
		portfolio.clickOnRequestBookingButton();

		portfolio.clickOnPayButton();

		logger.info("Ending of PortfolioDoctorAppointmentBookingWithOnlyCoins method");
	}

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
