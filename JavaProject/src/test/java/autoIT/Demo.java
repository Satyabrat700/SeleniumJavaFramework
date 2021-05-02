package autoIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo {

	public static String URL = "";
	@Test
	public  void Test() throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\SeleniumJavaFramework\\JavaProject\\Drivers\\chromedriver.exe");
		URL = "https://Satyabrat700:46a7b0e6-4762-47fe-8546-95c42abb63b5@ondemand.eu-central-1.saucelabs.com:443/wd/hub";



		//WebDriver driver=new ChromeDriver();
		 WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		//Go to the url
		driver.get("https://www.findmyfare.com/");

		//Get the title and print it
		System.out.println(driver.getTitle());

		//Validate landed url
		System.out.println(driver.getCurrentUrl());

		//Print page source
		System.out.println(driver.getPageSource());

		//Go to the url
		driver.get("https://www.airbnb.com/");

		//Navigate back
		driver.navigate().back();

		//Navigate forward
		driver.navigate().forward();

		//Close current browser
		driver.close();

		//Close all the browsers
		driver.quit();

	}

}