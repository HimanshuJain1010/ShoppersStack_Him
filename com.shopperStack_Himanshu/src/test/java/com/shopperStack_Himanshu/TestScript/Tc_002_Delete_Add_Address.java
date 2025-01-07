package com.shopperStack_Himanshu.TestScript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.shopperStack.genricUtility.BaseTest;
import com.shopperStack.genricUtility.WebDriverUtility;
import com.shopperStack_Himanshu.MyAddresses_page;
import com.shopperStack_Himanshu.Myprofile_page;

public class Tc_002_Delete_Add_Address extends BaseTest {
	
	@Test
	public void deteleaddress() throws InterruptedException, IOException
	{
		homePage.getSettingbtn().click();
		homePage.getMyprofile().click();
	
		Myprofile_page myprofile_page = new Myprofile_page(driver);
		myprofile_page.getMyaddressesbtn().click();
		
		Thread.sleep(3000);
		MyAddresses_page myAddresses_page = new MyAddresses_page(driver);
		myAddresses_page.getDeletebtn().click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",myAddresses_page.getPopbtn());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		webDriverUtility.getScreenShotofWebpage(driver);
		Thread.sleep(2000);
		
		
	}
	
	

}
