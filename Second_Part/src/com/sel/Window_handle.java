package com.sel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {

		
		WebDriver d = new ChromeDriver();
		
		//d.get("https://chromedriver.chromium.org/home");
		
		d.get("https://appleid.apple.com/#!&page=signin");
		
		d.get("https://www.wikipedia.org/");
		
		
		d.getWindowHandle();
		
		
	/*	Set<String> win = d.getWindowHandles();
		System.out.println(win);   */
	}

}
