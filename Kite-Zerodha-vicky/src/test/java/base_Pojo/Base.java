package base_Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	// Launch Chrome Driver
public static WebDriver launchChromeDrver() {
	System.setProperty("webdriver.chrome.driver", "V:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
}

	// Launch gecko or Firefox Driver
public static WebDriver launchFirefoxDriver() {
	System.setProperty("webdriver.gecko.driver", "V:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
}

	// Launch Opera Driver 
public static WebDriver launchOperaDriver() {
	System.setProperty("webdriver.opera.driver", "V:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new OperaDriver();
	return driver;
}

	// Launch Edge Driver
public static WebDriver launchEdgeDriver() {
	System.setProperty("webdriver.edge.driver", "V:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new EdgeDriver();
	return driver;
	
}

}
