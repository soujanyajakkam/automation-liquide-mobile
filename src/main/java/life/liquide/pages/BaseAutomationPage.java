package life.liquide.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.appium.java_client.touch.offset.PointOption;

public class BaseAutomationPage {
	protected AppiumDriver driver = null;
    public static String OTP;
    public static String OTP1;
	protected VisualComparisionPage visualComparision = null;
	protected static final Logger logger = Logger.getLogger(BaseAutomationPage.class.getName());
	
	public static String TEST_FILE_PATH = null;
	public BaseAutomationPage(AppiumDriver driver) {
		this.driver = driver;
		if (TEST_FILE_PATH == null) {
			TEST_FILE_PATH = getTestFilePath();
			logger.debug("In Constructor " + TEST_FILE_PATH);
		}
		PageFactory.initElements(driver, this);
		visualComparision = new VisualComparisionPage(driver);
	}
	public String getTestFilePath() {
		String path = "src/test/resources";
		File file = new File(path);
		return file.getAbsolutePath();
	}
	protected void selectDropdown(String id, String value) {
		logger.info("Starting of selectDropdown method");
		Select conditions = new Select(driver.findElement(By.id(id)));
		conditions.selectByValue(value);
		logger.info("Ending of selectDropdown method");
	}

	public void clickOnWebElement(WebElement webelement) {
		logger.info("Starting of clickOnWebElement method");
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", webelement);
		logger.info("Ending of clickOnWebElement method");
	}

	public void clickOnWebElement(List<WebElement> webelement) {
		logger.info("Starting of clickOnWebElement method");
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", webelement);
		logger.info("Ending of clickOnWebElement method");
	}

