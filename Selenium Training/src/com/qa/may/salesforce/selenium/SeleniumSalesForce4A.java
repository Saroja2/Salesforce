package com.qa.may.salesforce.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSalesForce4A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver =new  FirefoxDriver();
		
		driver.get("https://www.salesforce.com");
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(userLogin).build().perform();
		
		Thread.sleep(5000);
		userLogin.click();
		
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
	    //logger.log(LogStatus.INFO,"Enter Username Passed successfully");
	    
	    WebElement forgotPassword = driver.findElement(By.id("forgot_password_link"));
	    action.moveToElement(forgotPassword).build().perform();
	    forgotPassword.click();
	   // logger.log(LogStatus.INFO,"Enter Password Passed Successfully");
	    
	    driver.quit();
		
	}

}
