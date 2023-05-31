package com.BrainsInJars.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellcontractpagePOM {

	WebDriver driver;
	public  dellcontractpagePOM(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[2]/div/a/span/span")
	  
	   WebElement click_contact;
	     
	   public WebElement contact(){
	   return click_contact;
	   }
}