	public void scrollDown(int scroll) {
		logger.info("Starting of scrollDown method");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + scroll + ")");
		logger.info("Ending of scrollDown method");
	}
	public void refresh() {
		logger.info("Starting of refresh method");
		driver.navigate().refresh();
		logger.info("Ending of refresh method");
	}
	public void ClearBrowserCache() throws InterruptedException
	{
	driver.manage().deleteAllCookies(); //delete all cookies
	Thread.sleep(7000); //wait 7 seconds to clear cookies.
	}
	public void impicitWait() {
		logger.info("Starting of impicitWait method");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("Ending of impicitWait method");
	}
	public void explicitWait(List<WebElement> categoryOptions) {
		logger.info("Starting of explicitWait method");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(categoryOptions));
		logger.info("Ending of explicitWait method");
	}
	public void explicitWait(WebElement categoryOptions) {
		logger.info("Starting of explicitWait method");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.visibilityOf(categoryOptions));
		logger.info("Ending of explicitWait method");
	}
	public void scrollIntoView(WebElement element) {
		logger.info("Starting of scrollIntoView method");
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].scrollIntoView(true);", element);
		logger.info("Ending of scrollIntoView method");
	}
	public void pickFromWebElemetList(List<WebElement> webElements, String containsText) {
		logger.info("Staritng of pickFromWebElemetList method");
		for (WebElement webElement : webElements) {
			if (webElement.getText().contains(containsText)) {
				this.clickOnWebElement(webElement);
				break;
			}
		}
		logger.info("Ending of pickFromWebElemetList method");
	}
	
	protected void androidScrollUsingText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
	}

	public void pickFromWebElemetList(List<WebElement> webElements, List<WebElement> textWebElements,
			String containsText) {
		logger.info("Staritng of pickFromWebElemetList method");
		WebElement webElement = null;
		WebElement textWebElement = null;
		Object[] webElementsArray = webElements.toArray();
		Object[] xPathArray = textWebElements.toArray();
		for (int i = 0; i < webElements.size(); i++) {
			webElement = (WebElement) webElementsArray[i];
			textWebElement = (WebElement) xPathArray[i];
			if (textWebElement.getText().contains(containsText)) {
				this.clickOnWebElement(webElement);
				break;
			}
		}
		logger.info("Ending of pickFromWebElemetList method");
	}
	public void uploadFile(String filepath) {
		Robot robot = null;
		try {
			robot = new Robot();
			StringSelection stringSelection = new StringSelection(filepath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(500);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e2) {
			e2.printStackTrace();
		}
	}
	public void mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
		public void verticalScroll(WebElement ele01) throws InterruptedException {
		logger.info("Starting of verticalScroll Method");
		int centerX = ele01.getRect().x + (ele01.getSize().width / 2);
		double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);
		double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(
				finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int) startY));
		swipe.addAction(finger.createPointerDown(0));
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int) endY));
		swipe.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(swipe));
		logger.info("Ending of verticalScroll Method");
	}

	public void horizontalScroll(WebElement ele01, double startX,double endX,int StartAndEndY) {
		logger.info("Starting of horizontalScroll Method");
        StartAndEndY = ele01.getRect().y + (ele01.getSize().height / 2);
		startX = ele01.getRect().x + (ele01.getSize().width * 0.9);
		endX = ele01.getRect().x + (ele01.getSize().width * 0.1);
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(
				finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int) startX, StartAndEndY));
		swipe.addAction(finger.createPointerDown(0));
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), (int) endX,StartAndEndY));
		swipe.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(swipe));
		logger.info("Ending of horizontalScroll Method");
	}

	public WebElement getElementIfVisible(WebDriver driver, WebElement element) {
		try {
			element = (new WebDriverWait(driver, Duration.ofSeconds(120))
					.until(ExpectedConditions.visibilityOf(element)));

		} catch (StaleElementReferenceException se) {
			try {
				element = new WebDriverWait(driver, Duration.ofSeconds(20))
						.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
			} catch (Exception e) {
				logger.error("Element unavailable\n" + se.getMessage());
			}
		} catch (Exception e) {
			logger.error("Element unavailable\n" + e.getMessage());
		}
		return element;
	}

	public WebElement getElementIfClickable(WebDriver driver, WebElement element) {
		try {
			element = (new WebDriverWait(driver, Duration.ofSeconds(20))
					.until(ExpectedConditions.elementToBeClickable(element)));
		} catch (StaleElementReferenceException se) {
			try {
				element = new WebDriverWait(driver, Duration.ofSeconds(20))
						.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
			} catch (Exception e) {
				logger.error("Element unavailable to click\n" + se.getMessage());
			}
		} catch (Exception e) {
			logger.error("Element unavailable to click\n" + e.getMessage());
		}
		return element;
	}

	public void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void clickOutside() {
		logger.info("Starting of clickOutside method");
		Actions action = new Actions(driver);
		action.moveByOffset(0, 0).click().build().perform();
		logger.info("Ending of clickOutside method");
	}
	protected void getLongPressAction(By longPressElement) {
		WebElement holdElement = driver.findElement(longPressElement);
		TouchActions action = new TouchActions(driver);
		action.longPress(holdElement);
		action.perform();
	}
	
	public void touchAction() {
		logger.info("Starting of touchAction method");
		Dimension size = driver.manage().window().getSize();
		int startX = (int) (size.width * 0.9);
		int endX = (int) (size.width * 0.2);
		int startY = size.height / 4;
		int endY = startY;
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(
				finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), startX, (int) startY));
		swipe.addAction(finger.createPointerDown(0));
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), startX, (int) endY));
		swipe.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(swipe));
		logger.info("Ending of touchAction method");
	}
	public void swipeAction(int startX,int endX,int startY,int endY) {
		logger.info("Starting of swipeAction method");

		Dimension size = driver.manage().window().getSize();
         startX = (int) (size.width * 0.9);

         endX = startX;

		startY = (int) (size.height * 0.2);

		endY = (int) (size.height * 0.9);

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		// Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger, 1);
		// Move finger into starting position
		swipe.addAction(
				finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), startX, (int) startY));
		// Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		// Finger moves to end position
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), startX, (int) endY));
		// Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		// Perform the actions
		driver.perform(Arrays.asList(swipe));

		logger.info("Ending of swipeAction method");
	}

	public void swipeUpAction(int startX,int endX,int startY,int endY) {
		logger.info("Starting of swipeUpAction method");

		Dimension size = driver.manage().window().getSize();

		 startX = (int) (size.width * 0.9);

		endX = (int) (size.height * 0.9);

		startY = (int) (size.height * 0.2);

		 endY = startY;
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		// Creating Sequence object to add actions
		Sequence swipe = new Sequence(finger, 1);
		// Move finger into starting position
		swipe.addAction(
				finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), startX, (int) startY));
		// Finger comes down into contact with screen
		swipe.addAction(finger.createPointerDown(0));
		// Finger moves to end position
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), startX, (int) endY));
		// Get up Finger from Srceen
		swipe.addAction(finger.createPointerUp(0));

		// Perform the actions
		driver.perform(Arrays.asList(swipe));

		logger.info("Ending of swipeUpAction method");
	}
	
	public void tapByCoordinates(int x, int y) {
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.tap(PointOption.point(x, y)).perform();
	}
	public void switchContextWebView() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> contextNames = ((SupportsContextSwitching) driver).getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
		}
		((SupportsContextSwitching) driver).context("WEBVIEW_chrome");
	}
	public void switchContextMobileView() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> contextNames = ((SupportsContextSwitching) driver).getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
		}
		((SupportsContextSwitching) driver).context("NATIVE_APP");
	}

