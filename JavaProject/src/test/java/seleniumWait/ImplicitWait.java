package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait {
	WebDriver driver;
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("TestAutomation")	;
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("abcd")).sendKeys("TestAutomation")	;
	}

}
