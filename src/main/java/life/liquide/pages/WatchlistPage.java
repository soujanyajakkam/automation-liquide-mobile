package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class WatchlistPage extends BaseAutomationPage{

	private static final Logger logger = Logger.getLogger(WatchlistPage.class.getName());

	@FindBy(xpath="//android.view.ViewGroup[3]/android.widget.HorizontalScrollView//android.widget.ImageView")
	private WebElement cardCreateAWatchlist;
	
	@FindBy(xpath="//android.widget.TextView[@text = 'Watchlist is empty! ']")
	private WebElement txtWatchlistEmpty;
	
	@FindBy(xpath="//android.widget.TextView[@text = 'View recommendations ']")
	private WebElement btnViewRecommendation;
	
	@FindBy(xpath="//android.view.ViewGroup[4]//android.widget.TextView")
	private WebElement icnCreateWatchlistTrade;
	
	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement tradeBackArrow;

	@FindBy(xpath="//android.widget.TextView[@text = 'My watchlist']")
	private WebElement txtMyWatchlist;
	
	@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View")
	private WebElement seeAllOption;
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement icnSearch;
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Search for stocks']")
	private WebElement searchTextFiled;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement icnSearchAddToWatchlist;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement icnClose;
	
	@FindBy(xpath="//android.widget.TextView[@text = 'Trending Stocks']")
	private WebElement txtTrendingStocks;
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]//android.view.View")
	private WebElement cardTrendingStock;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement trendAddToWatchlist;
	
	@FindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement trendBackArrow;
	
	@FindBy(xpath="//android.view.View[1]/android.view.ViewGroup//android.view.View")
	private WebElement icnHome;
	
	@FindBy(xpath="//android.view.View[4]//android.view.View")
	private WebElement icnMarket;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement icnFilter;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Sort by']")
	private WebElement txtSortby;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Current Price']")
	private WebElement filterCureentPrice;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Day change %']")
	private WebElement filterDayChange;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Company (A-Z)']")
	private WebElement filterCompany;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[3]")
	private WebElement downArrow;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]//android.widget.TextView[6]")
	private WebElement upArrow;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement icnRemoveFromWatchlist;
	
	public WatchlistPage(AppiumDriver driver) {
		super(driver);
	}

	public void clickonCreateWatchlistCard() {
		logger.info("Starting clickonCreateWatchlistCard method");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
				  ".scrollIntoView(new UiSelector().text(\"Top gaining stocks\"))"));
		clickOnElement(cardCreateAWatchlist);

		logger.info("Ending clickonCreateWatchlistCard method");
	}
	
	public String textWatchlistIsEmpty() {
		logger.info("Starting of textWatchlistIsEmpty method");

		logger.info("Ending of textWatchlistIsEmpty method");

		return getText(txtWatchlistEmpty);
	}
	
	public void clickonViewRecommendationButton() {
		logger.info("Starting clickonViewRecommendationButton method");

		clickOnElement(btnViewRecommendation);

		logger.info("Ending clickonViewRecommendationButton method");
	}
	
	public void clickOnWatchlistIconInTrade() {
		logger.info("Starting clickOnWatchlistIconInTrade method");

		clickOnElement(icnCreateWatchlistTrade);
		
		logger.info("Ending clickOnWatchlistIconInTrade method");
	}
	
	public void clickOnTradeBackArrow() {
		logger.info("Starting clickOnTradeBackArrow method");

		clickOnElement(tradeBackArrow);
		
		logger.info("Ending clickOnTradeBackArrow method");
	}
	
	public String textMyWatchlist() {
		logger.info("Starting of textMyWatchlist method");

		logger.info("Ending of textMyWatchlist method");

		return getText(txtMyWatchlist);
	}
	
	public void clickOnSeeAllOption() {
		logger.info("Starting clickOnSeeAllOption method");

		clickOnElement(seeAllOption);
		
		logger.info("Ending clickOnSeeAllOption method");
	}
	
	public void enterStockDetails(String stockName) {
		logger.info("Starting clickonSearchIcon method");

		clickOnElement(icnSearch);
		sendKeys(searchTextFiled, stockName);
		
		logger.info("Ending clickonSearchIcon method");
	}
	
	
	public void clickonAddtoWatchlistInSearch() {
		logger.info("Starting clickonAddtoWatchlistInSearch method");

		clickOnElement(icnSearchAddToWatchlist);

		logger.info("Ending clickonAddtoWatchlistInSearch method");
	}


	public void clickOnCloseIcon() {
		logger.info("Starting clickOnCloseIcon method");

		clickOnElement(icnClose);

		logger.info("Ending clickOnCloseIcon method");
	}

	public String textTrendingStocks() {
		logger.info("Starting of textTrendingStocks method");

		logger.info("Ending of textTrendingStocks method");

		return getText(txtTrendingStocks);
	}
	public void clickOnTrendingStockCard() {
		logger.info("Starting clickOnTrendingStockCard method");

		clickOnElement(cardTrendingStock);

		logger.info("Ending clickOnTrendingStockCard method");
	}
	public void clickOnTrendAddToWatchlist() {
		logger.info("Starting clickOnTrendAddToWatchlist method");

		clickOnElement(trendAddToWatchlist);

		logger.info("Ending clickOnTrendAddToWatchlist method");
	}
	public void clickOnTrendBackArrow() {
		logger.info("Starting clickOnTrendBackArrow method");

		clickOnElement(trendBackArrow);

		logger.info("Ending clickOnTrendBackArrow method");
	}
	public void clickOnHomeAndMarketIcon() {
		logger.info("Starting clickOnTrendAddToWatchlist method");

		clickOnElement(icnHome);
		clickOnElement(icnMarket);
		clickOnElement(icnFilter);
		
		logger.info("Ending clickOnTrendAddToWatchlist method");
	}
	public String textSortBy() {
		logger.info("Starting of textSortBy method");

		logger.info("Ending of textSortBy method");

		return getText(txtSortby);
	}
	public void applyingFilters() throws InterruptedException {
		logger.info("Starting applyingFilters method");

		clickOnElement(filterCureentPrice);
		Thread.sleep(2000);
		clickOnElement(icnFilter);
		clickOnElement(filterDayChange);
		Thread.sleep(2000);
		clickOnElement(filterCompany);
		Thread.sleep(2000);
		clickOnElement(downArrow);
		clickOnElement(upArrow);
		clickOnElement(icnRemoveFromWatchlist);
		clickOnElement(icnHome);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
				  ".scrollIntoView(new UiSelector().text(\"My watchlist\"))"));
		Thread.sleep(2000);
		logger.info("Ending applyingFilters method");
	}
	
}
