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

public class ExtentReportsDemoTestNG {
	//declare as global variables
	ExtentReports extent;
	ExtentSparkReporter spark;
	
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

	@Test
	public void test1() {
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test-FAIL", "This is a test to validate Google search functionality-Pass");
		
		//log(Status,details)
		test1.log(Status.INFO, "");
		
		//info(details)
		test1.info("");
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		//test with snapshot
		test1.addScreenCaptureFromPath("screenshot.png");

	}
	
	@Test
	public void test2() {
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("Google Search Test-PASS", "This is a test to validate Google search functionality-2");
		
		//log(Status,details)
		test2.log(Status.INFO, "");
		
		//info(details)
		test2.info("");
		test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		//test with snapshot
		test2.addScreenCaptureFromPath("screenshot.png");

	}
	
	//@AfterTest  //To run after test
	@AfterSuite //if there are multiple tests and we want to run the tear up only once after all the tests
	public void tearDown() {
		
		//calling flush writes everything to the log file
		extent.flush();

	}

}
