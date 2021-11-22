package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("input[id*='CustomerEmail']");
	
	By password=By.cssSelector("input[id*='CustomerPassword']");
	
	By signin=By.cssSelector("input[value*='Sign In']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}

}
