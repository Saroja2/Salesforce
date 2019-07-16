package com.qa.may.salesforce.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class T06 {
	
	public static void enterText(WebElement obj, String text, String objName) {
		
	if(obj.isEnabled())	{
		obj.sendKeys(text);
		System.out.println("Pass:" + text + "is entered in " + objName + "field..");
	}
	else 
		System.out.println("Fail" + text + "is disabled " + objName + "field..");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Saroja/Documents/Seleniumtraining/FirefoxDriver/geckodriver");
		
	
		driver = new FirefoxDriver();
		
		
		//String fileName1 = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		
		//String path = "/Users/Saroja/Documents/Seleniumtraining/" + fileName1;
		
		//reports = new ExtentReports(path);
		//logger =reports.startTest("SFDCLogin TestCase_3");
		
		driver.get("https://www.salesforce.com");
		//logger.log(LogStatus.INFO, "Application is up and running..");
      	
		Thread.sleep(9000);
		
		T06 tc6 = new T06();
	
		WebElement userLogin =driver.findElement(By.className("global-nav-login-flydown"));
		System.out.println("web element is " + userLogin);
		//Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(userLogin).build().perform();
		
		//Thread.sleep(5000);
		userLogin.click();
		
		WebElement userName = driver.findElement(By.id("username"));
		tc6.enterText(userName, "saroja.potturi-zkne@force.com" , "UserName");
	   // userName.sendKeys("saroja_potturi-pfwc@force.com");
	    
	    
	    WebElement userPassword = driver.findElement(By.id("password"));
	  //  userPassword.sendKeys("Jun!2019");
	   // logger.log(LogStatus.INFO,"Enter Password Passed Successfully");
	    tc6.enterText(userPassword,"Jul!2019", "Password");
	  
	    Thread.sleep(5000);
	   
	    WebElement Login =driver.findElement(By.id("Login"));
		Login.click();  
		
		Thread.sleep(5000);
	/*	driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='https://login.salesforce.com/login/sessionserver212.html']")));
		
		System.out.println("I am in iframe");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement close = driver.findElement(By.id("tryLexDialogX"));
	
		close.click(); */
		
		act.moveToElement(driver.findElement(By.id("userNavLabel"))).build().perform();
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(1000);
		
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		
		WebElement editButton =driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		act.moveToElement(editButton).build().perform();
		editButton.click();
		
		
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
	
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='https://login.salesforce.com/login/sessionserver212.html']")));
		System.out.println("I am in iframe");
		
		driver.switchTo().defaultContent();
		WebElement profileFrame= driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		System.out.println("I am inside second frame");
		
		
		WebElement aboutMe = driver.findElement(By.id("aboutTab"));
		act.moveToElement(aboutMe).build().perform();
		aboutMe.click();
		
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.clear();
		Thread.sleep(2000);
		lastName.sendKeys("Potturi");
		
		
		WebElement saveall = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		act.moveToElement(saveall).build().perform();
		saveall.click();
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement post = driver.findElement(By.xpath(" //span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		act.moveToElement(post).build().perform();
		post.click();
		
		WebElement framePost = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
		
		driver.switchTo().frame(framePost);
		System.out.println("I am in a frame");
		
			
		WebElement postText = driver.findElement(By.xpath("/html[1]/body[1]"));
		postText.sendKeys("Hello!");
		
		driver.switchTo().defaultContent();
		
		WebElement file = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		act.moveToElement(file).build().perform();
		file.click();

		WebElement fileUpload = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		act.moveToElement(fileUpload).build().perform();
		fileUpload.click();
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		browse.clear();
		Thread.sleep(3000);
		browse.sendKeys("/Users/Saroja/Documents/FileUpload/SendKeys.pages");
	
		Thread.sleep(2000);
		WebElement share = driver.findElement(By.xpath(" //input[@id='publishersharebutton']"));
		share.click();
	
		Thread.sleep(5000);
		WebElement addPhoto = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		act.moveToElement(addPhoto).build().perform();
		addPhoto.click();
		
		
		
		driver.switchTo().defaultContent();
		WebElement uploadPhoto = driver.findElement(By.xpath(" //div[@id='uploadPhoto']"));
		act.moveToElement(uploadPhoto).build().perform();
		
		driver.switchTo().frame("uploadPhotoContentId");
		System.out.println("Inside second frame");
	
		Thread.sleep(5000);
		WebElement photoForm = driver.findElement(By.id("j_id0:uploadFileForm"));
		act.moveToElement(photoForm).build().perform();
		
		WebElement photo = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		photo.clear();
		Thread.sleep(3000);
		photo.sendKeys("/Users/Saroja/Documents/FileUpload/Dogpic.jpg");
		
		Thread.sleep(8000);
		
		WebElement save = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		act.moveToElement(save).build().perform();
		save.click();
		
		Thread.sleep(6000);
		WebElement save2 = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		save2.click();
		
} 

	

}


































