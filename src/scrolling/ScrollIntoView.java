package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(100);
		WebElement HideShowButton = driver.findElement(By.id("hide-textbox"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		j.executeScript("arguments[0].scrollIntoView(true);",HideShowButton);
		Thread.sleep(100);
		HideShowButton.click();
	}

}
