package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyLeads extends Annotations
{
 public MyLeads()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(how=How.XPATH, using="//a[text()='Create Lead']")
 private WebElement elecreatelead;
 
 @FindBy(how=How.XPATH, using="//a[text()='Find Leads']")
 private WebElement elefindlead;
 
 @FindBy(how=How.LINK_TEXT, using="Merge Leads")
 private WebElement elemergelead;
 
 public CreateLeads clickCreateLeadLink()
 {
   click(elecreatelead); 
   return new CreateLeads();
 }
 
 public FindLeads clickFindLeadLink()
 {
   click(elefindlead);
   return new FindLeads();
 }
 
 public MergeLeads clickMergeLeadLink()
 {
   click(elemergelead); 
   return new MergeLeads();
 }
 
 
}
