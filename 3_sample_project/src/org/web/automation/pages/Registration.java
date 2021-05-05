package org.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class Registration {
	
	WebDriver driver = null;
	PageActions action = null;
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		action = new PageActions(driver);
	}
	
	public void clickSignInButton() {
		
		try {
			action.clickButton(driver.findElement(By.className
					(PropertyReader.readElementProperty("login_signin_tab_class"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void createNewEmail() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("new_email_xpath"))),
					PropertyReader.readConfigProperty("new_email_address"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
		
	
	public void clickCreateAccountButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
						(PropertyReader.readElementProperty("create_account_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void clickTitleRadioButton() {
		try {
			action.clickButton(driver.findElement(By.xpath
						(PropertyReader.readElementProperty("title_radio_button_xpath"))));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterFirstname() {	
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
						(PropertyReader.readElementProperty("input_customer_firstname_xpath"))),
					PropertyReader.readConfigProperty("registration_firstname"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	

}
