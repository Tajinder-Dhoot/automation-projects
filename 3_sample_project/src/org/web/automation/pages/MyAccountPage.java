package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class MyAccountPage {
	
	WebDriver driver = null;
	PageActions action = null;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	
	public void clickHomeIconButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("my_account_home_icon_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickOrderHistoryButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_order_history_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickMyCreditSlipsButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_credit_slips_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickMyAddressesButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_my_addresses_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickMyPersonalInfoButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_personal_info_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickMyWishlistButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_my_wishlist_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickMyAccountButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_my_account_button"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickAddressUpdateButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_address_update_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickAddressUpdateSaveButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_address_update_save_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterFirstnameInUpdateAddress() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_update_address_firstname_xpath"))),
					PropertyReader.readConfigProperty("login_update_address_firstname"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}

}
