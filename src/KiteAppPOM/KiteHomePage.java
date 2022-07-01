package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	
	//1. data members
	 
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;

	//2. constructor
	 public KiteHomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	 //3. methods
	 
	 public String getActulUserID()
	 {
		 String actualUserID = userID.getText();
		 return actualUserID;
	 }
	 
	 public void validateUserID(String expectedUsername)
	 {
		 String actualUserID = userID.getText();
		 String expetctedUserID = expectedUsername;
		 
		 if(actualUserID.equals(expetctedUserID))
		 {
			 System.out.println("User ID matching TC is Passed");
		 }
		 
		 else {
			 System.out.println("User ID not matching TC is Failed");

		}
		 
		 
	 }
	
	 public void clickOnLogoutButton() throws InterruptedException
	 {
		 userID.click();
		 Thread.sleep(200);
		 logOutButton.click();
	 }
	
	
}
