package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_001_LoginCard_Functionality extends InstanciateDriver {
	
	@Test
	public void tc_001_Valid_User() {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_002_ValidEmail_InvalidPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterInValidPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_003_InvalidEmail_ValidPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterInValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_004_InvalidEmail_InvalidPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterInValidEmail();
		loginCard.enterInValidPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_005_EmptyEmail_EmptyPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterEmptyEmail();
		loginCard.enterEmptyPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_006_EmptyEmail_ValidPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterEmptyEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	}
	
	@Test
	public void tc_007_ValidEmail_EmptyPassword() {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterEmptyPassword();
		loginCard.clickSignInButton();
	}
}
