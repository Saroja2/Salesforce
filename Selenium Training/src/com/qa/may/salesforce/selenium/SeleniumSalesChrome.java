package com.qa.may.salesforce.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSalesChrome {
	public static void enterText(WebElement obj, String text, String objName) {
		if(obj.isEnabled())	{
			obj.sendKeys(text);
			System.out.println("Pass:" + text + "is entered in " + objName + "field..");
		}
		else 
			System.out.println("Fail" + text + "is disabled " + objName + "field..");
		}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","/Users/Saroja/Documents/Seleniumtraining/chromedriver");
		WebDriver driver;
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		//Thread.sleep(5000);
		
	
		WebElement loginDropDown = driver.findElement(By.className("global-nav-login-flydown"));
		Actions act = new Actions(driver);
		act.moveToElement(loginDropDown).build().perform();
		loginDropDown.click();
		
		
		
		
		
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
		Thread.sleep(25000);
		
	
		WebElement logoutIcon = driver.findElement(By.className("uiImage"));
		System.out.println("uiImage  ... ");
	
		Actions logoutImage = new Actions(driver);
		logoutImage.moveToElement(logoutIcon).build().perform();
		System.out.println("After move to  ... ");
		logoutImage.click();
	
		
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logoutIcon);
		System.out.println("After logoutIcon.click  ... " + logoutIcon);

		logoutIcon.click();
		System.out.println("After logoutIcon.click  ... " + logoutIcon);
		Thread.sleep(5000);
		
		WebElement logout = driver.findElement(By.className("profile-link-label logout uiOutputURL"));
		logout.click();
		
	//	Alert alert = driver.switchTo().alert();
	//	alert.dismiss();
	/*	String primaryWindow = driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) 
		{
			System.out.println("No of Handles: " + handle);
			driver.switchTo().window(handle);			
		} */
	
		
		

	}

}
