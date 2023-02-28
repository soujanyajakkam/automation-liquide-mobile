package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class ScreenersPage extends BaseAutomationPage{

	private static final Logger logger = Logger.getLogger(ScreenersPage.class.getName());

	@FindBy(xpath = "//android.view.View[4]//android.view.View")
	private WebElement marketsTab;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
	private WebElement screenersSection;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Premium Screeners!']")
	private WebElement txtPremiumScreeners;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement cardBreakOut;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Get access to all paid screeners for 7 days at']")
	private WebElement txtGetAccess;
	
	@FindBy(xpath = "//android.view.ViewGroup[5]//android.view.View")
	private WebElement btnPay50CoinsInstead;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Buy Screener']")
	private WebElement txtBuyScreeners;

	@FindBy(xpath = "//android.widget.TextView[@text = '0']")
	private WebElement btnPay50Coins;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Add Coins']")
	private WebElement txtAddCoins;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
	private WebElement btnPay50;

	@FindBy(xpath = "//android.view.View[@text = 'Netbanking All Indian banks']")
	private WebElement crdNetBanking;
	
	@FindBy(xpath = "//android.view.View[3]/android.view.View")
	private WebElement bank;
	
	@FindBy(xpath = "//android.widget.Button[@text = 'Pay Now']")
	private WebElement btnPayNow;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Welcome to Razorpay Software Private Ltd Bank']")
	private WebElement txtRazorPay;

	@FindBy(xpath = "//android.widget.Button[@text = 'Success']")
	private WebElement btnSuccess;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement backarrow;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement imagecardBreakout;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]//android.view.View")
	private WebElement Confirmbutton;

	public ScreenersPage(AppiumDriver driver) {
		super(driver);
	}

	public void clickOnMarketsTab() {
		logger.info("Starting clickOnMarketsTab method");
		
		clickOnElement(marketsTab);

		logger.info("Ending clickOnMarketsTab method");
	}

	public void clickOnScreenersSection() {
		logger.info("Starting clickOnScreenersSection method");
	
		clickOnElement(screenersSection);
		
		logger.info("Ending clickOnScreenersSection method");
	}

	public String textPremiumScreeners() {
		logger.info("Starting of textPremiumScreeners method");

		logger.info("Ending of textPremiumScreeners method");

		return getText(txtPremiumScreeners);
	}

	public void clickonBreakOut() {
		logger.info("Starting clickonBreakOut method");

		clickOnElement(cardBreakOut);

		logger.info("Ending clickonBreakOut method");
	}
	public String TextGetAccess() {
		logger.info("Starting TextGetAccess method");

		logger.info("Ending TextGetAccess method");
		
		return getText(txtGetAccess);
	}
	
	public void clickOnButtonPay50CoinsInstead() {
		logger.info("Starting clickOnButtonPay50CoinsInstead method");

		clickOnElement(btnPay50CoinsInstead);
		
		logger.info("Ending clickOnButtonPay50CoinsInstead method");
	}
	
	public String textBuyScreeners() {
		logger.info("Starting of textBuyScreeners method");

		logger.info("Ending of textBuyScreeners method");

		return getText(txtBuyScreeners);
	}
	
	public void clickOnButtonPay50coins() {
		logger.info("Starting clickOnButtonPay50coins method");
       
	    clickOnElement(btnPay50Coins);
		
		logger.info("Ending clickOnButtonPay50coins method");
	}
	public String textAddCoins() {
		logger.info("Starting of textAddCoins method");

		logger.info("Ending of textAddCoins method");

		return getText(txtAddCoins);
	}
	
	public void clickOnbuttonPay50() {
		logger.info("Starting clickOnbuttonPay50 method");

		clickOnElement(btnPay50);
		
		logger.info("Ending clickOnbuttonPay50 method");
	}
	
	public void ImagcardNetBanking() {
		logger.info("Starting ImagcardNetBanking method");

		clickOnElement(crdNetBanking);

		logger.info("Ending ImagcardNetBanking method");
	}
	public void clickOnOnebank() {
		logger.info("Starting clickOnOnebank method");

		clickOnElement(bank);

		logger.info("Ending clickOnOnebank method");
	}

	
	public void clickonButtonPayNow() {
		logger.info("Starting clickonButtonPayNow method");

		clickOnElement(btnPayNow);
		
		logger.info("Ending clickonButtonPayNow method");
	}
	
	public String textRazorPay() {
		logger.info("Starting of textRazorPay method");

		logger.info("Ending of textRazorPay method");

		return getText(txtRazorPay);
	}
	
	public void clickonbuttonSuccess() {
		logger.info("Starting clickonbuttonSuccess method");

		clickOnElement(btnSuccess);

		logger.info("Ending clickonbuttonSuccess method");
	}


	public void ImageCardBreakout() {
		logger.info("Starting ImageCardBreakout method");
       clickOnElement(backarrow);
		clickOnElement(imagecardBreakout);

		logger.info("Ending ImageCardBreakout method");
	}
	public void clickOnConfirmButton() {
		logger.info("Starting clickOnConfirmButton method");
     
		clickOnElement(Confirmbutton);

		logger.info("Ending clickOnConfirmButton method");
	}
	

}
