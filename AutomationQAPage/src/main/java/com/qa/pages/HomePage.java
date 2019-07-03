package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		SignInBtn.click();
		return new SignInPage();
	}
	public ContactsPage ContactsPageBtn(){
		ContactsBtn.click();
		return new ContactsPage();
	}
	public boolean PageLogoTest(){
		return Logo.isDisplayed();
	}
	
	public String HomePageTextTest(){
		String HomePageTxt=driver.getTitle();
		return HomePageTxt;
	}
	public boolean EveningDressLinkVisible(){
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='block_top_menu']//ul[contains(@class,'sf-menu')]/li[2]/a[text()='Dresses']"))).build().perform();
//		driver.findElement(By.xpath(xpathExpression))
//		for(int i=0;i<3;i++){
		boolean a=driver.findElement(By.xpath("//div[@id='block_top_menu']//"
				+ "ul[contains(@class,'sf-menu')]/li[2]/a[text()='Dresses']"
				+ "//following-sibling::ul/li[2]/a[text()='Evening Dresses']")).isDisplayed();
		
		return a;
//		}
	}
	
	
	
	
	

}
