package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_One {

	public static void main(String[] args) {// in html <input type ="hidden"

		
		WebDriver x = new ChromeDriver();
		
		x.get("https://www.facebook.com/");
		
		WebElement displayed = x.findElement(By.xpath("//input[@type='hidden' and @name='lsd']"));
		boolean dd = displayed.isDisplayed();
		System.out.println("input type ='hidden' is displaed in UI or not = " + dd);
		
		
		
		
		
		
	}
}


