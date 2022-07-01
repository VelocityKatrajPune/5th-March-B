package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);

		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(day);
		
//		3.	By using one of the select class methods we can select values form list box like 
//		i. selectByVisibleText: selectByVisibleText(String arg0) 
//		ii. selectByIndex: selectByIndex(int arg0) 
//		iii. selectByValue: selectByValue(String arg0)
		
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(100);
			s.selectByIndex(i);
		}
		
		for(int i=9;i>=0;i--)
			{
			Thread.sleep(100);
			s.selectByIndex(i);
			}

		boolean result = s.isMultiple();
		System.out.println("Multiple selection availabe result is "+result);
	
		for(int i=0;i<=30;i++)//0
		{		
		System.out.println(s.getOptions().get(i).getText());
		}
	}

}
