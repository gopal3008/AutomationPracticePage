package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignInBtn;
	

	@FindBy(xpath="//a[contains(text(),'Contact us')]")
	WebElement ContactsBtn;
	
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement Logo;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	//// div[@id='htmlcontent_top']//ul[@class='htmlcontent-home clearfix row']//li[@class='htmlcontent-item-1 col-xs-4']//a[contains(@class,'item-link')]
	
	public SignInPage SignInBtn(){
		return new SignInPage();
	}
	public ContactsPage ContactsPageBtn(){
		return new ContactsPage();
	}
	public boolean PageLogoTest(){
		return Logo.isDisplayed();
	}
	
	public String HomePageTextTest(){
		String HomePageTxt=driver.getTitle();
		return HomePageTxt;
	}
	
	
	
	
	
	

}
