package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile {
//	public static void takeScreenshot(WebDriver driver) throws IOException
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String random= RandomString.make(3);
//		
//		File dest= new File("D:\\Velocity\\Java Class\\5th March B Batch\\Screenshot\\Screenshot"+random+".png");
//
//		FileHandler.copy(source, dest);
//	}
	
	public static String readDataFromProprty(String key) throws IOException
	{
		Properties prop= new Properties();
		
		FileInputStream myprop= new FileInputStream("C:\\Users\\yogendra\\eclipse-workspace\\5th_March_B_Selenuim\\myproperty.properties");
	
		prop.load(myprop);
		
		String value = prop.getProperty(key);
		
		return value;
	}

	public static void implicitWait(WebDriver driver,int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
}
