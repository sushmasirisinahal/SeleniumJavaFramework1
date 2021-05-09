package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		//Create ExtentReport and configurations
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");//target/Spark/Spark.html
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report Demo");
		extent.attachReporter(spark);	
		
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("Google Search Test", "This is a test to validate Google search functionality");
		
		//Start the test
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "Starting test case.");
		//Enter the url
		driver.get("https://google.com");
		test.pass("Successfully logged into Google.");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		test.pass("Entered test in search box.");
		
		//Click on Google Search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN); //click();
		
		test.pass("Pressed keyboard enter key.");
		
		//close browser
		driver.close();
		driver.quit();
		test.pass("Closed the browser.");
		
		test.info("Test completed.");
		
		//Test 2 example for failed test
		
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("Google Search Test2", "This is a test to validate Google search functionality-Fail scenario");
				
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting test case.");
		//Enter the url
		driver.get("https://google.com");
		test2.pass("Successfully logged into Google.");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Test by Test");
		test2.fail("Entered test in search box.");
		
		//Click on Google Search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN); //click();
		
		test2.pass("Pressed keyboard enter key.");
		
		//close browser
		driver.close();
		driver.quit();
		test2.pass("Closed the browser.");
		
		test2.info("Test completed.");
		
		//calling flush writes everything to the log
		extent.flush();

	}

}
