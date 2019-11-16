package myproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myproject.base.TestBase;

public class LoginPage extends TestBase
{
	//Page Factory OR Object Repository
	
	
	//Username Textbox
	@FindBy(id="txtUsername")
	WebElement username;
	
	//Password Textbox
	@FindBy(id = "txtPassword")
	WebElement password;
	
	//Login Button
	@FindBy(name = "Submit")
	WebElement loginBtn;
	
	//OrangeHRM Logo
	@FindBy(xpath = "//div[@id='divLogo']")
	WebElement logo;
	
	//Forgot your password link
	@FindBy(partialLinkText = "Forgot")
	WebElement forgotPwdLink;
	
	//Create a constructor which Initialize the Page Objects through PageFactory class
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions to be performed on LoginPage
	
	//Verify the Page Title
	public String pageTitle() 
	{
		return driver.getTitle();
	}
	
	//Verify the logo
	public boolean logo() 
	{
		return logo.isDisplayed();
	}
	
	//Click Forgot your password? link
	public void clickForgotPwdLink()
	{
		forgotPwdLink.click();
	}
	
	//Verify the Login
	public void login(String userName, String pwd) 
	{
		username.sendKeys(userName);
		password.sendKeys(pwd);
		loginBtn.click();
	}
}
