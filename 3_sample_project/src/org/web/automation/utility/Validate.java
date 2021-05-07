package org.web.automation.utility;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validate {
	
	public void validateElementPresent(WebDriver driver, String locatorType, String locator) {
		
		if (locatorType.equalsIgnoreCase("xpath")) {
			System.out.println(locatorType);
			System.out.println(locator);
			assertEquals(driver.findElement(By.xpath(locator)).isDisplayed(), true);
		}
		else if (locatorType.equalsIgnoreCase("id")) {
			assertEquals(driver.findElement(By.id(locator)).isDisplayed(), true);
		}
		else if (locatorType.equalsIgnoreCase("className")) {
			assertEquals(driver.findElement(By.className(locator)).isDisplayed(), true);
		}
	}
	
public void validateElementNotPresent(WebDriver driver, String locatorType, String locator) {
		
		if (locatorType.equalsIgnoreCase("xpath")) {
			assertEquals(driver.findElement(By.xpath(locator)).isDisplayed(), false);
		}
		else if (locatorType.equalsIgnoreCase("id")) {
			assertEquals(driver.findElement(By.id(locator)).isDisplayed(), false);
		}
		else if (locatorType.equalsIgnoreCase("className")) {
			assertEquals(driver.findElement(By.className(locator)).isDisplayed(), false);
		}
	}

}
