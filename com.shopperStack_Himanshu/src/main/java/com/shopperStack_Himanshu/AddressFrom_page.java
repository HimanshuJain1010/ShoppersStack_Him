package com.shopperStack_Himanshu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFrom_page {
	public AddressFrom_page(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(id = "Office")
	private WebElement officerb;
	
	@FindBy(id="Name")
	private WebElement Nametextfield;
	
	@FindBy(id="House/Office Info")
	private WebElement housetextfield;
	
	@FindBy(id ="Street Info")
	private WebElement streetinfotf;
	
	@FindBy(id ="Landmark")
	private WebElement landmarkTF;
	
	@FindBy(id ="Country")
	private WebElement countrydropdown;
	
	@FindBy(id ="State")
	private WebElement statedropd;
	
	@FindBy(id="City")
	private WebElement citydropdown;
	
	@FindBy(id = "Pincode")
	private WebElement pincodetextfield;
	
	@FindBy(id="Phone Number")
	private WebElement phnumberTextf;
	
	@FindBy(id="addAddress")
	private WebElement addadressbtn;

	public WebElement getOfficerb() {
		return officerb;
	}

	public WebElement getNametextfield() {
		return Nametextfield;
	}

	public WebElement getHousetextfield() {
		return housetextfield;
	}

	public WebElement getStreetinfotf() {
		return streetinfotf;
	}

	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getStatedropd() {
		return statedropd;
	}

	public WebElement getCitydropdown() {
		return citydropdown;
	}

	public WebElement getPincodetextfield() {
		return pincodetextfield;
	}

	public WebElement getPhnumberTextf() {
		return phnumberTextf;
	}

	public WebElement getAddadressbtn() {
		return addadressbtn;
	}
	
	
	

}