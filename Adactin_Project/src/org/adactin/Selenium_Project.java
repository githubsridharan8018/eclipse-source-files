package org.adactin;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Project {// Adactin -- demo website

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		WebDriver a = new EdgeDriver();

		a.get("https://adactinhotelapp.com/");

		//Thread.sleep(50);

		a.manage().window().fullscreen();

		TakesScreenshot ss = (TakesScreenshot) a;

		File bc = ss.getScreenshotAs(OutputType.FILE);
		File ab = new File("C:\\Users\\sridh\\eclipse-workspace\\Adactin_Project\\snapsAdactin\\pic1.png");
		FileUtils.copyFile(bc, ab);

		a.manage().window().getSize();

		WebElement find1 = a.findElement(By.xpath("//input[@type='text']"));

		find1.sendKeys("sridharan8018");

		WebElement find2 = a.findElement(By.xpath("//input[@type='password']"));

		find2.sendKeys("239259");

		WebElement find3 = a.findElement(By.xpath("//input[@name = 'login']"));

		find3.click();

		a.navigate().to("https://adactinhotelapp.com/SearchHotel.php");

		a.manage().window().fullscreen();

		WebElement f1 = a.findElement(By.xpath("//select[@id='location']"));

		f1.click();

		Select s1 = new Select(f1);

		s1.selectByIndex(8);

		WebElement f2 = a.findElement(By.xpath("//select[@id='hotels']"));

		Select s2 = new Select(f2);

		s2.selectByIndex(2);

		WebElement f3 = a.findElement(By.xpath("//select[@id='room_type']"));

		Select s3 = new Select(f3);

		s3.selectByIndex(1);

		WebElement f4 = a.findElement(By.xpath("//select[@id='room_nos']"));

		Select s4 = new Select(f4);

		s4.selectByIndex(8);

		WebElement f5 = a.findElement(By.xpath("(//input[@maxlength='10'])[1]"));
		f5.click();
		f5.clear();
		f5.sendKeys("11/12/2022");

		WebElement f6 = a.findElement(By.xpath("//input[@name='datepick_out']"));
		f6.click();
		f6.clear();
		f6.sendKeys("13/12/2022");

		WebElement f7 = a.findElement(By.xpath("//select[@id='adult_room']"));

		Select s5 = new Select(f7);

		s5.selectByIndex(2);

		WebElement f8 = a.findElement(By.xpath("//select[@name='child_room']"));

		Select s6 = new Select(f8);

		s6.selectByIndex(2);

		WebElement f9 = a.findElement(By.xpath("//input[@type='submit']"));

		f9.click();

		a.navigate().to("https://adactinhotelapp.com/SelectHotel.php");

		a.manage().window().fullscreen();

		WebElement f10 = a.findElement(By.xpath("//input[@type='radio']"));

		f10.click();

		WebElement f11 = a.findElement(By.xpath("//input[@type='submit']"));

		f11.click();

		a.navigate().to("https://adactinhotelapp.com/BookHotel.php");
		a.manage().window().fullscreen();

		WebElement f12 = a.findElement(By.xpath("//input[@name='first_name']"));

		f12.sendKeys("SRIDHARAN");

		WebElement f13 = a.findElement(By.xpath("//input[@name='last_name']"));

		f13.sendKeys("M");

		WebElement f14 = a.findElement(By.xpath("//textarea[@name='address']"));

		f14.sendKeys("No:8,VINAYAGAR KOIL STREET-608001,CONTACT NO:8056459018");

		WebElement f15 = a.findElement(By.xpath("//input[@name='cc_num']"));

		f15.sendKeys("1234000088886789");

		WebElement f16 = a.findElement(By.xpath("//select[@id='cc_type']"));

		Select s7 = new Select(f16);

		s7.selectByIndex(1);

		WebElement f17 = a.findElement(By.xpath("//select[@id='cc_exp_month']"));

		Select s8 = new Select(f17);

		s8.selectByIndex(10);

		WebElement f18 = a.findElement(By.xpath("//select[@name='cc_exp_year']"));

		Select s9 = new Select(f18);

		s9.selectByIndex(12);

		WebElement f19 = a.findElement(By.xpath("//input[@name='cc_cvv']"));

		f19.sendKeys("786");

		WebElement f20 = a.findElement(By.xpath("//input[@name='book_now']"));

		f20.click();

		a.navigate().to("https://adactinhotelapp.com/BookedItinerary.php");

		WebElement f21 = a.findElement(By.xpath("//a[text()='Booked Itinerary']"));

		f21.click();

		a.navigate().to("https://adactinhotelapp.com/BookedItinerary.php");
		a.manage().window().fullscreen();

		  WebElement f25 = a.findElement(By.xpath("//input[@value='Logout']"));
		  f25.click();
		 
	}
}
// end of the project
