package listeners;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listeners.testNGListeners.class)
public class TestNGListenerDemo3_Seleniumexample {
	
	@Test
	public void test7() {
		System.out.println("I am inside Test 7");
	}
	
	@Test
	public void test8() {
		System.out.println("I am inside Test 8");
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("ABCD");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		driver.close();
	}
	
	@Test
	public void test9() {
		System.out.println("I am inside Test 9");
		throw new SkipException("This test is skipped");
	}

}
