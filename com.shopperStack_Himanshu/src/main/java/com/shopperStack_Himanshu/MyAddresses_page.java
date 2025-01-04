package com.shopperStack_Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddresses_page {
	public MyAddresses_page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath ="//button[text() = 'Add Address']")
	private WebElement addaddressbtn;
	
	@FindBy(xpath ="(//span[contains(@class ,'MuiButton-startIcon')])[2]")
	private WebElement deletebtn;
	
	@FindBy(xpath = "(//button[text() ='Yes'])[1]")
	private WebElement yesbtn;

	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}
	
}
