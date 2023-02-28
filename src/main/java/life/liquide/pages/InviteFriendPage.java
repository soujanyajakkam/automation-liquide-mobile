package life.liquide.pages;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class InviteFriendPage extends BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(InviteFriendPage.class.getName());


	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[2]//android.widget.ImageView")
	private WebElement cardInviteNow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Invite']")
	private WebElement txtInvite;

	@FindBy(xpath = "//android.view.ViewGroup[3]//android.view.View")
	private WebElement btnViewAllRewards;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Scratch Cards']")
	private WebElement txtScratchCard;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement backArrow;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Copy code']")
	private WebElement btnCopycode;

	@FindBy(xpath = "//android.view.ViewGroup[6]//android.view.View")
	private WebElement btnInviteNow;

	@FindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView")
	private WebElement drag;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Gmail']")
	private WebElement crdGmail;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.EditText")
	private WebElement txtEmaild;

	@FindBy(xpath = "//android.widget.Button[@content-desc = 'Send']")
	private WebElement btnSend;

	public InviteFriendPage(AppiumDriver driver) {
		super(driver);
	}

	public void clickOnInviteNow() {
		logger.info("Starting clickOnInviteNowButton method");
	 
		
		
			
			  driver.findElement(AppiumBy.
			  androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
			  ".scrollIntoView(new UiSelector().text(\"News that moves\"))"));
			  
		
		clickOnElement(cardInviteNow);
		clickOnElement(cardInviteNow);

		logger.info("Ending clickOnInviteNowButton method");
	}

	public String textInvite() {
		logger.info("Starting of textInvite method");

		logger.info("Ending of textInvite method");
		try {
			getText(txtInvite);
		} catch (StaleElementReferenceException e) {

		}
		return getText(txtInvite);
	}

	public void clickViewAllRewardsButton() {
		logger.info("Starting clickViewAllRewardsButton method");

		clickOnElement(btnViewAllRewards);

		logger.info("Ending clickViewAllRewardsButton method");
	}

	public String textScratchCard() {
		logger.info("Starting of textScratchCard method");

		logger.info("Ending of textScratchCard method");

		return getText(txtScratchCard);
	}

	public void clickOnScratchCardBackArrow() {
		logger.info("Starting clickOnScratchCardBackArrow method");

		clickOnElement(backArrow);

		logger.info("Ending clickOnScratchCardBackArrow method");
	}

	public void clickOnCopyCodeButton() {
		logger.info("Starting clickOnCopyCodeButton method");

		clickOnElement(btnCopycode);

		logger.info("Ending clickOnCopyCodeButton method");
	}

	public void clickOnInviteNowButton() {
		logger.info("Starting clickOnInviteNowButton method");

		clickOnElement(btnInviteNow);

		logger.info("Ending clickOnInviteNowButton method");
	}
	
	public void swipeup() {
		logger.info("Starting swipeup method");
		TouchActions action = new TouchActions(driver);
		action.scroll(drag, 109, 997);
		
		action.perform();
		//clickOnElement(drag);
		//swipeUpAction(102,99,997,737);
		//slider(drag,102);
		logger.info("Ending swipeup method");
	}

	public void enterEmailId(String email) throws InterruptedException {
		logger.info("Starting enterEmailId method");
		Thread.sleep(3000);
		try {
			clickOnElement(crdGmail);
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		sendKeys(txtEmaild, email);

		logger.info("Ending enterEmailId method");
	}

	public void clickOnSendButton() {
		logger.info("Starting clickOnSendButton method");

		clickOnElement(btnSend);
		
		logger.info("Ending clickOnSendButton method");
	}

}
