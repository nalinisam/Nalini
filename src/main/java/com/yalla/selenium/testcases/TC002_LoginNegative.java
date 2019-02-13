package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_LoginNegative extends Annotations
{

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_LoginNegative";
		testDescription = "Login Negative";
		testNodes = "Login";
		authors = "Nalini";
		category = "Smoke";
		excelFileName = "lg";
	}
	@Test(dataProvider="fetchData")
	public void loginPositive(String username, String password) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginNeg()
		.verifyErrorMsg();
		 
		// Another way 
		/*LoginPage page = new LoginPage();
		page.enterUserName(username);
		page.enterPassword(password);
		page.clickLoginButton();*/
		
	}
	
}









