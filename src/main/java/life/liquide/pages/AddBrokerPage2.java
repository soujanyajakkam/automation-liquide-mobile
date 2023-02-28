package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddBrokerPage2 extends BaseAutomationPage {

	private static final Logger logger = Logger.getLogger(AddBrokerPage2.class.getName());

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[2]//android.widget.ImageView")
	private WebElement imgcardAddBroker;
	
	@FindBy(xpath = "//input[@id='mobileNum'] ")
	private WebElement txtmblNum;

	@FindBy(xpath = "//button[@id='getOtp']")
	private WebElement btnGetOTp;

	@FindBy(xpath = "//input[@id='otpNum']")
	private WebElement txtOtpNUm;

	@FindBy(xpath = "//button[@id='continueBtn']")
	private WebElement btnContinue;
	
    @FindBy(xpath="//input[@id='pinCode']") 
    private WebElement txtPinCode;
	  
	@FindBy(xpath = "//button[@id='pinContinueBtn']")
	private WebElement btncontinue1;
	
	@FindBy(xpath = "//button[contains(text(),'Continue with Upstox')]")
	private WebElement btncontinue2;
	
	@FindBy(xpath = "//button[contains(text(),'Grant permission')]")
	private WebElement btncontinue3;
	
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private WebElement downArrowPortfolio;
	
	public AddBrokerPage2(AppiumDriver driver) {
		super(driver);
	}

	public void addBroker() {
		logger.info("Starting addBroker method");

		clickOnElement(imgcardAddBroker);

		logger.info("Ending addBroker method");
	}

	public void connectBroker() throws InterruptedException {
		logger.info("Starting connectBroker method");

		Thread.sleep(10000);
	//this.tapByCoordinates(364, 1222);
		this.tapByCoordinates(164, 1057);
		logger.info("Ending connectBroker method");
	}

	
	public void enterToken(String num) {
		logger.info("Starting entertoken method");

		super.switchContextWebView();
		clickOnElement(txtmblNum);
		this.txtmblNum.sendKeys(Keys.ENTER);
		sendKeys(txtmblNum, num);

		logger.info("Ending entertoken method");
	}

	public void clickOnGenerateOTp() {
		logger.info("Starting clickOnGenerateOTp method");

		clickOnElement(btnGetOTp);

		logger.info("Ending clickOnGenerateOTp method");
	}


	public void enterUserOTP() throws InterruptedException {
		logger.info("Starting enterUserPin method");
		
        driver.navigate().back();
        
		super.switchContextWebView();
		
		clickOnElement(txtOtpNUm);
		
	    this.sendKeys(txtOtpNUm,OTP);

		logger.info("Ending enterUserPin method");
	}

	public void clickOnVerify() {
		logger.info("Starting clickOnVerify method");

		clickOnElement(btnContinue);

		logger.info("Ending clickOnVerify method");
	}
	
	
	public void enterUserPinNumber(String pin) {
		logger.info("Starting enterUserPinNumber method");
		
		clickOnElement(txtPinCode);
		
	    this.sendKeys(txtPinCode,pin);

		logger.info("Ending enterUserPinNumber method");
	}
	
	public void clickOnSubmitButton() throws InterruptedException {
		logger.info("Starting clickOnSubmitButton method");

		clickOnElement(btncontinue1);
		Thread.sleep(1000);
		   
	   super.switchContextMobileView();
	   
		//clickOnElement(btncontinue2);
		//clickOnElement(btncontinue3);
		//Thread.sleep(50000);
		//super.switchContextMobileView();
	   Thread.sleep(20000);
	   driver.quit();
		logger.info("Ending clickOnSubmitButton method");
	}
	
	
	public void clickOnPortfolioHealthCard() {
		logger.info("Starting clickOnPortfolioHealthCard method");
		
		//clickOnElement(downArrowPortfolio);
		//clickOnElement(downArrowPortfolio);
		logger.info("Ending clickOnPortfolioHealthCard method");
	}
}
