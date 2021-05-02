package mobileAutomation;

import java.io.IOException;

import Utility.*;

public class excelUtilDemoCall {
	
	public static void main(String[] args) {
		
		Excel obj;
		obj = new Excel("C:\\Users\\satya\\OneDrive\\Desktop\\MobileAutomation\\AliExpressTestData.xlsx", "Sheet1");
		
		System.out.println(Excel.getrowcount());
		
		
	}

}
