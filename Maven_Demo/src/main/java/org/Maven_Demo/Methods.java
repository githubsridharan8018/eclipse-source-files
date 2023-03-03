package org.Maven_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
	
	public static WebDriver d;  
	//browser launch
	public static void browser_Launch(String name) {
		
      d = new ChromeDriver();		

	}
	
	public static void url(String url) {
		
		d.get(url);
		
	}
	
	public static void send(WebElement el,String data){
		el.sendKeys(data);

	}
	
	public static void max() {
		d.manage().window().maximize();

	}
	
	public static void btn(WebElement el) {
		el.click();
		
	}
	 
	public static void drop(WebElement el,int value) {
	
		Select s = new Select(el);
		s.selectByIndex(value);
	}
	
	public static void delete(WebElement el) {
	
		el.clear();

	}
	
	
	public static void screen(String name) throws IOException {
		
		TakesScreenshot s = (TakesScreenshot) d;
		
		File a = s.getScreenshotAs(OutputType.FILE);
		
		File b = new File("C:\\Users\\sridh\\eclipse-workspace\\Maven_Demo\\picture\\" + name +".png");
		
		FileUtils.copyFile(a, b);

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
