package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class RegistrationPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"personalaccount-radio\"]")
	WebElement personAccount;
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement registerButton;
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage register(String firstName1, String LastName1, String email1, String password1)
	{
		Action.click(driver, personAccount);
		Action.type(firstName, firstName1);
		Action.type(lastName, LastName1);
		Action.type(email, email1);
		Action.type(password, password1);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(registerButton));
		Action.click(driver, registerButton);
		return new HomePage();
	}
	
}
