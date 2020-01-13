package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatiane\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://automationpractice.com/index.php");
		browser.manage().window().maximize();
		
		return browser;
	}
}
