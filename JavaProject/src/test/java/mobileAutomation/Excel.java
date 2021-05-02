package mobileAutomation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	XSSFWorkbook workbook;
	static XSSFSheet sheet;



	public  Excel(String path, String sheetName) {

		try {
			workbook = new XSSFWorkbook("C:\\Users\\satya\\eclipse-workspace\\JavaProject\\testdata\\testdata.xlsx");
			sheet=workbook.getSheet("Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}



	public static int getrowcount() {


		int rowcount= sheet.getPhysicalNumberOfRows();

		return rowcount;



	}

	public static int getcolcount() {


		int colcount= sheet.getRow(0).getPhysicalNumberOfCells();
		return colcount;



	}

	public static String getCellDataString(int rownum,int colnum) {


		String Value= sheet.getRow(rownum).getCell(colnum).getStringCellValue();

		return Value;




	}
}
