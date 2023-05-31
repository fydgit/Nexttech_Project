package com.BrainsInJars.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBsignupPOM {

	WebDriver driver;
	public  FBsignupPOM(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy(name="firstname")
	  
	   WebElement Type_first_name;
	     
	   public WebElement first_name(){
	   return Type_first_name;
	   }

	@FindBy(name="lastname")
		  
	   WebElement Type_lastname;
	     
	   public WebElement lastname(){
	   return Type_lastname;
	   }
	
	@FindBy(xpath="//input[@name=\"reg_email__\"]")
	   
	   WebElement Type_emailid;
	     
	   public WebElement emailid(){
		return Type_emailid;
	 

	   } 
   @FindBy(xpath="//input[@name=\"reg_email_confirmation__\"]")
	   
	   WebElement Type_reemailid;
	     
	   public WebElement reemailid(){
	   return Type_reemailid;

	   } 
	
  @FindBy(xpath="//input[@name=\"reg_passwd__\"]")
	   
	   WebElement Type_password;
	     
	   public WebElement password(){
	   return Type_password;

	   } 
	   @FindBy (xpath="//*[@id=\"month\"]")
	   public WebElement click_month;
	   
	   
	   @FindBy (xpath="//*[@id=\"day\"]")
	   public WebElement click_day;
	   
	   @FindBy (xpath="//*[@id=\"year\"]")
	   public WebElement click_year;
	   
	   @FindBy (xpath="//input[@value=\"1\"]") 
	   WebElement click_gender;
	   public WebElement gender(){
	   return click_gender;
	   }
	   
	   @FindBy(name="websubmit")
            WebElement click_signup;
       public WebElement signup(){
	   return click_signup;

	   } 
       
	   
}



