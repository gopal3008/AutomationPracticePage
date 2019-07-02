package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qa.Base.TestBase;

public class SignInPage extends TestBase{

	
//	HomePage Homepage;
//	SignInPage SigninPage;
//	MyAccountPage myAccount;
	
public SignInPage() {
	// TODO Auto-generated constructor stub
	super();
}	
@FindBy(xpath="//span[text()='Call us now: ']") WebElement CallUsOptn;
@FindBy(id="email") WebElement EmailAddress;
@FindBy(id="passwd") WebElement password;
@FindBy(xpath="//button[@type = 'submit' and @name='submit_search']") WebElement SubmitBtn;
@FindBy(id="email_create") WebElement CreateEmail;
@FindBy(id="SubmitCreate") WebElement SubmitCreate;

public MyAccountPage Signin(String un,String pwd){
	EmailAddress.clear();
	EmailAddress.sendKeys(un);
	password.clear();
	password.sendKeys(pwd);
	SubmitBtn.click();
	return new MyAccountPage();
}

public CreateAccountPage createAct(String CA){
	CreateEmail.clear();
	CreateEmail.sendKeys(CA);
	SubmitBtn.click();
	return new CreateAccountPage();
}

public String VerifyCallusNowtext(){
	String CallusText = CallUsOptn.getText();
	return CallusText;
}

public HomePage HomeIconTest(){
	driver.findElement(By.xpath("//a[@class='home']")).click();
	return new HomePage();
}
public void EveningDressLinkVisible(){
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='Dresses']"))).build().perform();
//	driver.findElement(By.xpath(xpathExpression))
}
	
	
	
	
	
	
	

}
