package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		Workbook Book = WorkbookFactory.create(MyFile);
		Sheet sheet = Book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}
