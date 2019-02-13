package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC005_EditLead extends Annotations
{
	 @BeforeTest
	  public void setData()
	  {
		    testCaseName = "TC005_EditLead";
			testDescription = "Edit Lead";
			testNodes = "Edit";
			authors = "Nalini";
			category = "Smoke";
			excelFileName = "el";
	  }
	 
	 @Test(dataProvider = "fetchData")
	 public void editLead(String username,String password,String emailId,String companyname)
	 {
		 new LoginPage()
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton()
			.clickCrmSfa()
			.clickLeads()
			.clickFindLeadLink()
			.clickEmailTab()
			.enterEmailId(emailId)
			.clickFindLeadsButton()
			.clickFirstResultingLead()
			.clickEditButton()
			.enterCompanyName(companyname)
			.clickUpdateButton()
			.verifyViewLeadCN(companyname);
			
	 }
}
