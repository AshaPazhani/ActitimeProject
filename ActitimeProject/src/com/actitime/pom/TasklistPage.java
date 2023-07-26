package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasklistPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement cusdescrip;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcus;
	
	@FindBy(xpath="(//div[text()='Big Bang Company' and @class='itemRow cpItemRow '])")
	private WebElement bigbangcom;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcus;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualtitle;
	
	public TasklistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCusdescrip() {
		return cusdescrip;
	}

	public WebElement getSelectcus() {
		return selectcus;
	}

	public WebElement getBigbangcom() {
		return bigbangcom;
	}

	public WebElement getCreatecus() {
		return createcus;
	}

	public WebElement getActualtitle() {
		return actualtitle;
	}
	


}
