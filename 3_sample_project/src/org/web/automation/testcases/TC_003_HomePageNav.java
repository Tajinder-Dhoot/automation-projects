package org.web.automation.testcases;

import org.testng.annotations.Test;
import org.web.automation.base.InstanciateDriver;

public class TC_003_HomePageNav extends InstanciateDriver {

	
	/*@Test 
	public void tc_001_successfulOrderByWomenCategorySignedOutUser() {
		
		homeNav.clickNavWomenButton();
		homeNav.clickAddToCartButtonInCategoryProductlist();
		productPopup.clickProceedToCheckoutButton();
		cart.clickProceedToCheckoutButtonInCart();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		order.placeOrder();
	}*/
	
	@Test 
	public void tc_002_successfulOrderByDressCategorySignedOutUser() {
		
		homeNav.clickNavDressesButton();
		homeNav.clickAddToCartButtonInCategoryProductlist();
		productPopup.clickProceedToCheckoutButton();
		cart.clickProceedToCheckoutButtonInCart();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		order.placeOrder();
	}
	
	@Test 
	public void tc_003_successfulOrderByTshirtsCategorySignedOutUser() {
		
		homeNav.clickNavTshirtsButton();
		homeNav.clickAddToCartButtonInCategoryProductlist();
		productPopup.clickProceedToCheckoutButton();
		cart.clickProceedToCheckoutButtonInCart();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
	
		order.placeOrder();
	}
	
	/*@Test 
	public void tc_004_Continue_ShoppingbyCategory() {
		
		homeNav.clickNavTshirtsButton();
		homeNav.clickAddToCartButtonInCategoryProductlist();
		productPopup.clickContinueShoppingButton();
	}
	
	@Test 
	public void tc_005_Continue_ShoppingHomePage() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickContinueShoppingButton();
	}*/
	
	/*@Test 
	public void tc_006_successfulOrderFromHomePageSignedOutUser() {
		
		home.clickAddToCartButtonOnHomeProductList();
		productPopup.clickProceedToCheckoutButton();
		cart.clickProceedToCheckoutButtonInCart();
		
		loginCard.enterValidEmail();
		loginCard.enterValidPassword();
		loginCard.clickSignInButton();
		
		order = new PlaceOrder(driver);
		order.placeOrder();
	}*/
	
	
}
