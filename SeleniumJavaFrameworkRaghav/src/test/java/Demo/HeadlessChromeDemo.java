package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminHome\\Eclipse projects\\SeleniumJavaFrameworkRaghav\\Drivers\\Chromedriver\\chromedriver.exe");
		
		//headless chrome - additional steps to not open browser but perform same activites
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800"); // to set window size, you can check with display settings and give the same here
		
				
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver(options); //not to open the browser
		
		
		driver.get("https:google.com");
		System.out.println(driver.getTitle()); 
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
}
