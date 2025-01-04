package com.shopperStack_Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//span[text() ='Login']")
	private WebElement loginbtn;
	
	

}
