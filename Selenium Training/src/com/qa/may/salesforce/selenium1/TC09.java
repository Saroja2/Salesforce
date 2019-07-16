package com.qa.may.salesforce.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC09 {

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

		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
	}

}
