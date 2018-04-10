package org.automation.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	
	public static boolean validatePageUrl(WebDriver driver,String expectedUrl)
	{
		boolean flag = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedUrl))
		{
			flag = true;
		}
		return flag;
	}
	public static void validatePageTitle(WebDriver  driver,String expectedTitle)
	{
		boolean flag = false;
		if(driver.getTitle().equalsIgnoreCase(expectedTitle));
	}
}
