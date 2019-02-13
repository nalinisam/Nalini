package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.CreateLeads;
import com.yalla.selenium.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC003_CreateLead extends Annotations
{
	@BeforeTest
	public void setData() 
	{
		testCaseName = "TC003_CreateLead";
		testDescription = "Create Lead";
		testNodes = "Create";
		authors = "Nalini";
		category = "Smoke";
		excelFileName = "cl";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String username, String password, String companyname, String firstname, String lastname, String source )
	{
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfa()
		.clickCreateLeads();
		
		//Enter data in create lead form and verify firstname in viewlead page
		new CreateLeads()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterSourceId(source)
		.clickCreateLeadButton()
		.verifyViewLeadFN(firstname);
		
	}
}
