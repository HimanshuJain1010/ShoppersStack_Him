package com.shopperStack.genricUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisenesrUtility implements ITestListener{
	BaseTest bs = new BaseTest();
	javaUtility  javaUtility = new javaUtility();
	
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts =  (TakesScreenshot) bs.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File des = new File (FrameworkConstent.screenShotPath+javaUtility.getLocalDateTime()+".png");
		try {
			FileHandler.copy(temp, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
