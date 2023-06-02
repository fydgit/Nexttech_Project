package com.BrainsInJars.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fb_login {
	WebDriver driver;
	@Given("^User go to facebook homepage$")
	public void user_go_to_facebook_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farja\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver = new ChromeDriver();
	      
	   // how to open URL
	    driver.get("https://www.facebook.com/");
	                Thread.sleep(3000);   
	}

	@When("^User click on facebook login option$")
	public void user_click_on_facebook_login_option() throws Throwable {
	    
	}

	@Then("^User should be able to redirect login page$")
	public void user_should_be_able_to_redirect_login_page() throws Throwable {
	   
	}

}
