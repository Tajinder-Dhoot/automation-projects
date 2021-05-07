package org.web.automation.utility;

import org.openqa.selenium.WebDriver;
import org.web.automation.pages.LoginCard;

public class SignIn {
	
	WebDriver driver = null;
	LoginCard loginCard = null;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		loginCard = new LoginCard(driver);
	}
	
	public void signInFromHomePage() {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	}
	
	public void signInAfterRedirectionToSignInPage() {
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	}

}
