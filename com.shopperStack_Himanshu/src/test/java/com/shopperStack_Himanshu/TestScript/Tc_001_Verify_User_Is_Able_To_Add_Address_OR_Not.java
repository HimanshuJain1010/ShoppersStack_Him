package com.shopperStack_Himanshu.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.shopperStack.genricUtility.BaseTest;
import com.shopperStack_Himanshu.AddressFrom_page;
import com.shopperStack_Himanshu.MyAddresses_page;
import com.shopperStack_Himanshu.Myprofile_page;

public class Tc_001_Verify_User_Is_Able_To_Add_Address_OR_Not  extends BaseTest {
	
	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		homePage.getSettingbtn().click();
		homePage.getMyprofile().click();
		
		
		Myprofile_page myProfilePage = new Myprofile_page(driver);
		myProfilePage.getMyaddressesbtn().click();
		
		Thread.sleep(2000);
		MyAddresses_page myAddresses_page = new MyAddresses_page(driver);
		myAddresses_page.getAddaddressbtn().click();
		
		AddressFrom_page addressFrom_page = new AddressFrom_page(driver);
		
		addressFrom_page.getNametextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressFrom_page.getHousetextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressFrom_page.getStreetinfotf().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressFrom_page.getLandmarkTF().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByvalue(addressFrom_page.getCountrydropdown(),fileUtility.readDataFromPropertyFileString("country"));
		Thread.sleep(3000);
		addressFrom_page.getStatedropd().sendKeys("Maharashtra");
		webDriverUtility.selectByvalue(addressFrom_page.getCitydropdown(),fileUtility.readDataFromPropertyFileString("city"));
		addressFrom_page.getPincodetextfield().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressFrom_page.getPhnumberTextf().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressFrom_page.getAddadressbtn().click();
		
		Thread.sleep(2000);
		
		webDriverUtility.getScreenShotofWebpage(driver);
		Thread.sleep(10000);
		
	
	}

}
