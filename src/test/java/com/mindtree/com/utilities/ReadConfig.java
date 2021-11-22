package com.mindtree.com.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadConfig {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sravani-jukebox\\ComprehensiveAssessment\\Configuration\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravani-jukebox\\ComprehensiveAssessment\\Driver\\chromedrivernew.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("internet explorer"))
		{
			System.setProperty("","C:\\Users\\sravani-jukebox\\ComprehensiveAssessment\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("C://Users//sravani-jukebox//ComprehensiveAssessment//screenshots//"+result+"screenshot.png"));
	}
	

}



	

