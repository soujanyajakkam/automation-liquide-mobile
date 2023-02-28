package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class loginPage extends BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(loginPage.class.getName());
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
	@FindBy(xpath = "//android.view.ViewGroup")
	private WebElement btnOtp;
	@FindBy(xpath ="//android.widget.TextView[@resource-id=\"otpInputTextId1\"])")
	private WebElement txtOtpfi;
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement cardMenu;
	@FindBy(xpath ="//android.widget.TextView[@text='Log out']")
	private WebElement btnLogOut;
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement countryDropdown;
	@FindBy(xpath = "//android.widget.TextView[@text = 'Select your country']")
	private WebElement txtSelectCountry;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement labelAustrila;
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnSelect;
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]")
	private WebElement labelCanada;
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[5]")
	private WebElement labelUnitedArab;
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[6]")
	private WebElement labelAmerica;
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement labelIndia;
	@FindBy(xpath = "//android.widget.Button[@text = 'OK']")
	private WebElement alertOkButton;
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement mobileNumberEdit;
	public loginPage(AppiumDriver appiumDriver) {
		super(appiumDriver);

	}
	public void clickOnGetStartedButton() {
		logger.info("Starting clickOnGetStartedButton method");
		clickOnElement(btnGetStarted);
		logger.info("Ending clickOnGetStartedButton method");
	}
	public String getEnterPhoneNumberScreen() {
		logger.info("Starting of getEnterPhoneNumberScreen Method");
		logger.info("Ending of getEnterPhoneNumberScreen Method");
		return ((WebElement) screenEnteYourPhoneNumber).getAttribute("text");
	}

	public void enterMobileNumber(String mobilenumber) {
		logger.info("Starting enterMobileNumber method");
		sendKeys(txtMobileNumber, mobilenumber);
		logger.info("Ending enterMobileNumber method");
	}
	public void clickOnAcceptCheckBox() throws InterruptedException {
		logger.info("Starting clickOnAcceptCheckBox method");
		clickOnElement(chkAccept);
		//clickOnElement(chkAccept);
		logger.info("Ending clickOnAcceptCheckBox method");
	}
	public void clickOnSendOtpButton() {
		logger.info("Starting clickOnSendOtpButton method");
		clickOnElement(btnSendOtp);
		logger.info("Ending clickOnSendOtpButton method");
	}
	public void enterOtp(String otp) throws InterruptedException {
		logger.info("Starting enterotp method");
	    String otpText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"enterOtpText\"]")).getText(); 
        System.out.println("+++++++++++++++++++++" + otpText);
		logger.info("Ending enterOtp method");

	}
	public void txtOTpFirstIndex() throws InterruptedException {
		logger.info("Starting txtOTpFirstIndex method");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
        logger.info("Ending txtOTpFirstIndex method");
	}
	
	public void clickOnButtonLogOut() {
		logger.info("Starting clickOnButtonLogOut method");
		clickOnElement(cardMenu);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Log out\"))"));
		clickOnElement(btnLogOut);
		 logger.info("Ending clickOnButtonLogOut method");
	}
	public void clickOnCountryDropdown() {
		logger.info("Starting clickOnCountryDropdown method");
		clickOnElement(countryDropdown);
		 logger.info("Ending clickOnCountryDropdown method");	
	}
	public String textSelectCountry() {
		logger.info("Starting of textSelectCountry Method");
		logger.info("Ending of textSelectCountry Method");
		return ((WebElement) txtSelectCountry).getAttribute("text");
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
	public void clickOnCanadaCountry() {
		logger.info("Starting clickOnCanadaCountry method");
		try {
			clickOnElement(labelCanada);
			} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		 logger.info("Ending clickOnCanadaCountry method");	
	}
	public void clickOnUnitedArabCountry() {
		logger.info("Starting clickOnUnitedArabCountry method");
		try {
			clickOnElement(labelUnitedArab);
			} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		 logger.info("Ending clickOnUnitedArabCountry method");	
	}
	public void clickOnAmericACountry() {
		logger.info("Starting clickOnAmericACountry method");
		try {
			clickOnElement(labelAmerica);
			} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		 logger.info("Ending clickOnAmericACountry method");	
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
	
	public void clickOnSelectButton() {
		logger.info("Starting clickOnSelectButton method");
		clickOnElement(btnSelect);
		 logger.info("Ending clickOnSelectButton method");	
	}
	public void clickOnAlertButton() {
		logger.info("Starting clickOnAlertButton method");
		clickOnElement(alertOkButton);
		 logger.info("Ending clickOnAlertButton method");	
	}
	public void clearData() {
		logger.info("Starting clearData method");
		mobileNumberEdit.click();
		mobileNumberEdit.clear();
		/*
		 * Actions a =new Actions(driver);
		 * a.moveToElement(txtMobileNumber).click().sendKeys(Keys.BACK_SPACE).perform();
		 */
		logger.info("Ending clearData method");
	}
	public void InvalidOTP() throws InterruptedException {
		logger.info("Starting InvalidOTP method");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"otpInputTextId1\"]")).getText();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		System.out.println("Entered number 6");
		Thread.sleep(1);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
        logger.info("Ending InvalidOTP method");
	}

}
