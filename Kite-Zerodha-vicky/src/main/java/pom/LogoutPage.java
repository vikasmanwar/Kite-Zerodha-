package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindBy (xpath="//span[@class='user-id']")
	private WebElement accountUserButton;
	
	@FindBy (xpath="//a[@target='_self']")
	private WebElement logoutButton;
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogoutButton() {
		accountUserButton.click();
		logoutButton.click();
	}
}
