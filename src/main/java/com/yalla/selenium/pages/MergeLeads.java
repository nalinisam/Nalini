package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yalla.testng.api.base.Annotations;

public class MergeLeads extends Annotations
{
	public MergeLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//img[@alt='Lookup']")
	private WebElement eleiconfromlead;
	
	@FindBy(how=How.XPATH, using="(//img[@alt='Lookup'])[2]")
	private WebElement eleicontolead;
	
	@FindBy(how=How.XPATH, using="//a[@class='buttonDangerous']")
	private WebElement elemergebutton;
	
	public NewWindow clickIconFromLead()
	{
		click(eleiconfromlead);
		return new NewWindow();
		
	}
	
	public NewWindow clickIconToLead()
	{
		click(eleicontolead);
		return new NewWindow();
		
	}
	
	public void clickMergeLeadButton()
	{
		click(elemergebutton);
		
	}
	
	public MyLeads clickAlertOkButton()
	{
		acceptAlert();
		return new MyLeads();
	}
	
	
	/*//Click Merge Leads
    click(locateElement("link","Merge Leads"));
    
    //Click on Icon near From Lead
    click(locateElement("xpath","//img[@src='/images/fieldlookup.gif']"));
    
    //Move to new window
    switchToWindow(1);
    
    //Enter Lead ID
    
    append(locateElement("xpath","//input[@name='id']"),"10161");
    
    //Click Find Leads button
    click(locateElement("xpath","//button[text()='Find Leads']"));
    
    Thread.sleep(3000);
    
    //Click First Resulting Lead
    click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
    
    //Switch back to primary window
    switchToWindow(0);
    
    //Click on Icon near to Lead
    click(locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]"));
    
    
    //Move to new window
    switchToWindow(1);
    
    //Enter Lead Id
    append(locateElement("xpath","//input[@name='id']"),"10164");
    
    //Click Find Leads button
    click(locateElement("xpath","//button[text()='Find Leads']"));
    
    Thread.sleep(3000);
    
    //Click first resulting lead
    click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
    
    //Switch back to primary window
    switchToWindow(0);
    
    //Click Merge
    click(locateElement("xpath","//a[@class='buttonDangerous']"));
    
    //Accept Alert
    acceptAlert();
    
    //Click Find Leads
    click(locateElement("xpath","//a[text()='Find Leads']"));
    
    //Enter from leadId
   
    append(locateElement("xpath","//input[@name='id']"),"10161");
    
    //Click Find leads
    click(locateElement("xpath","//button[text()='Find Leads']"));
    
    //Verify error msg
  
    verifyExactText(locateElement("xpath","//div[@class='x-paging-info']"),"No records to display");
*/   		

}
