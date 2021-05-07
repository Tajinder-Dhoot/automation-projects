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
	
	public void clickContinueShoppingButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_continue_shopping_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickProceedToCheckoutButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickOrderProceedToCheckoutButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("home_nav_order_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickAddressWindowProceedToCheckoutButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("delivery_address_window_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	
	public void clickShippingWindowAgreeToTermsButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("shipping_window_agree_to_terms_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickShippingWindowProceedToCheckoutButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("shipping_window_proceed_to_checkout_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickPaymentWindowPayByWireButton() {
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
	
	public void clickReduceQuantityButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("cart_order_quantity_down_xpath"))));
			Thread.sleep(3000);
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	
}
