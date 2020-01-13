package TestWeb;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import Help.Web;
import Pages.LoginPage;

public class UserLoginTest {
	private WebDriver browser;
	
	@Rule
	public TestName test = new TestName();

	@Before
	public void setUp() {
		browser = Web.createChrome();
		
	}
	
	@Test
	
	public void existingUser() {
		new LoginPage(browser)
		.clickLoginIn()
		.typeLogin("barti.carvalho@gmail.com")
		.typePassword("84236210Lilica!")
		.clickLogin()
		.readme()
		.me();
	}
		
	@After
	public void tearDown() {
		  browser.quit();
		}

	
}
