package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

public class TC_002_Search extends ReadConfig{
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());	
	
	@Test
	public void Search() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h = new HomePage(driver);
		h.Search().sendKeys("adiyogi");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Product name is entered");
		log.info("Navigated to Search Page");
		SearchPage s=new SearchPage(driver);
		s.Adiyogi().click();
		log.info("Navigated to Product Page");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}

}
