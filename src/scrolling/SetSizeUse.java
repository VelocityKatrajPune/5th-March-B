package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(100);
		System.out.println(driver.manage().window().getSize());
		
		//to set size--> create object of dimension class
		
		Dimension d= new Dimension(1170, 400);
		
		driver.manage().window().setSize(d);
		
		

	}

}
