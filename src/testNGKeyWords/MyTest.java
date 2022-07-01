package testNGKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
	@Test
	  public void D() 
	  {
		  
		  Reporter.log("D is running", true);
		  
	  }
	@Test(priority = -1, timeOut = 900, enabled = true, dependsOnMethods = {"A"})
	
public void C() 
{
	  Reporter.log("C is running", true);
	  
}
	@Test
	  public void A() 
	  {
		  Reporter.log("A is running", true);
		  
	  }
}
