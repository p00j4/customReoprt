package com.pooja.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
	// WebDriver driver=null;

	@Override
	public void onTestFailure(ITestResult result) {
		/**
		 * want to get the enclosing method name
		 * where failure occured and this function got called from
		 *  but all of below returns @Test method name i.e. "testBooking"
		 **/
		
		System.out.println("***** Error " + result.getName()
				+ " test has failed *****");
		String methodName = result.getName().toString().trim();
		System.out.println(methodName);
		System.out.println(result.getTestName());
		System.out.println("method name ="
				+ result.getMethod().getConstructorOrMethod().getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("on start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on success " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on skip " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on onTestFailedButWithinSuccessPercentage "
				+ result.getMethod().getMethodName());
	}

	public void onStart(ITestContext context) {
		System.out.println("on onStart " + context.getName());
	}
}