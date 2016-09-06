package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPage {
	
	WebDriver driver;
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		driver = BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	
	@Test
	public void testHomePage()
	{
		
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		AssertJUnit.assertTrue(title.contains("Low Prices in Electronics"));
		
		System.out.println("my application title is " + title);
		
		home.clickOnSigninLink();
		
	    LoginPage login = 	PageFactory.initElements(driver, LoginPage.class);
	    
	    login.loginApplication("yash.dewangan82@gmail.com", "landu17");
	    
	    login.verifySignOutLink();
				                                             
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
	BrowserFactory.closeBrowser(driver);
		
	}
	

}
