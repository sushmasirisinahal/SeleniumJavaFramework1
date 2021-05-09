package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();

	}

	
	public static void googleSearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		
		//Click on Google Search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER); ////input[@name='btnK']
			
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");

		
	}
	
}

	
	