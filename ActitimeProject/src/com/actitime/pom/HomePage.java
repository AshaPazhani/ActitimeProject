package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskstab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setlogout() throws InterruptedException
	{
		Thread.sleep(5000);
		logoutbtn.click();
	}
	public void setTasksTab()
	{
		taskstab.click();
	}

}
