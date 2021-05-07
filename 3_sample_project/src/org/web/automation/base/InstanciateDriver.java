package org.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.pages.MyAccountPage;
import org.web.automation.pages.HomePageNavBar;
import org.web.automation.pages.LoginCard;
import org.web.automation.pages.Registration;
import org.web.automation.pages.ShoppingCart;
import org.web.automation.utility.PropertyReader;

public class InstanciateDriver {
	
	public WebDriver driver = null;
	public Registration register = null;
	public MyAccountPage myAccount = null;
	public LoginCard loginCard = null;
	public HomePageNavBar homeNav = null;
	Shopping cart = null;
	
	@BeforeMethod
	public void startBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(PropertyReader.readConfigProperty("application_url"));
		
		register = new Registration(driver);
		loginCard = new LoginCard(driver);
		myAccount = new MyAccountPage(driver);
		homeNav = new HomePageNavBar(driver);
		cart = new ShoppingCart(driver);

	}
	
	/*@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}*/

}
