package com.qa.may.salesforce.selenium;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportSample {
	
	static ExtentReports reports;
	static ExtentTest logger;

	public static void main(String[] args) {

		String fileName = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		String path = "/Users/Saroja/Documents/Seleniumtraining/" + fileName;
		
		reports = new ExtentReports(path);
		logger =reports.startTest("LoginPage TestCase");
		
		logger.log(LogStatus.INFO,"Enter Username Passed successfully");
		logger.log(LogStatus.INFO,"Enter Password Passed succesfully");
		logger.log(LogStatus.INFO, "Clicked on Login Button successfully");
		
		logger.log(LogStatus.PASS, "LoginPage testcase passed successfully");
		
		
		reports.endTest(logger);
		reports.flush();
		
		
	}

}
//String fileName = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmmss'.html'".format(new Date());

//String fileName = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmmss'.html'".format(new Date());	