package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Velocity");
		
		Actions act= new Actions(driver);
		
		//act.sendKeys(textBox, "Pune").perform();
		
		act.keyDown(textBox, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
		
		
	}

}
