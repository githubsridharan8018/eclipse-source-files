package com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	
	public static WebDriver web;//class variable declaration
	
	

public static  WebDriver browser(String name) {//browser launch

		if (name.equalsIgnoreCase(name)) {
	    web= new ChromeDriver();
	}
        else if (name.equalsIgnoreCase(name)) {
	    web= new FirefoxDriver();
    }
       return web;
	}
	
	
	public static void geturl(String url) {
    web.get(url);
	}
	
	public static void max() {
   web.manage().window().maximize();
	}
	
	public static void screenshot(String name) throws IOException {
     TakesScreenshot t = (TakesScreenshot) web;
     File g = t.getScreenshotAs(OutputType.FILE);
     File f= new File("C:\\Users\\sridh\\eclipse-workspace\\Cucu\\screen\\"+ name +".png");
     FileUtils.copyFile(g, f);
	}
	
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void sendvalues(WebElement element,String values) {
    element.sendKeys(values);
	}
	
	public static void dropdown(WebElement element, int index) {
    Select s = new Select(element);
    s.selectByIndex(index);
	}
	
	public static void clear(WebElement element) {
     element.clear();
	}
	 
	 public static void Alert() {
    web.switchTo().alert().accept();
	}
	 
	 public static void quit() {
     web.quit();
	}
	 
    }



