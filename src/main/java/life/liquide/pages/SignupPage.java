package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SignupPage extends BaseAutomationPage {

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

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextFavouriteStocks;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextExploreMarketToday;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextGetPortfolioUpdates;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextLImo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextGetPortfolioHealthCheckups;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextMarketExpendition;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextHelpYouInvest;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextGetSmartSellAlerts;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Got it, next!']")
	private WebElement btnGotitNextInvestSecurly;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Start Investing!']")
	private WebElement btnStartInvesting;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
	private WebElement scrnExploreHowtheMarketDoingtoday;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Add broker']")
	private WebElement btnAddBroker;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement cardMenu;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Log out']")
	private WebElement btnLogOut;
	
	public SignupPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
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
		//clickOnElement(chkAccept);

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

	public String threeStepsAwayScreen() {
		logger.info("Starting of threeStepsAwayScreen Method");

		logger.info("Ending of threeStepsAwayScreen Method");

		return getText(screenYou3StepsAwayFromBeatingMarket);
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

		this.tapByCoordinates(320, 1219);
		clickOnElement(btnGender);
		Thread.sleep(1000);
		clickOnElement(btnProceed1);

		logger.info("Ending clickOnGenderButton method");
	}

	public String perfectTellusScreen() {
		logger.info("Starting of perfectTellusScreen Method");

		logger.info("Ending of perfectTellusScreen Method");

		return getText(screenPerfecttellus);
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

	public void clickOnSkip() {
		logger.info("Starting clickOnSkip method");

		clickOnElement(btnSkip);
		clickOnElement(btnSkip);

		logger.info("Ending clickOnSkip method");
	}

	public String weHaveSoMuchtoShow() {
		logger.info("Starting weHaveSoMuchtoShow method");

		logger.info("Ending weHaveSoMuchtoShow method");
		return getText(scrnSoMuchToshow);
	}

	public void clickOnYesLetsDoItbutton() {
		logger.info("Starting clickOnYesLetsDoItbutton method");

		clickOnElement(btnLetsdoit);

		logger.info("Ending clickOnYesLetsDoItbutton method");
	}

	public void clickOnExploreHowtheMarketDoingtoday() {
		logger.info("Starting clickOnExploreHowtheMarketDoingtoday method");

		clickOnElement(scrnExploreHowtheMarketDoingtoday);

		logger.info("Ending clickOnExploreHowthbtnGotitNextInvestSecurlyeMarketDoingtoday method");
	}

	public void clickOnGotitNextButtonFavouriteStocks() {
		logger.info("Starting clickOnGotitNextButtonFavouriteStocks method");

		clickOnElement(btnGotitNextFavouriteStocks);

		logger.info("Ending clickOnGotitNextButtonFavouriteStocks method");
	}

	public void clickOnGotitNextButtonExploreMarketToday() {
		logger.info("Starting clickOnGotitNextButtonExploreMarketToday method");

		clickOnElement(btnGotitNextExploreMarketToday);

		logger.info("Ending clickOnGotitNextButtonExploreMarketToday method");
	}

	public void clickOnGotitNextButtonGetPortfolioUpdates() {
		logger.info("Starting clickOnGotitNextButtonGetPortfolioUpdates method");

		clickOnElement(btnGotitNextGetPortfolioUpdates);

		logger.info("Ending clickOnGotitNextButtonGetPortfolioUpdates method");
	}

	public void clickOnGotitNextButtonLImo() {
		logger.info("Starting clickOnGotitNextButtonLImo method");

		clickOnElement(btnGotitNextLImo);

		logger.info("Ending clickOnGotitNextButtonLImo method");
	}

	public void clickOnGotitNextButtonLGetPortfolioHealthCheckups() {
		logger.info("Starting clickOnGotitNextButtonLGetPortfolioHealthCheckups method");

		clickOnElement(btnGotitNextGetPortfolioHealthCheckups);

		logger.info("Ending clickOnGotitNextButtonLGetPortfolioHealthCheckups method");
	}

	public void clickOnGotitNextButtonMarketExpendition() {
		logger.info("Starting clickOnGotitNextButtonMarketExpendition method");

		clickOnElement(btnGotitNextMarketExpendition);

		logger.info("Ending clickOnGotitNextButtonMarketExpendition method");
	}

	public void clickOnGotitNextButtonHelpYouInvest() {
		logger.info("Starting clickOnGotitNextButtonHelpYouInvest method");

		clickOnElement(btnGotitNextHelpYouInvest);

		logger.info("Ending clickOnGotitNextButtonHelpYouInvest method");
	}

	public void clickOnGotitNextButtonGetSmartSellAlerts() {
		logger.info("Starting clickOnGotitNextButtonGetSmartSellAlerts method");

		this.tapByCoordinates(354, 1326);

		logger.info("Ending clickOnGotitNextButtonGetSmartSellAlerts method");
	}

	public void clickOnGotitNextButtonInvestSecurly() {
		logger.info("Starting clickOnGotitNextButtonInvestSecurly method");

		this.tapByCoordinates(354, 1326);

		logger.info("Ending clickOnGotitNextButtonInvestSecurly method");
	}

	public void clickOnStartInvesting() {
		logger.info("Starting clickOnStartInvesting method");

		this.tapByCoordinates(354, 1326);

		logger.info("Ending clickOnStartInvesting method");
	}

	public void clickOnIwillDoItLater() {
		logger.info("Starting clickOnIwillDoItLater method");

		this.tapByCoordinates(354, 1354);

		logger.info("Ending clickOnIwillDoItLater method");
	}
	public void clickOnButtonLogOut() {
		logger.info("Starting clickOnButtonLogOut method");
		clickOnElement(cardMenu);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Log out\"))"));
		clickOnElement(btnLogOut);
		 logger.info("Ending clickOnButtonLogOut method");
	}
	public String textGetStarted() {
		logger.info("Starting of textGetStarted Method");

		logger.info("Ending of textGetStarted Method");
		return getText(btnGetStarted);
	}

}
