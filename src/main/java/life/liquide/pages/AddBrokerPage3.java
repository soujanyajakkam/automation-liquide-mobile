package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class AddBrokerPage3 extends BaseAutomationPage {

	public AddBrokerPage3(AppiumDriver driver) {
		super(driver);
	}




	private static final Logger logger = Logger.getLogger(AddBrokerPage2.class.getName());

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[2]//android.widget.ImageView")
	private WebElement imgcardAddBroker;
	

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private WebElement downArrowPortfolio;
	
	public void addBroker() {
		logger.info("Starting addBroker method");

		clickOnElement(imgcardAddBroker);

		logger.info("Ending addBroker method");
	}

	public void connectBroker() throws InterruptedException {
		logger.info("Starting connectBroker method");

		Thread.sleep(10000);
		this.tapByCoordinates(164, 1057);

		logger.info("Ending connectBroker method");
	}

	public void clickOnPortfolioHealthCard() {
		logger.info("Starting clickOnPortfolioHealthCard method");
		
		clickOnElement(downArrowPortfolio);
		clickOnElement(downArrowPortfolio);
		logger.info("Ending clickOnPortfolioHealthCard method");
	}
}
