package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SignupNegativePage extends BaseAutomationPage{
	private static final Logger logger = Logger.getLogger(SignupPage.class.getName());

	@FindBy(xpath = "//android.widget.TextView[@text = 'Get Started']")
	private WebElement btnGetStarted;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Enter your phone number']")
	private WebElement screenEnteYourPhoneNumber;

	@FindBy(xpath = "//android.widget.EditText[@text = '000 000 0000']")
	private WebElement txtMobileNumber;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]")
	private WebElement chkAccept;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Send OTP']")
	private WebElement btnSendOtp;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Enter OTP sent to']")
	private WebElement screenEnterOTPsent;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Awesome!']")
	private WebElement screenYou3StepsAwayFromBeatingMarket;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter Full Name']")
	private WebElement txtFullName;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement selectName;

	@FindBy(xpath = "//android.view.ViewGroup[5]/android.widget.HorizontalScrollView")
	private WebElement swipeAge;

	@FindBy(xpath = "//android.widget.TextView[@text = 'female']")
	private WebElement btnGender;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Proceed']")
	private WebElement btnProceed1;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Perfect! tell us']")
	private WebElement screenPerfecttellus;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement btnProfile;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Proceed']")
	private WebElement btnProceed2;

	@FindBy(xpath = "//android.widget.TextView[@text = 'years of experience in stock investment?']")
	private WebElement screenYearsOfExperience;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement btnYears;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Proceed']")
	private WebElement btnProceed3;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement screenReferral;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement btnSkip;

	@FindBy(xpath = "//android.widget.TextView[@text = 'We have so much to show you! Would you like to take a tour?']")
	private WebElement scrnSoMuchToshow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Yes, let’s do it!']")
	private WebElement btnLetsdoit;

	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement imgSearchForYourStocks;

	
	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement cardMenu;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Log out']")
	private WebElement btnLogOut;
	
	@FindBy(xpath = "//android.widget.Button[@text = 'OK']")
	private WebElement alertOkButton;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement mobileNumberEdit;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement countryDropdown;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement labelAustrila;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement labelIndia;
	
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnSelect;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Please enter a valid name']")
	private WebElement txtPleaseEnterValidname;

	@FindBy(xpath = "//android.widget.Button[@text = 'OK']")
	private WebElement btnOk;
	
	@FindBy(xpath = "//android.widget.TextView[1]")
	private WebElement blackSpace;
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter here']")
	private WebElement txtFiledReferral;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Submit']")
	private WebElement btnSubmit;

	public SignupNegativePage(AppiumDriver driver) {
		super(driver);
	}
	public void clickOnGetStartedButton() {
		logger.info("Starting clickOnGetStartedButton method");

		clickOnElement(btnGetStarted);

		logger.info("Ending clickOnGetStartedButton method");
	}

	public String getEnterPhoenNumberScreen() {
		logger.info("Starting of getEnterPhoenNumberScreen Method");

		logger.info("Ending of getEnterPhoenNumberScreen Method");

		return getText(screenEnteYourPhoneNumber);
	}

	public void enterMobileNumber(String mobilenumber) {
		logger.info("Starting enterMobileNumber method");

		sendKeys(txtMobileNumber, mobilenumber);

		logger.info("Ending enterMobileNumber method");
	}

	public void clickOnAcceptCheckBox() {
		logger.info("Starting clickOnAcceptCheckBox method");

		clickOnElement(chkAccept);

		logger.info("Ending clickOnAcceptCheckBox method");
	}

	public void clickOnSendOtpButton() {
		logger.info("Starting clickOnSendOtpButton method");

		clickOnElement(btnSendOtp);

		logger.info("Ending clickOnSendOtpButton method");
	}

	public String enterOTPScreen() {
		logger.info("Starting of enterOTPScreen Method");

		logger.info("Ending of enterOTPScreen Method");
		return getText(screenEnterOTPsent);
	}

	public void enterOTPFiled() throws InterruptedException {
		logger.info("Starting enterOTPFiled method");

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		//((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.PASTE));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
		  
		logger.info("Ending enterOTPFiled method");
	}
	public String textGetStarted() {
		logger.info("Starting of textGetStarted Method");

		logger.info("Ending of textGetStarted Method");
		return getText(btnGetStarted);
	}
	public void clearData() {
		logger.info("Starting clearData method");
		mobileNumberEdit.click();
		mobileNumberEdit.clear();
		logger.info("Ending clearData method");
	}
	public void clickOnCountryDropdown() {
		logger.info("Starting clickOnCountryDropdown method");
		clickOnElement(countryDropdown);
		 logger.info("Ending clickOnCountryDropdown method");	
	}
	public void clickOnAustrilaCountry() {
		logger.info("Starting clickOnAustrilaCountry method");
		try {
			clickOnElement(labelAustrila);
			clickOnElement(labelAustrila);
			} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		 logger.info("Ending clickOnAustrilaCountry method");	
	}
	public void clickOnIndiaCountry() {
		
		logger.info("Starting clickOnIndiaCountry method");
		try {
			clickOnElement(labelIndia);
			} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		 logger.info("Ending clickOnIndiaCountry method");
	}
	public void clickOnAlertButton() {
		logger.info("Starting clickOnAlertButton method");
		clickOnElement(alertOkButton);
		 logger.info("Ending clickOnAlertButton method");	
	}
	public void clickOnSelectButton() {
		logger.info("Starting clickOnSelectButton method");
		clickOnElement(btnSelect);
		 logger.info("Ending clickOnSelectButton method");	
	}
	public void InvalidOTP() throws InterruptedException {
		logger.info("Starting InvalidOTP method");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
        logger.info("Ending InvalidOTP method");
	}
	public void InvalidOTP1() throws InterruptedException {
		logger.info("Starting InvalidOTP1 method");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
        logger.info("Ending InvalidOTP1 method");
	}
	public void InvalidOTP2() throws InterruptedException {
		logger.info("Starting InvalidOTP2 method");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.COMMA));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.COMMA));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.MINUS));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.MINUS));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.COMMA));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.MINUS));
        logger.info("Ending InvalidOTP2 method");
	}

	public String threeStepsAwayScreen() {
		logger.info("Starting of threeStepsAwayScreen Method");

		logger.info("Ending of threeStepsAwayScreen Method");

		return getText(screenYou3StepsAwayFromBeatingMarket);
	}
	public void clickOnName() {
		logger.info("Starting enterName method");

		selectName.click();
		selectName.clear();
		logger.info("Ending enterName method");
	}

	public void enterName(String fullName) {
		logger.info("Starting enterName method");

		sendKeys(txtFullName, fullName);

		logger.info("Ending enterName method");
	}

	public void setAge() {
		logger.info("Starting setAge method");

		this.horizontalScroll(swipeAge, 315, 239, 930);

		logger.info("Ending setAge method");
	}

	public void clickOnGenderButton() throws InterruptedException {
		logger.info("Starting clickOnGenderButton method");

		//this.tapByCoordinates(320, 1219);
		clickOnElement(btnGender);
		clickOnElement(btnGender);

		logger.info("Ending clickOnGenderButton method");
	}

	public void clickOnProccedButton() throws InterruptedException {
		logger.info("Starting clickOnProccedButton method");
		clickOnElement(btnProceed1);
		logger.info("Ending clickOnProccedButton method");
	}

	public String popUpPleaseEnterValidName() {
		logger.info("Starting of popUpPleaseEnterValidName Method");

		logger.info("Ending of popUpPleaseEnterValidName Method");

		return getText(txtPleaseEnterValidname);
	}
	public void okButton(){
		logger.info("Starting okButton method");

		clickOnElement(btnOk);

		logger.info("Ending okButton method");
	}
	public String perfectTellusScreen() {
		logger.info("Starting of perfectTellusScreen Method");

		logger.info("Ending of perfectTellusScreen Method");

		return getText(screenPerfecttellus);
	}
	public void clickOnBlackSpace(){
		logger.info("Starting clickOnBlackSpace method");
		clickOnElement(blackSpace);
		logger.info("Starting clickOnBlackSpace method");
	}
	public void selectProfileButton() throws InterruptedException {
		logger.info("Starting selectProfileButton method");

		clickOnElement(btnProfile);
		clickOnElement(btnProceed2);

		logger.info("Ending selectProfileButton method");
	}
	public String setYearsScreen() {
		logger.info("Starting of setYearsScreen Method");

		logger.info("Ending of setYearsScreen Method");
		return getText(screenYearsOfExperience);
	}

	public void selectYearButton() throws InterruptedException {
		logger.info("Starting selectYearButton method");

		clickOnElement(btnYears);
		clickOnElement(btnProceed3);

		logger.info("Ending selectYearButton method");
	}

	public String referralScreen() {
		logger.info("Starting of referralScreen Method");

		logger.info("Ending of referralScreen Method");
		return getText(screenReferral);
	}
	public void enterReferralCode(String referral) {
		logger.info("Starting enterReferralCode method");

		clickOnElement(txtFiledReferral);
		sendKeys(txtFiledReferral, referral);

		logger.info("Ending enterReferralCode method");
	}
	public void clickOnSubmitButton() {
		logger.info("Starting clickOnSubmitButton method");

		clickOnElement(btnSubmit);
		
		logger.info("Ending clickOnSubmitButton method");
	}
	public void clickOnSkip() {
		logger.info("Starting clickOnSkip method");

		clickOnElement(btnSkip);
		clickOnElement(btnSkip);

		logger.info("Ending clickOnSkip method");
	}

		public void clickOnButtonLogOut() {
		logger.info("Starting clickOnButtonLogOut method");
		clickOnElement(cardMenu);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Log out\"))"));
		clickOnElement(btnLogOut);
		 logger.info("Ending clickOnButtonLogOut method");
	}

	
	
}
	


