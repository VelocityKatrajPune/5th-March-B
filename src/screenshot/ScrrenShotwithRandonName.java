package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrrenShotwithRandonName {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		String random= RandomString.make(3);
		
		File dest= new File("D:\\Velocity\\Java Class\\5th March B Batch\\Screenshot\\testScreenshot"+random+".png");

		FileHandler.copy(source, dest);
	}

}
