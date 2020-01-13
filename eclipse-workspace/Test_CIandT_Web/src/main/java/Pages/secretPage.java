package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secretPage extends BasePage{
	
	public secretPage(WebDriver browser) {
		super(browser);
	}
	
	public MePage readme() {
		browser.findElement(By.className("account")).click();
		
		return new MePage(browser);
	}

}
