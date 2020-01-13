package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver browser) {
		super(browser);
	}

	public LoginFormPage clickLoginIn() {
		browser.findElement(By.className("login")).click();
		
		return new LoginFormPage(browser);
	}
}
