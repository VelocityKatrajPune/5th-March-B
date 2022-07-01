package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test
  public void myTest() 
  {
	  Reporter.log("Test Method is running", true);
  }
  
  @Test
  public void myTest1() 
  {
	  Reporter.log("Test Method1 is running", true);
  }
  
  @BeforeMethod()
  public void logIn()
  {
	  Reporter.log("Before method is running", true);
  }
  
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("After method is running", true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Before class is running", true);  
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("After class is running", true);  
  }
}
