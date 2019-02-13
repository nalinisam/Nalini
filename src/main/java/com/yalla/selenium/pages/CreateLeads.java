package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class CreateLeads extends Annotations
{
 public CreateLeads()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(how = How.ID, using="createLeadForm_companyName")
 private WebElement elecompanyname;
 
 @FindBy(how=How.XPATH, using="//div[@class='fieldgroup-body']//following::input[@name='firstName']")
 private WebElement elefirstname;
 
 @FindBy(how=How.XPATH, using="//div[@class='fieldgroup-body']//following::input[@name='lastName']")
 private WebElement elelastname;
 
 @FindBy(how=How.NAME, using="dataSourceId")
 private WebElement elesource;
 
 @FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement elecreateleadbutton;
 
 //static String verifyfirstname;
 public CreateLeads enterCompanyName(String companyname)
 {
	 append(elecompanyname,companyname);
	 return this;
 }

 public CreateLeads enterFirstName(String firstname)
 {
	 append(elefirstname,firstname);
	 return this;
 }
 
 public CreateLeads enterLastName(String lastname)
 {
	 append(elelastname,lastname);
	 return this;
 }
 
 /*public CreateLeads enterSourceId(String source)
 {
	 append(elesource,source);
	 return this;
 }*/
 
 public CreateLeads enterSourceId(String source)
 {
	 selectDropDownUsingText(elesource, source);
	 return this;
 }
 public ViewLead clickCreateLeadButton()
 {
	 click(elecreateleadbutton);
	 return new ViewLead();
 }
 
}
