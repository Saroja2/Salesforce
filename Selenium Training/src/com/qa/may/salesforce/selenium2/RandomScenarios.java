package com.qa.may.salesforce.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RandomScenarios {

	
	public void TC33() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(6000);
		
		WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
		act.moveToElement(home).build().perform();
		home.click();
		Thread.sleep(3000);
		
		WebElement myLink = driver.findElement(By.xpath("//a[contains(text(),'saroja Potturi')]"));
		act.moveToElement(myLink).build().perform();
		myLink.click();
		
		
	}
	
	public void TC34() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(6000);
		
		WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
		act.moveToElement(home).build().perform();
		home.click();
		Thread.sleep(3000);
		
		WebElement myLink = driver.findElement(By.xpath("//a[contains(text(),'saroja Potturi')]"));
		act.moveToElement(myLink).build().perform();
		myLink.click();
		Thread.sleep(3000);
		
		
		WebElement editLink = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		act.moveToElement(editLink).build().perform();
		editLink.click();
		
		driver.switchTo().frame(0);
		System.out.println("I am inside a frame");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		System.out.println("I am inside second frame");
		Thread.sleep(3000);
		
		WebElement aboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		act.moveToElement(aboutTab).build().perform();
		aboutTab.click();
		Thread.sleep(3000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		act.moveToElement(lastName).build().perform();
		lastName.clear();
		lastName.sendKeys("ABCD");
		Thread.sleep(3000);

		WebElement saveAll = driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		act.moveToElement(saveAll).build().perform();
		saveAll.click();
		
	}//img[@class='allTabsArrow']
	
	public void TC35() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(6000);
		
		 
	    WebElement plus =driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	    act.moveToElement(plus).build().perform();
		plus.click();  
		Thread.sleep(3000);
		 
	    WebElement customizeMyTab =driver.findElement(By.xpath("//input[@name='customize']"));
	    act.moveToElement(customizeMyTab).build().perform();
	    customizeMyTab.click();
	    Thread.sleep(3000);
	    
	    WebElement selectedTabs =driver.findElement(By.xpath("//select[@id='duel_select_1']"));
	    Select selectedTabsdd = new Select(selectedTabs);
	    selectedTabsdd.selectByVisibleText("Opportunities");
	    Thread.sleep(3000);
	    
	    WebElement selectionRemove =driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
	    act.moveToElement(selectionRemove).build().perform();
	    selectionRemove.click();
	    Thread.sleep(3000);
	    
	    WebElement save =driver.findElement(By.xpath("//input[@name='save']"));
	    act.moveToElement(save).build().perform();
	    save.click();
	    Thread.sleep(3000);
	    
	    WebElement userMenu =driver.findElement(By.xpath("//span[@id='userNavLabel']"));
	    act.moveToElement(userMenu).build().perform();
	    userMenu.click();
	    Thread.sleep(1000);
	    
	    WebElement logout =driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	    act.moveToElement(logout).build().perform();
	    logout.click();
	}
	
	public void TC36() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(6000);
		
		WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
		act.moveToElement(home).build().perform();
		home.click();
		Thread.sleep(3000);
		
		WebElement currentDate = driver.findElement(By.xpath("//a[@href='/00U/c?md3=193&md0=2019']"));
		act.moveToElement(currentDate).build().perform();
		currentDate.click();
		Thread.sleep(3000);
		
		WebElement pmlink = driver.findElement(By.id("p:f:j_id25:j_id61:4:j_id64"));
		act.moveToElement(pmlink).build().perform();
		pmlink.click();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		WebElement comboBox = driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		act.moveToElement(comboBox).build().perform();
		comboBox.click();
		Thread.sleep(3000);
		
		
		for(String child : driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}
		
		WebElement comboBoxLink = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		act.moveToElement(comboBoxLink).build().perform();
		comboBoxLink.click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		WebElement endTime = driver.findElement(By.id("EndDateTime_time"));
		act.moveToElement(endTime).build().perform();
		endTime.click();
		
	
		WebElement pmTime = driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",pmTime );
		pmTime.click();
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",save);
	    save.click();
	    
	    
		
	}
	
	public void TC37() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(6000);
		
		WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
		act.moveToElement(home).build().perform();
		home.click();
		Thread.sleep(3000);
		
		WebElement currentDate = driver.findElement(By.xpath("//a[@href='/00U/c?md3=193&md0=2019']"));
		act.moveToElement(currentDate).build().perform();
		currentDate.click();
		Thread.sleep(3000);
		
		WebElement fourPm = driver.findElement(By.id("p:f:j_id25:j_id61:20:j_id64"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", fourPm );
		fourPm.click();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		WebElement comboBox = driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
		act.moveToElement(comboBox).build().perform();
		comboBox.click();
		Thread.sleep(3000);
		
		
		for(String child : driver.getWindowHandles())
		{
			driver.switchTo().window(child);
		}
		
		WebElement comboBoxLink = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		act.moveToElement(comboBoxLink).build().perform();
		comboBoxLink.click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		WebElement endTime = driver.findElement(By.id("EndDateTime_time"));
		act.moveToElement(endTime).build().perform();
		endTime.click();
		
	
		WebElement pmTime = driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",pmTime );
		pmTime.click();
		Thread.sleep(3000);
		
		
		
		WebElement reccuringEvent = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",reccuringEvent );		
		reccuringEvent.click();
		Thread.sleep(3000);		
		
	}
		
	public static void main(String[] args) throws InterruptedException {
		
		RandomScenarios rs = new RandomScenarios();
		//rs.TC33();
		//rs.TC34();
		//rs.TC35();
		//rs.TC36();
		rs.TC37();
	}

}
