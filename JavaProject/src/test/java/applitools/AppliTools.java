package applitools;



import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.BatchInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.net.URISyntaxException;

public  class AppliTools {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // Open a Chrome browser.

		Eyes eyes = new Eyes();
		eyes.setApiKey("7BQrl4XUad0sZLByJKb5GhYG117PJabJCHKjRus32FE110");
		
		eyes.open(driver, "Hello World!", "First Appli programme");
		new RectangleSize(1200,600);
		
		driver.get("https://applitools.com/helloworld/?diff2");
		
		eyes.checkWindow("Hello!");
		
		driver.findElement(By.xpath("//button")).click();
		
		
		eyes.checkWindow("Check!");
		
		eyes.close();
		
		driver.close();




	}
}