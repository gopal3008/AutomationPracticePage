package com.qa.pages.TestCases;

//import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;

public class HomePageTest extends TestBase{

//	TestBase Testbase;
	HomePage Homepage;
	ContactsPage ContactsPg;
	SignInPage SignInPg;

	
	
	public HomePageTest() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
	initialization();
	Homepage = new HomePage();
//	Homepage.SignInBtn();
//	PageFactory.initElements(driver, this);
	
	}
	@Test(priority=1,groups = "HomePage")
	public void PageLogoTest(){
		boolean flag=Homepage.PageLogoTest();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=2,groups = "HomePage")
	public void HomePageText(){
		String HPText=Homepage.HomePageTextTest();
		Assert.assertEquals(HPText, "My Store");
	}
	
	@Test(priority=3,groups = "HomePage")
	public void SignInBtnTest(){
		SignInPg = Homepage.SignInBtn();
	}
	@Test(priority=4,groups = "HomePage",dependsOnMethods= "SignInBtnTest")
	public void ContactsPageTest(){
		ContactsPg = Homepage.ContactsPageBtn();
	}
	@Test(priority=5,groups = "HomePage")
//	@Parameters({"sa"})
	public void verifyEveningDresslinkVisibleTest(){
		boolean LinkVisible = Homepage.EveningDressLinkVisible();
		Assert.assertEquals(LinkVisible, true, null);
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}	
	
	
	
	
	
	
	
	
}
