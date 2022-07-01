package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet mySheet;
		
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("lauching url",true);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		login= new KiteLoginPage(driver);
		home= new KiteHomePage(driver);
		pin= new KitePinPage(driver);
		File MyFile=new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		mySheet=WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		
	}
	@BeforeMethod
	public void loginToKite() 
	{
		
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username", true);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Password",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending PIN",true);
		pin.clickOnContinueButton();
		Reporter.log("Clicking on continue button",true);
	}
	@Test
	public void verifyKiteUserName() 
	{
		// expected uSernAMe--> excell
		//actual userNAme???
		String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String actualUserID = home.getActulUserID();
		Reporter.log("Validating user ID on login button",true);
		Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
		Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", true);
		
		
	}
	@AfterMethod 
	public void logOutFromKiteApp() throws InterruptedException
	{

		home.clickOnLogoutButton();
		Reporter.log("Logging out.......",true);
		
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing browser", true);
		driver.close();
	}
}
