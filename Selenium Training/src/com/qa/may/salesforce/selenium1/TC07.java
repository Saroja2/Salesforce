package com.qa.may.salesforce.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC07 {

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

	
		WebElement mySettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		act.moveToElement(mySettings).build().perform();
		mySettings.click();
		Thread.sleep(2000);

		
		WebElement personal=driver.findElement(By.id("PersonalInfo_font"));
		act.moveToElement(personal).build().perform();
		personal.click();
		Thread.sleep(4000);

	
		
		WebElement loginHistory=driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		act.moveToElement(loginHistory).build().perform();
		loginHistory.click();
		Thread.sleep(4000);
		

		driver.navigate().back();
		WebElement displayAndLayout=driver.findElement(By.id("DisplayAndLayout_font"));
		act.moveToElement(displayAndLayout).build().perform();
		displayAndLayout.click();
		Thread.sleep(4000);
		
		WebElement customizeMyTabs=driver.findElement(By.id("CustomizeTabs_font"));
		act.moveToElement(customizeMyTabs).build().perform();
		customizeMyTabs.click();
		Thread.sleep(2000);
		
		WebElement customApp = driver.findElement(By.xpath("//select[@id='p4']"));
		Select appDropdown = new Select(customApp);
		appDropdown.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(2000);
		
		WebElement availableTab = driver.findElement(By.id("duel_select_0"));
		Select availableTabdd = new Select(availableTab);
		availableTabdd .selectByVisibleText("Reports");
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.xpath("//img[contains(@class,'rightArrowIcon')]"));
		add.click();
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		act.moveToElement(save).build().perform();
		save.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		act.moveToElement(email).build().perform();	
		email.click();
		Thread.sleep(2000);
		
		WebElement emailSettings = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		act.moveToElement(emailSettings).build().perform();	
		emailSettings.click();
		Thread.sleep(2000);
		
		
		WebElement emailExternal = driver.findElement(By.xpath("//input[@id='use_external_email1']"));
		act.moveToElement(emailExternal).build().perform();	
		emailExternal.click();
		Thread.sleep(2000);
		

		WebElement senderName = driver.findElement(By.xpath("//input[@id='sender_name']"));
		act.moveToElement(senderName).build().perform();	
		senderName.clear();
		senderName.sendKeys("Saroja Potturi");
		Thread.sleep(2000);
		
		WebElement senderEmail = driver.findElement(By.xpath("//input[@id='sender_email']"));
		act.moveToElement(senderEmail).build().perform();	
		senderEmail.clear();
		senderEmail.sendKeys("Saroja_Potturi@yahoo.com");
		Thread.sleep(2000);
		
		WebElement bcc0 = driver.findElement(By.xpath("//input[@id='auto_bcc0']"));
		act.moveToElement(bcc0).build().perform();
		bcc0.click();
		
		WebElement bcc1 = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		act.moveToElement(bcc1).build().perform();
		bcc1.click();
	
		WebElement subscriptions = driver.findElement(By.className("titleSeparatingColon"));
		act.moveToElement(subscriptions).build().perform();
		WebElement bottomButtons = driver.findElement(By.xpath("//td[@id='bottomButtonRow']"));
		act.moveToElement(bottomButtons).build().perform(); 
		
		
		WebElement saveEmail = driver.findElement(By.cssSelector("body.hasMotif.setupTab.UserEmailPrefEdit.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer.setupV2 td.oRight div.bPageBlock.brandSecondaryBrd.bEditBlock.bLayoutBlock.secondaryPalette:nth-child(7) div.pbBottomButtons table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td.pbButtonb > input.btn.primary:nth-child(1)"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveEmail);
		
		act.moveToElement(saveEmail).build().perform();
		saveEmail.click(); 
		Thread.sleep(2000); 
		
		WebElement calendar = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", calendar);
		calendar.click();
		
		WebElement reminder = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		reminder.click();
		

		WebElement reminderAlert = driver.findElement(By.xpath("//input[@id='testbtn']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", reminderAlert);

		reminderAlert.click();
		
	}

}
