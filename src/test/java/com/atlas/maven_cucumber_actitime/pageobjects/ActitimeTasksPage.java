package com.atlas.maven_cucumber_actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasksPage extends ActitimeBasePage {
	public ActitimeTasksPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
}
