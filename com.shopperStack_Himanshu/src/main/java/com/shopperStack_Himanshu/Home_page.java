package com.shopperStack_Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge')]")
	private WebElement settingbtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myprofile;
	
	@FindBy(xpath = "//li[contains(@class,'MuiButtonBase-root')][6]")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "(//span[contains(@class,'BaseBadge')])[2]")
	private WebElement accountbtn;
	

	public WebElement getAccountbtn() {
		return accountbtn;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getMyprofile() {
		return myprofile;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	

}
