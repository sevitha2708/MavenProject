package com.amdocs.mystore.actiondriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.mystore.base.BaseClass;

public class Action extends BaseClass 
{
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}


	public static void click(WebDriver driver, WebElement ele) 
	{

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}
	
	public static void launchNewWindow(WebDriver driver)
	{
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles)
		{
			if (!windowHandle.equals(currentWindowHandle)) 
			{
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}


	public static void submit(WebElement locatorName) throws Throwable {

	        WebDriverWait wait = new WebDriverWait(BaseClass.driver,300);

	        wait.until(ExpectedConditions.elementToBeClickable(locatorName)).click();

	    }

	public static boolean findElement(WebDriver driver, WebElement ele)
	{
		boolean flag = false;
		try 
		{
			ele.isDisplayed();
			flag = true;
		}
		catch (Exception e) 
		{
			// System.out.println("Location not found: "+locatorName);
			flag = false;
		}
		finally 
		{
			if (flag) 
			{
				System.out.println("Successfully Found element at");

			}
			else
			{
				System.out.println("Unable to locate element at");
			}
		}
		return flag;
	}

	public static boolean isDisplayed(WebDriver driver, WebElement ele) 
	{
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) 
		{
			flag = ele.isDisplayed();
			if (flag) 
			{
				System.out.println("The element is Displayed");
			}
			else 
			{
				System.out.println("The element is not Displayed");
			}
		} 
		else
		{
			System.out.println("Not displayed ");
		}
		return flag;
	}

	public static boolean isSelected(WebDriver driver, WebElement ele)
	{
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) 
		{
			flag = ele.isSelected();
			if (flag)
			{
				System.out.println("The element is Selected");
			}
			else
			{
				System.out.println("The element is not Selected");
			}
		} 
		else
		{
			System.out.println("Not selected ");
		}
		return flag;
	}

	public static boolean isEnabled(WebDriver driver, WebElement ele) 
	{
		boolean flag = false;
		flag = findElement(driver, ele);
		if (flag) 
		{
			flag = ele.isEnabled();
			if (flag) 
			{
				System.out.println("The element is Enabled");
			}
			else 
			{
				System.out.println("The element is not Enabled");
			}
		} 
		else 
		{
			System.out.println("Not Enabled ");
		}
		return flag;
	}

	public static boolean type(WebElement ele, String text)
	{
		boolean flag = false;
		try
		{
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} 
		catch (Exception e) 
		{
			System.out.println("Location Not found");
			flag = false;
		}
		finally 
		{
			if (flag) 
			{
				System.out.println("Successfully entered value");
			}
			else
			{
				System.out.println("Unable to enter value");
			}
		}
		return flag;
	}

	public static boolean selectBySendkeys(String value,WebElement ele) 
	{
		boolean flag = false;
		try 
		{
			ele.sendKeys(value);
			flag = true;
			return true;
		} 
		catch (Exception e) 
		{

			return false;
		}
		finally 
		{
			if (flag) 
			{
				System.out.println("Select value from the DropDown");		
			} 
			else 
			{
				System.out.println("Not Selected value from the DropDown");
				// throw new ElementNotFoundException("", "", "")
			}
		}
	}


	public static boolean selectByIndex(WebElement element, int index) 
	{
		boolean flag = false;
		try 
		{
			Select s = new Select(element);
			s.selectByIndex(index);
			flag = true;
			return true;
		} 
		catch (Exception e)
		{
			return false;
		}
		finally 
		{
			if (flag)
			{
				System.out.println("Option selected by Index");
			} 
			else
			{
				System.out.println("Option not selected by Index");
			}
		}
	}

	public static boolean selectByValue(WebElement element,String value)
	{
		boolean flag = false;
		try 
		{
			Select s = new Select(element);
			s.selectByValue(value);
			flag = true;
			return true;
		}
		catch (Exception e)
		{
			return false;
		} 
		finally 
		{
			if (flag) 
			{
				System.out.println("Option selected by Value");
			} 
			else 
			{
				System.out.println("Option not selected by Value");
			}
		}
	}


	public static boolean selectByVisibleText(String visibletext, WebElement ele) 
	{
		boolean flag = false;
		try 
		{
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);
			flag = true;
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		} 
		finally 
		{
			if (flag)
			{
				System.out.println("Option selected by VisibleText");
			} 
			else 
			{
				System.out.println("Option not selected by VisibleText");
			}
		}
	}

	public static boolean moveToElement(WebDriver driver, WebElement ele) 
	{
		boolean flag = false;
		try 
		{
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return flag;
	}

	

	public static String getTitle(WebDriver driver) 
	{
		boolean flag = false;

		String text = driver.getTitle();
		if (flag)
		{
			System.out.println("Title of the page is: \""+text+"\"");
		}
		return text;
	}



	public static void implicitWait(WebDriver driver, int timeOut) 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}


