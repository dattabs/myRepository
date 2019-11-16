package MavenFirstProject.MFP;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myproject.base.TestBase;
import myproject.pages.HomePage;
import myproject.pages.LoginPage;

public class HomePageTests extends TestBase
{
	//Initialize the HomePage at the class level so that we can use it in all the methods
		HomePage homePage;
		LoginPage loginPage;
		
		//Create the constructor so that we can initialize and call the TestBase constructor using Super() keyword 
		public HomePageTests() 
		{
			super(); //This will call the parent (TestBase) class constructor
		}
		
		@BeforeMethod
		public void setup()
		{
			initialization();
			homePage = new HomePage();
			loginPage = new LoginPage();
			loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		}
		
		
		@Test(priority = 1)
		public void validateWelComeLinkPresent() 
		{
			
			homePage.welComeLink();

		}
		
		@Test(priority = 3)
		public void validateLogout() 
		{
			
			homePage.welComeLinkClick();
			homePage.logoutLink();
			loginPage.logo();
			

		}
		
		@Test(priority = 2)
		public void validateAboutLink()
		{
			
			homePage.welComeLinkClick();
			homePage.aboutLink();
			homePage.aboutPopUp();
			
		}
		
		
		@AfterMethod
		public void tearTown()
		{
			driver.quit();
		}

}
