package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class testNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("*****  Test Started:    "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****  Test Successful:    "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****  Test Failed:    "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****  Test Skipped:    "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("*****  Test Finished:    "+context.getName());
		
	}
	

}

