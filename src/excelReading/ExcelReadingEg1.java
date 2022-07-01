package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		
		String name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name1);
		
		String name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name2);

		double num1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(num1);
		
		double num2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(num2);
	
		boolean value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		System.out.println(value1);
		
		boolean value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(value2);
	
		System.out.println(WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue());
	
		
		
		
	}

}
