package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class HomePageNavBar {
	
	WebDriver driver = null;
	PageActions action = null;
	
	public HomePageNavBar(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	
	public void clickNavDressesButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_dresses_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickNavWomenButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_women_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickNavTshirtsButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_tshirts_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}

	public void clickAddToCartButtonInCategoryProductlist() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_add_to_cart_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
}
