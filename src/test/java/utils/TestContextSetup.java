package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
import stepDefinitions.Hooks;

public class TestContextSetup {
	
	public WebDriver driver;
 	public String LandingPageProductName;
 	public PageObjectManager pageObjectManager;
 	public TestBase testBase;
 	public GenericUtils genericUtils;
 //	public Hooks hooks;
 	
 	public TestContextSetup() throws InterruptedException, IOException  {
 		testBase=new TestBase();
 	pageObjectManager =new PageObjectManager(testBase.WebDriverManager());
 //	Thread.sleep(3000);
 	genericUtils=new GenericUtils(testBase.WebDriverManager());
 	//hooks=new Hooks(testBase.WebDriverManager());
 	
 	}
}
