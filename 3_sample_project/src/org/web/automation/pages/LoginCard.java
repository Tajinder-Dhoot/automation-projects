package org.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.web.automation.utility.PageActions;
import org.web.automation.utility.PropertyReader;

public class LoginCard {

	WebDriver driver = null;
	PageActions action = null;
	
	public LoginCard(WebDriver driver) {
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

	public void enterValidEmail() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_xpath"))),
					PropertyReader.readConfigProperty("login_valid_email"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterInValidEmail() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_xpath"))),
					PropertyReader.readConfigProperty("login_invalid_email"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyEmail() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_xpath"))),
					PropertyReader.readConfigProperty("login_empty_email"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterValidPassword() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_password_xpath"))),
					PropertyReader.readConfigProperty("login_valid_password"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterInValidPassword() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_password_xpath"))),
					PropertyReader.readConfigProperty("login_invalid_password"));
		}
		catch (Exception e) {
			System.out.println("---------------------Exception-----------------");
			e.printStackTrace();
		}
	}
	
	public void enterEmptyPassword() {
		try {
			action.enterDataInTextBox(driver.findElement(By.xpath
					(PropertyReader.readElementProperty("login_email_password_xpath"))),
					PropertyReader.readConfigProperty("login_empty_password"));
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
}
