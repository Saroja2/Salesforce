package com.qa.may.salesforce.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOpty {

	public static String parentWindow;

		public void TC16() throws InterruptedException 
		{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.salesforce.com");
			Thread.sleep(9000);
			parentWindow = driver.getWindowHandle();
			
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
			
			
			WebElement oppurtunites = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			act.moveToElement(oppurtunites).build().perform();
			oppurtunites.click();
			Thread.sleep(2000);
			
			WebElement oppurtunitesdd = driver.findElement(By.xpath("//select[@id='fcf']"));
			act.moveToElement(oppurtunitesdd).build().perform();
			oppurtunitesdd.click();
			Thread.sleep(2000);
			
			
			WebElement oppurtunitesNew = driver.findElement(By.xpath("//input[@name='new']"));
			act.moveToElement(oppurtunitesNew).build().perform();
			oppurtunitesNew.click();
			Thread.sleep(2000);
			
			WebElement oppurtunitesName = driver.findElement(By.xpath("//input[@id='opp3']"));
			act.moveToElement(oppurtunitesName).build().perform();
			oppurtunitesName.sendKeys("Deal1");
			Thread.sleep(2000);
			
			WebElement accountName = driver.findElement(By.xpath("//a[@id='opp4_lkwgt']//img[@class='lookupIcon']"));
			act.moveToElement(accountName).build().perform();
			accountName.click();
			Thread.sleep(2000);
			//String parent = driver.getWindowHandle();
			
			for(String child : driver.getWindowHandles()) 
			{
				driver.switchTo().window(child);
			}
			
			driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
			Thread.sleep(2000);
			System.out.println("I am inside a frame");
			WebElement accountNameSrch = driver.findElement(By.id("lksrch"));
			act.moveToElement(accountNameSrch).build().perform();
			accountNameSrch.sendKeys("roja");
			Thread.sleep(2000);
			
			WebElement gobutton = driver.findElement(By.xpath("//input[@name='go']"));
			act.moveToElement(gobutton).build().perform();
			gobutton.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
			Thread.sleep(4000);
			
			
			
			WebElement accountLink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", accountLink);		
			accountLink.click();
			Thread.sleep(4000);
			driver.switchTo().window(CreateOpty.parentWindow);
			
		
			WebElement closeDate = driver.findElement(By.xpath("//a[contains(text(),'7/7/2019')]"));
			act.moveToElement(closeDate).build().perform();
			closeDate.click();


			
			WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
			Select stagedd = new Select(stage);
			stagedd.selectByVisibleText("Proposal");
			Thread.sleep(2000);
			
			WebElement probability = driver.findElement(By.xpath("//input[@id='opp12']"));
			act.moveToElement(probability).build().perform();
			probability.clear();
			Thread.sleep(2000);
			probability.sendKeys("90");
			Thread.sleep(3000);
			
			WebElement additionalInformation = driver.findElement(By.xpath("//div[@id='head_2_ep']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",additionalInformation );
			Thread.sleep(2000);
			
			
			WebElement leadSource = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/select[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", leadSource);
			Select leadSourcedd = new Select(leadSource);
			leadSourcedd.selectByVisibleText("Partner");
			Thread.sleep(2000);
			
			WebElement primaryCampaign = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/a[1]/img[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",primaryCampaign);
			act.moveToElement(primaryCampaign).build().perform();
			primaryCampaign.click();
			Thread.sleep(2000);
			
			for(String child : driver.getWindowHandles()) 
			{
				driver.switchTo().window(child);
			}
			
			driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
			
			WebElement recCampaign = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/div[2]/input[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",recCampaign);
			act.moveToElement(recCampaign).build().perform();
			recCampaign.sendKeys("*c*");
			
			WebElement recCampaignGo = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/div[2]/input[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",recCampaignGo);
			act.moveToElement(recCampaignGo).build().perform();
			recCampaignGo.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
			
			Thread.sleep(2000);					
			
			WebElement cuCatEmailinv = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",cuCatEmailinv);
			//act.moveToElement(recCampaignGo).build().perform();
			cuCatEmailinv.click();
			
			Thread.sleep(4000);
			driver.switchTo().window(CreateOpty.parentWindow);
			
			WebElement saveOppurtunity = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
			act.moveToElement(saveOppurtunity).build().perform();
			saveOppurtunity.click();
			Thread.sleep(2000);
			
			
			
		}//a[contains(text(),'Opportunity Pipeline')]
		
		public void TC15() throws InterruptedException 
		{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.salesforce.com");
			Thread.sleep(9000);
			parentWindow = driver.getWindowHandle();
			
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
			
			
			WebElement oppurtunites = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			act.moveToElement(oppurtunites).build().perform();
			oppurtunites.click();
			Thread.sleep(2000);
			
			WebElement oppurtunitesdd = driver.findElement(By.xpath("//select[@id='fcf']"));
			act.moveToElement(oppurtunitesdd).build().perform();
			oppurtunitesdd.click();
			Thread.sleep(2000);
		
		}
		
		
		public void TC17() throws InterruptedException 
		{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.salesforce.com");
			Thread.sleep(9000);
			parentWindow = driver.getWindowHandle();
			
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
			
			
			WebElement oppurtunites = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
			act.moveToElement(oppurtunites).build().perform();
			oppurtunites.click();
			Thread.sleep(2000);
	
			WebElement oppurtunityPipeline = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
			act.moveToElement(oppurtunityPipeline).build().perform();
			oppurtunityPipeline.click();
			Thread.sleep(2000);
			
		}
			public void TC18() throws InterruptedException 
			{
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
				driver = new FirefoxDriver();
				driver.get("https://www.salesforce.com");
				Thread.sleep(9000);
				parentWindow = driver.getWindowHandle();
				
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
				
				
				WebElement oppurtunites = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
				act.moveToElement(oppurtunites).build().perform();
				oppurtunites.click();
				Thread.sleep(2000);
				
				WebElement stuckOppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
				act.moveToElement(stuckOppurtunities).build().perform();
				stuckOppurtunities.click();
				Thread.sleep(2000);
			
	}
			public void TC19() throws InterruptedException 
			{
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
				driver = new FirefoxDriver();
				driver.get("https://www.salesforce.com");
				Thread.sleep(9000);
				parentWindow = driver.getWindowHandle();
				
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
				
				
				WebElement oppurtunites = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
				act.moveToElement(oppurtunites).build().perform();
				oppurtunites.click();
				Thread.sleep(2000);
				
				
				
				WebElement quarterSummInterval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
				Select quarterSummIntervaldd = new Select(quarterSummInterval);
				quarterSummIntervaldd.selectByVisibleText("Current FQ");
				Thread.sleep(2000);
				
				WebElement quarterSummInclude = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/select[1]"));
				Select quarterSummIncludedd = new Select(quarterSummInclude);
				quarterSummIncludedd.selectByVisibleText("All Opportunities");
				Thread.sleep(2000);
			
				quarterSummIncludedd.selectByVisibleText("Open Opportunities");
				Thread.sleep(2000);
			
				quarterSummIncludedd.selectByVisibleText("Closed Opportunities");
				Thread.sleep(2000);
				
				quarterSummIntervaldd.selectByVisibleText("Next FQ");
				Thread.sleep(2000);
				
				quarterSummIncludedd.selectByVisibleText("All Opportunities");
				Thread.sleep(2000);
			
				quarterSummIncludedd.selectByVisibleText("Open Opportunities");
				Thread.sleep(2000);
			
				quarterSummIncludedd.selectByVisibleText("Closed Opportunities");
				Thread.sleep(2000);
				
				
	}
		public static void main(String[] args) throws InterruptedException {

			CreateOpty co = new CreateOpty();
		//		co.TC15();
		//	 	co.TC16();
		//		co.TC17();
		//		co.TC18();
				co.TC19();
	}

}
