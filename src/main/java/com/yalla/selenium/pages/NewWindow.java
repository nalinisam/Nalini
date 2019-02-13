package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yalla.testng.api.base.Annotations;

public class NewWindow extends Annotations 
{
	public NewWindow()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	private WebElement elefrmleadid;
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement elefindleadbuttn;
	
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	private WebElement elefirstresultlead;
	
	public MergeLeads clickFirstResultLead(String id)
	{
		switchToWindow(1);
		append(elefrmleadid,id);
		click(elefindleadbuttn);
		click(elefirstresultlead);
		switchToWindow(0);
		return new MergeLeads();
		
	}
	
	
	
}
