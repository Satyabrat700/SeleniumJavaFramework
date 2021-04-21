import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPOM;

import Pages.GoogleSearch;
public class BrowserTest {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		GoogleSearchPOM Obj=new GoogleSearchPOM(driver);
		
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(3000);
		
	
		
	
	GoogleSearch.Google_Search(driver).sendKeys("Automation");
	
	
	
	GoogleSearch.Google_button(driver).sendKeys(Keys.RETURN);
	
	Obj.Google_Search("Satya");
	
		
		
	}

}
