package KiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasses 
{
	protected WebDriver driver;
	//browser setup
	
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
}
