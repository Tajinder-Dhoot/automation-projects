package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_004_MyAccountPageFunctionality extends InstanciateDriver {
	
	@Test
	public void tc_001_UpdateFirstNameInMyAddress() {
		
		signIn.signInFromHomePage();
		
		myAccount.clickMyAddressesButton();
		myAccount.clickMyAccountButton();
		
		myAccount.clickMyAddressesButton();
		myAccount.clickAddressUpdateButton();
		myAccount.enterFirstnameInUpdateAddress();
		myAccount.clickAddressUpdateSaveButton();
		
	}
}
