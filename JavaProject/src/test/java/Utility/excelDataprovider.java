package Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.*;

public class excelDataprovider {
	public Excel obj;
	
	static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya\\eclipse-workspace\\JavaProject\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}
	
	@Test (dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException {	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(6000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Logout")).click();
		
		
	}

	@DataProvider(name="test1data")
	public Object[][] getdata() throws IOException {
		
		String excelpath="C:\\Users\\satya\\eclipse-workspace\\JavaProject\\testdata\\testdata.xlsx";
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
