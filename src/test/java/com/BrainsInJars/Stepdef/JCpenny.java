package com.BrainsInJars.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BrainsInJars.pageobjectmodel.JCpennyPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JCpenny {
	WebDriver driver;
	@Given("^user visits JCPenney homepage$")
	public void user_visits_JCPenney_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farja\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver = new ChromeDriver();
	      
	    //implicit wait 
	      driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	   
	      driver.get("https://www.JCPenney.com/");
	                Thread.sleep(3000);  
	                driver.manage().window().maximize();    
	}

	@When("^user go to Home & Lifestyle dropdown menu and able to see product$")
	public void user_go_to_Home_Lifestyle_dropdown_menu_and_able_to_see_product() throws Throwable {
		Actions act=new Actions (driver);
		JCpennyPOM obj=new JCpennyPOM(driver); 
		act.moveToElement(obj.Home_Lifestyle()).build().perform();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 30); 
	}
	@Then("^user is able to see the products$")
	public void user_is_able_to_see_the_products() throws Throwable {
	 // driver.quit();
		driver.close();
	}
}


