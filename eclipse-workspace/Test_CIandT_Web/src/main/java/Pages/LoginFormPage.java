package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{


	public LoginFormPage(WebDriver browser) {
		super(browser);
	
	}

	public LoginFormPage typeLogin(String login) {
		browser.findElement(By.id("email")).sendKeys(login);
		
		return this;
		
	}
	
	public LoginFormPage typePassword(String password) {
		browser.findElement(By.id("passwd")).sendKeys(password);
		
		return this;
	}
	
	public secretPage clickLogin(){
		browser.findElement(By.id("SubmitLogin")).click();
		
		return new secretPage(browser);
		
	}
}

