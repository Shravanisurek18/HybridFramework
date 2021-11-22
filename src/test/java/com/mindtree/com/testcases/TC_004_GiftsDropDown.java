package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.BirthdayGiftPage;
import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.KidsGifts;
import com.mindtree.com.utilities.ReadConfig;

public class TC_004_GiftsDropDown extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Test
	public void Dropdown() throws IOException
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
		log.info("Navigated to Search Page by selecting from dropdown");
		BirthdayGiftPage bp=new BirthdayGiftPage(driver);
		bp.KidGift().click();
		log.info("Navigated to Birthday gifts page");
		KidsGifts kg = new KidsGifts(driver);
		kg.Gift().click();
		log.info("Navigated to Kids gift page");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}

}
