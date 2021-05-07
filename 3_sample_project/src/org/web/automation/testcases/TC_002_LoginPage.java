package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_002_LoginPage extends InstanciateDriver {

	@Test
	public void tc_001_Add_Dress_To_cart() {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		myAccount.clickDressesButtonTopMenu();
		myAccount.clickDressesAddToCartButton();
		myAccount.clickDressesAddToCartPopupCheckoutButton();
	}
}
