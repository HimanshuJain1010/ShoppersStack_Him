package com.shopperStack.genricUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	javaUtility javaUtitly = new javaUtility();
	public void selectByvalue(WebElement element , String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void getScreenShotofWebpage(WebDriver driver) throws IOException
	{
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File des = new File (FrameworkConstent.screenShotPath+ javaUtitly.getLocalDateTime()+".png");
		FileHandler.copy(temp, des);
		
		
	}
	public void getScreenShotOfWebElement(WebElement element) throws IOException
	{
		File temp = element.getScreenshotAs(OutputType.FILE);
		File des = new File (FrameworkConstent.screenShotPath+ javaUtitly.getLocalDateTime()+".png");
		FileHandler.copy(temp, des);
		
	}

} 
