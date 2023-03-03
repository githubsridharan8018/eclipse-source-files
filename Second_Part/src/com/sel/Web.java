package com.sel;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = new ChromeDriver();/// browser launch
		
		driver.get("https://www.facebook.com/"); // to get url
		
		/*TakesScreenshot a = (TakesScreenshot) driver;
		
		File b = a.getScreenshotAs(OutputType.FILE);
		
		File c = new File("C:\\Users\\sridh\\eclipse-workspace\\Second_Part\\Screenshot\\facebook.png");
		
		FileUtils.copyFile(b, c);*/
		
		
	 WebElement find = driver.findElement(By.xpath("//input[@name='email']"));
	 find.sendKeys("msridhran031@gmail.com");
	 
	 WebElement f = driver.findElement(By.xpath("//input[@type='password']"));
	 
	 f.sendKeys("123456789");
	 
	// WebElement k = driver.findElement(By.xpath("//button[@name='login']"));

	// k.click();
	 
     String attribute = find.getAttribute("name");	 
	 System.out.println(attribute);
	 
	 String attribute2 = find.getAttribute("value");// attribute name = value
	 System.out.println("The value =" + attribute2);
	 
		boolean enabled = find.isEnabled();
		System.out.println("is enabled or not= " + enabled);
		
		boolean selected = find.isSelected();
		System.out.println("is selected or not=" + selected);
		
		String tagName = find.getTagName();
		System.out.println("print the Tagname= "+ tagName);
		
		
	}

}
