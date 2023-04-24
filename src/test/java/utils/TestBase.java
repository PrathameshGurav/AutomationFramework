package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		
	    if (driver==null) 
	    {
	    	if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	    	}
	    	if (prop.getProperty("browser").equalsIgnoreCase("Microsoft Edge")) {
	    		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	    		driver=new EdgeDriver();
	    	    	}
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get(url);
		driver.manage().window().maximize();
		
	    }
		return driver;
	   
	}

}
