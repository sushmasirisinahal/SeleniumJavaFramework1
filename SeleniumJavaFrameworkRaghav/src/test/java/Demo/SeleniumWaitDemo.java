package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumwaits();
	}
	
	public static void seleniumwaits() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //10 seconds, we can give minutes, hours, days etc, default frequency of polling is 250 ms
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.xpath("//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10); //Explicit wait example
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd"))); //Calling Explicit wait
		
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
		
	}

}
