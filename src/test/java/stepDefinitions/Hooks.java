package stepDefinitions;

import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	private static final String TakesScreenshot = null;
	TestContextSetup testContextSetup;
	
	public Hooks( TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void afterScenario() {
	testContextSetup.testBase.driver.quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException, InterruptedException {
		WebDriver driver=testContextSetup.testBase.WebDriverManager();
		
		if(scenario.isFailed()) {
					
			File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");		
			//File dest = new File("./test-output/Screenshot/failed.png");
			//FileUtils.copyFile(src, dest);	
			
		}
		
	}

}
