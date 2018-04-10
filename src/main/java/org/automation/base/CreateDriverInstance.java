package org.automation.base;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriverInstance {
	
	public WebDriver driver;
	@BeforeMethod
	public void intiateDriverInstance() throws IOException
	{
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationUrl").toString());	
	}
	@AfterMethod
	public void closeDriverInstace()
	{
		driver.quit();
	}

}
