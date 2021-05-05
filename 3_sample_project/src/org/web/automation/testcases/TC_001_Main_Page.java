package org.web.automation.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_001_Main_Page extends InstanciateDriver {
	
	@Test
	public void tc_001_ReachLoginPage() throws IOException {
		
		register.clickSignInButton();
		register.createNewEmail();
		register.clickCreateAccountButton();
		//register.clickTitleRadioButton();
		register.enterFirstname();
	}

}
