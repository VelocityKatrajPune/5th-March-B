package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolleg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().maximize();
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(90,900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(90,-900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(10,-900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(-90,-900)");

		
		
		

	}

}
