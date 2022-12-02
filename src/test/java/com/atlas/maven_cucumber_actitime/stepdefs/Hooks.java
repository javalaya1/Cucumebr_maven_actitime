package com.atlas.maven_cucumber_actitime.stepdefs;

import com.atlas.maven_cucumber_actitime.utility.PropertiesFileReader;

import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void loadFiles() {
		PropertiesFileReader.readProperty();
	}
}
