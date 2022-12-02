package com.atlas.maven_cucumber_actitime.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActitimeBasePage {

	protected WebDriver driver;

	public ActitimeBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public String getTitle() {
		return this.driver.getTitle();
	}

	public void switchWindow(int windowNumber) {
		List<String> allWindows = new ArrayList<>(this.driver.getWindowHandles());
		this.driver.switchTo().window(allWindows.get(windowNumber));
	}
}
