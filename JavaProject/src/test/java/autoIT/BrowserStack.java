package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BrowserStack {
  public static final String AUTOMATE_USERNAME = "satyabratanayak_ywECFP";
  public static final String AUTOMATE_ACCESS_KEY = "yKxMsFuCy2fCy1yJPU1g";
  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("os_version", "8");
    caps.setCapability("resolution", "1920x1080");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "latest-beta");
    caps.setCapability("os", "Windows");
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("https://www.google.com");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();
    // Setting the status of test as 'passed' or 'failed' based on the condition; if title of the web page contains 'BrowserStack'
    WebDriverWait wait = new WebDriverWait(driver, 5);
    try {
    	wait.until(ExpectedConditions.titleContains("BrowserStack"));
    	markTestStatus("passed","Yaay title contains 'BrowserStack'!",driver);
    }
    catch(Exception e) {
    	markTestStatus("failed","Naay title does not contain 'BrowserStack'!",driver);
    }
    System.out.println(driver.getTitle());
    driver.quit();
  }
  // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
  public static void markTestStatus(String status, String reason, WebDriver driver) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
  }
} 