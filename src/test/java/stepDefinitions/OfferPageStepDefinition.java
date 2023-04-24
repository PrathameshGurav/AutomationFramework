package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LandingsPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition  {

	 WebDriver driver;
	String offrePageProductName;
	String LandingPageProductName;
	TestContextSetup testContextSetup;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

@Then("User serached for {string} shortname in offer page")
public void user_serached_for_shortname_in_offer_page(String shortString) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	switchToOffersPage();
	
	OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
	offersPage.searchItem(shortString);
	//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortString);
	Thread.sleep(3000);
	offrePageProductName=offersPage.getProductName();
	System.out.println(offrePageProductName);
	
	System.out.println("This is for Git Practice ");
	System.out.println("Smita added some changes in offer page stepdefinition in atutomation framework ");

}

public void switchToOffersPage() {
LandingsPage landingPage =  testContextSetup.pageObjectManager.getLandingPage();
landingPage.selectTopDealsPage();
testContextSetup.genericUtils.switchWindowToChild();	
}


@Then("Validate productname in offer page matches with home  page")
public void validate_productname_in_offer_page_matches_with_home_page() {
    // Write code here that turns the phrase above into concrete actions
Assert.assertEquals(testContextSetup.LandingPageProductName,offrePageProductName);	
}

	
}
