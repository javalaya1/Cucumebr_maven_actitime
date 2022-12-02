package com.atlas.maven_cucumber_actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTimeTrackPage extends ActitimeBasePage {
	public ActitimeTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
}
