package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	}

}
