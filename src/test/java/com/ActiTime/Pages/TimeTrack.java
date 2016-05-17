package com.ActiTime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeTrack {

	@FindBy(id="taskSearchControl_field")
	public WebElement taskSearch;
	
	
	
	public void SearchTask(String taskName){
		
		taskSearch.sendKeys(taskName);
	}
	
}
