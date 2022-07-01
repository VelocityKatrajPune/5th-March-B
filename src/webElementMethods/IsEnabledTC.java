package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsEnabledTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(200);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));

		if(OTPButton.isEnabled())
		{
			OTPButton.click();
		}
		else {
		
			System.out.println("Entering mobile number");
			driver.findElement(By.name("mobileNumber")).sendKeys("8888888888");
			Thread.sleep(100);
			if(OTPButton.isEnabled())
			{
				OTPButton.click();
			}
			else {
				System.out.println("Failed to click OTP button");
			}
		}
	}

}
