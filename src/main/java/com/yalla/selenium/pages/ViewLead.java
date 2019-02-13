package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLead extends Annotations
{
 public ViewLead()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(how=How.ID, using="viewLead_firstName_sp")
 private WebElement viewleadFN;
 
 @FindBy(how=How.ID, using="viewLead_companyName_sp")
 private WebElement viewleadCN;

 @FindBy(how=How.LINK_TEXT, using="Edit")
 private WebElement eleeditbutton;
 
 @FindBy(how=How.XPATH, using="//a[text()='Delete']")
 private WebElement eledeletebutton;
 
 public ViewLead verifyViewLeadFN(String firstname)
 {
	 verifyExactText(viewleadFN,firstname);
     return this;
 }
 
//Click Edit
 public EditLead clickEditButton()
 {
	 click(eleeditbutton);
	 return new EditLead();
 }
 
 //Confirm the changed companyname appears
 
 public ViewLead verifyViewLeadCN(String companyname)
 {
	 verifyPartialText(viewleadCN,companyname);
     return this;
 }
  
	 public MyLeads clickDeleteButton()
	 {
		 click(eledeletebutton);
		 return new MyLeads();
	 }
 
}
 
