package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.TrackYourOrderPage;
import com.mindtree.com.utilities.ReadConfig;
import com.mindtree.com.utilities.ReadExcel;

public class TC_011_TrackYourOrder extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Test(dataProvider="getdata")
	public void Track(String user, String num) throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h=new HomePage(driver);
		h.Track().click();
		log.info("Navigated to track your order page");
		TrackYourOrderPage t=new TrackYourOrderPage(driver);
		t.EmailAddress().sendKeys(user);
		log.info("email address is entered");
		t.OrderNumber().sendKeys(num);
		log.info("password is entered");
		t.FindOrder().click();
		log.info("Order is displayed");
	}
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		Object[][] data = ReadExcel.getDetails("status");
		return data;
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
		log.info("Driver is closed");
	}

}
