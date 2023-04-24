package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class LandingsPage {
	WebDriver driver;
	private By search=By.xpath("//input[@type=\"search\"]");	
	private By productName=By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	private By increament=By.xpath("//a[@class='increment']");
	private By addTocart=	By.xpath("//button[contains(text(),\"ADD TO CART\")]");
	
	public LandingsPage(WebDriver driver) {
		this.driver=driver;
		
	}

	
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void selectTopDealsPage() {
		 driver.findElement(topDeals).click();
	}
	
	public String getTitleLandiningPage() {
		return driver.getTitle();
	}
	
	public void IncreamentQuantity(int Qty) {
		
		int i=Qty-1;
		while(i>0) {
			driver.findElement(increament).click();
			i--;
			
		}
	
	}
	
	public void addTocart() {
		driver.findElement(addTocart).click();
	}

}
