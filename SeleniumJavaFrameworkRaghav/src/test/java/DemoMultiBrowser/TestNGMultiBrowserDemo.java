package DemoMultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")  //to get the parameters for set up, how to get it is by creating xml file by right clicking on test -> TestNG-> convert to TestNG
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is:  "+browserName);
		System.out.println("Thread ID is:  "+Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath+"/Drivers/EdgeDriver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if(browserName.equalsIgnoreCase("ie")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("ignoreProtectedModeSettings", true);
			System.setProperty("webdriver.ie.driver", projectPath+"/Drivers/IEdriver/IEdriverServer.exe");
			driver = new InternetExplorerDriver(caps);
			
		}

	}

	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);

	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test completed successfully.");
	}

}
