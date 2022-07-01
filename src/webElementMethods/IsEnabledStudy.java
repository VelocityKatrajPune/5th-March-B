package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

		Thread.sleep(1000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		boolean result = OTPButton.isEnabled();
		
		System.out.println("OTP button status is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		
		Thread.sleep(100);
		
		boolean result1 = OTPButton.isEnabled();
		
		System.out.println("OTP button status is "+result1);
		
	
	}

}
