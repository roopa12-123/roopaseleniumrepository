 package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementationClass implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test script got failed",true);
	}
	
}
