package fluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FlunetWait {
	
	WebDriver driver;
	@Test
	public void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(option);
	
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("TestAutomation")	;
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
			 
		
		//WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		//driver.findElement(By.name("abcd")).sendKeys("TestAutomation")	;
	}

}
