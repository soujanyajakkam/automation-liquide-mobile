package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class TradePage extends BaseAutomationPage{

	
	
		private static final Logger logger = Logger.getLogger(TradePage.class.getName());

		@FindBy(xpath = "//android.view.View[2]//android.view.View")
		private WebElement cardTrade;

		@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.view.ViewGroup")
		private WebElement btnBuy;
		@FindBy(xpath = "//android.widget.TextView[@text = 'Buy stock']")
		private WebElement txtBuyStock;
		
		@FindBy(xpath ="//android.widget.TextView[@text = 'Login with Leprechaun']")
		private WebElement txtLoginWithLeprechaun;
		
		@FindBy(xpath ="//input[@type=\"text\"]")
		private WebElement filedLogin;
		
		@FindBy(xpath ="//android.widget.EditText")
		private WebElement txtLogin;
		
		@FindBy(xpath = "//android.widget.Button[@text = 'LOGIN']")
		private WebElement btnLogin;

		@FindBy(xpath = "//android.widget.EditText[@text = '1']")
		private WebElement btnQuantity;
		
		@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView[@text = 'Buy']")
		private WebElement btnBuyStock;
		
		@FindBy(xpath = "//button[contains(text(),'Review')] ")
		private WebElement btnReview;

		@FindBy(xpath = "//button[contains(text(),'Place Order')] ")
		private WebElement btnPlaceOrder;
		
		@FindBy(xpath = "//button[contains(text(),'Confirm Order')] ")
		private WebElement btnConfirmOrder;
		


		public TradePage(AppiumDriver driver) {
			super(driver);
		}
		
		public void clickonTradeCard() {
			logger.info("Starting clickonTradeCard method");
		
			clickOnElement(cardTrade);

			logger.info("Ending clickonTradeCard method");
		}

		
		public void clickonBuyButton() {
			logger.info("Starting clickonBuyButton method");

			clickOnElement(btnBuy);

			logger.info("Ending clickonBuyButton method");
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

		public void EnterLoginCredentials(String LoginCredentilas) {
			logger.info("Starting EnterLoginCredentials method");

			clickOnElement(filedLogin);
			
			sendKeys(txtLogin,LoginCredentilas);
			
			logger.info("Ending EnterLoginCredentials method");
		}
		
		public void clickOnLoginButton() {
			logger.info("Starting clickOnLoginButton method");

			clickOnElement(btnLogin);
			
			logger.info("Ending clickOnLoginButton method");
		}
		
		public void enterQuantity(String Quantity) {
			logger.info("Starting enterQuantity method");

			clickOnElement(btnQuantity);

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
}}