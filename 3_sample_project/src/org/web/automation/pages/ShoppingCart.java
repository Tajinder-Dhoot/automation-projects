package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;
import org.web.automation.utility.Validate;

public class ShoppingCart {

	WebDriver driver = null;
	Validate validate = null;
	PageActions action = null;
	
	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
		validate = new Validate();
		action = new PageActions(driver);
	}
	
	public void checkCartIsEmpty() {
		try {
		validate.validateElementPresent(driver,
				PropertyReader.readConfigProperty("cart_empty_message_locator_type"),
				PropertyReader.readElementProperty("cart_empty_message_xpath"));
		
	}
		catch (Exception e) {
			System.out.println("------------------------------Exception-------------------------");
			e.printStackTrace();
		}
	}
	
	public void checkCartIsNotEmpty() {
		try {
		validate.validateElementPresent(driver,
				PropertyReader.readConfigProperty("cart_not_empty_locator_type"),
				PropertyReader.readElementProperty("cart_proceed_to_checkout_button_xpath"));
		
	}
		catch (Exception e) {
			System.out.println("------------------------------Exception-------------------------");
			e.printStackTrace();
		}
	}
	
	public void clickDecreaseProductQuantityButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("cart_decrease_quantity_button_xpath"))));
			Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickIncreaseProductQuantityButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("cart_increase_quantity_button_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickOrderDeleteButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("cart_order_delete_button"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickProceedToCheckoutButtonInCart() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("cart_proceed_to_checkout_button_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickProceedToCheckoutButtonInAddressSection() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("delivery_address_window_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	
	public void clickAgreeToTermsButtonInShippingSection() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("shipping_window_agree_to_terms_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickProceedToCheckoutButtonInShippingSection() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("shipping_window_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickPayByWireButtonInPaymentSection() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("payment_window_pay_by_wire_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickPaymentWindowConfirmOrderButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("payment_window_confirm_order_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
}
