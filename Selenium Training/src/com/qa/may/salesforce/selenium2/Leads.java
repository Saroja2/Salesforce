package com.qa.may.salesforce.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Leads {
	
	public void TC20() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	//	parentWindow = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		act.moveToElement(userLogin).build().perform();
		userLogin.click();
	
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(4000);
		
		
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);
	
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
	}
	
	public void TC21() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	//	parentWindow = driver.getWindowHandle();
		
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
		Thread.sleep(4000);
		
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		WebElement leadsList = driver.findElement(By.xpath("//select[@id='fcf']"));
		act.moveToElement(leadsList).build().perform();
		leadsList.click();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);
	
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
		
	}
	
	public void TC22() throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com");
		Thread.sleep(9000);
	//	parentWindow = driver.getWindowHandle();
		
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
		Thread.sleep(4000);
	
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		WebElement leadsList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select leadsListdd = new Select(leadsList);
		leadsListdd.selectByVisibleText("Today's Leads");
		
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);
	
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		Thread.sleep(5000);

		userName = driver.findElement(By.id("username"));
	    userName.sendKeys("saroja_potturi-pfwc@force.com");
		Thread.sleep(3000);
	    
	    userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("Jun!2019");
	
	    Thread.sleep(3000);
	   
	    Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(4000);

		leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		
		
		WebElement gobutton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		act.moveToElement(gobutton).build().perform();
		gobutton.click();
		Thread.sleep(2000);
			
	}
	
	
	public void TC23() throws InterruptedException 
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
		Thread.sleep(4000);
	
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		WebElement leadsList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select leadsListdd = new Select(leadsList);
		leadsListdd.selectByVisibleText("Today's Leads");
		
		Thread.sleep(2000);
		
	}
	
	public void TC24() throws InterruptedException 
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
		Thread.sleep(4000);
	
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		act.moveToElement(leads).build().perform();
		leads.click();
		Thread.sleep(2000);
		
		WebElement leadsList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select leadsListdd = new Select(leadsList);
		leadsListdd.selectByVisibleText("Today's Leads");
		
		Thread.sleep(2000);
		
		WebElement newLead = driver.findElement(By.xpath("//input[@name='new']"));
		act.moveToElement(newLead).build().perform();
		newLead.click();
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		act.moveToElement(lastName).build().perform();
		lastName.clear();
		lastName.sendKeys("ABCD");
		
		WebElement companyName = driver.findElement(By.xpath("//input[@id='lea3']"));
		act.moveToElement(companyName).build().perform();
		companyName.clear();
		companyName.sendKeys("ABCD");
		
		WebElement saveLead = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		act.moveToElement(saveLead).build().perform();
		saveLead.click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		Leads ls = new Leads();
	//	ls.TC20();
	//	ls.TC21();
	//  ls.TC22();
	//	ls.TC23();
	    ls.TC24();

	}
}