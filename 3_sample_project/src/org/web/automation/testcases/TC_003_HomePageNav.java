package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_003_HomePageNav extends InstanciateDriver {

	/*@Test 
	public void tc_001_successfulOrderByWomenCategorySignedOutUser() {
		
		homeNav.clickNavWomenButton();
		homeNav.clickNavAddToCartButton();
		homeNav.clickNavProceedToCheckoutButton();
		homeNav.clickNavOrderProceedToCheckoutButton();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		homeNav.clickAddressWindowProceedToCheckoutButton();
		homeNav.clickShippingWindowAgreeToTermsButton();
		homeNav.clickShippingWindowProceedToCheckoutButton();
		homeNav.clickPaymentWindowPayByWireButton();
		homeNav.clickPaymentWindowConfirmOrderButton();
	}*/
	
	/*@Test 
	public void tc_001_successfulOrderByDressCategorySignedOutUser() {
		
		homeNav.clickNavDressesButton();
		homeNav.clickNavAddToCartButton();
		homeNav.clickNavProceedToCheckoutButton();
		homeNav.clickNavOrderProceedToCheckoutButton();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		homeNav.clickAddressWindowProceedToCheckoutButton();
		homeNav.clickShippingWindowAgreeToTermsButton();
		homeNav.clickShippingWindowProceedToCheckoutButton();
		homeNav.clickPaymentWindowPayByWireButton();
		homeNav.clickPaymentWindowConfirmOrderButton();
	}*/
	
	/*@Test 
	public void tc_001_successfulOrderByTshirtsCategorySignedOutUser() {
		
		homeNav.clickNavTshirtsButton();
		homeNav.clickNavAddToCartButton();
		homeNav.clickNavProceedToCheckoutButton();
		homeNav.clickNavOrderProceedToCheckoutButton();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		homeNav.clickAddressWindowProceedToCheckoutButton();
		homeNav.clickShippingWindowAgreeToTermsButton();
		homeNav.clickShippingWindowProceedToCheckoutButton();
		homeNav.clickPaymentWindowPayByWireButton();
		homeNav.clickPaymentWindowConfirmOrderButton();
	}*/
	
	/*@Test 
	public void tc_001_Continue_ShoppingbyCategory() {
		
		homeNav.clickNavTshirtsButton();
		homeNav.clickNavAddToCartButton();
		homeNav.clickContinueShoppingButton();
		
	}*/
	
	/*@Test 
	public void tc_001_Continue_ShoppingHomePage() {
		
		homeNav.clickAddToCartButtonOnHomeProductList();
		homeNav.clickContinueShoppingButton();
	}*/
	
	/*@Test 
	public void tc_001_successfulOrderFromHomePageSignedOutUser() {
		
		homeNav.clickAddToCartButtonOnHomeProductList();
		homeNav.clickProceedToCheckoutButton();
		homeNav.clickOrderProceedToCheckoutButton();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		homeNav.clickAddressWindowProceedToCheckoutButton();
		homeNav.clickShippingWindowAgreeToTermsButton();
		homeNav.clickShippingWindowProceedToCheckoutButton();
		homeNav.clickPaymentWindowPayByWireButton();
		homeNav.clickPaymentWindowConfirmOrderButton();
	}*/
	
	@Test 
	public void tc_001_successfulOrderFromHomePageSignedOutUserReduceProductQuantity() {
		
		homeNav.clickAddToCartButtonOnHomeProductList();
		homeNav.clickProceedToCheckoutButton();
		homeNav.clickReduceQuantityButton();
		homeNav.clickOrderProceedToCheckoutButton();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		homeNav.clickAddressWindowProceedToCheckoutButton();
		homeNav.clickShippingWindowAgreeToTermsButton();
		homeNav.clickShippingWindowProceedToCheckoutButton();
		homeNav.clickPaymentWindowPayByWireButton();
		homeNav.clickPaymentWindowConfirmOrderButton();
	}
}
