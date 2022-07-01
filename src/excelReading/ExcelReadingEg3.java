package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	// reading whole row
		
		
//		for(int i=0;i<=3;i++)// static coding
//		{
//		String value = mysheet.getRow(0).getCell(i).getStringCellValue();
//		System.out.println(value);
//		}
		
		int lastRowNum = mysheet.getLastRowNum();
		int totalRowCount = lastRowNum;
		
		int lastCellNum = mysheet.getRow(0).getLastCellNum();
		int totalCellCount = lastCellNum-1;
		
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		
	
		for(int i=0;i<=totalCellCount;i++)// dynamic coding
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}

}
