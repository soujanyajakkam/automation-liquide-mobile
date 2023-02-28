package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LiquideOnePage extends BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(LiquideOnePage.class.getName());
	@FindBy(xpath = "//android.widget.TextView[@text = 'Stocks in buzz']")
	private WebElement txtstock;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]//android.widget.ImageView")
	private WebElement cardLiquideOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Liquide One']")
	private WebElement txtLiquideOne;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select a plan']")
	private WebElement btnSelectPlan;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select a plan']")
	private WebElement txtSelectplan;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement cardSelectAmountthreethousand;

	@FindBy(xpath = "//android.view.ViewGroup[3]//android.view.View")
	private WebElement btnProceed3999;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Buy Liquide One']")
	private WebElement txtBuyLiquideOne;

	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View")
	private WebElement btnSwitchPlan;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Proceed with ₹999']")
	private WebElement btnProceedwith999;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnPay;

	@FindBy(xpath = "//android.view.View[@text = 'Netbanking All Indian banks']")
	private WebElement imagcrdNetBanking;

	@FindBy(xpath = "//android.view.View[4]/android.view.View")
	private WebElement imagcrdYesBanking;

	@FindBy(xpath = "//android.widget.Button[@text = 'Pay Now']")
	private WebElement btnPayNow;

	@FindBy(xpath = "//android.widget.Button[@text = 'Success']")
	private WebElement btnSuccess;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Explore']")
	private WebElement btnExplore;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement btnUseCoins;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View")
	private WebElement btnPay0;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Apply coupons']")
	private WebElement labelApplyCoupons;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnApply;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnYayButton;
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter email ID']")
	private WebElement txtEnterEmail;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Update email']")
	private WebElement btnUpdateEmail;
	
	public LiquideOnePage(AppiumDriver driver) {
		super(driver);
	}

	public void clickOnLiquideOneImagecard() {
		logger.info("Starting clickOnLiquideOneImagecard method");

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Stocks in buzz\"))"));
		// explicitWait(txtstock);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(cardLiquideOne);

		logger.info("Ending clickOnLiquideOneImagecard method");
	}

	public String textLiquideOne() {
		logger.info("Starting of textLiquideOne method");

		logger.info("Ending of textLiquideOne method");

		return getText(txtLiquideOne);
	}

	public void clickSelectPlanButton() {
		logger.info("Starting clickSelectPlanButton method");
		try {
			clickOnElement(btnSelectPlan);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("Ending clickSelectPlanButton method");
	}

	public String textSelectplan() {
		logger.info("Starting of textSelectplan method");

		logger.info("Ending of textSelectplan method");

		return getText(txtSelectplan);
	}

	public void clickOnCardAmount() {
		logger.info("Starting clickOnCardAmount method");

		clickOnElement(cardSelectAmountthreethousand);

		logger.info("Ending clickOnCardAmount method");
	}

	public void clickOnProceedButton() {
		logger.info("Starting clickOnProceedButton method");

		clickOnElement(btnProceed3999);

		logger.info("Ending clickOnProceedButton method");
	}

	public String textBuyLiquideOne() {
		logger.info("Starting of textBuyLiquideOne method");

		logger.info("Ending of textBuyLiquideOne method");

		return getText(txtBuyLiquideOne);
	}

	public void clickSwitchPlanButton() {
		logger.info("Starting clickSwitchPlanButton method");

		clickOnElement(btnSwitchPlan);

		logger.info("Ending clickSwitchPlanButton method");
	}

	public void clickOnProceed999Button() {
		logger.info("Starting clickOnProceed999Button method");

		clickOnElement(btnProceedwith999);

		logger.info("Ending clickOnProceed999Button method");
	}

	public void clickOnPayButton() {
		logger.info("Starting clickPay999Button method");
		try {
			clickOnElement(btnPay);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info("Ending clickPay999Button method");
	}

	public void clickOnNetBankingImageCard() {
		logger.info("Starting clickOnNetBankingImageCard method");

		clickOnElement(imagcrdNetBanking);

		logger.info("Ending clickOnNetBankingImageCard method");
	}

	public void clickYesBankImageCard() {
		logger.info("Starting clickYesBankImageCard method");

		clickOnElement(imagcrdYesBanking);

		logger.info("Ending clickYesBankImageCard method");
	}

	public void clickOnPayNowButton() {
		logger.info("Starting clickOnPayNowButton method");

		clickOnElement(btnPayNow);

		logger.info("Ending clickOnPayNowButton method");
	}

	public void clickSuccessButton() {
		logger.info("Starting clickSuccessButton method");

		clickOnElement(btnSuccess);

		logger.info("Ending clickSuccessButton method");
	}

	public void clickExploreButton() {
		logger.info("Starting clickExploreButton method");

		clickOnElement(btnExplore);

		logger.info("Ending clickExploreButton method");
	}

	public void clickOnUseCoinsButton() {
		logger.info("Starting clickOnUseCoinsButton method");

		clickOnElement(btnUseCoins);

		logger.info("Ending clickOnUseCoinsButton method");
	}

	public void clickOnPay0Button() {
		logger.info("Starting clickOnPay0Button method");

		clickOnElement(btnPay0);

		logger.info("Ending clickOnPay0Button method");
	}

	public void clickOnApplyCoupon() {
		logger.info("Starting clickOnApplyCoupon method");

		clickOnElement(labelApplyCoupons);

		logger.info("Ending clickOnApplyCoupon method");
	}

	public void clickOnCouponCode() {
		logger.info("Starting clickOnCouponCode method");

		clickOnElement(btnApply);

		logger.info("Ending clickOnCouponCode method");
	}

	public void clickOnYayThanksButton() {
		logger.info("Starting clickOnYayThanksButton method");

		clickOnElement(btnYayButton);

		logger.info("Ending clickOnYayThanksButton method");
	}
	public void enterEmailId(String email) {
		logger.info("Starting enterEmailId method");

		clickOnElement(txtEnterEmail);
		clickOnElement(txtEnterEmail);
		sendKeys(txtEnterEmail, email);
		
		logger.info("Ending enterEmailId method");
	}

	public void clickOnUpdateEmail() {
		logger.info("Starting clickOnUpdateEmail method");

		clickOnElement(btnUpdateEmail);

		logger.info("Ending clickOnUpdateEmail method");
	}
}
