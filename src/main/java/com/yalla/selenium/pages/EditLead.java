package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class EditLead extends Annotations 
{
 public EditLead()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(how = How.ID, using="updateLeadForm_companyName")
 private WebElement elecompanyname;
 
 @FindBy(how = How.XPATH, using="//input[@value='Update']")
 private WebElement eleupdatebutton;
 
 public EditLead enterCompanyName(String companyname)
 {
	clearAndType(elecompanyname,companyname);
	return this;
 }
 
 public ViewLead clickUpdateButton()
 {
	 click(eleupdatebutton);
	 return new ViewLead();
 }
 
 
}
