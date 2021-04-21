package Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPOM;

import Pages.GoogleSearch;
public class BrowserTestTestNG {
	
	static WebDriver driver=null;
	
	
	
@BeforeTest public void setup() {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	GoogleSearchPOM Obj=new GoogleSearchPOM(driver);
}
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		@Test public void search() {	
		
		driver.get("https://www.google.com/");
	
	GoogleSearch.Google_Search(driver).sendKeys("Automation");
	
	
		}
		@AfterTest public void Teardowntest() {
	//GoogleSearch.Google_button(driver).sendKeys(Keys.RETURN);
			
			throw new SkipException(null);
	
	
	
		
		}


}
