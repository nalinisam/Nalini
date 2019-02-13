package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class HomePage extends Annotations {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using = "CRM/SFA") private WebElement crmsfa;
	@FindBy(how=How.CLASS_NAME, using = "decorativeSubmit") private WebElement logoutbutton;
	public void passFirstName(String data) {
		verifyExactText(crmsfa, data);
	}
	public MyHomePage clickCrmSfa() {
		click(crmsfa);	
		return new MyHomePage();
	}
	public LoginPage clickLogOut() {
		click(logoutbutton);
		return new LoginPage();
	}

}
