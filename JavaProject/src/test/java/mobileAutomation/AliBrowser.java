package mobileAutomation;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AliBrowser {

	AndroidDriver<MobileElement> driver;

	public WebDriverWait                wait;
	public AliBrowser(AndroidDriver driver)
	{
		this.driver=driver;
	}



	@BeforeMethod
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName","HYF0218825005836");
		capabilities.setCapability("browserName","Chrome");

		capabilities.setCapability("platformName","Android");



		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


	}

	@Test
	public void basicTest() throws InterruptedException {
		//Click and pass Splash
		driver.get("https://m.aliexpress.com/");

		Thread.sleep(6000);


		driver.findElement(By.cssSelector("#footer-account > svg.footer-icon")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("fm-login-id")).click();
		driver.findElement(By.id("fm-login-id")).clear();
		driver.findElement(By.id("fm-login-id")).sendKeys("satyabrat700@outlook.com");
		driver.findElement(By.id("fm-login-password")).clear();
		driver.findElement(By.id("fm-login-password")).sendKeys("Covid2020");
		driver.findElement(By.xpath("//button[@type='submit']")).click();


		driver.findElement(By.xpath("//input[@class='_34eUx _3e9e8']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).clear();

		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("fidget spinner");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//span[text()='Best match']")).click();
		driver.findElement(By.xpath("//*[text()='Orders']")).click();

		//	UiObject searchbox= new UiObject(new UiSelector().resourceId(""));

		//		JavascriptExecutor js=(JavascriptExecutor) driver;
		//		
		//		Thread.sleep(5000);

		//		WebElement myElement= driver.findElement(By.xpath("//img[@src='//ae01.alicdn.com/kf/Hb513645d979144c08c4fabde67aee8b8f.jpg_300x300Q70.jpg_.webp']"));
		//		//WebElement myElement=	driver.findElement(By.xpath("//*[contains(@content-desc='New Fidget Spinner-Toys Stress-Reliever Antistress Magnetic Artificial-Satellite Metal']"));
		//		
		//		js.executeScript("arguments[0].scrollIntoView(true);",myElement);

		//
		//		System.out.println(myElement.getText());
		//		myElement.click();




		new TouchAction(driver).tap(PointOption.point(247,1676)).release().perform(); 



		//driver.findElement(By.xpath("(//input[@class='icon-svg']")).click();
		driver.findElement(By.xpath("//img[@alt='Relief-Toys Spinners Led-Light Hand-Top Finger-Stress EDC Luminous']")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		driver.findElement(By.xpath("//img[@alt='green']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		driver.close();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		driver.findElement(By.xpath("//img[@alt='Toys Spinner Fidget-Toy Bubble-Key-Chain Push-Pop Popit Simple Dimple New']")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div[7]/div/div")).click();
		driver.findElement(By.xpath("//img[@alt='2']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		driver.close();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		driver.findElement(By.xpath("//div[@id='nav-user-account']/span/a/span")).click();
		driver.findElement(By.id("headMenu_account")).click();
		driver.findElement(By.linkText("Edit Settings")).click();
		driver.findElement(By.linkText("Upload My Photo")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
		driver.findElement(By.id("add_img")).click();
		driver.findElement(By.id("ksu-html5-ko4vkwm5")).clear();
		driver.findElement(By.id("ksu-html5-ko4vkwm5")).sendKeys("C:\\fakepath\\Screenshot (1).png");
		driver.close();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		driver.findElement(By.linkText("Cart2")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
		driver.findElement(By.xpath("//div[@id='nav-user-account']/div")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}