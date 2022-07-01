package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass
{
  @Test
  public void myMethod1()
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("myMethod1 is running");
		
  }
  @Test
  public void myMethod3()
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		Reporter.log("myMethod3 is running");
  }
	@Test
		  public void myMethod2()
		  {
			  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://kite.zerodha.com/");
				Reporter.log("myMethod2 is running", true);
				
		  }
		 
  }

