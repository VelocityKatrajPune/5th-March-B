package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		userName.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		pin.sendKeys("982278");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String actualUserID = userId.getText();
		String expectedUserID="ELR321";
		
		if (actualUserID.equals(expectedUserID))
		
		{
		System.out.println("User ID matching TC is passed");	
		}
		else {
			System.out.println("User ID not matching TC is failed");
		}
		
		userId.click();
		Thread.sleep(1000);
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		Thread.sleep(1000);
		driver.close();
	
	}

}
