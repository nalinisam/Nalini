package com.yalla.selenium.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.LoginPage;
import com.yalla.selenium.pages.MergeLeads;
import com.yalla.selenium.pages.MyLeads;
import com.yalla.selenium.pages.NewWindow;
import com.yalla.testng.api.base.Annotations;

public class TC004_MergeLead extends Annotations
{
  @BeforeTest
  public void setData()
  {
	    testCaseName = "TC004_MergeLead";
		testDescription = "Merge Lead";
		testNodes = "Merge";
		authors = "Nalini";
		category = "Smoke";
		excelFileName = "mrg";
  }
  
  @Test(dataProvider = "fetchData")
 public void mergeLead(String username,String password,String fromId, String toId)
 {
	  new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLeads()
		.clickMergeLeadLink()
		.clickIconFromLead()
		.clickFirstResultLead(fromId)
		.clickIconToLead()
		.clickFirstResultLead(toId)
		.clickMergeLeadButton();
	  
	  new MergeLeads()
	  .clickAlertOkButton()
	  .clickFindLeadLink()
	  .enterLeadId(fromId)
	  .clickFindLeadsButton()
	  .verifyErrorMsg();
	  
 }
  
}
