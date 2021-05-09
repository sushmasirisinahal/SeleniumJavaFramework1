package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesRaghav.GoogleSearchPagePOM1;

public class GoogleSearchTestPOM1 {
	static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();

	}

	
	public static void googleSearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		GoogleSearchPagePOM1.textbox_search(driver).sendKeys("Automation Test by Test");
		//driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		
		//Click on Google Search button
		GoogleSearchPagePOM1.button_search(driver).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER); ////input[@name='btnK']
			
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");

		
	}

}

