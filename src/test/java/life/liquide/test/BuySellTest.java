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
import life.liquide.pages.BuySellPage;
import life.liquide.pages.TradePage;

@Epic("Buying and selling")
@Feature("Buying and selling")
public class BuySellTest extends BaseMobileAutomationTest {

	private BuySellPage BuySell = null;
	private TradePage trade = null;
	private final Logger logger = Logger.getLogger(BuySellTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.BuySell = new BuySellPage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	/*
	 * @Test(priority = 1, description = "Verifying Buying funtionality", groups =
	 * "End to End")
	 * 
	 * @Parameters({ "devicename" })
	 * 
	 * @Description("Test Description: Verifying Purchasing stock funtionality")
	 * 
	 * @Story("Verifying Purchasing stock") public void BuyStock() throws
	 * InterruptedException { logger.info("Starting of BuyStock method");
	 * 
	 * BuySell.clickOnMarketsImageCard(); BuySell.clickOnAllStocksOption();
	 * Assert.assertEquals(BuySell.textAllStocks(),
	 * expectedAssertionsProp.getProperty("allstocks.txt"));
	 * System.out.println(" Hi,All Stocks  text is expected – Assert passed");
	 * BuySell.clickonOneStock(); BuySell.clickOnBuyButton();
	 * 
	 * Assert.assertEquals(BuySell.textBuyStock(),
	 * expectedAssertionsProp.getProperty("BuyStock.txt"));
	 * System.out.println(" Hi,Buy stock text is expected – Assert passed");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * // BuySell.switchContextWebView();
	 * 
	 * Thread.sleep(2000);
	 * BuySell.EnterLoginCredentials(testDataProp.getProperty("login"));
	 * BuySell.clickOnLoginButton(); BuySell.switchContextMobileView();
	 * 
	 * // Thread.sleep(2000);
	 * 
	 * BuySell.enterQuantity(testDataProp.getProperty("quantity"));
	 * BuySell.clickonBuyStock(); BuySell.switchContextWebView();
	 * BuySell.clickonReview(); BuySell.clickOnPlaceOrder();
	 * 
	 * BuySell.clickOnConfirmOrder();
	 * 
	 * logger.info("Ending of BuyStock method"); }
	 */

	@Test(priority = 2, description = "Verifying Selling stock funtionality")

	@Parameters({ "devicename" })

	@Description("Test Description: Verifying Selling stock funtionality")

	@Story("Verifying selling stock")
	public void SellStock() throws InterruptedException {
		logger.info("Starting of BuyStock method");
		BuySell.clickOnMarketsImageCard();
		BuySell.clickOnAllStocksOption();
		Assert.assertEquals(BuySell.textAllStocks(), expectedAssertionsProp.getProperty("allstocks.txt"));
		System.out.println(" Hi,All Stocks  text is expected – Assert passed");
		BuySell.clickonOneStock();
		BuySell.clickOnSellButton();

		Assert.assertEquals(BuySell.textSellStock(), expectedAssertionsProp.getProperty("sellStock.txt"));
		System.out.println(" Hi,Sell Stock  text is expected – Assert passed");
	
		/*
		 * BuySell.switchContextWebView();
		 * BuySell.EnterLoginCredentials(testDataProp.getProperty("login"));
		 * BuySell.clickOnLoginButton(); BuySell.switchContextMobileView();
		 */

		BuySell.enterQuantity(testDataProp.getProperty("quantity"));

		BuySell.clickOnSellStockButton();
	    BuySell.switchContextWebView();
		BuySell.clickonReview();
		BuySell.clickOnPlaceOrder();
	    BuySell.clickOnConfirmOrder();
	    
	   Thread.sleep(10000);
		logger.info("Ending of BuyStock method");
	}

	/*
	 * @Test(priority = 3, description =
	 * "Verifying Buying stock through Liquide Setup funtionality")
	 * 
	 * @Parameters({ "devicename" })
	 * 
	 * @Description("Test Description: Verifying Buying stock through Liquide Setup funtionality"
	 * )
	 * 
	 * @Story("Verifying Buying stock through Liquide Setup") public void
	 * BuyStockThroughLiquideSetup() throws InterruptedException {
	 * logger.info("Starting of BuyStockThroughLiquideSetup method");
	 * trade.clickonTradeCard(); trade.clickonBuyStock();
	 * Assert.assertEquals(trade.textBuyStock(),
	 * expectedAssertionsProp.getProperty("BuyStock.txt"));
	 * trade.switchContextWebView();
	 * trade.EnterLoginCredentials(testDataProp.getProperty("login"));
	 * trade.clickOnLoginButton(); trade.switchContextMobileView();
	 * trade.enterQuantity(testDataProp.getProperty("quantity"));
	 * trade.clickonBuyStock(); trade.switchContextWebView(); trade.clickonReview();
	 * trade.clickOnPlaceOrder(); trade.clickOnConfirmOrder();
	 * logger.info("Ending of BuyStockThroughLiquideSetup method"); }
	 */

	@AfterClass
	@Parameters({ "deviceName", "udid" })
	public void quitDriver(String deviceName, String udid) {
		logger.info("Starting of quitDriver method");

		this.quitMobileDriver(udid);

		logger.info("Ending of quitDriver method");
	}
}
