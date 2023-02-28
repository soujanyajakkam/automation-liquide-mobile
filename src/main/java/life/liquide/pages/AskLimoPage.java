package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AskLimoPage extends BaseAutomationPage {

	private static final Logger logger = Logger.getLogger(AskLimoPage.class.getName());

	@FindBy(xpath = "//android.view.View[3]/android.view.ViewGroup")
	private WebElement icnLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Hi, I am LiMo!']")
	private WebElement txtIamLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Ask LiMo']")
	private WebElement btnAskLimo;

	@FindBy(xpath = "//android.widget.TextView[@text = '1. Which stock should LiMo help you with?']")
	private WebElement txtFirstQuestion;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Search a stock...']")
	private WebElement txtFiledSearch;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Search for stocks']")
	private WebElement textStock;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'MAHAPEXLTD']")
	private WebElement imgcardAppearedStock;

	@FindBy(xpath = "//android.widget.TextView[@text = 'No']")
	private WebElement btnOwnthisStockAlready;

	@FindBy(xpath = "//android.widget.TextView[@text = '12+ months']")
	private WebElement btnInvestPeriod;

	@FindBy(xpath = "//android.widget.EditText[@text = 'Write here']")
	private WebElement textAdditionalInfo;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Submit']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//android.widget.TextView[@text = 'LiMo']")
	private WebElement txtAfterSubmit;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Maha Rashtra Apex Corporation Ltd.']")
	private WebElement screenResult;
	
	public AskLimoPage(AppiumDriver driver) {
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

	public String textQuestion() {
		logger.info("Starting of textQuestion method");

		logger.info("Ending of textQuestion method");

		return getText(txtFirstQuestion);
	}

	public void clickOnSearchIcon() {
		logger.info("Starting clickOnSearchIcon method");

		clickOnElement(txtFiledSearch);

		logger.info("Ending clickOnSearchIcon method");
	}

	public void enterStockName(String searchStock) {
		logger.info("Starting enterStockName method");

		sendKeys(textStock, searchStock);

		logger.info("Ending enterStockName method");
	}

	public void clickOnAppearedStock() {
		logger.info("Starting clickOnAppearedStock method");

		clickOnElement(imgcardAppearedStock);

		logger.info("Ending clickOnAppearedStock method");
	}

	public void clickOnOwnThisStockAlredy() {
		logger.info("Starting clickOnOwnThisStockAlredy method");

		clickOnElement(btnOwnthisStockAlready);

		logger.info("Ending clickOnOwnThisStockAlredy method");
	}

	public void clickOnInvestPeriod() {
		logger.info("Starting clickOnInvestPeriod method");

		clickOnElement(btnInvestPeriod);

		logger.info("Ending clickOnInvestPeriod method");
	}

	public void enterAdditionalInformation(String Inform) {
		logger.info("Starting enterAdditionalInformation method");

		clickOnElement(textAdditionalInfo);
		sendKeys(textAdditionalInfo, Inform);

		logger.info("Ending enterAdditionalInformation method");
	}

	public void clickOnSubmit() {
		logger.info("Starting clickOnSubmit method");

		clickOnElement(btnSubmit);
		clickOnElement(btnSubmit);

		logger.info("Ending clickOnSubmit method");
	}

	public String screenAfterSubmit() {
		logger.info("Starting of screenAfterSubmit method");

		logger.info("Ending of screenAfterSubmit method");
		try {
			getText(txtAfterSubmit);
		} catch (StaleElementReferenceException e) {

		}
		return getText(txtAfterSubmit);
	
		
	}
	public void screenResult() {
		logger.info("Starting of screenResult method");
		clickOnElement(screenResult);
		logger.info("Ending of screenResult method");

		
	}
}
