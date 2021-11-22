package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver;
	
	By cont = By.cssSelector("a[href*='javascript:void(0)']");
	
	By checkbox = By.id("cart-notes");
	
	By from = By.id("from");
	
	By to = By.id("to");
	
	By message = By.cssSelector("input[id*='gift-card']");
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Cont()
	{
		return driver.findElement(cont);
	}
	
	public WebElement CheckBox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement From()
	{
		return driver.findElement(from);
	}
	
	public WebElement To()
	{
		return driver.findElement(to);
	}
	
	public WebElement Message()
	{
		return driver.findElement(message);
	}
}
