import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsDemo {

	static WebDriver driver=null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Google search", "Validate Google search");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		driver.get("https://www.google.com/");

		test.pass("passed success");

		ExtentTest test2 = extent.createTest("Google search1", "Validate Google search1");

		// info(details)
		test2.info("This step shows usage of info(details) 1");


		extent.flush();
	}

}
