package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithExcel {

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File MyFile=new File("D:\\Velocity\\Java Class\\5th March B Batch\\5thMarchTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		WebElement userName = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		userName.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		pin.sendKeys(PIN);
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String actualUserID = userId.getText();
		String expectedUserID=UN;
		
		if (actualUserID.equals(expectedUserID))
		
		{
		System.out.println("User ID matching TC is passed");	
		}
		else {
			System.out.println("User ID not matching TC is failed");
		}
		
		userId.click();
		Thread.sleep(1000);
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		Thread.sleep(1000);
		driver.close();
	
	}

	}


