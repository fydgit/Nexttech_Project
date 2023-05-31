package com.BrainsInJars.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BrainsInJars.pageobjectmodel.FBsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignup {
	WebDriver driver;
	@Given("^User go to fb webpage and clicks on create new account$")
	public void user_go_to_fb_webpage_and_clicks_on_create_new_account() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farja\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver = new ChromeDriver();
	   
	    //implicit wait 
	      driver. manage(). timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	   
	      driver.get("https://www.facebook.com/signup");
	    
	      //hard wait
	     // Thread.sleep(2000);
	      
	     driver.manage().window().maximize();
		}
		catch(Exception e	) {
			System.out.println("browser and url not working");
		}
	}

	@When("^User types \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_types_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		try {
		FBsignupPOM search=new FBsignupPOM(driver);
		search.first_name().sendKeys(arg1);
		Thread.sleep(1000);      //hard wait
		search.lastname().sendKeys(arg2);
		Thread.sleep(1000);       //hard wait
		search.emailid().sendKeys(arg3);
		Thread.sleep(1000);        //hard wait
		search.reemailid().sendKeys(arg4);
		Thread.sleep(1000);        //hard wait
		search.password().sendKeys(arg5);
		Thread.sleep(1000);        //hard wait
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20); 
		}
		catch(Exception e	) {
			System.out.println("element not found");
		}
	}
	@When("^User Choose month, day and year$")
	public void user_Choose_month_day_and_year() throws Throwable {
		try {
      FBsignupPOM search = new FBsignupPOM(driver);
		
		Select down = new Select(search.click_month);
  down.selectByIndex(8);
  // down.selectByvalue(5); value 5 is may
 // down.selectByVisibleText("Feb");
	//Thread.sleep(1000);
	
		Select down1 = new Select(search.click_day);
 down1.selectByVisibleText("18");
//down1.selectByvalue("18");
 // down1.selectByindex(5); day 6
	//Thread.sleep(1000);
	
		Select down2 = new Select(search.click_year);
		down2.selectByVisibleText("1987");
	//Thread.sleep(1000);
		
		//explicit wait
				WebDriverWait wait=new WebDriverWait(driver, 20); 
		}
		catch(Exception e){
			System.out.println("select dropdown error");
		}
	 
	}
	@When("^User select gender$")
	public void user_select_gender() throws Throwable {
		try {
		FBsignupPOM search=new FBsignupPOM(driver);
		search.gender().click();
		
		//explicit wait
				WebDriverWait wait=new WebDriverWait(driver, 20); 
		}
		catch(Exception e	) {
			System.out.println("gender not working");
		}
	}

	@When("^User clicks Signup option$")
	public void user_clicks_Signup_option() throws Throwable {
		try {
		FBsignupPOM search=new FBsignupPOM(driver);
		search.signup().click(); 
		Thread.sleep(3000);
		//explicit wait
				WebDriverWait wait=new WebDriverWait(driver, 20); 
		}
		catch(Exception e	) {
			System.out.println("click option not working");
		}
	
	}
	@Then("^User will able go to login page$")
	public void user_will_able_go_to_login_page() throws Throwable {
	 //driver.close();
	 driver.quit();
	}



}
	    


	

	