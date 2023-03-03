package org.adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Method_Invoking {

	public static WebDriver a; // null pointer

	public static void dropdown_index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void frames_Locator(String name) {

		a.switchTo().frame(name);

	}

	public static void screenshot(String name) throws IOException {// screenshot method

		TakesScreenshot s = (TakesScreenshot) a;

		File src = s.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\sridh\\eclipse-workspace\\Adactin_Project\\method invoking\\" + name + ".png");

		FileUtils.copyFile(src, des);

	}

	public static void main(String[] args) throws IOException {// main method

		a = new ChromeDriver();

		a.get("https://adactinhotelapp.com/");
		screenshot("1");

		a.manage().window().maximize();

		WebElement f1 = a.findElement(By.xpath("//input[@type='text']"));
		f1.sendKeys("sridharan8018");

		WebElement f2 = a.findElement(By.xpath("//input[@type='password']"));
		f2.sendKeys("Adactin$8018");
		screenshot("2");

		WebElement f3 = a.findElement(By.xpath("//input[@name = 'login']"));
		f3.click();
		screenshot("3");

		a.manage().window().maximize();

		WebElement f4 = a.findElement(By.xpath("//select[@id='location']"));
		dropdown_index(f4, 8);

		WebElement f5 = a.findElement(By.xpath("//select[@id='hotels']"));
		dropdown_index(f5, 2);

		WebElement f6 = a.findElement(By.xpath("//select[@id='room_type']"));
		dropdown_index(f6, 1);

		WebElement f7 = a.findElement(By.xpath("//select[@id='room_nos']"));
		dropdown_index(f7, 8);

		WebElement f8 = a.findElement(By.xpath("(//input[@maxlength='10'])[1]"));
		f8.click();
		f8.clear();
		f8.sendKeys("12/12/2022");

		WebElement f9 = a.findElement(By.xpath("//input[@name='datepick_out']"));
		f9.click();
		f9.clear();
		f9.sendKeys("13/12/2022");

		WebElement f10 = a.findElement(By.xpath("//select[@id='adult_room']"));

		dropdown_index(f10, 2);

		WebElement f11 = a.findElement(By.xpath("//select[@name='child_room']"));
		dropdown_index(f11, 2);

		WebElement f12 = a.findElement(By.xpath("//input[@type='submit']"));
		f12.click();

		WebElement f13 = a.findElement(By.xpath("//input[@type='radio']"));

		f13.click();

		WebElement f14 = a.findElement(By.xpath("//input[@type='submit']"));

		f14.click();

		WebElement f15 = a.findElement(By.xpath("//input[@name='first_name']"));

		f15.sendKeys("SRIDHARAN");

		WebElement f16 = a.findElement(By.xpath("//input[@name='last_name']"));

		f16.sendKeys("M");

		WebElement f17 = a.findElement(By.xpath("//textarea[@name='address']"));

		f17.sendKeys("No:8,VINAYAGAR KOIL STREET-608001,CONTACT NO:8056459018");

		WebElement f18 = a.findElement(By.xpath("//input[@name='cc_num']"));

		f18.sendKeys("1234000088886789");

		WebElement f19 = a.findElement(By.xpath("//select[@id='cc_type']"));
		dropdown_index(f19, 1);

		WebElement f20 = a.findElement(By.xpath("//select[@id='cc_exp_month']"));
		dropdown_index(f20, 10);

		WebElement f21 = a.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropdown_index(f21, 12);

		WebElement f22 = a.findElement(By.xpath("//input[@name='cc_cvv']"));

		f22.sendKeys("786");

		screenshot("4");

		WebElement f23 = a.findElement(By.xpath("//input[@name='book_now']"));
		f23.click();

		WebElement f24 = a.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		f24.click();

		screenshot("after book");

		WebElement f25 = a.findElement(By.xpath("//input[@value='Logout']"));
		f25.click();

		screenshot("5");
		
		
		

	}

}
