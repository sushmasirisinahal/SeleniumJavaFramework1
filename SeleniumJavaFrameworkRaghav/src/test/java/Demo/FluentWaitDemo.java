package Demo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	
	public static void test() throws Exception {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		//driver.findElement(By.linkText("ABCD Dental: Home")).click();
		
		//Fluent wait example from Seleniumapi
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement linkElement = driver.findElement(By.linkText("ABCD Dental: Home"));
			       
			       if(linkElement.isEnabled()) {
			    	   System.out.println("Element found");
			       }
			       return linkElement;
			       
			     }
			   });
			   element.click();
				
				
		//Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
