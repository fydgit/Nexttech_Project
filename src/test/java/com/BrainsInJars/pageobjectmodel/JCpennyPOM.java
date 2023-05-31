package com.BrainsInJars.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCpennyPOM {
	WebDriver driver;
	public  JCpennyPOM(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	@FindBy(xpath="//div[@data-automation-id=\"menu-item-link-1\"]")
	   WebElement act_Home_Lifestyle;
	     public WebElement Home_Lifestyle(){
	   return act_Home_Lifestyle;
	   }
}
