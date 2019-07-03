package com.qa.pages.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.CreateAccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.MyAccountPage;
import com.qa.pages.SignInPage;

public class SignInPageTests extends TestBase{
	
	HomePage Homepage;
	SignInPage SignInpage;
//	CreateAccountPage CreateActPage;
	MyAccountPage myAccountPage;
	
	public SignInPageTests() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void Setup(){
		initialization();
		Homepage = new HomePage();
		SignInpage = Homepage.SignInBtn();
		System.out.println("Inside SignInPage");
			}
	@Test(enabled=true)
	public void VerifySignInLinkTest(){
		System.out.println("Inside verify link");
		myAccountPage=SignInpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
					}
	@Test(enabled=true)
	public void verifyCallusNowTextTest(){
		System.out.println("Inside Verify Call Us Text");
		String VerifyCallUsText = SignInpage.VerifyCallusNowtext();
		Assert.assertEquals(VerifyCallUsText, "Call us now: 0123-456-789");
	}
//	@Test
//	public void verifyCode(){
//		SignInpage.
//	}
	@Test
	public void VerifyHomePageLinkTest(){
		Homepage=SignInpage.HomeIconTest();
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
