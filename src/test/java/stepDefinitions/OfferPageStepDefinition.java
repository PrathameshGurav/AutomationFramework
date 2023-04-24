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
	
	System.out.println("Prathamesh pulled the above code and adding some more code in this class as bellow");
	System.out.println("Prathamesh adding this line in offerpage stepdef ");
	System.out.println("Greatwork by prathamesh ");
	System.out.println("He is best automation test Engineer i ever seen ");
	
	
	System.out.println("I am sumit and i am an architect , joined this project");
	System.out.println("I am doing some major changes i automation framewok hence i will take out one branch from master called Developer branch");
	System.out.println("Beacuse if i started changes direcr in master branch the prathanesh and smita will see some failure in there testcases");
	System.out.println("There work will get impacted");
	System.out.println("Hence i am doing changes in master branch abd later i will merge");

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
