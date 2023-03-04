package life.liquide.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class TradePastReturnsPage extends BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(TradePastReturnsPage.class.getName());

	@FindBy(xpath = "//android.view.View[2]//android.view.View")
	private WebElement cardTrade;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Past Returns']")
	private WebElement sectionPastReturns;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement icnFilters;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Filter']")
	private WebElement txtFilters;

	@FindBy(xpath = "//android.widget.TextView[@text = 'All trades']")
	private WebElement filterAllTrades;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Apply filter']")
	private WebElement btnApplyFilter;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Status']")
	private WebElement labelStatus;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Target Hit']")
	private WebElement filterTargetHit;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Stoploss Hit']")
	private WebElement filterStoplossHit;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Ongoing trades']")
	private WebElement filterOngoingtrades;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Cost-to-cost']")
	private WebElement filterCosttoCost;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Trade type']")
	private WebElement labelTradeType;
	
	@FindBy(xpath = "//android.view.ViewGroup[7]/android.widget.TextView")
	private WebElement allTrades;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Short term (1-3 months)']")
	private WebElement filterShortTerm;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Medium term (3-12 months)']")
	private WebElement filterMediumTerm;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Long term (>12 months)']")
	private WebElement filterLongTerm;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Period']")
	private WebElement labelPeriod;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Last month']")
	private WebElement filterLastmonth;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Last 3 months']")
	private WebElement filterLast3months;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Last 6 months']")
	private WebElement filterLast6months;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Last year']")
	private WebElement filterLastyear;
	
	@FindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View")
	private WebElement icnClear;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Cancel']")
	private WebElement btnCancel;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'My trades']")
	private WebElement sectionMyTrades;
	
	public TradePastReturnsPage(AppiumDriver driver) {
		super(driver);
	}

	public void clickonTradeCard() {
		logger.info("Starting clickonTradeCard method");

		clickOnElement(cardTrade);

		logger.info("Ending clickonTradeCard method");
	}

	public void clickonPastReturnsSection() {
		logger.info("Starting clickonPastReturnsSection method");

		clickOnElement(sectionPastReturns);

		logger.info("Ending clickonPastReturnsSection method");
	}

	public void clickOnFilterIcon() {
		logger.info("Starting clickOnFilterIcon method");

		clickOnElement(icnFilters);

		logger.info("Ending clickOnFilterIcon method");
	}

	public String textFilters() {
		logger.info("Starting of textFilters method");

		logger.info("Ending of textBuyStock method");

		return getText(txtFilters);
	}

	public void clickOnStatus() {
		logger.info("Starting clickOnStatus method");

		clickOnElement(labelStatus);

		logger.info("Ending clickOnStatus method");
	}

	public void selectFilterStatusAllTrades() {
		logger.info("Starting selectFilterStatusAllTrades method");

		clickOnElement(filterAllTrades);

		logger.info("Ending selectFilterStatusAllTrades method");
	}

	public void clickonApplyFilterButton() {
		logger.info("Starting clickonApplyFilterButton method");

		clickOnElement(btnApplyFilter);

		logger.info("Ending clickonApplyFilterButton method");
	}

	public void selectFilterStatusTargetHit() {
		logger.info("Starting selectFilterStatusTargetHit method");

		clickOnElement(filterTargetHit);

		logger.info("Ending selectFilterStatusTargetHit method");
	}

	public void selectFilterStatusStoplossHit() {
		logger.info("Starting selectFilterStatusStoplossHit method");

		clickOnElement(filterStoplossHit);

		logger.info("Ending selectFilterStatusStoplossHit method");
	}

	public void selectFilterStatusOngoingtrades() {
		logger.info("Starting selectFilterStatusOngoingtrades method");

		clickOnElement(filterOngoingtrades);

		logger.info("Ending selectFilterStatusOngoingtrades method");
	}

	public void selectFilterStatusCosttoCost() {
		logger.info("Starting selectFilterStatusCosttoCost method");

		clickOnElement(filterCosttoCost);

		logger.info("Ending selectFilterStatusCosttoCost method");
	}
	
	public void clickOnTradeType() {
		logger.info("Starting clickOnTradeType method");

		clickOnElement(labelTradeType);

		logger.info("Ending clickOnTradeType method");
	}
	public void clickOnTradeTypeAllTrade() {
		logger.info("Starting clickOnTradeTypeAllTrade method");

		clickOnElement(allTrades);
		
		logger.info("Ending clickOnTradeType method");
	}	
	public void selectFilterTradeTypeAllTrades() {
		logger.info("Starting selectFilterTradeTypeAllTrades method");

		clickOnElement(filterAllTrades);

		logger.info("Ending selectFilterTradeTypeAllTrades method");
	}
	public void selectFilterTradeTypeShortTerm() {
		logger.info("Starting selectFilterTradeTypeShortTerm method");

		clickOnElement(filterShortTerm);

		logger.info("Ending selectFilterTradeTypeShortTerm method");
	}
	public void selectFilterTradeTypeMediumTerm() {
		logger.info("Starting selectFilterTradeTypeMediumTerm method");

		clickOnElement(filterMediumTerm);

		logger.info("Ending selectFilterTradeTypeMediumTerm method");
	}
	public void selectFilterTradeTypeLongTerm() {
		logger.info("Starting selectFilterTradeTypeLongTerm method");

		clickOnElement(filterLongTerm);

		logger.info("Ending selectFilterTradeTypeLongTerm method");
	}
	public void clickOnPeriod() {
		logger.info("Starting clickOnPeriod method");

		clickOnElement(labelPeriod);

		logger.info("Ending clickOnPeriod method");
	}
	public void selectFilterPeriodLastmonth() {
		logger.info("Starting selectFilterPeriodLastmonth method");

		clickOnElement(filterLastmonth);

		logger.info("Ending selectFilterPeriodLastmonth method");
	}
	public void selectFilterPeriodLast3month() {
		logger.info("Starting selectFilterPeriodLast3month method");

		clickOnElement(filterLast3months);

		logger.info("Ending selectFilterPeriodLast3month method");
	}
	public void selectFilterPeriodLast6month() {
		logger.info("Starting selectFilterPeriodLast6month method");

		clickOnElement(filterLast6months);

		logger.info("Ending selectFilterPeriodLast6month method");
	}
	public void selectFilterPeriodLastyear() {
		logger.info("Starting selectFilterPeriodLastyear method");

		clickOnElement(filterLastyear);

		logger.info("Ending selectFilterPeriodLastyear method");
	}
	public void clickOnClear() {
		logger.info("Starting clickOnClear method");

		clickOnElement(icnClear);
		
		logger.info("Ending clickOnClear method");
		}
	public void clickOnCancelButton() {
		logger.info("Starting clickOnCancelButton method");

		clickOnElement(btnCancel);
		
		logger.info("Ending clickOnCancelButton method");
		}
	
	public void clickOnMyTradesSection() {
		logger.info("Starting clickOnMyTradesSection method");

		clickOnElement(sectionMyTrades);
		
		logger.info("Ending clickOnMyTradesSection method");
}
}