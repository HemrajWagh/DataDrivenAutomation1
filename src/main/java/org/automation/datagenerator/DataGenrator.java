package org.automation.datagenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenrator {
	
	@DataProvider(name="excelData")
	public Object[][] GetExcelData() throws Exception
	{
		FileInputStream file = new FileInputStream("./Excel/ExcelData2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("login");
		int noofrow = sheet.getPhysicalNumberOfRows();
		Object [][] testdata = new Object[noofrow][2];
		for(int i=0;i<=noofrow;i++)
		try{	
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testdata[i][0] = username.getStringCellValue();
			testdata[i][1] = password.getStringCellValue();
	}}
	catch (Exception e) {
		// TODO: handle exception
	}
	
		return testdata;
	}	
}

