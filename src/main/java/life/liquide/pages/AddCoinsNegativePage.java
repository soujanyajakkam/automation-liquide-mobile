package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddCoinsNegativePage extends BaseAutomationPage{
	private static final Logger logger = Logger.getLogger(AddCoinsNegativePage.class.getName());

	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]//android.widget.ImageView")
	private WebElement imgCardAddCoins;
	
	@FindBy(xpath="//android.view.ViewGroup[4]/android.view.ViewGroup//android.view.View")
	private WebElement btnAddCoins;
	
	@FindBy(xpath="//android.widget.TextView[@text = '50']")
	private WebElement imgcardCoinTopUp;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnPay;
	
	@FindBy(xpath = "//android.widget.EditText[@text = 'Enter email ID']")
	private WebElement txtEnterEmail;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Update email']")
	private WebElement btnUpdateEmail;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Please enter valid email address']")
	private WebElement txtPleaseentervadlidname;

	@FindBy(xpath = "//android.widget.Button[@text = 'OK']")
	private WebElement btnOk;

	@FindBy(xpath = "//android.widget.EditText")
	private WebElement textfiledEmail;

	public AddCoinsNegativePage(AppiumDriver driver) {
		super(driver);
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

	public void clickOnPayButton() {
		logger.info("Starting clickOnPayButton method");

		clickOnElement(btnPay);

		logger.info("Ending clickOnPayButton method");
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
	

	public String textEmail() {
		logger.info("Starting of textEmail method");

		logger.info("Ending of textEmail method");

		return getText(txtPleaseentervadlidname);
	}
	
	public void clickOnButtonOk() {
		logger.info("Starting clickOnButtonOk method");

		clickOnElement(btnOk);

		logger.info("Ending clickOnButtonOk method");
	}
	public void doubleClickOntextfiled() {
		logger.info("Starting doubleClickOntextfiled method");

		textfiledEmail.click();
		textfiledEmail.clear();

		logger.info("Ending doubleClickOntextfiled method");
	}
}
