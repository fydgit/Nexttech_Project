package com.BrainsInJars.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BrainsInJars.pageobjectmodel.FBsignupPOM;
import com.BrainsInJars.pageobjectmodel.dellcontractpagePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellcontractpage {
	WebDriver driver;
	@Given("^user go to dell homepage$")
	public void user_go_to_dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farja\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
	       driver=new ChromeDriver(); 
	       
	     //implicit wait 
		      driver. manage(). timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	       
	       // how to open URL
		   driver.get("https://www.dell.com/");
		               Thread.sleep(3000);
		               driver.manage().window().maximize();
	}

	@When("^user click on dell contact page$")
	public void user_click_on_dell_contact_page() throws Throwable {
		dellcontractpagePOM obj=new dellcontractpagePOM(driver);
		obj.contact().click(); 
	}

	@Then("^user should be able to rediract contact page$")
	public void user_should_be_able_to_rediract_contact_page() throws Throwable {
		driver.quit();
	}


}
