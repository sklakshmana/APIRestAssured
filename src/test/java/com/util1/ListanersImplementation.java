package com.util1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;

public class ListanersImplementation implements ITestListener
{
	
	ExtentReports report;

	
	public void onTestStart(ITestResult result) {
		
		
	}

	
	public void onTestSuccess(ITestResult result) {

		
	}

	
	public void onTestFailure(ITestResult result) {
	
		
	}


	public void onTestSkipped(ITestResult result) {

		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	
	public void onStart(ITestContext context) {
		
		//report=ExtentReportNG.setupExtentReport();
				
	}


	public void onFinish(ITestContext context) {
		
		
	}

}
