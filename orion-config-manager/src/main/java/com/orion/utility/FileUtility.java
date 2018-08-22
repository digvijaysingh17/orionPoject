package com.orion.utility;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileUtility {
	public static String initConfigPath(String filePath) throws IOException {
		String generalPath = new File("../").getCanonicalPath();
		String configLocation = generalPath + filePath;
		return configLocation;
	}
	public static List<File> getFiles(String configLocation) throws IOException {
		List<File> listOfAppFiles = null;
		File appFolder = new File(configLocation);
		System.out.println("*** Appfolder Path is***"+appFolder.getAbsolutePath());
		listOfAppFiles = Arrays.asList(appFolder.listFiles());
		return listOfAppFiles;
	}
}
