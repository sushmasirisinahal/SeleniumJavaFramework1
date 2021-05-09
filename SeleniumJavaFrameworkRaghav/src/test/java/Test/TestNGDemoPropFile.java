package Test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.log4jDemo;
import config.PropertiesFile;

public class TestNGDemoPropFile {
	
	WebDriver driver = null;
	private static Logger logger = LogManager.getLogger(log4jDemo.class);
	public static String browserName = null;
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath+"/Drivers/EdgeDriver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		
		logger.info("Browser started.");
	}
	@Test
	public void googleSearch()
	{
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		logger.info("Input successfully complete in search box.");
		
		//Click on Google Search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
	@AfterTest
	public void tearDownTest() {
				
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties(); //call set properties method and update the config.properties
		logger.info("Successfully logged out.");

	}

}

	
	