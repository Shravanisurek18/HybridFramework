package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.MinionGiftsPage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.utilities.ReadConfig;


public class TC_009_IncreaseQuantity extends ReadConfig {
	
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
		h.dropDown2();
		log.info("minion lover is selected from dropdown");
		MinionGiftsPage m=new MinionGiftsPage(driver);
		m.Figure().click();
		log.info("minion gifts page is opened");
		ProductPage p=new ProductPage(driver);
		p.Increase().click();
		log.info("quantity is increased");
		p.Add().click();
		log.info("product is added to cart");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}
	
}
