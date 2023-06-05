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
public class TaskModule extends BaseClass {
	@Test
	public void testcreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
		String taskname = f.getExcelData("TaskModule", 1, 3);
		Reporter.log("Create Task",true);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		Thread.sleep(2000);
		t.getAddNewBtn().click();
		t.getNewtask().click();
		t.getCustomerdrpdwn().click();
		t.getOurcompany3().click();
		t.getEnterprojectname().click();
		t.getAccounting().click();
		t.getEntertaskname().sendKeys("h");
		t.getCreateacount3().click();
		String actualtask = t.getActualtask().getText();
		assertEquals(actualtask, taskname);
}
}
