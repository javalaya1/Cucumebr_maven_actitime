package com.atlas.maven_cucumber_actitime.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesFileReader {

	private static String propFileFolderLocation = "actitime_testdata";

	public static String readProperty(String propFileName, String key) {
		try (FileInputStream fis = new FileInputStream(
				propFileFolderLocation + System.getProperty("file.separator") + propFileName + ".properties")) {
			Properties props = new Properties();
			props.load(fis);
			props.get(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static HashMap<String, String> allPropsData = new HashMap<>();

	public static void readProperty() {
		File file_or_folder = new File(propFileFolderLocation);
		if (file_or_folder.isDirectory()) {
			for (String file : file_or_folder.list()) { // to read all properties file under the folder

				if (file.contains(".properties")) {
					try (FileInputStream fis = new FileInputStream(
							propFileFolderLocation + System.getProperty("file.separator") + file)) {
						Properties props = new Properties();
						props.load(fis);
						props.keySet().forEach(x -> allPropsData.put(x.toString(), props.get(x).toString()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
