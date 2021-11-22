package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public WebDriver driver;
	
	By prod=By.cssSelector("a[href*='tree-led-lamp']");
	
	By map=By.xpath("//*[@id=\"snize-product-9400967751\"]/a");
	
	By portrait = By.xpath("//*[@id=\"snize-product-4702068310104\"]/a");
	
	By bobbleheads= By.xpath("//*[@id=\"snize-product-7019647205574\"]/a");
	
	By adiyogi = By.xpath("//*[@id=\"snize-product-6585716277446\"]/a");
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Product()
	{
		return driver.findElement(prod);
	}
	
	public WebElement Map()
	{
		return driver.findElement(map);
	}
	
	public WebElement Portrait()
	{
		return driver.findElement(portrait);
	}
	
	public WebElement Bobbleheads()
	{
		return driver.findElement(bobbleheads);
	}
	
	public WebElement Adiyogi()
	{
		return driver.findElement(adiyogi);
	}

}
