package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;
import org.web.automation.utility.Validate;

public class ProductAddedPopup {

	WebDriver driver = null;
	PageActions action = null;
	Validate validate = null;
	
	public ProductAddedPopup(WebDriver driver) {

		this.driver = driver;
		action = new PageActions(driver);
		validate = new Validate();
		
	}
	
	public void clickContinueShoppingButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("product_popup_continue_shopping_button_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickProceedToCheckoutButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("product_popup_proceed_to_checkout_button_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickCheckoutCrossButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("product_popup_checkout_cross_button_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	/*public void CorrectProductAdded() {
		try {
			validate.validateElementPresent(driver,
					PropertyReader.readConfigProperty("product_popup_any_element_locator_type"),
					PropertyReader.readElementProperty(""));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}*/
	
	public void ContinueButtonPresent() {
		try {
			validate.validateElementPresent(driver,
					PropertyReader.readConfigProperty("product_popup_any_element_locator_type"),
					PropertyReader.readElementProperty("product_popup_continue_shopping_button_xpath"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void ProceedToCheckoutButtonPresent() {
		try {
			validate.validateElementPresent(driver,
					PropertyReader.readConfigProperty("product_popup_any_element_locator_type"),
					PropertyReader.readElementProperty("product_popup_proceed_to_checkout_button_xpath"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}

}
