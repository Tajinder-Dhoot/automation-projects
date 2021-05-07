package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class HomePage {

	WebDriver driver = null;
	PageActions action = null;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
		
	}
	
	public void clickCartTabButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_cart_tab_xpath"))));
		}
		catch (Exception e) {
			System.out.println("------------------------------Exception-------------------------");
			e.printStackTrace();
		}
	}
	
	public void clickAddToCartButtonOnHomeProductList() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_add_to_cart_button"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}

}
