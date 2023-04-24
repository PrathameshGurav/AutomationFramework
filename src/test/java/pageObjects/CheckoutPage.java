package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class CheckoutPage {
	WebDriver driver;
	private By cartBag=By.cssSelector("img[alt='Cart']");
	private By checkOutButton=By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]");
	private By promoBtn=By.xpath("//button[text()='Apply']");
	private By placeOrder=By.xpath("//button[contains(text(),\"Place Order\")]");	
	private By checkOutProductName=By.cssSelector("p.product-name");
	 
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		
	}

	
	
public void checkOutItems() {
	driver.findElement(cartBag).click();
	driver.findElement(checkOutButton).click();
}

public Boolean verifyPromoBtn() {
	return driver.findElement(promoBtn).isDisplayed();
}

public Boolean verifyPlaceOrder() {
	return driver.findElement(placeOrder).isDisplayed();
}

public String getChecoutProductName() {
	return driver.findElement(checkOutProductName).getText().split("-")[0].trim();
}



}
