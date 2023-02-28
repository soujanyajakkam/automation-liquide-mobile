package life.liquide.test;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseMobileAutomationTest {
	private static final Logger logger = Logger.getLogger(BaseMobileAutomationTest.class.getName());
	protected static AndroidDriver driver = null;
	protected static Map<String, AndroidDriver> driversMap = new HashMap<String, AndroidDriver>();
	protected static Properties testDataProp = null;
	protected static Properties expectedAssertionsProp = null;

	public enum SCREEN_ID {
		LOGIN_SCREEN, REGISTER_SCREEN, MY_INVESTMENT_SCREEN, CONFIRM_PURCHASE_SCREEN, PAYMENT_SCREEN, MENU_BAR,
		VIEW_ORDER_SCREEN, CLIENT_ORDER_DETAILS;
	}

	@BeforeSuite
	public void initTestData() {
		if (testDataProp == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;
			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertions.properties");
				testDataProp = new Properties();
				testDataProp.load(testDataReader);
				expectedAssertionsProp = new Properties();
				expectedAssertionsProp.load(assertionsReader);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					testDataReader.close();
					assertionsReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected synchronized void initMobileDriver(life.liquide.mobileconfig.MobileConfigurationVO mobileConfigurationVO)
			throws MalformedURLException {
		logger.info("Starting of method initMobileDriver");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", mobileConfigurationVO.getDeviceName());
		cap.setCapability("udid", mobileConfigurationVO.getUdId());
		cap.setCapability("platformName", mobileConfigurationVO.getPlatformName());
		cap.setCapability("platformVersion", mobileConfigurationVO.getPlatformVersion());
		cap.setCapability("noReset", true);
		cap.setCapability("appPackage", mobileConfigurationVO.getAppPackage());
		cap.setCapability("appActivity", mobileConfigurationVO.getAppActivity());
		cap.setCapability("setWebContentsDebuggingEnabled", true);
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//driver = new AndroidDriver(new URL("http://192.168.217.78:4723/wd/hub"), cap);
		driversMap.put(mobileConfigurationVO.getUdId(), driver);
		logger.info("Ending of method initMobileDriver");
	}

	
	protected synchronized AndroidDriver getMobileDriver(String driverKey) throws Exception {
		logger.info("Starting of method getMobileDriver");
		driver = (AndroidDriver) driversMap.get(driverKey);
		// Use existing driver
		if (driver == null) {
			logger.error("Driver not initialized, Please call initDriver Method. Before calling getDriver ");
			throw new Exception("Drivier not initialized");
		}
		// Otherwise create new driver
		logger.info("Ending of method getMobileDriver");
		return driver;
	}

	protected synchronized void quitMobileDriver(String driverKey) {
		logger.info("Starting of method quitDriver in BaseAutomationTest ");
		AndroidDriver driver = null;
		driver = (AndroidDriver) driversMap.get(driverKey);
		try {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			driver = null;
		}
		logger.info("Ending of method quitDriver in BaseAutomationTest");
	}

	public void resetApp() {
		driver.resetInputState();
	}

	public WebDriver getChildWebDriver() {
		return driver;
	}

}

