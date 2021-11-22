package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.BirthdayGiftPage;
import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.utilities.ReadConfig;

import junit.framework.Assert;

public class TC_008_ValidateTitle extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Test
	public void Title() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h=new HomePage(driver);
		h.dropDown();
		log.info("Birthday gifts is selected from dropdown");
		BirthdayGiftPage bp=new BirthdayGiftPage(driver);
		Assert.assertEquals(bp.Title().getText(),"Birthday Gifts by Recipient");
		log.info("Title validation done");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}


}
