package org.automaion.testcases;

import java.io.IOException;

import org.automation.base.CreateDriverInstance;
import org.automation.datagenerator.DataGenrator;
import org.automation.pages.LoginPage;
import org.automation.utility.Utility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends CreateDriverInstance {
	
	
	@Test//(dataProvider="excelData",dataProviderClass=DataGenrator.class)
	public void tc_001_login_fuctionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Uname1");
		Utility.captureScreenshot(driver, "Entername");
		login.enterPassword("Pass1");
		login.clickSighin();
		
	}
	@AfterMethod
	public void failTestScreenshot(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			System.out.println(result);
			Utility.captureScreenshot(driver, "fail");
		}
	}
}	
