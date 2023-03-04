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
import life.liquide.pages.WatchlistPage;

@Epic("Create a Watchlist")
@Feature("Create a Watchlist")
public class WatchlistTest extends BaseMobileAutomationTest {
	private WatchlistPage watchlist = null;
	private final Logger logger = Logger.getLogger(WatchlistTest.class.getName());

	@BeforeClass
	@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
	public void initClass(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity) throws Exception {
		logger.info("Starting of initClass method in LandingPage");

		MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
				platformVersion, appPackage, appActivity);
		this.initMobileDriver(mobileConfigurationVO);
		this.watchlist = new WatchlistPage(this.getMobileDriver(udid));

		logger.info("Ending of initClass method in LandingPage");
	}

	@Test(priority = 1, description = "Adding Stocks Into watchlist")
	@Parameters({ "devicename" })
	@Description("Test Description: Verifying WatchList funtionality")
	@Story("Adding Stocks Into watchlist")
	public void createWatchlist() throws InterruptedException {
		logger.info("Starting of createWatchlist method");
		Thread.sleep(2000);
		//watchlist.clickonCreateWatchlistCard();

		//Assert.assertEquals(watchlist.textWatchlistIsEmpty(), expectedAssertionsProp.getProperty("watchlistempty.txt"));
		//System.out.println("Watchlist is empty! text expected – Assert passed");

		watchlist.clickonViewRecommendationButton();
		watchlist.clickOnWatchlistIconInTrade();
		watchlist.clickOnTradeBackArrow();
		/*
		 * Assert.assertEquals(watchlist.textMyWatchlist(),
		 * expectedAssertionsProp.getProperty("mywatchlist.txt"));
		 * System.out.println("My watchlist text is expected – Assert passed");
		 */
		watchlist.clickOnSeeAllOption();

		watchlist.enterStockDetails(testDataProp.getProperty("stockName"));

		watchlist.clickonAddtoWatchlistInSearch();
		watchlist.clickOnCloseIcon();

		Assert.assertEquals(watchlist.textTrendingStocks(), expectedAssertionsProp.getProperty("trendingstocks.txt"));
		System.out.println("Trending Stocks text is expected – Assert passed");

		watchlist.clickOnTrendingStockCard();
		watchlist.clickOnTrendAddToWatchlist();
		watchlist.clickOnTrendBackArrow();
		watchlist.clickOnHomeAndMarketIcon();

		Assert.assertEquals(watchlist.textSortBy(), expectedAssertionsProp.getProperty("sortby.txt"));
		System.out.println("Sort by text is expected – Assert passed");
		watchlist.applyingFilters();
		Thread.sleep(2000);
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
