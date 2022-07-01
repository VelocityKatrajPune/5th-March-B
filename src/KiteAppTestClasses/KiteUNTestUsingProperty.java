package KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClassUsingProperty;
import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteAppUtility.UtilityUsingPropertyFile;
@Listeners(testNGlistener.Listener.class)
public class KiteUNTestUsingProperty extends BaseClassUsingProperty {
 
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login = new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile.readDataFromProprty("UN"));
		login.sendPassword(UtilityUsingPropertyFile.readDataFromProprty("PWD"));
		login.clickOnLoginButton();
		
		UtilityUsingPropertyFile.implicitWait(driver, 200);
		
		pin.sendPin(UtilityUsingPropertyFile.readDataFromProprty("PIN"));
		pin.clickOnContinueButton();
		UtilityUsingPropertyFile.implicitWait(driver, 200);
	}
	
	@Test
  public void ValidateUserName() throws IOException 
	{
		
		String actualUserID=home.getActulUserID();
		String expectedUserID = UtilityUsingPropertyFile.readDataFromProprty("UN1");
		
		Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected are not matching, TC is failed");
		Reporter.log("Actual and Expected are matching, TC is PASSED", true);
		//UtilityUsingPropertyFile.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.clickOnLogoutButton();
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}
