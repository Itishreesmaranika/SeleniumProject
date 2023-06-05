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
public class ProjectModule extends BaseClass {
@Test
public void testcreateproject() throws EncryptedDocumentException, IOException, InterruptedException {
	String projectname = f.getExcelData("ProjectModule", 1, 3);
	String description = f.getExcelData("ProjectModule", 1, 4);
	Reporter.log("Create Project",true);
	HomePage h=new HomePage(driver);
	h.setTask();
	TaskListPage t=new TaskListPage(driver);
	Thread.sleep(2000);
	t.getAddNewBtn().click();
	t.getNewproject().click();
	t.getEnterprojectname().sendKeys(projectname);
	t.getCustomerdropdown().click();
	t.getOurcompany2().click();
	t.getDescription2().sendKeys(description);
	t.getCreatecustomer2().click();
	Thread.sleep(2000);
	String actualproject = t.getActualproject().getText();
	assertEquals(actualproject, projectname);
}
}
