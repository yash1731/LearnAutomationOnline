package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

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

public class VerifyLoginPageWithReport {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest  logger;
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		report = new ExtentReports(".\\Reports\\LoginPageReport.html",true);
		
		logger = report.startTest("verify login test");
		
		driver = BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		
		logger.log(LogStatus.INFO, "Application is up and running");
	}
	
	
	@Test
	public void testHomePage()
	{
		
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		AssertJUnit.assertTrue(title.contains("Low Prices in Electronics"));
		
		logger.log(LogStatus.PASS, "Home page loged and verify");
		
		System.out.println("my application title is " + title);
		
		home.clickOnSigninLink();
		
		logger.log(LogStatus.INFO, "click on sign out link");
		
	    LoginPage login = 	PageFactory.initElements(driver, LoginPage.class);
	    
	    login.loginApplication("yash.dewangan82@gmail.com", "landu17");
	    
	    logger.log(LogStatus.INFO, "long in to application");
	    
	    login.verifySignOutLink();
	    
	    logger.log(LogStatus.PASS, "sign out link present");
				                                             
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
	BrowserFactory.closeBrowser(driver);
	report.endTest(logger);
	report.flush();
		
	}
	

}
