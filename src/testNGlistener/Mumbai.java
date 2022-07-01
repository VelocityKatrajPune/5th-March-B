package testNGlistener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai {
  @Test
  public void Sanpada() 
  {
	  Reporter.log("Sanpada TC is running", true);
  }
  
  @Test
  public void ghanSoli()
  {
	  Reporter.log("ghanSoli TC is running", true);
  }
}
