package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//to set position we need to create object of point class
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p= new Point(200, -100);
		Thread.sleep(2000);
		driver.manage().window().setPosition(p);

	}

}
