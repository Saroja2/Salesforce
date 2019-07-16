package com.qa.may.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class SeleniumTraining {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Selenium Training");
		System.setProperty("webdriver.chrome.driver","/Users/Saroja/Documents/Seleniumtraining/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com");
		Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email_field']"));
		userName.sendKeys("admin123@gmail.com");
		
		WebElement userPassword = driver.findElement(By.id("password_field"));
		userPassword.sendKeys("admin123");
		
		WebElement userLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		userLoginButton.click();
		
		Thread.sleep(5000);
		WebElement homeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		homeTab.click();
		
		Thread.sleep(1000);
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//span[2]//input[1]"));
		femaleRadioButton.click();
		
		WebElement studentName  = driver.findElement(By.id("name"));
		studentName.sendKeys("Saroja");
		
		WebElement studentFatherName = driver.findElement(By.id("lname"));
		studentFatherName.sendKeys("RamaKrishna");
		
		WebElement selectCity = driver.findElement(By.id("city"));
		Select cityDropdown = new Select(selectCity);
		cityDropdown.selectByIndex(2);
		
		WebElement selectCourse =  driver.findElement(By.id("course"));
		Select courseDropdown = new Select(selectCourse);
		courseDropdown.selectByVisibleText("MBA");
		Thread.sleep(2000);
		courseDropdown.selectByValue("btech");
		

		WebElement linkSwitchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		
		Actions linkSwitch = new Actions(driver);
		linkSwitch.moveToElement(linkSwitchTo).build().perform();

		WebElement switchToWindow = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		switchToWindow.click(); 
		
		
		
		 WebElement linkSwitchTo1 = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		
		Actions linkSwitch1 = new Actions(driver);
		linkSwitch.moveToElement(linkSwitchTo1).build().perform();
		Thread.sleep(100);
		
		WebElement switchToAlert = driver.findElement(By.xpath("//a[contains(text(),'Alert')]"));
		switchToAlert.click();
		
		WebElement switchToPromtAlert = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		switchToPromtAlert.click();
		Thread.sleep(500);
		
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Saroja");
		Thread.sleep(2000);
		alert.accept();
		
		WebElement switchToPromtAlert1 = driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		switchToPromtAlert1.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();

		WebElement switchToWindowsAlert = driver.findElement(By.xpath("//button[contains(text(),'Window Alert')]"));
		switchToWindowsAlert.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println();
		System.out.println(alert1.getText());
		alert1.accept();
		
		WebElement linkSwitchTo2 = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		
		Actions linkSwitch2 = new Actions(driver);
		linkSwitch2.moveToElement(linkSwitchTo2).build().perform();
	
		WebElement switchToWindow1 = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		switchToWindow1.click();
		
		WebElement clickToOpenTabButton = driver.findElement(By.xpath("//a[1]//button[1]"));
		clickToOpenTabButton.click();
		
		String primaryWindow = driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) 
		{
			System.out.println("No of Handles: " + handle);
			driver.switchTo().window(handle);			
		}
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.switchTo().window(primaryWindow);
		
		WebElement clickToOpenNewWindowButton = driver.findElement(By.xpath("//a[2]//button[1]"));
		clickToOpenNewWindowButton.click();
		Thread.sleep(1000);
		String primaryWindow1 = driver.getWindowHandle();
		for(String handle1 : driver.getWindowHandles()) 
		{
			driver.switchTo().window(handle1);
		}
		Thread.sleep(1000);
		driver.switchTo().window(primaryWindow1);
		
		//moving to intractions tab
		WebElement userIntractionsTab = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		Actions intractionsTabLink = new Actions(driver);
		intractionsTabLink.moveToElement(userIntractionsTab).build().perform();
		
		//clicking on mouse hover link
		WebElement mouseHoverLink =  driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]"));
		mouseHoverLink.click();
	
		//Hover to mouseHover
		WebElement mouseHoverButton = driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
		Actions mouseHovering = new Actions(driver);
		mouseHovering.moveToElement(mouseHoverButton).build().perform();
		
		WebElement mHTabsLink = driver.findElement(By.xpath("//div[@class='dropdown login']//a[contains(text(),'Tabs')]"));
		Actions mHTabs = new Actions(driver);
		mHTabs.moveToElement(mHTabsLink).build().perform();
	
		
		Thread.sleep(5000);
		driver.quit();
	
	
	}
}
