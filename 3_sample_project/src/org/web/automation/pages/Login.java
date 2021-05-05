package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class Login {
	
	WebDriver driver = null;
	PageActions action = null;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	
	public void clickSignInTab() {
		
		try {
			action.clickButton(driver.findElement(By.className
					(PropertyReader.readElementProperty("login_signin_tab_class"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}

	public void enterEmail() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_xpath"))),
					PropertyReader.readConfigProperty("login_email"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterPassword() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_password_xpath"))),
					PropertyReader.readConfigProperty("login_password"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickSignInButton() {	
		try {
			action.clickButton(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_signin_button_xpath"))));
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
