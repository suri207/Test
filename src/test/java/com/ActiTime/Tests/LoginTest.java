package com.ActiTime.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ActiTime.Pages.LoginPage;
import com.ActiTime.config.BaseExample;
import com.ActiTime.config.WebDriverEvents;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseExample {

	@Test
	public   void main( ) {

		test = extent.startTest("passTest");
		//test.log(LogStatus.PASS, "Pass");
		//Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
 	 	
		WebDriver wdriver = new FirefoxDriver();
		EventFiringWebDriver driver= new EventFiringWebDriver(wdriver);
		WebDriverEvents Webdevents = new WebDriverEvents();
		driver.register(Webdevents);
  
		test.log(LogStatus.INFO, "launching the browser");

		driver.get("http://localhost/login.do");
		test.log(LogStatus.INFO, "navigating to the url");

		LoginPage lp= PageFactory.initElements(driver, LoginPage.class);
		test.log(LogStatus.INFO, "loging to application");

		lp.login("admin", "manager");
		test.log(LogStatus.INFO, "loging to application sucessfually");


	}

}
