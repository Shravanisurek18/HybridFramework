package com.mindtree.com.pageobjects;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	public WebDriver driver;
	
	By signin = By.linkText("sign in");
	
	By search = By.cssSelector("input[type*='search']");
	
	By mainmenu = By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[7]/a");
	
	By submenu = By.linkText("Birthday Gifts");
	
	By shop = By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/a");
	
	By person = By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/ul/li[1]/a");
	
	By minion = By.linkText("Minion Lover");
	
	By track = By.linkText("Track your order");

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dropDown()
	{
		new Actions(driver).moveToElement(driver.findElement(mainmenu)).build().perform();
		new Actions(driver).moveToElement(driver.findElement(submenu)).click().build().perform();
	}
	
	public void dropDown2()
	{
		new Actions(driver).moveToElement(driver.findElement(shop)).build().perform();
		new Actions(driver).moveToElement(driver.findElement(person)).build().perform();
		new Actions(driver).moveToElement(driver.findElement(minion)).click().build().perform();
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
	public WebElement Track()
	{
		return driver.findElement(track);
	}
	
	
}
