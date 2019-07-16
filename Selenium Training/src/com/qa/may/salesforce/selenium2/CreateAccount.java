package com.qa.may.salesforce.selenium2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public void TC10() throws InterruptedException 
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
		Thread.sleep(3000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));		
		act.moveToElement(accounts).build().perform();
		accounts.click();
		Thread.sleep(3000);
		
		WebElement newAccount = driver.findElement(By.xpath("//div[@id='createNewButton']"));
		act.moveToElement(newAccount).build().perform();
		newAccount.click();
		Thread.sleep(3000);
		
		WebElement Account = driver.findElement(By.xpath("//a[@class='accountMru menuButtonMenuLink']"));
		act.moveToElement(Account).build().perform();
		Account.click();
		Thread.sleep(3000);
		
		WebElement accountName = driver.findElement(By.xpath("//input[@id='acc2']"));
		act.moveToElement(accountName).build().perform();
		accountName.clear();
		accountName.sendKeys("Sarojap");
		
		Thread.sleep(3000);
		
		WebElement accountSave = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		act.moveToElement(accountSave).build().perform();
		accountSave.click();
		
		
	}
	
	public void TC11() throws InterruptedException 
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
		Thread.sleep(3000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));		
		act.moveToElement(accounts).build().perform();
		accounts.click();
		Thread.sleep(3000);
		
		WebElement newView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		act.moveToElement(newView).build().perform();
		newView.click();
		Thread.sleep(3000);
		
		WebElement viewName= driver.findElement(By.xpath("//input[@id='fname']"));
		act.moveToElement(viewName).build().perform();
		viewName.clear();
		Thread.sleep(1000);
		viewName.sendKeys("Sarojapo");
		Thread.sleep(3000);
		
		

		WebElement viewNameUnique= driver.findElement(By.xpath("//input[@id='devname']"));
		act.moveToElement(viewNameUnique).build().perform();
		viewNameUnique.clear();
		Thread.sleep(1000);
		viewNameUnique.sendKeys("Sarojapott");
		Thread.sleep(3000);
		
		
		WebElement viewSave= driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		act.moveToElement(viewSave).build().perform();
		viewSave.click();
		
		Thread.sleep(3000);
	}
	
	
	public void TC12() throws InterruptedException 
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
		Thread.sleep(3000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));		
		act.moveToElement(accounts).build().perform();
		accounts.click();
		Thread.sleep(3000);
		
		WebElement viewName = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select viewdd = new Select(viewName);
		viewdd.selectByVisibleText("Sarojapo");
		

		WebElement editView = driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));		
		act.moveToElement(editView).build().perform();
		editView.click();
		
		WebElement viewName2= driver.findElement(By.xpath("//input[@id='fname']"));
		act.moveToElement(viewName2).build().perform();
		viewName2.clear();
		Thread.sleep(1000);
		viewName2.sendKeys("pSaroja");
		Thread.sleep(3000);
		
		

		WebElement viewNameUnique= driver.findElement(By.xpath("//input[@id='devname']"));
		act.moveToElement(viewNameUnique).build().perform();
		viewNameUnique.clear();
		Thread.sleep(1000);
		viewNameUnique.sendKeys("Sarojapottu");
		Thread.sleep(3000);
		

		WebElement filterField = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select  filterFielddd = new Select( filterField);
		filterFielddd.selectByVisibleText("Account Name");
		
		WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
		Select  operatordd = new Select(operator);
		operatordd.selectByVisibleText("contains");
		
		WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
		value.sendKeys("a");
		
		WebElement availableFields = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
		Select  availableFieldsdd = new Select(availableFields);
		availableFieldsdd.selectByVisibleText("Last Activity");
		
		WebElement add = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		add.click();
		
		WebElement  save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", save);
		
		act.moveToElement(save).build().perform();
		save.click();
		
		
	}	
	
	public void TC13() throws InterruptedException 
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
		
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accounts);
		accounts.click();
		Thread.sleep(3000);
		
		WebElement mergeAccounts = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", mergeAccounts);
		mergeAccounts.click();
		Thread.sleep(2000);
		
		WebElement searchAccount = driver.findElement(By.xpath("//input[@id='srch']"));
		searchAccount.sendKeys("sar");
		WebElement findAccounts = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[@name='srchbutton']"));
		act.moveToElement(findAccounts).build().perform();
		findAccounts.click();
		Thread.sleep(2000);
		
		WebElement findAccount1 = driver.findElement(By.xpath("//input[@id='cid0']"));
		act.moveToElement(findAccount1).build().perform();
		findAccount1.click();
		findAccount1.click();
		Thread.sleep(2000);
		
		WebElement findAccount2 = driver.findElement(By.xpath("//input[@id='cid1']"));
		act.moveToElement(findAccount2).build().perform();
		findAccount2.click();
		findAccount2.click();
		Thread.sleep(2000);
		
		WebElement findAccount3 = driver.findElement(By.xpath("//input[@id='cid2']"));
		act.moveToElement(findAccount3).build().perform();
		findAccount3.click();
		Thread.sleep(2000);
	
		WebElement next = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));
		act.moveToElement(next).build().perform();
	    next.click();
	}

	
	public void TC14() throws InterruptedException 
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
		
		
		WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accounts);
		accounts.click();
		Thread.sleep(3000);
		
		WebElement lastActivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		act.moveToElement(lastActivity).build().perform();
		lastActivity.click();
		Thread.sleep(1000);
		

		WebElement  lastActivitydd= driver.findElement(By.xpath("//input[@id='ext-gen20']"));
		act.moveToElement( lastActivitydd).build().perform();
		lastActivitydd.click();
		Thread.sleep(1000);
		
		WebElement createDate = driver.findElement(By.xpath("/html[1]/body[1]/div[15]/div[1]/div[3]"));
		act.moveToElement(createDate).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		createDate.click();
		
		WebElement fromdd = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		act.moveToElement(fromdd).build().perform();
		fromdd.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"));
		act.moveToElement(from).build().perform();
		
		from.sendKeys("07/07/2019");
		
		WebElement to = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]"));
		act.moveToElement(to).build().perform();
		to.clear();
		to.sendKeys("07/07/2019");
		
		String parent = driver.getWindowHandle();
		WebElement saveReport = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]"));
		act.moveToElement(saveReport).build().perform();
		saveReport.click();
		
	/*	Set<String>  allWindows = driver.getWindowHandles();
		for (String child : allWindows) 
		{
			if(!parent.equalsIgnoreCase(child))
			{driver.switchTo().window(child); }
			*/
		
		for(String handle1 : driver.getWindowHandles()) 
		{
			driver.switchTo().window(handle1);
		}
		Thread.sleep(1000);
		driver.switchTo().window(parent);   
		

				
				WebElement reportName = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
			    act.moveToElement(reportName).build().perform();
			    reportName.click();
			    reportName.sendKeys("Today_tReport");
			    Thread.sleep(3000);
				WebElement reportNameUnique = driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
				reportNameUnique.click();
				act.moveToElement(reportNameUnique).build().perform();
			    reportNameUnique.sendKeys("ReportFortToday");
			    Thread.sleep(3000);
			    WebElement saveAndRun = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
			    act.moveToElement(saveAndRun).build().perform();
			    saveAndRun.click();
			    Thread.sleep(5000);
				
			driver.switchTo().window(parent);
			
	
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		CreateAccount ca = new CreateAccount();
		
		// ca.TC10();
	    // ca.TC11();
		// ca.TC12();
		// ca.TC13();
		   ca.TC14();
	}
	
	
}
