package com.atlas.maven_cucumber_actitime.stepdefs;

import org.openqa.selenium.WebDriver;

import com.atlas.maven_cucumber_actitime.pageobjects.ActitimeLoginPage;
import com.atlas.maven_cucumber_actitime.utility.BrowserFactory;
import com.atlas.maven_cucumber_actitime.utility.PropertiesFileReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestStepDefs {
	WebDriver driver = null;

	@Given("User navigate to the Website")
	public void user_navigate_to_the_website() {

		String browserName = PropertiesFileReader.allPropsData.get("browsername");
		driver = BrowserFactory.openRequiredBorwser(browserName);

		String url = PropertiesFileReader.allPropsData.get("applicationurl");
		BrowserFactory.launchApplication(url);
	}

//	@When("User entered the user name")
//	public void enterUserName() {
//
//	}
	ActitimeLoginPage alp = null;

	@When("User entered the user name {string}")
	public void user_entered_the_user_name(String usernamedata) {
		alp = new ActitimeLoginPage(driver);
		alp.enterUserName(usernamedata);
	}

	@And("LogOut from Actitime")
	public void userLogoutFromWebsite() {

	}

//	@And("User entered the password")
//	public void userEnterdPassword() {
//
//	}

	@And("User entered the password {string}")
	public void userEnterdPassword(String pass) {
		alp.enterPassword(pass);
	}

	@When("click on the sign-in button")
	public void click_on_the_sign_in_button() {
		alp.clickLoginButton();
	}

	@Then("validate user successfully logged-in by reading title")
	public void validate_user_successfully_logged_in_by_reading_title() {

	}

	@When("User entered the invalid user name")
	public void enterInvalidUserName() {

	}

	@And("User entered the invalid password")
	public void enterInvlidPwd() {

	}

	@Then("validate user unsuccessful logged-in by reading title")
	public void checkInvalidLoginErrorMsg() {

	}
}
