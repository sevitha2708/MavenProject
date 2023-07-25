package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class IndexPage  extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"gh-ug-flex\"]/a")
	WebElement register;
	
	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
	WebElement signIn;
	
	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//*[@id=\"gh-btn\"]")
	WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"gh-logo\"]")
	WebElement myEbayLogo;
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public RegistrationPage clickOnRegister()
	{
		Action.click(driver, register);
		return new RegistrationPage();
	}
	
	public LoginPage clickOnSignIn()
	{
		Action.click(driver, signIn);
		return new LoginPage();
	}
	
}
