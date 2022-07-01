package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("-incognito");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File MyFile=new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		String userName = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		String Kitepin = mySheet.getRow(0).getCell(2).getStringCellValue();

		KiteLoginPage login= new KiteLoginPage(driver);
		//login.sendUserName(userName);
	
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPassword(password);
		login.clickOnLoginButton();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(Kitepin);
		pin.clickOnContinueButton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserID(userName);
		home.clickOnLogoutButton();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}

}
