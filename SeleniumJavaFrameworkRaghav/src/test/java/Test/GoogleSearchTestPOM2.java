package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagesRaghav.GoogleSearchPagePOM2;

public class GoogleSearchTestPOM2 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	} 
	
	public static void googleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPagePOM2 object = new GoogleSearchPagePOM2(driver);
		driver.get("https://google.com");
		object.setTextInSearchBox("Test automation");
		object.clickSearchButton();
		driver.close();
	}

}
