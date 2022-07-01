package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import KiteAppUtility.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingProperty 
{
	protected static WebDriver driver;
	//browser setup
	
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityUsingPropertyFile.readDataFromProprty("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
	
	public  void takeScreenshot(String TCName) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		File dest= new File("D:\\Velocity\\Java Class\\5th March B Batch\\Screenshot\\"+TCName+".png");

		FileHandler.copy(source, dest);
	}
	
	
}
