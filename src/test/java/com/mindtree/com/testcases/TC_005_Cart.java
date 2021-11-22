package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

public class TC_005_Cart extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
 
	
	@Test
	public void Cart() throws IOException
	{
		driver=initializeDriver();
		log.info("driver is intialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h=new HomePage(driver);
		h.Search().sendKeys("scratch world map");
		h.Search().sendKeys(Keys.ENTER);
		log.info("navigated to search page");
		SearchPage s=new SearchPage(driver);
		s.Map().click();
		log.info("navigated to product description page");
		ProductPage p=new ProductPage(driver);
		p.Add().click();
		log.info("Product is added to cart");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}

}
