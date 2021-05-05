package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_002_SignIn_Window extends InstanciateDriver {

	@Test
	public void tc_002_SignIn() {
		login.clickSignInTab();
		login.enterEmail();
		login.enterPassword();
		login.clickSignInButton();
		login.clickMyAddressesButton();
		login.clickMyAccountButton();
		
		/*login.clickOrderHistoryButton();
		login.clickMyAccountButton();
		
		login.clickMyCreditSlipsButton();
		login.clickMyAccountButton();
		
		login.clickMyPersonalInfoButton();
		login.clickMyAccountButton();
		
		login.clickMyWishlistButton();
		login.clickMyAccountButton();*/
		login.clickMyAddressesButton();
		login.clickAddressUpdateButton();
		login.enterFirstnameInUpdateAddress();
		login.clickAddressUpdateSaveButton();
		
	}
}
