package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddCoinsPage extends BaseAutomationPage {

	private static final Logger logger = Logger.getLogger(AddCoinsPage.class.getName());
	
	@FindBy(xpath = "//android.view.View[3]/android.view.ViewGroup")
	private WebElement icnLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Hi, I am LiMo!']")
	private WebElement txtIamLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Ask LiMo']")
	private WebElement btnAskLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Looks like you have insufficient coins!']")
	private WebElement txtInsufficientCoins;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Add coins to continue']")
	private WebElement btnAddCoinsToContinue;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select coin amount to top up']")
	private WebElement txtselectCoinsTop;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Add Coins']")
	private WebElement txtAddCoins;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Select coin amount to top up']")
	private WebElement txtselectCoinsTopUp;

	@FindBy(xpath = "//android.widget.TextView[@text = '50']")
	private WebElement imgcard50Coins;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
	private WebElement btnPay50;

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
	private WebElement btnPayNow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Welcome to Razorpay Software Private Ltd Bank']")
	private WebElement txtWelcomeToRazorpay;
	
	@FindBy(xpath = "//android.widget.Button[@text = 'Success']")
	private WebElement btnSuccess;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Coins were added successfully!']")
	private WebElement txtCoinsAddedSucessfully;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View[1]")
	private WebElement btnGotIt;
	
	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]//android.widget.ImageView")
	private WebElement imgCardAddCoins;
	
	@FindBy(xpath="//android.view.ViewGroup[4]/android.view.ViewGroup//android.view.View")
	private WebElement btnAddCoins;
	
	@FindBy(xpath="//android.widget.TextView[@text = '50']")
	private WebElement imgcardCoinTopUp;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnPay;
	
	public AddCoinsPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void clickOnLimoIcon() {
		logger.info("Starting clickOnLimoIcon method");

		clickOnElement(icnLimo);

		logger.info("Ending clickOnLimoIcon method");
	}

	public String textLimo() {
		logger.info("Starting of textLimo method");

		logger.info("Ending of textLimo method");

		return getText(txtIamLimo);
	}

	public void clickOnAskLimoButton() {
		logger.info("Starting clickOnAskLimoIcon method");

		clickOnElement(btnAskLimo);

		logger.info("Ending clickOnAskLimoIcon method");
	}

	
	
	public String insufficientCoinsPopUp() {
		logger.info("Starting insufficientCoinsPopUp method");

		logger.info("Ending insufficientCoinsPopUp method");
		return getText(txtInsufficientCoins);
	}

	public void clickOnAddCoinsToContinue() {
		logger.info("Starting clickOnAddCoinsToContinue method");

		clickOnElement(btnAddCoinsToContinue);

		logger.info("Ending clickOnAddCoinsToContinue method");
	}

	public String textAddcoins()  {
		logger.info("Starting txtAddcoins method");

		logger.info("Ending txtAddcoins method");
		return getText(txtAddCoins);
	}
	
	public String textCoinsTopUp()  {
		logger.info("Starting textCoinsTopUp method");

		logger.info("Ending textCoinsTopUp method");
		return getText(txtselectCoinsTopUp);
	}
	
	public void clickOnImgCardTopUpCoins() {
		logger.info("Starting clickOnImgCardTopUpCoins method");

		clickOnElement(imgcard50Coins);

		logger.info("Ending clickOnImgCardTopUpCoins method");
	}
	
	public void clickOnPayButton() {
		logger.info("Starting clickOnPayButton method");

		clickOnElement(btnPay50);

		logger.info("Ending clickOnPayButton method");
	}
	
	public String textHaveYouUpdatedEmail()  {
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
	public String textCardsAndMore()  {
		logger.info("Starting textHaveYouUpdatedEmail method");

		logger.info("Ending textHaveYouUpdatedEmail method");
		return getText(txtCardsAndMore);
	}
	
	
	public void clickOnNetBankingButton() {
		logger.info("Starting clickOnNetBankingButton method");

		clickOnElement(btnNetBanking);

		logger.info("Ending clickOnNetBankingButton method");
	}
	public String textSelectBank()  {
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
	public String textWelcomeRazorpay()  {
		logger.info("Starting textWelcomeRazorpay method");

		logger.info("Ending textWelcomeRazorpay method");
		return getText(txtWelcomeToRazorpay);
	}
	public void clickOnSuccessButton() {
		logger.info("Starting clickOnSuccessButton method");

		clickOnElement(btnSuccess);

		logger.info("Ending clickOnSuccessButton method");
	}
	public String textCoinsAddedPopUp()  {
		logger.info("Starting textCoinsAddedPopUp method");

		logger.info("Ending textCoinsAddedPopUp method");
		return getText(txtCoinsAddedSucessfully);
	}
	public void clickOnGotItButton() {
		logger.info("Starting clickOnGotItButton method");

		clickOnElement(btnGotIt);

		logger.info("Ending clickOnGotItButton method");
	}
	public void clickOnimgcrdCoins() {
		logger.info("Starting clickOnimgcrdCoins method");

		clickOnElement(imgCardAddCoins);

		logger.info("Ending clickOnimgcrdCoins method");
	}


	public void clickOnAddCoinsButton() {
		logger.info("Starting clickOnAddCoinsButton method");

		clickOnElement(btnAddCoins);

		logger.info("Ending clickOnAddCoinsButton method");
	}

	
	public void clickOncardCoinsTopUp() {
		logger.info("Starting clickOncardCoinsTopUp method");

		clickOnElement(imgcardCoinTopUp);

		logger.info("Ending clickOncardCoinsTopUp method");
	}
}
