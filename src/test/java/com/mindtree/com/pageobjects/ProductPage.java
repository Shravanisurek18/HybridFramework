package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	public WebDriver driver;
	
	By pincode=By.cssSelector("input[id*='PostalCode']");
	
	By check=By.cssSelector("button[onclick*='checkCodAvailability()']");
	
	By add = By.cssSelector("button[name*='add']");
	
	By click=By.cssSelector("button[aria-label*='Add to Wishlist']");
	
	By rachel = By.cssSelector("input[id*='ProductSelect-7019647205574-option-style-Rachel']");
	
	By monica = By.xpath("//*[@id=\"ProductSelect-7019647205574-option-0\"]/div[2]/label");
	
	By joey = By.xpath("//*[@id=\"ProductSelect-7019647205574-option-0\"]/div[6]/label");
	
	By increase = By.xpath("//*[@id=\"AddToCartForm-6249188720838\"]/div[2]/div/span[1]");

	
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Pincode()
	{
		return driver.findElement(pincode);
	}
	
	public WebElement Check()
	{
		return driver.findElement(check);
	}
	
	public WebElement Add()
	{
		return driver.findElement(add);
	}
	
	public WebElement Click()
	{
		return driver.findElement(click);
	}
	
	public WebElement Rachel()
	{
		return driver.findElement(rachel);
	}
	
	public WebElement Monica()
	{
		return driver.findElement(monica);
	}
	
	public WebElement Joey()
	{
		return driver.findElement(joey);
	}
	
	public WebElement Increase()
	{
		return driver.findElement(increase);
	}

}
