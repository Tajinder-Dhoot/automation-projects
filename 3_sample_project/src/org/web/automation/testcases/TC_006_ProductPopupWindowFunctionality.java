package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_006_ProductPopupWindowFunctionality extends InstanciateDriver {

	
	/*@Test
	public void tc_001_checkCorrectProductAdded() {
		
	}*/
	
	@Test
	public void tc_002_checkContinuebuttonPresent() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.ContinueButtonPresent();
	}
	
	@Test
	public void tc_003_checkProceedToCheckoutButtonPresent() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.ProceedToCheckoutButtonPresent();
	}
}
