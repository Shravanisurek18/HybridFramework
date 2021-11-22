package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MinionGiftsPage {
	
	public WebDriver driver;
	
	By figure = By.cssSelector("a[data-product-id*='6249188720838']");
	
	public MinionGiftsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Figure()
	{
		return driver.findElement(figure);
	}

}
