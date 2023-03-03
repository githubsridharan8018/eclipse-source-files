package org.Maven_Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends Methods {

	public static void main(String[] args) throws IOException {

	browser_Launch("Chrome");
	url("https://adactinhotelapp.com/");
	
	max();
	
	WebElement f1 = d.findElement(By.xpath("//input[@name='username']"));
	send(f1,"sridharan8018");
	
	WebElement f2 = d.findElement(By.xpath("//input[@type='password']"));
	send(f2,"Adactin$8018");
	screen("ab1");
	
	
	WebElement f3 = d.findElement(By.xpath("//input[@type='Submit']"));
	btn(f3);
	
	screen("ab2");
	
	
	
	WebElement f4 = d.findElement(By.xpath("//select[@name='location']"));
	drop(f4,2);
	
	WebElement f5 = d.findElement(By.xpath("//input[@name='datepick_in']"));
	btn(f5);
	delete(f5);
	send(f5, "30/12/2022"); 
	}

}
