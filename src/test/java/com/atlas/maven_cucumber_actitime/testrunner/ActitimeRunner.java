package com.atlas.maven_cucumber_actitime.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "AllFeatureFiles" }, glue = {
		"com.atlas.maven_cucumber_actitime.stepdefs" }, tags = "@Regression")
public class ActitimeRunner extends AbstractTestNGCucumberTests {

}
