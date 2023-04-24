package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LandingsPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinition  {

	WebDriver driver;
	String offrePageProductName;
	String LandingPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	LandingsPage landingPage;
	
	
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		 this.landingPage = testContextSetup.pageObjectManager.getLandingPage();;
		
	}
@Given("Usre is on GreenKart landing page")
public void usre_is_on_green_kart_landing_page() {
	
	Assert.assertTrue(landingPage.getTitleLandiningPage().contains("GreenKart"));
    
}
@When("Usre serach with shortname {string} and extracyted actual name of product from homepage")
public void usre_serach_with_shortname_and_extracyted_actual_name_of_product_from_homepage(String shortname) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	landingPage.searchItem(shortname);
	//testContextSetup.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortname);
	Thread.sleep(3000);
	testContextSetup.LandingPageProductName =landingPage.getProductName();
	//testContextSetup.LandingPageProductName = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	System.out.println(testContextSetup.LandingPageProductName+" is extracted from home page");

}


@When("Added {string} items of selected product to cart")
public void added_items_of_selected_product_to_cart(String qty) {
	
	landingPage.IncreamentQuantity(Integer.parseInt(qty));
	landingPage.addTocart();
}


	
}

	
    


	

