package myproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import myproject.base.TestBase;

public class HomePage extends TestBase
{
	//Page Factory OR Object Repository
	
	//Welcome Link
	@FindBy(id = "welcome")
	@CacheLookup
	WebElement welComeLinkElement;
	
	//Logout Link
	@FindBy(linkText = "Logout")
	WebElement logoutLinkElement;
	
	//About Link
	@FindBy(linkText = "About")
	WebElement aboutLinkElement;
	
	
	
	//Create a constructor which Initialize the Page Objects through PageFactory class
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions to be performed on HomePage
	//Welcome Link
	public void welComeLink()
	{
		boolean welcome = welComeLinkElement.isDisplayed();
		Assert.assertTrue(welcome);
		
	}
	
	//Welcome Link Click
	public void welComeLinkClick() 
	{
		welComeLinkElement.click();
	}
	
	//Logout Link Click
	public void logoutLink() 
	{
		logoutLinkElement.click();
	}
	
	//About Link Click
	public void aboutLink() 
	{
		aboutLinkElement.click();
	}
	
	//About Popup
	public void aboutPopUp() 
	{
		//String aboutAlertText = driver.switchTo().alert().getText();
		String aboutAlertText = driver.findElement(By.id("displayAbout")).getText();
		System.out.println(aboutAlertText);
	}
	
}
