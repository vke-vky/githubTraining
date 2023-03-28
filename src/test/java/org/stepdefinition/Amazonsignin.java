package org.stepdefinition;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsignin extends Base {
	
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	   
		launchBrowser();
		Windowmaximize();
		
	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
	   launchUrl("https://www.amazon.in/");
	}

	@When("To pass valid email or mobile number in email field")
	public void to_pass_valid_email_or_mobile_number_in_email_field() {
		WebElement signin = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		signin.click();
		WebElement MblNo = driver.findElement(By.name("email"));
		MblNo.sendKeys("8270932284");	
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		WebElement clkbtn = driver.findElement(By.id("continue"));
		clkbtn.click();
	   
	}

	@When("To check wheather navigate to the home page or not")
	public void to_check_wheather_navigate_to_the_home_page_or_not() {
		System.out.println("To check your login credentials");
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();	}


	
	

}
