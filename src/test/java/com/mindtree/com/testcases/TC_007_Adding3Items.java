package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.CartPage;
import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

public class TC_007_Adding3Items extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Test
	public void Cart_Three_Items() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h=new HomePage(driver);
		h.Search().sendKeys("friends bobbleheads");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Search page is opened");
		SearchPage s=new SearchPage(driver);
		s.Bobbleheads().click();
		log.info("Product description page is opened");
		ProductPage p=new ProductPage(driver);
		p.Add().click();
		log.info("product is added to cart");
		CartPage c=new CartPage(driver);
		c.Cont().click();
		log.info("Shopping can be continued");
		p.Monica().click();
		log.info("Another product can be selected");
		p.Add().click();
		log.info("product is added to cart");
		c.Cont().click();
		log.info("Shopping can be continued");
		p.Joey().click();
		log.info("Another product can be selected");
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
