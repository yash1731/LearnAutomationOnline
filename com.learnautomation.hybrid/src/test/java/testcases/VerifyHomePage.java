package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
	
	WebDriver driver;
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	
	@Test
	public void testHomePage()
	{
		
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		AssertJUnit.assertTrue(title.contains("Low Prices in Electronics"));
		
		System.out.println("my application title is " + title);
				                                             
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
	BrowserFactory.closeBrowser(driver);
		
	}
	

}
