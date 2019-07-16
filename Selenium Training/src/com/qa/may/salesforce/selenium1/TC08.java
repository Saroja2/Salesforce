package com.qa.may.salesforce.selenium1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC08 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		
	
		driver = new FirefoxDriver();
		
		driver.get("https://www.salesforce.com");
		
		Thread.sleep(5000);
		

	
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		Thread.sleep(6000);
		Actions act = new Actions(driver);
		act.moveToElement(userLogin).build().perform();
		
		//Thread.sleep(5000);
		userLogin.click();
		
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	    
	    
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click(); 
		Thread.sleep(1000);
		
		String parent = driver.getWindowHandle();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);

		WebElement devConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
		act.moveToElement(devConsole).build().perform();
		devConsole.click();
		
	/*	Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		for(String child : allWindows) 
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(10000);
			} driver.close();
		}
		
		driver.switchTo().window(parent); */
		
		for(String handle1 : driver.getWindowHandles()) 
		{
			driver.switchTo().window(handle1);
			Thread.sleep(4000);
		
		}
		driver.close();
		driver.switchTo().window(parent);
		

	}

}
