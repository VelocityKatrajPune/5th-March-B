package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(100);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));

		boolean result = textBox.isDisplayed();
		System.out.println("Text Box status is "+result);
		textBox.sendKeys("Hi GM");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		boolean result1 = textBox.isDisplayed();
		System.out.println("Text Box status is "+result1);
	}

}
