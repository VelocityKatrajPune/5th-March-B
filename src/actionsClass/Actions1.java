package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//move to element using mouse actions
		Actions act= new Actions(driver);
		WebElement MyElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		act.moveToElement(MyElement).perform();
		
		//click using mouse actions
		
		WebElement testElement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		//1st way
//		act.moveToElement(testElement).perform();
//		act.click().perform();
		
		//2nd
		//act.moveToElement(testElement).click().build().perform();
		
		//3rd 
		
		//act.click(testElement).perform();
		
		
		//right click--context click
		
		//act.moveToElement(testElement).contextClick().build().perform();
		
		act.contextClick(testElement).perform();
		
		
	}

}
