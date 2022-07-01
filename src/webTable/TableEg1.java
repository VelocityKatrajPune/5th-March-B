package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Velocity/Java%20Class/Aug-2021%20Class/Java%20notes/Webpage/table.html");
		
		Thread.sleep(5000);
		
		WebElement text = driver.findElement(By.xpath("//td[text()=' manual ']"));
		System.out.println(text.getText());
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table//th"));

		for(WebElement th:tableHeader)
		{
			System.out.print(th.getText()+" ||");
		}
		System.out.println();
		List<WebElement> row4 = driver.findElements(By.xpath("//table//tr[4]"));
		for(WebElement r:row4)
		{
			System.out.print(r.getText()+" ||");
		}
	
	
	}

}
