package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemoTestNG2 {
	//declare as global variables
	ExtentReports extent;
	ExtentSparkReporter spark;
	WebDriver driver = null;
	
	//@BeforeTest  //To run before test
	@BeforeSuite //if there are multiple tests and we want to run the set up only once before all the tests
	public void setUp() {

		//Create ExtentReport and configurations
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("Extent.html");//target/Spark/Spark.html
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report Demo");
		extent.attachReporter(spark);
		
	}
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void test1() {
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test-FAIL", "This is a test to validate Google search functionality-Pass");
		
		//goto google.com
		driver.get("https://google.com");
		
		//log(Status,details)
		test1.log(Status.INFO, "Successfully logged into Google.com");
		test1.fail("Testing fail test case");
		
		
	}
	
	@Test
	public void test2() {
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("Google Search Test-PASS", "This is a test to validate Google search functionality-2");
		
		//goto google.com
		driver.get("https://google.com");
				
		//log(Status,details)
		test2.log(Status.INFO, "Successfully logged into Google.com");
		test2.pass("Testing pass test case");

	}
	
	@AfterTest
	public void tearDownTest() {
				
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");

	}

	
	//@AfterTest  //To run after test
	@AfterSuite //if there are multiple tests and we want to run the tear up only once after all the tests
	public void tearDown() {
		
		//calling flush writes everything to the log file
		extent.flush();

	}

}
