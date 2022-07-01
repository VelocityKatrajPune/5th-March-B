package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//To take screenshot using selenium webdriver, we need to type cast driver object to Takes Screenshot interface.
		//Then we need call function getscreenshotAs(); there we need to pass the argument 
		//"Outputtype. FILE"

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination=new File("D:\\Velocity\\Java Class\\5th March B Batch\\Screenshot\\myscreenshot.png");
		
		FileHandler.copy(source, destination);
		
	}

}
