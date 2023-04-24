package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.java.it.Data;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\HP\\eclipse-workspace\\CucumberFramework1\\src\\test\\java\\Features",
		glue="stepDefinitions",
		tags="@placeOrder or @OffersPage",
		monochrome = true,
		plugin= {"html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"}
		)


public class TestNgTestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object [][] scenarios(){
		
    return super.scenarios();
	}

	
}
