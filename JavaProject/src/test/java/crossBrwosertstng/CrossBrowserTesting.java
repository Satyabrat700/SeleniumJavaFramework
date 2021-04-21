package crossBrwosertstng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver= null;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("Thread is:"+Thread.currentThread());

		if(browserName.equalsIgnoreCase("Chrome")) {


			System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");

			driver=new ChromeDriver();
			
			System.out.println("BrowserName is:"+browserName);

		}
		else if(browserName.equalsIgnoreCase("firefox")){


			System.setProperty("webdriver.gecko.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\geckodriver.exe");

			driver=new FirefoxDriver();
			System.out.println("BrowserName is:"+browserName);

		}


	}
	
	@Test public void Test() throws InterruptedException {
		Thread.sleep(6000);
		driver.get("https://www.google.com");
		System.out.println("Inside Test");

	}
	@AfterTest
	public void Close() {
		
		driver.close();
		
		System.out.println("Test Completed Successfully");


	}

}
