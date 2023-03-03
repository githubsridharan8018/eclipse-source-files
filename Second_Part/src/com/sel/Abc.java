package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abc {

	public static void main(String[] args) throws AWTException {

		WebDriver a = new ChromeDriver();
		
		a.get("https://www.facebook.com/");
		
		
		WebElement f = a.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		Actions b = new Actions(a);
		
		
		//b.click(f).build().perform();
		
		b.contextClick(f).build().perform();
		
		
		Robot g = new Robot();
		
		g.keyPress(KeyEvent.VK_DOWN);
		
		g.keyRelease(KeyEvent.VK_DOWN);
		
g.keyPress(KeyEvent.VK_DOWN);
		
		g.keyRelease(KeyEvent.VK_DOWN);
		
g.keyPress(KeyEvent.VK_DOWN);
		
		g.keyRelease(KeyEvent.VK_DOWN);
		
		g.keyPress(KeyEvent.VK_ENTER);
		
	}

}
