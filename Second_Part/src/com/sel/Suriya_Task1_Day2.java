package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suriya_Task1_Day2 {

	public static void main(String[] args) {
		
	//Day 2,Task--1 -- write a code to identify the <a tag in a webpage and count the no of <a tags available
		

		WebDriver q = new ChromeDriver();
		
		q.get("https://www.facebook.com/");
		
		
		List<WebElement> tag = q.findElements(By.tagName("a"));
		System.out.println("The no of <a tag in a webpage is:" + tag.size());
		
		
		List<WebElement> frame = q.findElements(By.tagName("iframe"));
		System.out.println("the no of iframes in web page is =" + frame.size());  

	
		
		
	}

}
