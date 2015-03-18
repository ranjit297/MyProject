package test.java;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



import mavenPac.Excel;

public class NewTest {
	
	
	 WebDriver driver;
	  Logger logger = Logger.getLogger("loging");
	
	
  @Test
  public void TestA() {
	  
		 String Sht="Sheet1";
	
	    
    	String strRouting_Num=Excel.getCellData(Sht, "Routing_Number", 2);
    	logger.info(strRouting_Num);
		String strAccount_Num=Excel.getCellData(Sht, "Account_Number", 2);
		logger.info(strAccount_Num);
		String strCheck_num=Excel.getCellData(Sht, "Check_Number", 2);
		logger.info(strCheck_num);
		String strEmail_Id=Excel.getCellData(Sht, "Email_Id", 2);
		logger.info(strEmail_Id);
		String strPhone_Num=Excel.getCellData(Sht, "Phone_Num", 2);
		logger.info(strPhone_Num);
		String strCustomer_Name=Excel.getCellData(Sht, "Customer_Name", 2);
		logger.info(strCustomer_Name);
		String strAddress=Excel.getCellData(Sht, "Address", 2);
		logger.info(strAddress);
		String strCity=Excel.getCellData(Sht, "City", 2);
		logger.info(strCity);
		String strState=Excel.getCellData(Sht, "States", 2);
		logger.info(strState);
		String strZip_Code=Excel.getCellData(Sht, "Zip_Code", 2);
		logger.info(strZip_Code);
		String strBank_Name=Excel.getCellData(Sht, "Bank_Name", 2);
		logger.info(strBank_Name);
		
  }  
@BeforeMethod
public void beforeMethod() {
	  
	//  System.setProperty("webdriver.chrome.driver","E:\\selenium API\\chromedriver.exe");
	//  driver= new ChromeDriver();
	 // driver.get("http://www.samsclubchecks.com/index.aspx");
	 // driver.manage().window().maximize();
	  logger.info("App Lunched");
   
    String Excelpath=System.getProperty("user.dir")+"\\src\\TestData.xlsx";
    Excel.excelRead(Excelpath); 	  
	  
}

@AfterMethod
public void afterMethod() 
{
	 logger.info("Excel Raed is done");
	// driver.close();
	  
}}	  

