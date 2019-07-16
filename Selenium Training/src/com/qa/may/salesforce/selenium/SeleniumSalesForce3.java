package com.qa.may.salesforce.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumSalesForce3 {
	

	static ExtentReports reports;
	static ExtentTest logger;
	

	public static void main(String[] args) throws InterruptedException {
		
		
		//options.addArguments("--disable-notifications");
		
		//HashMap<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
	//	prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
		//FirefoxOptions options = new FirefoxOptions();

        // Set the experimental option
		//options.setCapability("prefs", prefs);

        // pass the options object in Chrome driver

		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		
	
		driver = new FirefoxDriver();
		
		
		//String fileName1 = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		//String path = "/Users/Saroja/Documents/Seleniumtraining/" + fileName1;
		
		//reports = new ExtentReports(path);
		//logger =reports.startTest("SFDCLogin TestCase_3");
		
		driver.get("https://www.salesforce.com");
		//logger.log(LogStatus.INFO, "Application is up and running..");
      	
		Thread.sleep(9000);
		

	
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		//Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(userLogin).build().perform();
		
		//Thread.sleep(5000);
		userLogin.click();
		
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
	    //logger.log(LogStatus.INFO,"Enter Username Passed successfully");
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	   // logger.log(LogStatus.INFO,"Enter Password Passed Successfully");
	    
	    WebElement rememberMe = driver.findElement(By.id("rememberUn"));
	    rememberMe.click();
	   // logger.log(LogStatus.INFO, "Clicked on RememberMe checkBox successfully");
	   
	    Thread.sleep(5000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='https://login.salesforce.com/login/sessionserver212.html']")));
		
		System.out.println("I am in iframe");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement close = driver.findElement(By.id("tryLexDialogX"));
	
		close.click();
		
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		act.moveToElement(logout).build().perform();
		logout.click();
	
	
		//logger.log(LogStatus.INFO, "Clicked on Login Button successfully");
		//logger.log(LogStatus.PASS, "SFDCLogin testcase passed successfully");

		//reports.endTest(logger);
		//reports.flush();
		Thread.sleep(2000);
		//driver.quit();
		
		

		
	}

}
