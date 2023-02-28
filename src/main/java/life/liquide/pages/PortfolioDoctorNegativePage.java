package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class PortfolioDoctorNegativePage extends BaseAutomationPage {
	
	private static final Logger logger = Logger.getLogger(PortfolioDoctorNegativePage.class.getName());
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
	private WebElement txtOurOfferings;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Portfolio review']")
	private WebElement imgcardPortfolio;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Your 1-on-1 with  SEBI registered investment advisor']")
	private WebElement txtSEBIAdvisor;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Goal based portfolio roadmap']")
	private WebElement txtGoalBasesPortfolioroadmap;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement cardLiquideOne;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement btnBackArrow;
	
	@FindBy(xpath = "//android.view.ViewGroup[4]//android.widget.ImageView")
	private WebElement btnAddportfolio;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
	private WebElement btnUploadPortfolio;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Upload your portfolio']")
	private WebElement txtUploadPortfolio;
	
	@FindBy(xpath = "//android.widget.TextView[3]")
	private WebElement iconUploadPortfolio;
	
	@FindBy(xpath = "//android.widget.CompoundButton[@text = 'Images']")
	private WebElement btnImages;

	@FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]//android.widget.ImageView")
	private WebElement selectImage;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'SELECT']")
	private WebElement btnSelect;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Incorrect file format']")
	private WebElement txtIncorrectFileFormat;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Upload portfolio (CSV/XLSX/PDF)']")
	private WebElement UploadportfolioCSVXLSXPDF;
	
	@FindBy(xpath = "//android.widget.CompoundButton[@text = 'Documents']")
	private WebElement btndocuments;
	
	@FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]//android.widget.ImageView[1]")
	private WebElement selectGreate1mbFile;
	
	@FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement closeIcon;
	
	@FindBy(xpath = "//android.widget.LinearLayout[2]//android.widget.ImageView[2]")
	private WebElement multiSelect;
	
	
	public PortfolioDoctorNegativePage(AppiumDriver driver) {
		super(driver);
	}
	public void clickOnPortfolioReviewimgcard()  {
		logger.info("Starting clickOnPortfolioReviewimgcard method");

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Stocks in buzz\"))"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		this.tapByCoordinates(356,525);

		logger.info("Ending clickOnPortfolioReviewimgcard method");
	}

	public String textSEBIExpertAdvisor() {
		logger.info("Starting of textSEBIExpertAdvisor method");

		logger.info("Ending of textSEBIExpertAdvisor method");

		return getText(txtSEBIAdvisor);
	}
	public void clickOnLiquideOneimgCrd()  {
		logger.info("Starting clickOnLiquideOneimgCrd method");

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Goal based portfolio roadmap\"))"));
		clickOnElement(cardLiquideOne);
		clickOnElement(btnBackArrow);
		
		logger.info("Ending clickOnLiquideOneimgCrd method");
	}
	public void clickOnUploadPortfolio()  {
		logger.info("Starting clickOnUploadPortfolio method");
		clickOnElement(btnAddportfolio);
	
		clickOnElement(btnUploadPortfolio);
	
		logger.info("Ending clickOnUploadPortfolio method");
	}
	
	
	public void clickOnUpload()  {
		logger.info("Starting clickOnUpload method");

		clickOnElement(iconUploadPortfolio);
	
		logger.info("Ending clickOnUpload method");
	}
	public void uploadimages()  {
		logger.info("Starting uploadimages method");

		clickOnElement(btnImages);
		clickOnElement(selectImage);
		clickOnElement(btnSelect);
		clickOnElement(txtIncorrectFileFormat);
		logger.info("Ending uploadimages method");

}
	public void uploadDocuments()  {
		logger.info("Starting uploadDocuments method");

		clickOnElement(UploadportfolioCSVXLSXPDF);
		clickOnElement(btndocuments);
		try {
			clickOnElement(selectGreate1mbFile);
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
			clickOnElement(btnSelect);
		logger.info("Ending uploadDocuments method");

}	
	public void uploadMultipleDocumentsAtaTime()  {
		logger.info("Starting uploadMultipleDocumentsAtaTime method");
		clickOnElement(closeIcon);
		clickOnElement(btnUploadPortfolio);
		clickOnElement(iconUploadPortfolio);
		clickOnElement(btndocuments);
		try {
			clickOnElement(selectGreate1mbFile);
			clickOnElement(multiSelect);
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
			clickOnElement(btnSelect);
		logger.info("Ending uploadMultipleDocumentsAtaTime method");

}	
}