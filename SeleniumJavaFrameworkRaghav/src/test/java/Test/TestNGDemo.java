package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void googleSearch()
	{
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		
		//Click on Google Search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
	@AfterTest
	public void tearDownTest() {
				
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");

	}

}

	
	