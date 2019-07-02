package com.qa.pages.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;

public class HomePageTest extends TestBase{

	
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
	}
	@Test(priority=1)
	public void PageLogoTest(){
		boolean flag=Homepage.PageLogoTest();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=2)
	public void HomePageText(){
		String HPText=Homepage.HomePageTextTest();
		Assert.assertEquals(HPText, "My Store");
	}
	
	@Test(priority=3)
	public void SignInBtnTest(){
		SignInPg = Homepage.SignInBtn();
	}
	@Test(priority=4)
	public void ContactsPageTest(){
		ContactsPg = Homepage.ContactsPageBtn();
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}	
	
	
	
	
	
	
	
	
}
