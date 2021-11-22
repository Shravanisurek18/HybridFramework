package com.mindtree.com.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.LoginPage;
import com.mindtree.com.utilities.ReadConfig;
import com.mindtree.com.utilities.ReadExcel;

public class TC_001_Login extends ReadConfig{
	


public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Test(dataProvider="getdata")
	public void Login(String user, String pass) throws IOException
	{
		
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Navigated to URL");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		HomePage h=new HomePage(driver);
		h.SignIn().click();
		log.info("Navigated to Login Page");
		LoginPage l=new LoginPage(driver);
		l.Email().sendKeys(user);
		log.info("Email address is entered");
		l.Password().sendKeys(pass);
		log.info("Password is entered");
		l.SignIn().click();
		log.info("login is successful");
	}
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		Object[][] data = ReadExcel.getDetails("login");
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
