package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITDemo {
	@Test
	public void Test1() throws InterruptedException, IOException {
	//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.file.io/");
		Thread.sleep(6000);
		
		//driver.findElement(By.className("react-fine-uploader-file-input")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\\\Users\\\\satya\\\\OneDrive\\\\Desktop\\\\Demo.txt");
		Runtime.getRuntime().exec("C:\\Users\\satya\\OneDrive\\Desktop\\AutoITDemo.exe");
		
		Thread.sleep(6000);
		driver.close();




	}

	private By ByClassName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
