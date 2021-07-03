package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration of Variables.
	@FindBy(id ="username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pstbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgnbtn;
	
	//Initialization of variable
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Business Logics
	//Utilization
	public void setUser(String un, String pass) {
		untbx.sendKeys(un);
		pstbx.sendKeys(pass);
		lgnbtn.click();
	}

}
