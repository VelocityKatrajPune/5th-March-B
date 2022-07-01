package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyfirstSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
	//	driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
