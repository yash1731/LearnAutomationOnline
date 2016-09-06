package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
	this.driver=ldriver;
		
	}
	@FindBy(xpath=".//*[@id='nav-link-yourAccount']") WebElement SingInlink;
	@FindBy(xpath=".//*[@id='nav-link-prime']") WebElement TryPrime;
	@FindBy(xpath=".//*[@id='nav-link-wishlist']") WebElement YourList;
	@FindBy(xpath=".//*[@id='nav-cart']") WebElement Basket;
	
	public void clickOnSigninLink()
	{
		SingInlink.click();
		
	}
	public void clickOnTryPrime()
	{
		TryPrime.click();
		
	}
	public void clickOnYourList()
	{
		YourList.click();
		
	}
	public void clickOnBasket()
	{
		Basket.click();
		
	}
	
	public String getApplicationTitle()
	{
	return driver.getTitle();
	}
	
}










