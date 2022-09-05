package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static String readExcelFile(int row, int cell) throws Exception
	{
		FileInputStream file1 = new FileInputStream("C:\\Users\\Bhavesh\\eclipse-workspace\\Framework\\TestData\\TestData framework.xlsx");
		Sheet excelSheet = WorkbookFactory.create(file1).getSheet("Sheet1");
		String dataReading = excelSheet.getRow(row).getCell(cell).getStringCellValue();
		return dataReading;
	}

}
