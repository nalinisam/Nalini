package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.yalla.testng.api.base.Annotations;

public class MyHomePage extends Annotations
{
	public MyHomePage()
	  {
		  PageFactory.initElements(driver,this);
	  }
	  
	  @FindBy(how=How.XPATH, using="//a[text()='Leads']")
	  private WebElement eleleads;
	  
	  @FindBy(how=How.XPATH, using="//a[text()='Create Lead']")
	  private WebElement elecreateleads;
	  
	  public MyLeads clickLeads()
	  {
		  click(eleleads);
		  return new MyLeads();
	  }
	  
	  public CreateLeads clickCreateLeads()
	  {
		  click(elecreateleads);
		  return new CreateLeads();
	  }
}
