package org.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Utility {
	
	
	WebDriver driver;
	public static Object  fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	}
	public static String fetchElementLocator(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/Elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}

	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File( "./Screenshot/"+screenshotName+".png"));
		}catch (Exception e) {
		}
		
	}
	
}

