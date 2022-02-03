package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement user;
	
	@FindBy  (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//input[@type='password']")
	private  WebElement pin;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendUser() {
		user.sendKeys("DV1510");
	}
	
	public void sendPassword() {
		password.sendKeys("Vijay@123");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void sendPin() {
		pin.sendKeys("959594");
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
}
