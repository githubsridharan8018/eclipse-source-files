package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {

		
		WebDriver a = new ChromeDriver();
		
		
	a.get("https://letcode.in/dropdowns");
	
	WebElement q = a.findElement(By.xpath("//select[@id='fruits']"));
	
	Select m = new Select(q);
	
	m.selectByIndex(3);
	
	m.selectByValue("4");
	
	m.selectByVisibleText("Orange");
	
	boolean multi = m.isMultiple();
System.out.println("is it multiple " + multi);



List<WebElement> o = m.getOptions();
for (WebElement webElement : o) {
	System.out.println(webElement.getText());
	
	
}

System.out.println("--------------------------------------------------");

	List<WebElement> p = m.getAllSelectedOptions();
	
	for (WebElement web : p) {
		System.out.println(web.getText());
		
	}
	
	WebElement fst = m.getFirstSelectedOption();
	for (WebElement w : p) {
		
	System.out.println(w.getText());
		
	}
	}
	
	

	
 
}
