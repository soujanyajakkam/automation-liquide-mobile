package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddBrokerPage extends BaseAutomationPage {

	private static final Logger logger = Logger.getLogger(AddBrokerPage.class.getName());

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[2]//android.widget.ImageView")
	private WebElement imgcardAddBroker;

	@FindBy(xpath = "//input[@id='loginUser']")
	private WebElement txtmobile;

	@FindBy(xpath = "//h3[contains(text(),'Login')]")
	private WebElement txtlogin;

	@FindBy(xpath = "//button[@id='btnGenerateOTP']")
	private WebElement btnGenrateOtp;

	@FindBy(xpath = "//h3[contains(text(),'OTP Verification')]")
	private WebElement txtOTPVerification;
	
    @FindBy(xpath="//input[@id='dvLoginMPINOTP1']") 
    private WebElement txtuserPin1;
	  
	@FindBy(xpath = "//input[@id='dvLoginMPINOTP2']")
	private WebElement txtuserPin2;

	@FindBy(xpath = "//input[@id='dvLoginMPINOTP3']")
	private WebElement txtuserPin3;

	@FindBy(xpath = "//input[@id='dvLoginMPINOTP4']")
	private WebElement txtuserPin4;

	@FindBy(xpath = "//input[@id='dvLoginMPINOTP5']")
	private WebElement txtuserPin5;

	@FindBy(xpath = "//input[@id='dvLoginMPINOTP6']")
	private WebElement txtuserPin6;

	@FindBy(xpath="//button[@id='btnVerifyOTPMPIN']") 
    private WebElement btnVerify;
	  
	@FindBy(xpath="//h3[contains(text(),'Enter PIN')]//parent::div[@id='divEnterPin']")
	private WebElement txtEnterPin;
	
	@FindBy(xpath = "//input[@id='dvPin1']")
	private WebElement txtPin1;
	
	@FindBy(xpath = "//input[@id='dvPin2']")
	private WebElement txtPin2;
	
	@FindBy(xpath = "//input[@id='dvPin3']")
	private WebElement txtPin3;
	
	@FindBy(xpath = "//input[@id='dvPin4']")
	private WebElement txtPin4;

	@FindBy(xpath = "//input[@id='dvPin5']")
	private WebElement txtPin5;
	
	@FindBy(xpath = "//input[@id='dvPin6']")
	private WebElement txtPin6;
	
	@FindBy(xpath = "//button[@id='btnPINSubmit']")
	private WebElement btnSubmit;
		
	@FindBy(xpath = "(//button[contains(text(),'Yes, Bind')])[2]")
	private WebElement btnYesBehind;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private WebElement downArrowPortfolio;
	
	public AddBrokerPage(AppiumDriver driver) {
		super(driver);
	}

	public void addBroker() {
		logger.info("Starting addBroker method");

		clickOnElement(imgcardAddBroker);

		logger.info("Ending addBroker method");
	}

	public void connectBroker() throws InterruptedException {
		logger.info("Starting connectBroker method");

		Thread.sleep(20000);
		this.tapByCoordinates(164, 1057);

		logger.info("Ending connectBroker method");
	}

	
	public void enterToken(String token) {
		logger.info("Starting entertoken method");

		super.switchContextWebView();
		clickOnElement(txtmobile);
		this.txtmobile.sendKeys(Keys.ENTER);
		sendKeys(txtmobile, token);

		logger.info("Ending entertoken method");
	}

	public void clickOnGenerateOTp() {
		logger.info("Starting clickOnGenerateOTp method");

		clickOnElement(btnGenrateOtp);

		logger.info("Ending clickOnGenerateOTp method");
	}

	public String textOTPVerification() {
		logger.info("Starting textOTPVerification method");


		logger.info("Ending textOTPVerification method");
		return getText(txtOTPVerification);
	}

	
	public void enterUserOTP() throws InterruptedException {
		logger.info("Starting enterUserPin method");
		
        driver.navigate().back();
        
		super.switchContextWebView();
		
		clickOnElement(txtuserPin1);
		
	    this.sendKeys(txtuserPin1,OTP);

		logger.info("Ending enterUserPin method");
	}

	public void clickOnVerify() {
		logger.info("Starting clickOnVerify method");

		clickOnElement(btnVerify);

		logger.info("Ending clickOnVerify method");
	}
	
	public String textEnterPinNumber() {
		logger.info("Starting textEnterPinNumber method");


		logger.info("Ending textEnterPinNumber method");
		return getText(txtEnterPin);
	}

	
	public void enterUserPinNumber(String pin1) {
		logger.info("Starting enterUserPinNumber method");
		
		clickOnElement(txtPin1);
		
	    this.sendKeys(txtPin1,pin1);

		logger.info("Ending enterUserPinNumber method");
	}
	
	public void clickOnSubmitButton() {
		logger.info("Starting clickOnSubmitButton method");

		clickOnElement(btnSubmit);

		logger.info("Ending clickOnSubmitButton method");
	}
	public void clickOnYesBehind() throws InterruptedException {
		logger.info("Starting clickOnYesBehind method");

		clickOnElement(btnYesBehind);
		
		Thread.sleep(2000);
		super.switchContextMobileView();
		//clickOnElement(btnYesBehind);
		
		logger.info("Ending clickOnYesBehind method");
	}
	
	public void clickOnPortfolioHealthCard() {
		logger.info("Starting clickOnPortfolioHealthCard method");
		
		clickOnElement(downArrowPortfolio);
		clickOnElement(downArrowPortfolio);
		logger.info("Ending clickOnPortfolioHealthCard method");
	}
}
