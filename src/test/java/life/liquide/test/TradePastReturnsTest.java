package life.liquide.test;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import life.liquide.mobileconfig.MobileConfigurationVO;
import life.liquide.pages.TradePastReturnsPage;

	@Epic("Past Returns and Applying Filters")
	@Feature("Past Returns and Applying Filters")
	public class TradePastReturnsTest extends BaseMobileAutomationTest{
		
		private TradePastReturnsPage returns = null;
		private final Logger logger = Logger.getLogger(BuySellTest.class.getName());

		@BeforeClass
		@Parameters({ "deviceName", "udid", "platformName", "platformVersion", "appPackage", "appActivity" })
		public void initClass(String deviceName, String udid, String platformName, String platformVersion,
				String appPackage, String appActivity) throws Exception {
			logger.info("Starting of initClass method in LandingPage");

			MobileConfigurationVO mobileConfigurationVO = new MobileConfigurationVO(deviceName, udid, platformName,
					platformVersion, appPackage, appActivity);
			this.initMobileDriver(mobileConfigurationVO);
			this.returns = new TradePastReturnsPage(this.getMobileDriver(udid));

			logger.info("Ending of initClass method in LandingPage");
		}

		@Test(priority = 1, description = "Verifying PastReturns and Filters flow")

		@Parameters({ "devicename" })

		@Description("Test Description: VVerifying PastReturns and Filters flow")

		@Story("Verifying Filters in PastReturns ")
		public void pastReturnsFilters() throws InterruptedException {
			logger.info("Starting of pastReturnsFilters method");
			returns.clickonTradeCard();
			returns.clickonPastReturnsSection();
			returns.clickOnFilterIcon();
			Assert.assertEquals(returns.textFilters(), expectedAssertionsProp.getProperty("filters.txt"));
			System.out.println("Filters  text is expected – Assert passed");
			returns.clickOnStatus();
			returns.selectFilterStatusAllTrades();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusTargetHit();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusStoplossHit();
			returns.clickonApplyFilterButton();
		    
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusCosttoCost();
			returns.clickonApplyFilterButton();
			
			Thread.sleep(2000);
			returns.clickOnFilterIcon();
			returns.clickOnTradeType();
			returns.clickOnTradeTypeAllTrade();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeShortTerm();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeMediumTerm();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeLongTerm();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastmonth();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLast3month();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLast6month();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastyear();
			returns.clickonApplyFilterButton();
			
			logger.info("Ending of pastReturnsFilters method");
		}
		@Test(priority = 2, description = "Verify Combintaion of Filters Flow")

		@Parameters({ "devicename" })

		@Description("Test Description: Verify Combintaion of Filters Flow")

		@Story("Verify Combintaion of Filters Flow ")
		public void filterCombination() throws InterruptedException {
			logger.info("Starting of filterCombination method");
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusTargetHit();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeShortTerm();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastyear();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusStoplossHit();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeShortTerm();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastyear();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeShortTerm();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastyear();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeShortTerm();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLast6month();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeLongTerm();
			returns.clickOnPeriod();
			Thread.sleep(2000);
			returns.selectFilterPeriodLast3month();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeMediumTerm();
			returns.clickOnPeriod();
			Thread.sleep(2000);
			returns.selectFilterPeriodLast3month();
			returns.clickonApplyFilterButton();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnTradeType();
			returns.selectFilterTradeTypeMediumTerm();
			returns.clickOnPeriod();
			returns.selectFilterPeriodLastmonth();
			returns.clickOnClear();
			
			returns.clickOnFilterIcon();
			returns.clickOnStatus();
			returns.selectFilterStatusOngoingtrades();
			returns.clickOnCancelButton();
			
			returns.clickOnMyTradesSection();
			logger.info("Ending of filterCombination method");
		}
		@AfterClass
		@Parameters({ "deviceName", "udid" })
		public void quitDriver(String deviceName, String udid) {
			logger.info("Starting of quitDriver method");

			this.quitMobileDriver(udid);

			logger.info("Ending of quitDriver method");
		}
	}


