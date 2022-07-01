package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		Alert alt = driver.switchTo().alert();
		
		//2.Alert is an interface which contains abstract methods like
		
		System.out.println(alt.getText());//use to get text present in a alert popup.
		
		alt.accept();//use to click on ok button.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(8000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
	}

}
