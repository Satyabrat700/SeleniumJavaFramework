package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearch {
	
	static WebElement element=null;
	public static WebElement Google_Search(WebDriver driver) {
		
		 element=driver.findElement(By.name("q"));
		 
		 return element;
		
		
		
	}
	
	
public static WebElement Google_button(WebDriver driver) {
	
	 element=driver.findElement(By.name("btnK"));
	
	 return element;
	
}
}	

