package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_005_ShoppingCartFunctionality extends InstanciateDriver {
	
	@Test
	public void tc_001_checkCartIsEmpty() {
		
		home.clickCartTabButton();
		cart.checkCartIsEmpty();
	}

	@Test
	public void tc_002_checkCartIsNotEmpty() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickCartTabButton();
		cart.checkCartIsNotEmpty();
	}
	
	@Test
	public void tc_003_DecreaseProductQuantity() throws Exception {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickCartTabButton();
		Thread.sleep(2000);
		cart.clickDecreaseProductQuantityButton();
	}
	
	@Test
	public void tc_004_IncreaseProductQuantity() throws Exception {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickCartTabButton();
		Thread.sleep(2000);
		cart.clickIncreaseProductQuantityButton();
	}
	
	@Test
	public void tc_005_deleteProductFromCart() throws Exception {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		
		home.clickCartTabButton();
		Thread.sleep(3000);
		cart.clickOrderDeleteButton();
	}
	
	/*@Test
	public void tc_006_placeOrderFromCartForSignedOutUser() throws Exception {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickCartTabButton();
		cart.clickProceedToCheckoutButtonInCart();
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		cart.clickProceedToCheckoutButtonInAddressSection();
		cart.clickAgreeToTermsButtonInShippingSection();
		cart.clickProceedToCheckoutButtonInShippingSection();
		cart.clickPayByWireButtonInPaymentSection();
		cart.clickPaymentWindowConfirmOrderButton();
	}
	
	@Test
	public void tc_007_placeOrderFromCartForSignedInUser() throws Exception {
		
		loginCard.clickSignInTab();
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		myAccount.clickHomeIconButton();
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
		home.clickCartTabButton();
		cart.clickProceedToCheckoutButtonInCart();
		cart.clickProceedToCheckoutButtonInAddressSection();
		cart.clickAgreeToTermsButtonInShippingSection();
		cart.clickProceedToCheckoutButtonInShippingSection();
		cart.clickPayByWireButtonInPaymentSection();
		cart.clickPaymentWindowConfirmOrderButton();
	}*/
}
