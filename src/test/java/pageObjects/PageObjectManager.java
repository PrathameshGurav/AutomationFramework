package pageObjects;

import org.apache.logging.log4j.LogManager;
import java.util.logging.*;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageObjectManager {
	WebDriver driver;
	OffersPage offersPage;
	LandingsPage landingPage;
	CheckoutPage checkoutPage;
	
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public LandingsPage getLandingPage() {
		 return landingPage=new LandingsPage(driver);
	}
	
	public OffersPage getOffersPage() {
		 return offersPage=new OffersPage(driver);
	}
	
	public CheckoutPage getCheckoutPage() {
		 checkoutPage= new CheckoutPage(driver);
		 return checkoutPage;
	}
	
	
}




