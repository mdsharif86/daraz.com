package stepDefinition;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFunctionality extends Base {
	
	@Given("I am in www.daraz.com")
	public void i_am_in_www_daraz_com() {
	    driver.get("https://www.daraz.com.bd/");
	}

	@Given("I want to see the daraz logo is working")
	public void i_want_to_see_the_daraz_logo_is_working() {
	   
	}

	@Then("i need to click on the seach button and click on mobile phone")
	public void i_need_to_click_on_the_seach_button_and_click_on_mobile_phone() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("i need to click on my search button on see realme cs5s-4gb\\/128gb 600Mah battery")
	public void i_need_to_click_on_my_search_button_on_see_realme_cs5s_4gb_128gb_600mah_battery() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
