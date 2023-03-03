package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Good_Day {

	public static void main(String[] args) throws IOException {

		// syntax

		 WebDriver driver = new ChromeDriver();

		
		  driver.get("https://www.amazon.in/ref=nav_logo");
		  
		  
		  String a = driver.getTitle(); 
		  System.out.println(a);
		  
		  
		  driver.get("https://www.axisbank.com/"); 
		  System.out.println();
		  
		 String r = driver.getTitle();
		 System.out.println(r);
		  
		 // String s = driver.getTitle(); System.out.println(s);
		  
		   //driver.quit();
		  
		  //String currentUrl = driver.getCurrentUrl(); 
		  //System.out.println(currentUrl);
		  
	/*	 driver.navigate().to("https://www.netflix.com/in/");
		 driver.manage().window().minimize();
		  
		 driver.manage().window().maximize();
		 driver.manage().window().fullscreen();
		 driver.manage().window().getSize();
		  
		 driver.navigate().back(); //driver.navigate().forward();
		 driver.navigate().refresh();  */
		 

		// second topic -- Takescreenshot
		
		/*driver.get("https://www.facebook.com/login/");
		
		TakesScreenshot d = (TakesScreenshot) driver;
		
		
		File b = d.getScreenshotAs(OutputType.FILE);
		
		File c = new File("C:\\Users\\sridh\\eclipse-workspace\\Second_Part\\Screenshot\\facebook.png");
		
		FileUtils.copyFile(b, c);*/
	
		
		
		
        	}
}
