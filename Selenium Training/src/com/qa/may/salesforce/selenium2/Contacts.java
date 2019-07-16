package com.qa.may.salesforce.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contacts {

	public void TC25() throws InterruptedException 
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
		Thread.sleep(5000);

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		
		WebElement newContact =driver.findElement(By.xpath("//input[@name='new']"));
		act.moveToElement(newContact).build().perform();
		newContact.click();
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		act.moveToElement(lastName).build().perform();
		lastName.sendKeys("Krishna");
		
		String parent = driver.getWindowHandle();
		
		WebElement accountName = driver.findElement(By.xpath("//a[@id='con4_lkwgt']//img[@class='lookupIcon']"));
		act.moveToElement(accountName).build().perform();
		accountName.click();
		Thread.sleep(3000);
		
		for(String child : driver.getWindowHandles())
				{
					driver.switchTo().window(child);
				}
		 Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
		

		WebElement accountSrch = driver.findElement(By.id("lksrch"));
		act.moveToElement(accountSrch).build().perform();
		accountSrch.sendKeys("sar");
		Thread.sleep(3000);
		
		WebElement accountSrchGo = driver.findElement(By.xpath("//input[@name='go']"));
		act.moveToElement(accountSrchGo).build().perform();
		accountSrchGo.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
		
		WebElement accountSrchLink = driver.findElement(By.xpath("//a[contains(text(),'sarojapottu')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accountSrchLink );
		act.moveToElement(accountSrchLink).build().perform();
		accountSrchLink.click();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		WebElement contactSave = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accountSrchLink );
		act.moveToElement(contactSave).build().perform();
		contactSave.click();
		Thread.sleep(3000);
		
	}
	
	public void TC26() throws InterruptedException 
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
		Thread.sleep(5000);

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		
		WebElement createNewView =driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		act.moveToElement(createNewView).build().perform();
		createNewView.click();
		
		WebElement contactViewName=driver.findElement(By.xpath("//input[@id='fname']"));
		act.moveToElement(contactViewName).build().perform();
		contactViewName.clear();
		contactViewName.sendKeys("Krish");
		
		WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		act.moveToElement(viewUniqueName).build().perform();
		viewUniqueName.clear();
		viewUniqueName.sendKeys("KrishK");
		
		WebElement contactViewSave=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		act.moveToElement(contactViewSave).build().perform();
		contactViewSave.click();
	}
	
	
	
	public void TC27() throws InterruptedException 
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
		Thread.sleep(5000);

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		Thread.sleep(3000);
		
		WebElement recentlyViewed = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		Select recentViewdd = new Select(recentlyViewed);
		recentViewdd.selectByVisibleText("Recently Created");
		Thread.sleep(3000);
	}
	
	public void TC28() throws InterruptedException 
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

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		Thread.sleep(3000);
		
		WebElement viewContacts = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select viewContactsdd = new Select(viewContacts);
		viewContactsdd.selectByVisibleText("My Contacts");
	}
	
	public void TC29() throws InterruptedException 
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

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		Thread.sleep(3000);
		
		WebElement contactName =driver.findElement(By.xpath("//a[contains(text(),'Krishna')]"));
		act.moveToElement(contactName).build().perform();
		contactName.click();
		Thread.sleep(3000);
		
	}
	
	public void TC30() throws InterruptedException 
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
		Thread.sleep(5000);

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		
		WebElement createNewView =driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		act.moveToElement(createNewView).build().perform();
		createNewView.click();
		
		WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		act.moveToElement(viewUniqueName).build().perform();
		viewUniqueName.clear();
		viewUniqueName.sendKeys("EFGH");
		
		WebElement contactViewSave=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		act.moveToElement(contactViewSave).build().perform();
		contactViewSave.click();
	}
	
	
	public void TC31() throws InterruptedException 
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

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		Thread.sleep(2000);
		WebElement createNewView =driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		act.moveToElement(createNewView).build().perform();
		createNewView.click();
		Thread.sleep(2000);
		WebElement contactViewName=driver.findElement(By.xpath("//input[@id='fname']"));
		act.moveToElement(contactViewName).build().perform();
		contactViewName.clear();
		contactViewName.sendKeys("ABCD");
		Thread.sleep(2000);
		WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		act.moveToElement(viewUniqueName).build().perform();
		viewUniqueName.clear();
		viewUniqueName.sendKeys("EFGH");
		Thread.sleep(2000);
		WebElement contactViewCancel=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
		act.moveToElement(contactViewCancel).build().perform();
		contactViewCancel.click();
		Thread.sleep(2000);
	}
	
	public void TC32() throws InterruptedException 
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
	    userName.sendKeys("bhagatlingesh@gmail.com");
		Thread.sleep(3000);
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	    userPassword.sendKeys("lexkum143!");
	
	    Thread.sleep(3000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		Thread.sleep(5000);

		WebElement contacts =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		act.moveToElement(contacts).build().perform();
		contacts.click();
		
		WebElement newContact =driver.findElement(By.xpath("//input[@name='new']"));
		act.moveToElement(newContact).build().perform();
		newContact.click();
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		act.moveToElement(lastName).build().perform();
		lastName.sendKeys("Indian");
		
		String parent = driver.getWindowHandle();
		
		WebElement accountName = driver.findElement(By.xpath("//a[@id='con4_lkwgt']//img[@class='lookupIcon']"));
		act.moveToElement(accountName).build().perform();
		accountName.click();
		Thread.sleep(3000);
		
		for(String child : driver.getWindowHandles())
				{
					driver.switchTo().window(child);
				}
		 Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
		

		WebElement accountSrch = driver.findElement(By.id("lksrch"));
		act.moveToElement(accountSrch).build().perform();
		accountSrch.sendKeys("glo");
		Thread.sleep(3000);
		
		WebElement accountSrchGo = driver.findElement(By.xpath("//input[@name='go']"));
		act.moveToElement(accountSrchGo).build().perform();
		accountSrchGo.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
		
		WebElement accountSrchLink = driver.findElement(By.xpath("//a[contains(@class,'dataCell')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accountSrchLink );
		act.moveToElement(accountSrchLink).build().perform();
		accountSrchLink.click();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		WebElement contactSave = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accountSrchLink );
		act.moveToElement(contactSave).build().perform();
		contactSave.click();
		Thread.sleep(3000);
		
	}   
	
	
	public static void main(String[] args) throws InterruptedException {
		Contacts cs = new Contacts();
		// cs.TC25();
		// cs.TC26();
		// cs.TC27();
		// cs.TC28();
		// cs.TC29();
		// cs.TC30();
		// cs.TC31();
		cs.TC32();
	}	

}
