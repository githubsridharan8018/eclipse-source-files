package com.amazon.Base_Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner_Class extends Base_Class {// method invoke

	public static void main(String[] args) {

		browserlaunch("chrome");

		geturl("https://adactinhotelapp.com/");
		max();
		// fullscrn();
		WebElement f1 = d.findElement(By.xpath("//input[@name='username']"));
		send_Data(f1, "sridharan8018");

		WebElement f2 = d.findElement(By.xpath("//input[@type='password']"));
		send_Data(f2, "Adactin$8018");

		WebElement f3 = d.findElement(By.xpath("//input[@type='Submit']"));
		btn(f3);
		
		WebElement f4 = d.findElement(By.xpath("//select[@name='location']"));
		dropdown(f4, 5);
		
		WebElement f5 = d.findElement(By.xpath("//select[@name='hotels']"));
		dropdown(f5,2);
		
		WebElement f6 = d.findElement(By.xpath("//select[@name='room_type']"));
		dropdown(f6,2);
		
		WebElement f7 = d.findElement(By.xpath("//select[@name='room_nos']"));
		dropdown(f7,10);
		
		WebElement f8 = d.findElement(By.xpath("//input[@name='datepick_in']"));
		clrdata(f8);
		send_Data(f8,"15/02/2023");
		
		
		
	}
	

}
