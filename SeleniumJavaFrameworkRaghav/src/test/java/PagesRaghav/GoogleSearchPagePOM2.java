package PagesRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPagePOM2 {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	
	By button_search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	//Constructor to get the driver from the object as input
	public GoogleSearchPagePOM2(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).click();
		
	}

	

}
