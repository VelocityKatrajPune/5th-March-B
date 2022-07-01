package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void myTC() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));

  
//		if(checkBox1.isSelected())
//		{
//			Reporter.log("TC is passed", true);
//		}
//		
//		else {
//			Reporter.log("TC is failed", true);
//		}
  
		checkBox1.click();
		Thread.sleep(100);
		Assert.assertTrue(checkBox1.isSelected(), "CheckBox is not Selected TC is faild");
		Reporter.log("CheckBox is Selected TC is Passed", true);
  
  }
}
