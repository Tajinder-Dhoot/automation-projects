package org.web.automation.utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CaptureScreenshot {
	
	static String filename = null;
	
	public static void takeScreenshot(WebDriver driver, String name) {
		
		Calendar c = Calendar.getInstance();	
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		filename = "./Screenshots/"+c.getTime().toString().replace(":", "-").replace(" ", "-")+name+".png";
		
		// to create new file in folder Screenshots
		File finalDestination = new File(filename); 
		try {
			FileUtils.copyFile(f, finalDestination);
		} 
		catch (IOException e) {
			System.out.println("---------------------Exception----------------------");
			e.printStackTrace();
		}
		
		attachScreenshot();
	}
	
	public static void attachScreenshot() {
		
		try {
			// adds screenshot to the report
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			
			// will access the file if already created otherwise creates new file
			File f = new File(filename); 
			
			Reporter.log(
					"<a title= \"Snapshot\" href=\"" + f.getAbsolutePath() + "\">" + 
			"<img width=\"418\" height=\"240\" alt=\"Screenshot\" title=\"title\" src=\"../surefire-reports/html/screenshots/" + filename+ "\"</a>");
		}
		catch (Exception e) {
				System.out.println("----------------Exception----------------");
				System.out.println("Unable to attach Screenshot");
			}
		}

}
