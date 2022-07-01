package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read total sheet
		
		File MyFile = new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");

		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		// read total sheet using static coding
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
			System.out.println();
		}
	}

}
