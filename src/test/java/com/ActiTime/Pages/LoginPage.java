package com.ActiTime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="username")
	public WebElement loginUserid;

	@FindBy(name="pwd")
	public WebElement password;

	@FindBy(id="loginButton")
	public WebElement loginButton;



	public void login(String username, String pwd){

		loginUserid.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();

	}


}
