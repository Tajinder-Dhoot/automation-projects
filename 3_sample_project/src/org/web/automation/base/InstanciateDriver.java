package org.web.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class InstanciateDriver {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void startBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Registartion ']")).click();
		
	}

}
