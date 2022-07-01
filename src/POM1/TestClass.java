package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Java Class\\5th March B Batch\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage login= new KiteLoginPage(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserID();
		home.clickOnLogoutButton();
		
		
		driver.close();
		
		
		
		
		
	}

}
