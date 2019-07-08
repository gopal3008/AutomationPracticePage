package com.qa.pages.TestCases;

//import org.apache.http.util.Asserts;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
//import com.qa.pages.CreateAccountPage;
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
	@Test(enabled=true,groups="SignInPage",invocationCount= 2)
	public void VerifySignInLinkTest(){
		System.out.println("Inside verify link");
		myAccountPage=SignInpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
					}
	@Test(enabled=true,groups="SignInPage",timeOut= 100)
	public void verifyCallusNowTextTest(){
		System.out.println("Inside Verify Call Us Text");
		String VerifyCallUsText = SignInpage.VerifyCallusNowtext();
		Assert.assertEquals(VerifyCallUsText, "Call us now: 0123-456-789");
	}

	@Test(enabled=true,groups="SignInPage",expectedExceptions=TimeoutException.class)
	public void VerifyHomePageLinkTest(){
		String Homepageurl = SignInpage.HomeIconTest();
		Assert.assertEquals(Homepageurl, "http://automationpractice.com/index.php", "Strings Matched");
	}
	
	@Test
	public void CreateActlinkTest(String NewEmail){
		String CreateAnAccount = SignInpage.createAct("gopal.1740@gmail.com");
		Assert.assertEquals(CreateAnAccount, "CREATE AN ACCOUNT");
	}
	
	@DataProvider
	public void getTestData(){
		 
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
