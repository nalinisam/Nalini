package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class FindLeads extends Annotations
{
 public FindLeads()
 {
	 PageFactory.initElements(driver, this);
 }
 
 String exactTxt = "No records to display";
 @FindBy(how=How.XPATH, using="//span[text()='Email']")
 private WebElement eleemail;
 
 @FindBy(how=How.XPATH, using="//input[@name='emailAddress']")
 private WebElement eleemailaddress; 
 
 @FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
 private WebElement elefindleadsbutton; 
 
 
 @FindBy(how=How.XPATH, using="(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")
 private WebElement elefirstresultinglead;
 
 @FindBy(how=How.XPATH, using="//div[contains(@class,'x-form-element')]/input[@name='id']")
 private WebElement eleleadid;
 
 @FindBy(how=How.XPATH, using="//div[@class='x-paging-info']")
 private WebElement elemsg;
 
 
 public FindLeads clickEmailTab()
 {
	 click(eleemail);
	 return this;
 }
 
 public FindLeads enterEmailId(String emailId)
 {
	 append(eleemailaddress,emailId);
	 return this;
 }
 
 public FindLeads enterLeadId(String leadId)
 {
	 append(eleleadid,leadId);
	 return this;
 }

 public FindLeads clickFindLeadsButton()
 {
	 click(elefindleadsbutton);
	 return this;
 }
 
 public ViewLead clickFirstResultingLead()
 {
	 click(elefirstresultinglead);
	 return new ViewLead();
 }
 
//Capture Id of First Resulting lead
 public FindLeads captureID_FirstResultingLead()
 {
	 expText=getTypedText(elefirstresultinglead);
	 return this;
	 
 }
 
//Enter captured lead ID
 public FindLeads enterCapturedLeadID()
 {
	 append(eleleadid,expText);
	 return this;
 }
 
//Verify error msg
 public void verifyErrorMsg()
 {
	 verifyExactText(elemsg,exactTxt);
	
 }

		
}
