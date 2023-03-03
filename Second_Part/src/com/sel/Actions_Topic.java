package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Topic {

	public static void main(String[] args) {

		
		WebDriver a = new ChromeDriver();
		
		//a.get("https://www.techlistic.com/");
		
		
		//WebElement find = a.findElement(By.xpath("(//a[text()='Java'])[1]"));
		
		
		a.get("https://www.google.com/");
		WebElement find = a.findElement(By.xpath("//a[text()='Gmail']"));
		
		a.manage().window().maximize();
		
		
		
		Actions b = new Actions(a);    //automatically it will declare the web driver refname 
		
		//b.click(find).build().perform();
		
		
		b.click(find).build().perform();
		
		b.contextClick(find).build().perform();
		
		b.contextClick(find).build().perform();
		
		b.doubleClick(find).build().perform();
		
		b.clickAndHold(find).build().perform();
		
		
		
		
       
	
        
        
		
		
		
	}

}
