package com.yalla.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.yalla.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class Annotations extends SeleniumBase {
	public static String expText;
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	


	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}

	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome", "http://leaftaps.com/opentaps");		
	}

	@AfterMethod	
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
	}

	@AfterMethod
	public void afterMethod(){
		close();

	}


}
