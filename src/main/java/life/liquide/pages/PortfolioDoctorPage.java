package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class PortfolioDoctorPage extends BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(PortfolioDoctorPage.class.getName());
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]")
	private WebElement needBuyandSell;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Portfolio review']")
	private WebElement imgcardPortfolio;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Your 1-on-1 with  SEBI registered investment advisor']")
	private WebElement txtSEBIAdvisor;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.View")
	private WebElement btnBookAppointment;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Liquide Dev']")
	private WebElement txtLiquideDev;

	@FindBy(xpath = "//android.view.View[@content-desc = 'Accept']")
	private WebElement btnAcceptCookies;

	@FindBy(xpath = "//android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button")
	private WebElement btnSlot;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Confirm Booking']")
	private WebElement txtConfirmBooking;

	@FindBy(xpath = "//android.widget.Button[@text = 'Request Booking']")
	private WebElement btnRequestBooking;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnPayinConfirmBooking;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Pay ₹ 999']")
	private WebElement btnPay999;

	@FindBy(xpath = "//android.view.View[@text = 'Card Visa, MasterCard, RuPay, and Maestro']")
	private WebElement Card;

	@FindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	private WebElement txtCardNumber;

	@FindBy(xpath = "//android.view.View[2]/android.widget.EditText")
	private WebElement txtCardExpiry;

	@FindBy(xpath = "//android.view.View[4]/android.widget.EditText")
	private WebElement txtCardCvv;

	@FindBy(xpath = "//android.view.View[1]/android.widget.Button")
	private WebElement btnPayNow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Save your card securely on Liquide']")
	private WebElement txtSaveCardDetails;

	@FindBy(xpath = "//android.widget.Button[@text = 'Pay without Saving Card']")
	private WebElement btnPayWithoutSavingCard;

	@FindBy(xpath = "//android.widget.Button[@text = 'Success']")
	private WebElement btnSuccess;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Appointment booked successfully!']")
	private WebElement txtAppointmentBooked;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnOkay;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement btnBackArrow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement icnMenu;

	@FindBy(xpath = "//android.view.ViewGroup[5]")
	private WebElement lableLiquideOneCoins;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnAddcoins;

	@FindBy(xpath = "//android.widget.TextView[@text = '  2,000']")
	private WebElement imgcard2000Coins;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement btn2000coins;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Hey Anurag! Have you updated your email']")
	private WebElement txtHaveYouUpdatedYourEmail;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter email ID']")
	private WebElement txtEnterEmail;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Update email']")
	private WebElement btnUpdateEmail;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Cards, UPI & More']")
	private WebElement txtCardsAndMore;

	@FindBy(xpath = "//android.view.View[@text = 'Netbanking All Indian banks']")
	private WebElement btnNetBanking;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select Bank']")
	private WebElement txtSelectBank;

	@FindBy(xpath = "//android.view.View[4]/android.view.View")
	private WebElement imgcradNetBanking;

	@FindBy(xpath = "//android.widget.Button[@text = 'Pay Now']")
	private WebElement butnPayNow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Welcome to Razorpay Software Private Ltd Bank']")
	private WebElement txtWelcomeToRazorpay;

	@FindBy(xpath = "//android.widget.Button[@text = 'Success']")
	private WebElement butnSuccess;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Coins were added successfully!']")
	private WebElement txtCoinsAddedSucessfully;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnGotIt;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement backArrow;
	
	public PortfolioDoctorPage(AppiumDriver driver) {
		super(driver);
	}

	public void clickOnPortfolioReviewimgcard() {
		logger.info("Starting clickOnPortfolioReviewimgcard method");

		/*
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		 * ".scrollIntoView(new UiSelector().text(\"Need buy, sell hold advice?\"))"));
		 */
		//clickOnElement(imgcardPortfolio);
		this.tapByCoordinates(356, 525);

		logger.info("Ending clickOnPortfolioReviewimgcard method");
	}

	public String textSEBIExpertAdvisor() {
		logger.info("Starting of textSEBIExpertAdvisor method");

		logger.info("Ending of textSEBIExpertAdvisor method");

		return getText(txtSEBIAdvisor);
	}

	public void clickonBookAnAppointmentButton() {
		logger.info("Starting clickonBookAnAppointmentButton method");

		clickOnElement(btnBookAppointment);

		logger.info("Ending clickonBookAnAppointmentButton method");
	}

	public String textLiquideDev() {
		logger.info("Starting of textLiquideDev method");

		logger.info("Ending of textLiquideDev method");

		return getText(txtLiquideDev);
	}

	public void clickonAcceptCookiesButton() {
		logger.info("Starting clickonAcceptCookiesButton method");

		clickOnElement(btnAcceptCookies);

		logger.info("Ending clickonAcceptCookiesButton method");
	}

	public void clickonOneSlot() {
		logger.info("Starting clickonOneSlot method");

		clickOnElement(btnSlot);

		logger.info("Ending clickonOneSlot method");
	}

	public void clickOnRequestBookingButton() {
		logger.info("Starting clickOnRequestBookingButton method");

		clickOnElement(btnRequestBooking);

		logger.info("Ending clickOnRequestBookingButton method");
	}

	public void clickOnPayButton() {
		logger.info("Starting clickPay999Button method");
		explicitWait(btnPayinConfirmBooking);
		clickOnElement(btnPayinConfirmBooking);

		logger.info("Ending clickPay999Button method");
	}

	public void clickOnProceed999Button() {
		logger.info("Starting clickOnProceed999Button method");
		explicitWait(btnPay999);

		try {
			clickOnElement(btnPay999);
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}

		logger.info("Ending clickOnProceed999Button method");
	}

	public void EnterCardDetails(String cardNumber, String cardExpiry, String cardCvv) {
		logger.info("Starting EnterCardDetails method");

		clickOnElement(Card);
		clickOnElement(txtCardNumber);
		sendKeys(txtCardNumber, cardNumber);
		clickOnElement(txtCardExpiry);
		sendKeys(txtCardExpiry, cardExpiry);
		clickOnElement(txtCardCvv);
		sendKeys(txtCardCvv, cardCvv);

		logger.info("Ending EnterCardDetails method");
	}

	public void clickOnPayNowButton() {
		logger.info("Starting clickOnPayNowButton method");

		clickOnElement(btnPayNow);

		logger.info("Ending clickOnPayNowButton method");
	}

	public String textCardDetails() {
		logger.info("Starting of textCardDetails method");

		logger.info("Ending of textCardDetails method");

		return getText(txtSaveCardDetails);
	}

	public void clickOnPayWithoutSavingCard() {
		logger.info("Starting clickOnPayWithoutSavingCard method");

		clickOnElement(btnPayWithoutSavingCard);

		logger.info("Ending clickOnPayWithoutSavingCard method");
	}

	public void clickSuccessButton() {
		logger.info("Starting clickSuccessButton method");

		clickOnElement(btnSuccess);

		logger.info("Ending clickSuccessButton method");
	}

	public String textAppointmentBooked() {
		logger.info("Starting of textAppointmentBooked method");

		logger.info("Ending of textAppointmentBooked method");

		return getText(txtAppointmentBooked);
	}

	public void clickOkayButton() {
		logger.info("Starting clickOkayButton method");

		clickOnElement(btnOkay);

		this.tapByCoordinates(343, 463);

		logger.info("Ending clickOkayButton method");
	}

	public void clicckOnBackArrowButton() {
		logger.info("Starting clicckOnBackArrowButton method");

		clickOnElement(btnBackArrow);

		logger.info("Ending clicckOnBackArrowButton method");
	}

	public void clicckOnConfirmButton() {
		logger.info("Starting clicckOnConfirmButton method");

		clickOnElement(btnConfirm);

		logger.info("Ending clicckOnConfirmButton method");
	}

	public void AddCoins() {
		logger.info("Starting AddCoins method");
		try {
			clickOnElement(icnMenu);
			} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clickOnElement(lableLiquideOneCoins);
		clickOnElement(btnAddcoins);
		clickOnElement(imgcard2000Coins);
		clickOnElement(btn2000coins);

		logger.info("Ending AddCoins method");
	}

	public String textHaveYouUpdatedEmail() {
		logger.info("Starting textHaveYouUpdatedEmail method");

		logger.info("Ending textHaveYouUpdatedEmail method");
		return getText(txtHaveYouUpdatedYourEmail);
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

	public String textCardsAndMore() {
		logger.info("Starting textHaveYouUpdatedEmail method");

		logger.info("Ending textHaveYouUpdatedEmail method");
		return getText(txtCardsAndMore);
	}

	public void clickOnNetBankingButton() {
		logger.info("Starting clickOnNetBankingButton method");

		clickOnElement(btnNetBanking);

		logger.info("Ending clickOnNetBankingButton method");
	}

	public String textSelectBank() {
		logger.info("Starting textSelectBank method");

		logger.info("Ending textSelectBank method");
		return getText(txtSelectBank);
	}

	public void clickOnNetBankingimgcard() {
		logger.info("Starting clickOnNetBankingimgcard method");

		clickOnElement(imgcradNetBanking);

		logger.info("Ending clickOnNetBankingimgcard method");
	}

	public void clickOnPayNowRazopary() {
		logger.info("Starting clickOnPayNowRazopary method");

		clickOnElement(btnPayNow);

		logger.info("Ending clickOnPayNowRazopary method");
	}

	public String textWelcomeRazorpay() {
		logger.info("Starting textWelcomeRazorpay method");

		logger.info("Ending textWelcomeRazorpay method");
		return getText(txtWelcomeToRazorpay);
	}

	public void clickOnSuccessButton() {
		logger.info("Starting clickOnSuccessButton method");

		clickOnElement(btnSuccess);

		logger.info("Ending clickOnSuccessButton method");
	}

	public String textCoinsAddedPopUp() {
		logger.info("Starting textCoinsAddedPopUp method");

		logger.info("Ending textCoinsAddedPopUp method");
		return getText(txtCoinsAddedSucessfully);
	}

	public void clickOnGotItButton() {
		logger.info("Starting clickOnGotItButton method");

		clickOnElement(btnGotIt);

		logger.info("Ending clickOnGotItButton method");
	}
	public void clickOnBackArrowButton() {
		logger.info("Starting clickOnBackArrowButton method");

		clickOnElement(backArrow);

		logger.info("Ending clickOnBackArrowButton method");
	}
}
