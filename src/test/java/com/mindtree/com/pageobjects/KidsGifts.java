package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KidsGifts {
	
	public WebDriver driver;
	
	By gift = By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[1]/div[1]/div/a");
	
	public KidsGifts(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Gift()
	{
		return driver.findElement(gift);
	}

}
