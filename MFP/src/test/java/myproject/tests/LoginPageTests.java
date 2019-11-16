package myproject.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myproject.base.TestBase;
import myproject.pages.LoginPage;



public class LoginPageTests extends TestBase
{
	//Initialize the LoginPage at the class level so that we can use it in all the methods
	LoginPage loginPage;
	HomePageTests homePageTests;
	
	//Create the constructor so that we can initialize and call the TestBase constructor using Super() keyword 
	public LoginPageTests() 
	{
		super(); //This will call the parent (TestBase) class constructor
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		homePageTests = new HomePageTests();
	}
	
	@Test //(priority = 1)
	public void validateLoginPageTitle()
	{
		String title = loginPage.pageTitle();
		Assert.assertEquals(title, "OrangeHRM", "The Title is not matching");
	}
	
	@Test //(priority = 2)
	public void validateLogo()
	{
		boolean Logo = loginPage.logo();
		Assert.assertTrue(Logo);
	}
	
	@Test //(priority = 3)
	public void validateLogin()
	{
		loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		homePageTests.validateWelComeLinkPresent();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
