package org.web.automation.utility;

import org.openqa.selenium.WebDriver;
import org.web.automation.pages.ShoppingCart;

public class PlaceOrder {
	
	WebDriver driver = null; 
	public PlaceOrder(WebDriver driver) {
		this.driver = driver;
	}

	public void placeOrder() {
		
		ShoppingCart cart = new ShoppingCart(driver);
		cart.clickProceedToCheckoutButtonInAddressSection();
		cart.clickAgreeToTermsButtonInShippingSection();
		cart.clickProceedToCheckoutButtonInShippingSection();
		cart.clickPayByWireButtonInPaymentSection();
		cart.clickPaymentWindowConfirmOrderButton();
	}

}
