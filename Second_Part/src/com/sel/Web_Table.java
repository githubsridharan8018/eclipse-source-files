package com.sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {

		
		 WebDriver obj=new ChromeDriver();
		 
		 obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  
		  obj.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		  
		 WebElement find1 = obj.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		  String text = find1.getText();
		  System.out.println(text);
		  System.out.println();
		  
		 
		  List<WebElement> find2 = obj.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
		   for (WebElement webElement : find2) {
			 System.out.println(webElement.getText());
			 System.out.println();
		}
		  
		List<WebElement> find3 = obj.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));  
		  for (WebElement webElement1 : find3) {
			System.out.println(webElement1.getText());
			System.out.println();
		  }
			
			
			List<WebElement> find4 = obj.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
			for (WebElement web1 : find4) {
				System.out.println(web1.getText());
				
						
			}
			
	}
}
