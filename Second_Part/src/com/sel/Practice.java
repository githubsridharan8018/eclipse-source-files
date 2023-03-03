package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException {

		
		WebDriver a = new ChromeDriver();
		
		//a.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//String title = a.getTitle();
		//System.out.println(title);
		
		//String b = a.getCurrentUrl();
		//System.out.println(b);
		
		a.get("https://www.facebook.com/");
		
		/*a.navigate().to(b);
		
		a.navigate().back();
		
		a.navigate().forward();
		
		a.navigate().refresh();
		
		a.manage().window().maximize();
		
		a.manage().window().fullscreen();
		Dimension size = a.manage().window().getSize();
		
		System.out.println(size);*/
		
		TakesScreenshot c = (TakesScreenshot) a;
		
		
		File s = c.getScreenshotAs(OutputType.FILE);
		
		File t = new File("C:\\Users\\sridh\\eclipse-workspace\\Second_Part\\Picture\\ASCII.png");
		
		FileUtils.copyFile(s, t);
		
		
		//WebElement qq = a.findElement(By.xpath("//input[@class='gLFyf']"));
		
		//qq.sendKeys("123456");
		
		
		//WebElement find1 = a.findElement(By.xpath("//a[text()='Gmail']"));
		
		//find1.click();
		
		
		/*WebElement find2 = a.findElement(By.xpath("//span[text()='Meet the Google Pixel 7 and Pixel 7 Pro. ']"));
		
		String text = find2.getText();
		
		System.out.println(text);*/
		
		
		//WebElement find3 = a.findElement(By.xpath("//h2[contains(text(),'you')]"));
		
		/*WebElement rr = a.findElement(By.xpath("//a[text()='Help']"));
		
		
		JavascriptExecutor w = (JavascriptExecutor) a;
		
		w.executeScript("arguments[0].scrollIntoView()",rr);*/
				
      /* WebElement dd = a.findElement(By.xpath("//h2[contains(text(),'helps')]"));	
       String text = dd.getText();
       System.out.println(text);
       
		WebElement gg = a.findElement(By.xpath("//form[contains(@action,'privacy_mutation_token')]"));
		
		String text2 = gg.getText();
		
		System.out.println(text2);*/
		
		/*WebElement ss = a.findElement(By.xpath("//button[contains(@class,'_4jy0')]"));
		
		String text3 = ss.getText();
		System.out.println(text3);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
