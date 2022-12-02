package com.atlas.maven_cucumber_actitime.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonUtility {

	public static String getCurrentDate() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd-hh-mm-ss"));
	}

	public static void takePageScreenShot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot_from = ts.getScreenshotAs(OutputType.FILE);
		File dest_to = new File(
				"actitime_screenshots" + System.getProperty("file.separator") + getCurrentDate() + ".png");
		try {
			FileHandler.copy(screenshot_from, dest_to);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeElementScreenShot(WebElement element) {
		TakesScreenshot ts = (TakesScreenshot) element;
		File screenshot_from = ts.getScreenshotAs(OutputType.FILE);
		File dest_to = new File(
				"actitime_screenshots" + System.getProperty("file.separator") + getCurrentDate() + ".png");
		try {
			FileHandler.copy(screenshot_from, dest_to);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
