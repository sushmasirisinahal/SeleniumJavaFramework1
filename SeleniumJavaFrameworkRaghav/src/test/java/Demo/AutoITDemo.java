package Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminHome\\Eclipse projects\\SeleniumJavaFrameworkRaghav\\Drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //pending----
		driver.get("http://www.fileconvoy.com/");
		
		//driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	    driver.findElement(By.xpath("//*[@id=\"upfile_0\"]")).click();
	    Runtime.getRuntime().exec("C:/Users/adminHome/Desktop/AutoITPractice/FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
