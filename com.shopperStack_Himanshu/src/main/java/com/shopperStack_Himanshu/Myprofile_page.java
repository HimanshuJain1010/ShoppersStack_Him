package com.shopperStack_Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myprofile_page {
	public Myprofile_page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myaddressesbtn;
	
	public WebElement getMyaddressesbtn() {
		return myaddressesbtn;
	}
	
	

}
