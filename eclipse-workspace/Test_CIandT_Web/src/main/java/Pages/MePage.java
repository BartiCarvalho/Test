package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MePage extends BasePage{

	public MePage(WebDriver browser) {
		super(browser);
	}
	
	public MePage me() {	WebElement user = browser.findElement(By.className("account"));
	String nameUser = user.getText();
	assertEquals("Bartira Carvalho", nameUser);
	
	return this;
}
}
