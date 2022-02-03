package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

	@FindBy (xpath="//a[@aria-current='page']")
	private WebElement dashboard;
	
	@FindBy (xpath="//a[@class='orders-nav-item']")
	private WebElement orders;
	
	@FindBy (xpath="//a[@href='/holdings']")
	private WebElement holdings;
	
	@FindBy (xpath="//a[@href='/positions']")
	private WebElement positions;
	
	@FindBy (xpath="//a[@href='/funds']")
	private WebElement funds;
	
	@FindBy (xpath="//a[@href='/apps']")
	private WebElement apps;
	
	public Header(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOndashboardsTab() {
		dashboard.click();
	}
	
	public void clickOnOrdersTab() {
		orders.click();
	}
	
	public void clickOnHoldingsTab() {
		holdings.click();
	}
	
	public void clickOnPositionsTab() {
		positions.click();
	}
	
	public void clickOnFundsTab() {
		funds.click();
	}
	
	public void  clickOnAppsTab() {
		apps.click();
	}
}
