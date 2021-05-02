//package mobileAutomation;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class AliExpress {
//	
//	
//	@Test
//	public  void aliExp() throws MalformedURLException, InterruptedException {
//		public AndroidDriver<WebElement> driver ;
//	
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("appPackage", "com.alibaba.aliexpresshd");
//		capabilities.setCapability("appActivity", "com.alibaba.aliexpresshd.home.ui.MainActivity"); 
//		capabilities.setCapability("deviceName","ZF6222L6G4");
//		capabilities.setCapability("platformName","Android");
//		
//		 driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//			WebElement el1 =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView[4]"));
//			el1.click();
//			
//			
//			WebElement el2 =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[5]/android.widget.ImageView"));
//			el2.click();
//			
//		
//		
//			WebElement el4 =  driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign in\"]"));
//				el4.click();
//				
//			
//
//				// Start Second app
//				String appPackage="appPackage2";
//				String appActivity="appActivity2";
//				AndroidDriver(driver).startActivity(appPackage,appActivity);	
//				
//				
//				driver.close();
//				driver.quit();
//				
//		
//		
//	}
//
//}
