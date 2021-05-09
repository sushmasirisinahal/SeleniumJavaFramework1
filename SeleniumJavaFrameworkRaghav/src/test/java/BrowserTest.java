import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		//Save executable file in the project folder itself under Drivers folder
		/*if you give the location of folder having driver in environment variable PATH then you dont have to set below.
		 * To set it - Go to ThisPC->Right click - Properties ->Advanced System Settings -> Environmental Variables -> Path->
		 * add path to chromedriver so that you dont need to set system property and comment out below line */
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org");
		//either give try and catch or throws
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
