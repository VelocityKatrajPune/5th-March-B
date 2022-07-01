package xmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MyTest {
	// I want 1 3 5, I dont want 2,4
	
	@Test
	  public void myMethod1()
	  {
		Assert.fail();
		  Reporter.log("my Method1 is Running",true);
	  }
	
	@Test
	  public void myMethod2()
	  {
		  Reporter.log("my Method2 is Running",true);
	  }
	
	@Test
	  public void myMethod3()
	  {
		//Assert.fail();
		  Reporter.log("my Method3 is Running",true);
	  }
	
	@Test
	  public void myMethod4()
	  {
		  Reporter.log("my Method4 is Running",true);
	  }
	
	@Test
	  public void myMethod5()
	  {
		  Reporter.log("my Method5 is Running",true);
	  }
		

}
