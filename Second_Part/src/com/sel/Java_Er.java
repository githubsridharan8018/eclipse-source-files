package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Er {

	public static void main(String[] args) {

		WebDriver AR = new ChromeDriver();
		
		AR.get("https://www.facebook.com/");
		
		WebElement findElement = AR.findElement(By.xpath("//a[text()='Games']"));
		
		JavascriptExecutor q = (JavascriptExecutor) AR;
		
		q.executeScript("arguments[0].scrollIntoView()",findElement);
		
		
		WebElement findElement2 = AR.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		JavascriptExecutor w = (JavascriptExecutor) AR;
		
		w.executeScript("arguments[0].scrollIntoView()", findElement2);

		
        WebElement findElement3 = AR.findElement(By.xpath("//button[@name='login']"));		

        JavascriptExecutor e =(JavascriptExecutor) AR;
        
        e.executeScript("arguments[0].click()", findElement3);
		
        
        //WebElement findElement4 = AR.findElement(By.xpath("//h2[contains(text(),'life')]"));//syntax 4 more text 
        
       //JavascriptExecutor r = (JavascriptExecutor) AR;
       
       
       
       
       
        
	
	     //WebElement findElement5 = AR.findElement(By.xpath("//input[contains(@data-nlok-ref-guid,'e0c7')]"));
	     //System.out.println("the value is larger =" + findElement5);
	 
	    
	 
	 
	}

}
