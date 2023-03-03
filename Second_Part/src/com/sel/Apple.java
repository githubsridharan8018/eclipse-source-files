package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {

	public static void main(String[] args) {

		
		WebDriver a = new ChromeDriver();
		
		a.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement f1 = a.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		f1.click();
		
		Alert b = a.switchTo().alert();
		
		b.accept();
		b.dismiss();
		//String text = b.getText();
		//System.out.println(text);
		
		WebElement f2 = a.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		//f2.click();
		
		//Alert c = a.switchTo().alert();
		
		//c.sendKeys("this is an alert");
		
		
		
	}

}
