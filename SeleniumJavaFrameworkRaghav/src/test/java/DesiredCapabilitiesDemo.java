import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath+"/Drivers/IEdriver/IEdriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		
		//Click on Google Search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER); ////input[@name='btnK']
			
		
		//close browser
		driver.close();
		driver.quit();
		
		System.out.println("Test completed successfully");

		
	}

}
