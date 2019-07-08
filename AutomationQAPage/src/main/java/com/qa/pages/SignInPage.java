package com.qa.pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.Utility.TestUtil;

public class SignInPage extends TestBase{

	
	HomePage Homepage;
//	SignInPage SigninPage;
//	MyAccountPage myAccount;
	
//public SignInPage() {
//	// TODO Auto-generated constructor stub
//	super();
//}	
@FindBy(xpath="//span[text()='Call us now: ']") 
WebElement CallUsOptn;

@FindBy(id="email")
WebElement EmailAddress;

@FindBy(id="passwd") 
WebElement password;

@FindBy(xpath="//button[@type = 'submit' and @name='submit_search']") 
WebElement SubmitBtn;

@FindBy(id="email_create") 
WebElement CreateEmail;

@FindBy(id="SubmitCreate") 
WebElement SubmitCreate;

public SignInPage(){
	PageFactory.initElements(driver, this);
}

public MyAccountPage Signin(String un,String pwd){
	EmailAddress.clear();
	EmailAddress.sendKeys(un);
	password.clear();
	password.sendKeys(pwd);
	SubmitBtn.click();
	return new MyAccountPage();
}

public String createAct(String CA){
	CreateEmail.clear();
	CreateEmail.sendKeys(CA);
	SubmitBtn.click();
	String CreateAnAccount = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
//	return new CreateAccountPage();
	return CreateAnAccount;
}

public String VerifyCallusNowtext(){
	String CallusText = CallUsOptn.getText();
	return CallusText;
}

public String HomeIconTest(){
	driver.findElement(By.xpath("//a[@title='Return to Home']")).click();
//	driver.findElement(By.xpath("//a[@class = 'home']")).click();
	System.out.println("Check element");
	String HomepageURL = driver.getCurrentUrl();
	return HomepageURL;
//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//	System.out.println("Check element");
//	return new HomePage();
}

	
	
	
	
	
	
	

}
