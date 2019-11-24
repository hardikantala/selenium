package testNGListerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGITestListener implements ITestListener{

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed - " + result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped - " + result.getName());		
	}

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started - " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Yippi!! Test case success - " + result.getName());		
	}

}
