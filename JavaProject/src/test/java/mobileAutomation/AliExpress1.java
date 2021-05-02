package mobileAutomation;
import Utility.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.JavascriptExecutor;

public class AliExpress1 {

	public WebDriver driver;
	

	@BeforeTest
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","HYF0218825005836");
		capabilities.setCapability("browserName","Chrome");
		capabilities.setCapability("platformName","Android");
		driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	}
	@Test (dataProvider="AliExpressTestData")
	public void AddToCart() throws InterruptedException {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("AliExpressAuto.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Ali Express Mobile Automation", "Basic flow to add 2 items and delete one in end");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://m.aliexpress.com/");
		

		try {
			driver.findElement(By.cssSelector("#footer-account > svg.footer-icon")).click();
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("fm-login-id")).click();
			driver.findElement(By.id("fm-login-id")).clear();
			driver.findElement(By.id("fm-login-id")).sendKeys("satyabrat700@outlook.com");
			driver.findElement(By.id("fm-login-password")).clear();
			driver.findElement(By.id("fm-login-password")).sendKeys("Covid2020");
			driver.findElement(By.xpath("//button[@type='submit']")).click();


			WebElement verfic1=driver.findElement(By.xpath("//input[@type='search']"));
			boolean eleSelected= verfic1.isDisplayed();
			
			System.out.println(eleSelected);




			if (eleSelected) {
				Reporter.log("Login is done successfully");
			} else {
				Reporter.log("Login is failed");
			}

			Reporter.log("Login is done successfully");
			test.pass("Login is done successfully");
			driver.findElement(By.xpath("//input[@class='_34eUx _3e9e8']")).click();
			driver.findElement(By.xpath("//input[@type='search']")).clear();
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("fidget spinner");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.RETURN);
			driver.findElement(By.xpath("//span[text()='Best match']")).click();
			driver.findElement(By.xpath("//*[text()='Orders']")).click();



			driver.findElement(By.xpath("//div[@id='root']/div[3]/div/a[2]/div/img")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(@class,'_39wqN')][contains(.,'Add to cart')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[contains(@src,'https://ae01.alicdn.com/kf/H41a10e4f4667445693a9e3ef380ea75f6/New-Fidget-Spinner-Toys-Adult-Antistress-Magnetic-Metal-Spiner-Ball-Stress-Reliever-Artificial-Satellite-Hand-Spinner.jpg_120x120.jpg')]")).click();
			driver.findElement(By.xpath("//a[contains(@class,'_39wqN')]")).click();
			Reporter.log("First element is added to the cart successfully");
			test.pass("First element is added to the cart successfully");
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Best match']")).click();
			driver.findElement(By.xpath("//*[text()='Orders']")).click();


			driver.findElement(By.xpath("//div[@id='root']/div[3]/div[2]/a[2]/div/img")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@class,'_39wqN')][contains(.,'Add to cart')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[contains(@src,'https://ae01.alicdn.com/kf/HTB1kBk.aUWF3KVjSZPhq6xclXXaj/Rainbow-Metal-Finger-Spinner-R118-Bearing-Spinner-Toy-Adult-Toys-for-Children-Raytheon-Mushroom-60-65mm.jpg_120x120.jpg')]")).click();

			driver.findElement(By.xpath("//a[contains(@class,'_39wqN')]")).click();
			
			Reporter.log("Second element is added to the cart successfully");
			test.pass("Second element is added to the cart successfully");
			Thread.sleep(3000);
			System.out.println("Success");
			//driver.findElement(By.linkText("Add to cart")).click();
			
			driver.get("https://m.aliexpress.com/shopcart/list.html?spm=a2g0n.shopcart.footer.d_shopcart.733cLqfeLqfeFe#/");
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//div[@class='flex justify-center align-center _3mjb9 QznTv _26CyA']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.cssSelector(".\\_1MA94:nth-child(2) > .\\_3NMsE use")).click();
			driver.findElement(By.cssSelector(".\\_1lgjw use")).click();
			driver.findElement(By.cssSelector(".\\_26CyA")).click();
			Thread.sleep(5000);
			WebElement verfic2= driver.findElement(By.cssSelector(".\\_1MA94:nth-child(2) > .\\_3NMsE use"));

			boolean eleSelected1= verfic2.isDisplayed();
			if (eleSelected1) {
				Reporter.log("2nd item is deleted successfully");
			} else {
				Reporter.log("2nd item is not deleted successfully");
			}

			Reporter.log("2nd item is deleted successfully");
			test.pass("Second element is deleted from the cart successfully");
			extent.flush();

		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	@DataProvider(name="AliExpressTestData")
	public Object[][] getdata() throws IOException {

		String excelpath="C:\\Users\\satya\\OneDrive\\Desktop\\MobileAutomation\\AliExpressTestData.xlsx";
		Object data[][]=testdata(excelpath,"Sheet1");

		return data;


	}

	public Object[][] testdata(String excelPath,String sheetName)  {

		Excel Obj=new Excel(excelPath,sheetName);


		int rowscount= Excel.getrowcount();
		int colcount= Excel.getcolcount();

		Object data[][]=new Object[rowscount-1][colcount];

		for (int i=1;i<rowscount;i++) {

			for (int j=0;j<colcount;j++) {


				String cellData=Excel.getCellDataString(i,j);

				data[i-1][j]= cellData	;

			}



		}

		return data;
	}
	

}


