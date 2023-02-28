package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BuySellPage extends BaseAutomationPage {
	
	private static final Logger logger = Logger.getLogger(BuySellPage.class.getName());

	@FindBy(xpath = "//android.view.View[4]//android.view.View")
	private WebElement cardMarkets;

	@FindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View")
	private WebElement opnAllStocks;

	@FindBy(xpath = "//android.widget.TextView[@text = 'All stocks']")
	private WebElement txtAllStocks;

	@FindBy(xpath = "//android.view.ViewGroup[4]")
	private WebElement labelStock;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Buy']")
	private WebElement btnBuy;
	
	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup//android.view.View")
	private WebElement btnBuy1;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Buy stock']")
	private WebElement txtBuyStock;
	
	@FindBy(xpath ="//android.widget.TextView[@text = 'Login with Leprechaun']")
	private WebElement txtLoginWithLeprechaun;
	
	@FindBy(xpath ="//input[@type=\"text\"]")
	private WebElement filedLogin;
	
	@FindBy(xpath ="//android.widget.EditText")
	private WebElement txtLogin;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement btnLogin;

	@FindBy(xpath = "//android.widget.EditText")
	private WebElement btnQuantity;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView[@text = 'Buy']")
	private WebElement btnBuyStock;
	
	@FindBy(xpath = "//button[contains(text(),'Review')] ")
	private WebElement btnReview;

	@FindBy(xpath = "//button[contains(text(),'Place Order')] ")
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm Order')] ")
	private WebElement btnConfirmOrder;
	
	@FindBy(xpath ="//button[contains(text(),'Click here')]")
	private WebElement optClickhere;
	
	@FindBy(xpath ="//android.view.ViewGroup[7]")
	private WebElement oneCardStock;
	
	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[1]//android.view.View")
	private WebElement btnSell;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Sell stock']")
	private WebElement txtSellStock;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView[@text = 'Sell']")
	private WebElement btnSellStock;
	
	
	public BuySellPage(AppiumDriver driver) {
		super(driver);
	}
	public void clickOnMarketsImageCard() {
		logger.info("Starting clickOnMarketsImageCard method");
		explicitWait(cardMarkets);
		clickOnElement(cardMarkets);

		logger.info("Ending clickOnMarketsImageCard method");
	}

	public void clickOnAllStocksOption() {
		logger.info("Starting clickOnAllStocksOption method");
		/*
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		 * ".scrollIntoView(new UiSelector().text(\"Market indices\"))"));
		 */
		clickOnElement(opnAllStocks);
		
		logger.info("Ending clickOnAllStocksOption method");
	}

	public String textAllStocks() {
		logger.info("Starting of textAllStocks method");

		logger.info("Ending of textAllStocks method");

		return getText(txtAllStocks);
	}

	public void clickonOneStock() {
		logger.info("Starting clickonOneStock method");

		clickOnElement(labelStock);

		logger.info("Ending clickonOneStock method");
	}
	public void clickonSellStock() {
		logger.info("Starting clickonSellStock method");

		clickOnElement(oneCardStock);

		logger.info("Ending clickonSellStock method");
	}
	
	public void clickOnBuyButton() {
		logger.info("Starting clickOnBuyButton method");

		//clickOnElement(btnBuy);
		clickOnElement(btnBuy1);
		logger.info("Ending clickOnBuyButton method");
	}
	
	public String textBuyStock() {
		logger.info("Starting of textBuyStock method");

		logger.info("Ending of textBuyStock method");

		return getText(txtBuyStock);
	}
	
	public String textLoginWithLeprechaun() {
		logger.info("Starting of textLoginWithLeprechaun method");

		logger.info("Ending of textLoginWithLeprechaun method");

		return getText(txtLoginWithLeprechaun);
	}

	public void EnterLoginCredentials(String login) {
		logger.info("Starting EnterLoginCredentials method");
       explicitWait(filedLogin);
       super.switchContextWebView();
     
       Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(filedLogin).click().build();
		seriesOfActions.perform();
		
		//this.filedLogin.sendKeys(Keys.ENTER);
		sendKeys(filedLogin,login);
		
		logger.info("Ending EnterLoginCredentials method");
	}
	
	public void clickOnLoginButton() {
		logger.info("Starting clickOnLoginButton method");

		clickOnElement(btnLogin);
		clickOnElement(btnLogin);
		logger.info("Ending clickOnLoginButton method");
	}
	
	public void enterQuantity(String Quantity) {
		logger.info("Starting enterQuantity method");

		//clickOnElement(btnQuantity);

		sendKeys(btnQuantity,Quantity);
		
		logger.info("Ending enterQuantity method");
	}
	
	public void clickonBuyStock() {
		logger.info("Starting clickonBuyStock method");

		clickOnElement(btnBuyStock);
		
		logger.info("Ending clickonBuyStock method");
	}
	
	
	public void clickonReview() {
		logger.info("Starting clickonReview method");

		clickOnElement(btnReview);

		logger.info("Ending clickonReview method");
	}


	public void clickOnPlaceOrder() {
		logger.info("Starting clickOnPlaceOrder method");

		clickOnElement(btnPlaceOrder);

		logger.info("Ending clickOnPlaceOrder method");
	}


	public void clickOnConfirmOrder() {
		logger.info("Starting clickPay999Button method");

		clickOnElement(btnConfirmOrder);

		logger.info("Ending clickPay999Button method");
	}
	
	public void clickOnSellButton() {
		logger.info("Starting clickOnSellButton method");
        explicitWait(btnSell);
		clickOnElement(btnSell);

		logger.info("Ending clickOnSellButton method");
	}
	
	public String textSellStock() {
		logger.info("Starting of textSellStock method");

		logger.info("Ending of textSellStock method");

		return getText(txtSellStock);
	}
	public void clickOnSellStockButton() {
		logger.info("Starting clickOnSellStockButton method");

		clickOnElement(btnSellStock);

		logger.info("Ending clickOnSellStockButton method");
	}
	
	public void clickOnClickheretext() {
		logger.info("Starting clickOnClickheretext method");

		clickOnElement(optClickhere);

		logger.info("Ending clickOnClickheretext method");
	}
	
}

	


