package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BirthdayGiftPage {
	
	public WebDriver driver;
	
	By kid= By.xpath("//*[@id=\"mygiftpage\"]/div[1]/div[1]/div[3]/a");
	
	By title = By.xpath("//*[@id=\"mygiftpage\"]/div[1]/h2[1]");
	
	public BirthdayGiftPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement KidGift()
	{
		return driver.findElement(kid);
	}
	
	public WebElement Title()
	{
		return driver.findElement(title);
	}

}
