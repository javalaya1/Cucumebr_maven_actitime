package com.atlas.maven_cucumber_actitime.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage extends ActitimeBasePage {
	public ActitimeLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id = "username") // html
	private List<WebElement> username_element_list;

	@FindBy(id = "username") // html
	private WebElement username_element; // we can reuse this element in multiple methods

	@FindBy(name = "pwd")
	private WebElement password_element;

	@FindBy(xpath = "//div[normalize-space()='Login']")
	private WebElement loginButton_element;

	public void enterUserName(String usernameInput) { // functional
		if (username_element_list.size() <= 0) {
			driver.navigate().refresh();
		}
		username_element.clear();
		username_element.sendKeys(usernameInput);
	}

	public void enterPassword(String passInput) {
		password_element.clear();
		password_element.sendKeys(passInput);
	}

	public void clickLoginButton() {
		loginButton_element.click();
	}

}
