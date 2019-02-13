package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class LoginPage extends Annotations{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using = "username") private WebElement eleuname;
	@FindBy(how=How.ID, using = "password") private WebElement elepassword;
	@FindBy(how=How.CLASS_NAME, using = "decorativeSubmit") private WebElement eleloginbutton;
	@FindBy(how=How.XPATH, using = "//div[@id='errorDiv']") private WebElement eleerrmsg;

	/*public String getFirstName() {
		String elementText = getElementText(elepassword);
		return elementText; 
	}*/
	public LoginPage enterUserName(String username) {
		clearAndType(eleuname,username);
		return this;
	}
	public LoginPage enterPassword(String password) {
		clearAndType(elepassword,password);
		return this;
	}

	public HomePage clickLoginButton() {
		click(eleloginbutton);
		return new HomePage();
	}

	public LoginPage clickLoginNeg()
	{
		click(eleloginbutton);
		return this;
	}
	public LoginPage verifyErrorMsg()
	{
		String errmsg = eleerrmsg.getText(); 
		//return new HomePage();
		if(errmsg.contains("Error"))
		{
			System.out.println(errmsg);
			reportStep("Entered incorrect username and password","fail");
		}
		return this;


	}



}




