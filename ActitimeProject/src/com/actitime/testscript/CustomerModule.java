package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.Filelib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TasklistPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends Baseclass{
@Test
public void testCreatecustomer() throws EncryptedDocumentException, IOException {
	Reporter.log("Create customer",true);
	HomePage h= new HomePage(driver);
	h.setTasksTab();
	Filelib f= new Filelib();
	String custname = f.getExcelData("Createcustomer", 1, 3);
	String project = f.getExcelData("Createcustomer", 1, 4);
	TasklistPage t=new TasklistPage(driver);
	t.getAddnewbtn().click();
	t.getNewcustomer().click();
	t.getCustomername().sendKeys(custname);
	t.getCusdescrip().sendKeys(project);
	t.getSelectcus().click();
	t.getBigbangcom().click();
	t.getCreatecus().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualtitle(),custname));
	String actualtitle = t.getActualtitle().getText();
	Assert.assertEquals(actualtitle,custname );
	
}
}
