	package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage 
	{
		
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	
	@FindBy(xpath=(".//*[@id='ap_email']")) WebElement username;
	@FindBy(xpath=".//*[@id='ap_password']") WebElement password;
	@FindBy(xpath=".//*[@id='signInSubmit']") WebElement SignUpButton;
	@FindBy(xpath=".//*[@id='nav-item-signout']/span")WebElement signOut;
	By signout = By.xpath(".//*[@id='nav-item-signout']/span");
	
	public void loginApplication(String user, String pass)
	{
	username.sendKeys(user);
	password.sendKeys(pass);
	SignUpButton.click();
		
	}
	public void verifySignOutLink()
	{
	WebDriverWait  wait = new WebDriverWait(driver,10);
	WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(signout));
	
	String text = ele.getText();
	
	//Assert.assertEquals(text, "Sign Out","sign out link not verify properly");
	
	}
	
	

	}
