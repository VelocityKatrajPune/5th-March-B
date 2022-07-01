package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		
		String actualText = ele.getText();
		
		String expectedtext="VELOCITY CORPORATE TRAINING CENTER";
		
		if(actualText.equals(expectedtext))
		{
			System.out.println("text is matching Tc is passed");
		}

		else {
			System.out.println("text is not matching TC is failed");
		}
	}

}
