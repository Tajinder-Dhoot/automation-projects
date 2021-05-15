package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;
import org.web.automation.utility.CaptureScreenshot;

public class TC_006_ProductPopupWindowFunctionality extends InstanciateDriver {

	
	/*@Test
	public void tc_001_checkCorrectProductAdded() {
		
	}*/
	
	@Test
	public void tc_002_checkContinuebuttonPresent() {
		
		home.clickAddToCartButtonOnHomeProductList();
		//productPopup.ContinueButtonPresent()
		try {
			// wait for popup to appear and then take screenshot
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CaptureScreenshot.takeScreenshot(driver, "continue_button_not_present");
	}
	
	/*@Test
	public void tc_003_checkProceedToCheckoutButtonPresent() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.ProceedToCheckoutButtonPresent();
	}*/
}
