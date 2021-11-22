package com.mindtree.com.utilities;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting implements ITestListener{
	
	ExtentReports extent;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	
	

	public void onTestStart(ITestResult result) {
		
	String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	System.out.println(timeStamp+"-----------");
	String repName="Test-Report"+timeStamp+".html";
	System.out.println(repName);
	

	reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Host name", "local Host");
	extent.setSystemInfo("Envirnmont", "QA");
	extent.setSystemInfo("user", "YASH");
	
	reporter.config().setDocumentTitle("HealthCare Automation Testing");
	reporter.config().setReportName("Functional Test Report");
	reporter.config().setTheme(Theme.DARK);
	
	
		
	}

	public void onTestSuccess(ITestResult result) {
	test=extent.createTest(result.getName());
	test.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));

		
	
	}

	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		//captureScreenShot(driver, "login");
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	
	}

}

