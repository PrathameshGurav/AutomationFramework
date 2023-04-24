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
	System.out.println("This is for Git Practice ");
	System.out.println("Smita added some changes in landing page stepdefinition in atutomation framework ");
	
	System.out.println("Prathamesh pulled the above code and adding some more code in this class as bellow");
	System.out.println("Prathamesh adding this line in landingpage stepdef ");
	System.out.println("Greatwork by prathamesh ");
	System.out.println("He is best automation test Engineer i ever seen ");
	
	
	System.out.println("I am sumit and i am an architect , joined this project");
	System.out.println("I am doing some major changes i automation framewok hence i will take out one branch from master called Developer branch");
	System.out.println("Beacuse if i started changes direcr in master branch the prathanesh and smita will see some failure in there testcases");
	System.out.println("There work will get impacted");
	System.out.println("Hence i am doing changes in master branch abd later i will merge");
	
	
	System.out.println("I am Subodh and i am second  architect , joined this project with Sumit");
	System.out.println("I am doing some major changes i automation framewok with Sumit , i have pulled first cloned prject from master branch and then pulled latest changes done by sumit in develop branch");
	System.out.println("i switch the branch to develop");
	System.out.println(" i amde some code changes so sumit can carry forward the code from my changes");
	System.out.println("for that i will push this changes in develop branch");
	
	System.out.println("hi i am parathamesh and doing changes in develop branch");
    
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

	
    


	