public String getOTPFromMessages() throws InterruptedException {
		String currentAct = ((AndroidDriver) driver).getCurrentPackage();
	    System.out.println(currentAct);
		Thread.sleep(10000);
		((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.messaging",
				"com.google.android.apps.messaging.home.HomeActivity"));
		switchContextMobileView();
		driver.findElement(
				By.xpath("//android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[1]"))
				.click();
		WebElement element = driver.findElement(By.id("com.google.android.apps.messaging:id/suggestion_button_label"));
		OTP = element.getText().replaceAll("[^0-9]", "");
		logger.info("######################" + OTP);
		
		  char[] ch = OTP.toCharArray();
		  
		  for (int i = 0; i < OTP.length(); i++) {
		  
		  if (OTP.charAt(i) >= '0' && OTP.charAt(i) <= '9') {
		  
		 System.out.println("index position from "+ i +" : " +OTP.charAt(i));
		 } }
		  

	/*
	 * System.out.println("index position from p1"+" " + OTP.charAt(0));
	 * System.out.println("index position from p2"+" " + OTP.charAt(1));
	 * System.out.println("index position from p3" +" " + OTP.charAt(2));
	 * System.out.println("index position from p4" +" " + OTP.charAt(3));
	 * System.out.println("index position from p5" +" " + OTP.charAt(4));
	 * System.out.println("index position from p6" +" " + OTP.charAt(5));
	 */
return OTP;  
	  
	}

public String getOTPFromMessages1() throws InterruptedException {
	String currentAct = ((AndroidDriver) driver).getCurrentPackage();
    System.out.println(currentAct);
	Thread.sleep(10000);
	((StartsActivity) driver).startActivity(new Activity("com.google.android.apps.messaging",
			"com.google.android.apps.messaging.home.HomeActivity"));
	driver.findElement(
			By.xpath("//android.view.ViewGroup[1]//android.widget.TextView[2]"))
			.click();
	WebElement element = driver.findElement(By.id("com.google.android.apps.messaging:id/suggestion_button_label"));
	//element.click();
	OTP1 = element.getText().replaceAll("[^0-9]", "");
	logger.info("######################" + OTP1);
	
	  char[] ch = OTP1.toCharArray();
	  
	  for (int i = 0; i < OTP1.length(); i++) {
	  
	  if (OTP1.charAt(i) >= '0' && OTP1.charAt(i) <= '9') {
	  
	 System.out.println("index position from "+ i +" : " +OTP1.charAt(i));
	 } }
	  
return OTP1;  
  
}
	protected WebElement findElement(WebElement webelement, MOBILE_ACTIONS mobileActions) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			switch (mobileActions) {
			case CLICK:
				wait.until(ExpectedConditions.elementToBeClickable(webelement));
				break;
			case VISIBILE:
				wait.until(ExpectedConditions.visibilityOf(webelement));
				break;
			default:
				wait.until(ExpectedConditions.visibilityOf(webelement));
			}
		} catch (StaleElementReferenceException ex) {
			logger.info("Webelement exception{}" + webelement, ex);
		}
		return webelement;
	}
	public List<WebElement> findElements(List<WebElement> webelement, MOBILE_ACTIONS mobileActions) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class)
					.ignoring(ElementNotVisibleException.class);
			switch (mobileActions) {
			case CLICK:
				for (WebElement element : webelement) {
					wait.until(ExpectedConditions.elementToBeClickable(element));
				}
				break;
			case VISIBILE:
				wait.until(ExpectedConditions.visibilityOfAllElements(webelement));
				break;
			default:
				wait.until(ExpectedConditions.visibilityOfAllElements(webelement));
			}
		} catch (StaleElementReferenceException ex) {
			logger.info("Webelement exception{}" + webelement, ex);
		}
		return webelement;
	}

	protected void clickOnElement(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.CLICK).click();
	}
	protected String getText(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).getText();
	}
	protected boolean checkForPresence(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).isDisplayed();
	}
	protected void sendKeys(WebElement webelement, String keys) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE).sendKeys(keys);
	}
	public enum MOBILE_ACTIONS {
		CLICK, VISIBILE, TOAST, UP, DOWN
	}
	
	public void slider(WebElement webElement, int xCoordinate) {
		logger.info("Starting of slider method");

		Actions actions = new Actions(driver);
		actions.dragAndDropBy(webElement, xCoordinate, 0).perform();

		logger.info("Ending of slider method");
	}
}