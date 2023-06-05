package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newcustomer;
@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
private WebElement customername;
@FindBy(xpath="(//textarea [@placeholder=\"Enter Customer Description\"])")
private WebElement description;
@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement selectcustomer;
@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow '] ")
private WebElement ourcompany;
@FindBy(xpath="//div[@class=\"components_button withPlusIcon\"] ")
private WebElement createcustomer;
@FindBy(xpath="//div[@class=\"titleEditButtonContainer\"]/div[1]")
private WebElement actualcustomer;
@FindBy(xpath="//div[@class=\"item createNewProject\"]")
private WebElement newproject;
@FindBy(xpath="(//input[@placeholder=\"Enter Project Name\"])[2]")
private WebElement enterprojectname;
@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement customerdropdown;
@FindBy(xpath="(//div[text()='Our company'])[7]")
private WebElement ourcompany2;
@FindBy(xpath="//textarea[@placeholder=\"Add Project Description\"]")
private WebElement description2;
@FindBy(xpath="//div[text()='Create Project']")
private WebElement createcustomer2;
@FindBy(xpath="//div[@class=\"titleEditButtonContainer\"]/div[1]")
private WebElement actualproject;
@FindBy(xpath="//div[@class=\"item createNewTasks\"]")
private WebElement newtask;
@FindBy(xpath="//div[text()='- Select Customer -']")
private WebElement customerdrpdwn;
@FindBy(xpath="(//div[text()='Our company'])[11]")
private WebElement ourcompany3;
@FindBy(xpath="//div[text()='- Select Project -']")
private WebElement ourproject;
@FindBy(xpath="(//div[text()='Accounting'])[3]")
private WebElement accounting;
@FindBy(xpath="(//td[@class=\"nameCell first\"]/input[1])[1]")
private WebElement entertaskname;
@FindBy(xpath="//div[text()='Create Tasks']")
private WebElement createacount3;
@FindBy(xpath="(//div[@class=\"namesContainer\"]/div[2])[1]")
private WebElement actualtask;


public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewcustomer() {
	return newcustomer;
}
public WebElement getCustomername() {
	return customername;
}
public WebElement getDescription() {
	return description;
}
public WebElement getSelectcustomer() {
	return selectcustomer;
}
public WebElement getOurcompany() {
	return ourcompany;
}
public WebElement getCreatecustomer() {
	return createcustomer;
}
public WebElement getActualcustomer() {
	return actualcustomer;
}
public WebElement getNewproject() {
	return newproject;
}
public WebElement getEnterprojectname() {
	return enterprojectname;
}
public WebElement getCustomerdropdown() {
	return customerdropdown;
}
public WebElement getOurcompany2() {
	return ourcompany2;
}
public WebElement getDescription2() {
	return description2;
}
public WebElement getCreatecustomer2() {
	return createcustomer2;
}
public WebElement getActualproject() {
	return actualproject;
}
public WebElement getNewtask() {
	return newtask;
}
public WebElement getCustomerdrpdwn() {
	return customerdrpdwn;
}
public WebElement getOurcompany3() {
	return ourcompany3;
}
public WebElement getOurproject() {
	return ourproject;
}
public WebElement getAccounting() {
	return accounting;
}
public WebElement getEntertaskname() {
	return entertaskname;
}
public WebElement getCreateacount3() {
	return createacount3;
}
public WebElement getActualtask() {
	return actualtask;
}
}
