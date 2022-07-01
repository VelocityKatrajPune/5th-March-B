package testNGlistener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteAppBaseClass.BaseClassUsingProperty;


public class Listener implements ITestListener
{
	BaseClassUsingProperty b= new BaseClassUsingProperty();// created object of Base class
	
	//ontestPAss
	//ontestFail
	//onTestsucess
	//onTestSkipp
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String TCname = result.getName();
		try {
			b.takeScreenshot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is sucess",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is "+result.getName(),true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is skipped, please check dependent TC",true);
		Reporter.log("Skipped TC is "+result.getName(),true);
		ITestListener.super.onTestSkipped(result);
	}
}
