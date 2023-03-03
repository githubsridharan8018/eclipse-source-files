package com.amazon.Base_Adactin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {// reusable methods

	public static WebDriver d; // null

	public static void browserlaunch(String name) {

		d = new ChromeDriver();

	}

	public static void geturl(String url) {
		d.get(url);

	}

	public static void send_Data(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void fullscrn() {

		d.manage().window().fullscreen();

	}

	public static void max() {
		d.manage().window().maximize();

	}

	public static void btn(WebElement element) {
		element.click();

	}

	public static void dropdown(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void clrdata(WebElement element) {
		element.clear();

	}
	
	public static void alrt() {
		
	d.switchTo().alert().accept();
		
		

	}

}
