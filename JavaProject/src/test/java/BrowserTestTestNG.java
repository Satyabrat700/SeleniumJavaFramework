import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPOM;

import Pages.GoogleSearch;
public class BrowserTestTestNG {

	WebDriver driver=null;

	 ExtentReports extent;


	@BeforeSuite
	public  void setup() {
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		    
	     // create ExtentReports and attach reporter(s)
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);


		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();

		// creates a toggle for the given test, adds all log events under it    
	




	}

	//System.setProperty("webdriver.gecko.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	@Test 
	public  void search() throws InterruptedException {	


		ExtentTest test = extent.createTest("Google search","Validate Google search");

		Thread.sleep(3000);

		driver.get("https://www.google.com/");

		GoogleSearch.Google_Search(driver).sendKeys("Automation");

		test.log(Status.INFO, "This step shows usage of log(status, details)");
		extent.flush();


	}
	@AfterTest public void Teardowntest() {
		//GoogleSearch.Google_button(driver).sendKeys(Keys.RETURN);




	}


}
