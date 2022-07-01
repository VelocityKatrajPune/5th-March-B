package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.get("file:///D:/Velocity/Java%20Class/Aug-2021%20Class/Java%20notes/Webpage/table.html");
		
		Thread.sleep(1000);
		
		List<WebElement> NumOfRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> NumOfColumns = driver.findElements(By.xpath("//th"));
		
		int totalNumOfRows = NumOfRows.size();
		int totalNumOfColumns = NumOfColumns.size();
		
		System.out.println("Total number of rows are "+totalNumOfRows);
		System.out.println("Total number of columns are "+totalNumOfColumns);
	
	
		for(int i=1;i<=totalNumOfRows;i++)
		{
		  for(int j=1;j<=totalNumOfColumns;j++)
		  {
			 if(i==1)
			 {
				 	  String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					  System.out.print(text+" ");
			 }

			 else {
				 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				  System.out.print(text+" ");
			}
	  }
		  
		  System.out.println();

		}
		
	}

}
