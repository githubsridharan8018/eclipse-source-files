package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axpath {

	public static void main(String[] args) {

		
		WebDriver ax = new ChromeDriver();
		
		ax.get("https://www.amazon.in/");
		ax.manage().window().maximize();
		
		
		WebElement find = ax.findElement(By.xpath("//input[@type='text']"));
		
		find.sendKeys("oneplus");
		
	 	WebElement find1 = ax.findElement(By.xpath("//input[@type='submit']"));
		
		find1.click();
		
		WebElement find2 = ax.findElement(By.xpath("//div[@id='search']/div/div/div/span/div/div[4]/div/div/div/div/div/div/div/div/div/div[2]/div/span/a/div/img"));
		
	find2.click();
	
	}
	
	

}