/*try {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			 WebElement chkgrp =driver.findElement(By.xpath("//li[2][a[@class='dropdown-toggle']]/a"));
			  String chk_nm= chkgrp.getText();
			  wait.until(ExpectedConditions.elementToBeClickable(chkgrp));
		
			    Actions action=new Actions(driver);
			   action.moveToElement(chkgrp).perform();
		      action.click(chkgrp).perform();
		      logger.info("Check gruop seleceted :"+chk_nm);
		   
		    Thread.sleep(2000);
		    
		WebElement chktyp=driver.findElement(By.xpath("//a[@href='/line.aspx?lineid=212&add=n15']"));
		String chk_nm2=chktyp.getText();
		chktyp.click();
		logger.info("Check type selected :"+chk_nm2);
		
		} catch (Exception e) {
			
			logger.error("Failed to locate the Link", e);
			
		}
	
	try {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
			 WebElement mpchk=  driver.findElement(By.xpath("//a[p[contains(text(),'Boho Checks')]]"));
			  String chk_nm3=mpchk.getText();
			   wait.until(ExpectedConditions.elementToBeClickable(mpchk));
			  mpchk.click();
			 logger.info("One check selected : "+chk_nm3);
			   
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		List<WebElement> results=driver.findElements(By.xpath("//input[@type='checkbox' and @checked='checked']"));
		   
	int count=results.size();
	for (int i = 0; i<count; i++)
		{
			 if(results.get(i).isSelected()){
		
				 results.get(i).click();
				 
				
	}
			 
	}
	
	} catch (Exception e) {
		
		
	}
	
	try {
		
		WebElement tab=driver.findElement(By.xpath("//span[contains(text(),'Single Checks')]"));
		String  chktab=tab.getText();
		tab.click();
		logger.info("Check tab selected :"+chktab);
		
		
	} catch (Exception e) {
		logger.error("Falied to locate the tab", e);;
		
	}
	
	try {
		
		WebElement chkbox=driver.findElement(By.xpath("//input[@id='ProductOptions_rptrSingles_ctl00_Quantity_1279_289']"));
		chkbox.click();
		
		
	} catch (Exception e) {
	
		
		
	}
	
	try {
		
		WebElement btn =driver.findElement(By.xpath("//a[@id='lnkBtnPersonalize']"));
		btn.click();
		
	} catch (Exception e) {
		
	}
	
	
	try {
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 driver.findElement(By.id("routenum")).sendKeys(strRouting_Num);
	
		 driver.findElement(By.id("acctnum")).sendKeys(strAccount_Num);
		
		 driver.findElement(By.id("checknum")).sendKeys(strCheck_num);
	
		 driver.findElement(By.id("txtEmail")).sendKeys(strEmail_Id);
	
		 driver.findElement(By.id("txtContactPhone")).sendKeys(strPhone_Num);
	
		 driver.findElement(By.xpath("//a[@id='NextButtonTab1']/span")).click();

		 
	} catch (Exception e) {
		
	}
	
	
	
	try {
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("pline1")).sendKeys(strCustomer_Name);
		
		 driver.findElement(By.id("pline3")).sendKeys(strAddress);
	
		 driver.findElement(By.id("city")).sendKeys(strCity);
	
		 WebElement drp=driver.findElement(By.id("states"));
			Select sel= new Select(drp);
			sel.selectByVisibleText(strState);
			
		 driver.findElement(By.id("zip")).sendKeys(strZip_Code);
	
		 driver.findElement(By.id("bankinfo1")).sendKeys(strBank_Name);
	
		 driver.findElement(By.xpath("//a[@id='NextButtonTab2']")).click();

		 
	} catch (Exception e) {
		
		
		
	}
	
	
	try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.switchTo().frame(0);
		WebElement btn =driver.findElement(By.xpath("//a[contains(text(),'Continue') and @id='lnkVerifiedContinue']"));
			  
        btn.click();
	  driver.switchTo().defaultContent();
					
	} catch (Exception e) 
	{
	
	}
		
	try {
		
		   
		    WebElement drp1=driver.findElement(By.id("PersonalizeItList"));
			Select sel= new Select(drp1);
			sel.selectByVisibleText("R");
			driver.findElement(By.xpath("//input[@id='PersonalizeItMonogramModern']")).click();
			driver.findElement(By.xpath("//a[@id='previewbutton1a']")).click();
			

			
	} catch (Exception e) {
		
	}
		
	try {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		 String imageUrl=driver.findElement(By.xpath("//img[@id='checkpreview']")).getAttribute("src");  
		 System.out.println("Image source path : \n"+ imageUrl); 
		
		 Ocr.setUp();			 
		 Ocr ocr = new Ocr();
		 ocr.startEngine("eng", Ocr.SPEED_SLOW);
		 String s=  ocr.recognize(new URL[] {new URL(imageUrl)}, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		 Thread.sleep(2000);
		 System.out.println("Result: " + s);
		 ocr.stopEngine();
		 
		 
		driver.findElement(By.id("ckAgree")).click();;
	
		driver.findElement(By.xpath("//a[@id='lbApproveButton2a']/span")).click();
		
		
	} catch (Exception e) {
		
	}
	
	try {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(2);
		String strPrice=driver.findElement(By.id("lblItemPrice")).getText();
		System.out.println("Price is : "+strPrice);
		
		driver.findElement(By.id("ViewCartAndCheckout")).click();
		driver.switchTo().defaultContent();
	} catch (Exception e) {
	
	}*/


//}
