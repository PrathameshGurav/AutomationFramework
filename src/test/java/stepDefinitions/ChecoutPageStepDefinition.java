package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CheckoutPage;
import pageObjects.LandingsPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class ChecoutPageStepDefinition  {

	WebDriver driver;
	String offrePageProductName;
	String LandingPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	public CheckoutPage checkoutPage;
	LandingsPage landingPage;
	
	
	public ChecoutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
		 this.landingPage = testContextSetup.pageObjectManager.getLandingPage();;
	}

	
	@Then("User proceeds to Checout and validate the {string} items in checkout page")
	public void user_proceeds_to_checout_and_validate_the_items_in_checkout_page(String string) throws InterruptedException {
		checkoutPage.checkOutItems();	
	
		Assert.assertEquals(landingPage.getProductName(), checkoutPage.getChecoutProductName(), string);		
	}
	
	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_order() {
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
	}
	
}

	




