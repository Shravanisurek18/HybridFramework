package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrackYourOrderPage {
	
	public WebDriver driver;
	
	By emailaddress = By.id("ola_email");
	
	By ordernumber = By.id("ola_orderNumber");
	
	By findorder = By.id("ola_submitButton");
	
	public TrackYourOrderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement EmailAddress()
	{
		return driver.findElement(emailaddress);
	}
	
	public WebElement OrderNumber()
	{
		return driver.findElement(ordernumber);
	}
	
	public WebElement FindOrder()
	{
		return driver.findElement(findorder);
	}

}
