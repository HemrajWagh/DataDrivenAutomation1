package org.automation.pages;

import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) 
	
	{
		this.driver=driver;
	}
	
	@Test
	public void enterUsername(String uname) throws Exception
	{
		driver.findElement(By.id(Utility.fetchElementLocator("login_username_id"))).sendKeys(uname);
	}
	public void enterPassword(String upass) throws Exception
	{
		driver.findElement(By.id(Utility.fetchElementLocator("login_password_id"))).sendKeys(upass);
		Assert.assertEquals("test", "test123");
	}
	public void clickSighin() throws Exception
	{
	 	driver.findElement(By.xpath(Utility.fetchElementLocator("login_sighin_xpath"))).click();
	}
	
	
	}
