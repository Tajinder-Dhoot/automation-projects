package org.web.automation.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	
	WebDriverWait wait = null;
	
	public PageActions(WebDriver driver) {
		wait = new WebDriverWait(driver, 20);
	}
	
	public void clickButton(WebElement element) throws IOException {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void enterDataInTextBox(WebElement element, String text) throws IOException {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

}
