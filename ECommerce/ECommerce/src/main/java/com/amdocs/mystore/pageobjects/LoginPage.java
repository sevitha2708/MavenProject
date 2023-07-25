package com.amdocs.mystore.pageobjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class LoginPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"userid\"]")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"signin-continue-btn\"]")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"sgnBt\"]")
	WebElement signInButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userName1, String password1) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("implicitWait")), TimeUnit.SECONDS);
		Action.type(userName, userName1);
		Action.click(driver, continueButton);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("implicitWait")), TimeUnit.SECONDS);
		Action.type(password, password1);
		Action.click(driver, signInButton);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("implicitWait")), TimeUnit.SECONDS);

		//Thread.sleep(2000);
		//return new HomePage();
	}
}
