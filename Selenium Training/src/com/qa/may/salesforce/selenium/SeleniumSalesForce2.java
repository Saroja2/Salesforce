package com.qa.may.salesforce.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumSalesForce2 {

	static ExtentReports reports;
	static ExtentTest logger;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		
		WebDriver driver;
		driver = new FirefoxDriver();
		
		
		String fileName1 = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		String path = "/Users/Saroja/Documents/Seleniumtraining/" + fileName1;
		
		reports = new ExtentReports(path);
		logger =reports.startTest("SFDCLogin TestCase_2");
		
		driver.get("https://www.salesforce.com");
		logger.log(LogStatus.INFO, "Application is up and running..");
      	
		Thread.sleep(9000);
		


		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		//Thread.sleep(5000);
		Actions loginAction = new Actions(driver);
		loginAction.moveToElement(userLogin).build().perform();
		
		//Thread.sleep(5000);
		userLogin.click();
		
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
	    logger.log(LogStatus.INFO,"Enter Username Passed successfully");
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	    logger.log(LogStatus.INFO,"Enter Password Field Empty");
	    
		WebElement Login =driver.findElement(By.id("Login"));
		Login.click();
		Thread.sleep(5000);
		
		logger.log(LogStatus.INFO, "Clicked on Login Button successfully");
		logger.log(LogStatus.PASS, "SFDCLogin testcase passed successfully");

		reports.endTest(logger);
		reports.flush();
		
		driver.quit();
		
	}

}
