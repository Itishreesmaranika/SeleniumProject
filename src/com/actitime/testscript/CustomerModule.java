package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	String customerName =f.getExcelData("CreateCustomer", 1, 2);
	String customerdescription = f.getExcelData("CreateCustomer", 1, 3);
	Reporter.log("Create Customer",true);
	HomePage h=new HomePage(driver);
	h.setTask();
	TaskListPage t=new TaskListPage(driver);
	Thread.sleep(2000);
	t.getAddNewBtn().click();
	t.getNewcustomer().click();
	t.getCustomername().sendKeys(customerName);
	t.getDescription().sendKeys(customerdescription);
	t.getSelectcustomer().click();
	t.getOurcompany().click();
	t.getCreatecustomer().click();
	Thread.sleep(3000);
	String actualcustomer = t.getActualcustomer().getText();
	assertEquals(actualcustomer, customerName);
	}
}
