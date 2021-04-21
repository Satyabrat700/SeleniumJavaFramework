package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPOM {
	
	 WebElement element=null;
	 
	 WebDriver driver=null;
	 	static By GoogleSearch_Txt=By.name("q");
	
	static By GoogleSearch_Btn=By.name("btnK");
	
	public GoogleSearchPOM(WebDriver driver) {
		
		this.driver=driver;
		
		
	} 
	
	public  void Google_Search(String text) {
		
		 driver.findElement(GoogleSearch_Txt).sendKeys(text);
		 
			
		
	}
	
	
public void  Google_button() {
	
	driver.findElement(GoogleSearch_Btn).sendKeys(Keys.RETURN);
	
	
	
}

}
