package com.util1;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {
	
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() {
	
	ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/APIReport.html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		
		
		report.flush();
	}

}
