package com.Adactin_Dxpath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run extends Intro {//  declaration

	public static void main(String[] args) throws IOException {
//browser launch
		browser("chrome");
//get url		
		url("https://adactinhotelapp.com/");
//maximize window		
		q.manage().window().maximize();
		screenshot("1");
//user name 		
		WebElement f1 = q.findElement(By.xpath("//td[@width='150']//following::input[@type='text']"));
		send_Value(f1, "sridharan8018");
//password		
		WebElement f2 = q.findElement(By.xpath("//td[@align='right']//following::input[@type='password' and @name='password']"));
		send_Value(f2, "239259");
		screenshot("2");
//log in 		
		WebElement f3 = q.findElement(By.xpath("//span[@id='username_span']//following::input[@type='Submit']"));
		click_On(f3);
		screenshot("3");
//location		
		WebElement f4 = q.findElement(By.xpath("//td//parent::select[@name='location']"));
		drop_Down(f4,6);
//hotels
		WebElement f5 = q.findElement(By.xpath("//td//parent::select[@name='hotels']"));
		drop_Down(f5,4);
//room type
		WebElement f6 = q.findElement(By.xpath("//form[@name='search_form']//ancestor::select[@name='room_type']"));
		drop_Down(f6,4);
//no of rooms
		WebElement f7 = q.findElement(By.xpath("//td//child::select[@name='room_nos']"));
		drop_Down(f7,8);
		click_On(f7);
//check in date
		WebElement f8 = q.findElement(By.xpath("//td//child::input[@name='datepick_in']"));
		click_On(f8);
		delete(f8);
		send_Value(f8,"26/12/2022");
//check out date 
		WebElement f9 = q.findElement(By.xpath("//td//child::input[@name='datepick_out']"));
		click_On(f9);
		delete(f9);
		send_Value(f9,"31/12/2022");
//Adults per room
		WebElement f10 = q.findElement(By.xpath("//td//child::select[@name='adult_room']"));
		drop_Down(f10, 2);
//Children per room
		WebElement f11 = q.findElement(By.xpath("//td//child::select[@name='child_room']"));
		drop_Down(f11, 2);
		screenshot("4");
//search button
		WebElement f12 = q.findElement(By.xpath("//td//child::input[@id='Submit']"));
		click_On(f12);
//radio button
		WebElement f13 = q.findElement(By.xpath("//tr//child::input[@type='radio']"));
		click_On(f13);
//continue button
		WebElement f14 = q.findElement(By.xpath("//tr//child::input[@value=\"Continue\"]"));
		click_On(f14);
//first name 
		WebElement f15 = q.findElement(By.xpath("//td//child::input[@name='first_name']"));
		send_Value(f15, "SRIDHARAN");
//Last name
		WebElement f16 = q.findElement(By.xpath("//td//child::input[@id='last_name']"));
		send_Value(f16, "M");
//Billing address
		WebElement f17 = q.findElement(By.xpath("//td//child::textarea[@name='address']"));
		send_Value(f17, "No:8,VINAYAGAR KOIL STREET-608001,CONTACT NO:8056459018");
//credit card no 
		WebElement f18 = q.findElement(By.xpath("//td//child::input[@name='cc_num']"));
		send_Value(f18, "1234000088886789");
//credit card type
		WebElement f19 = q.findElement(By.xpath("//td//child::select[@name='cc_type']"));
        drop_Down(f19, 1);
//cc expiry month
        WebElement f20 = q.findElement(By.xpath("//td//child::select[@name='cc_exp_month']"));
        drop_Down(f20, 12);
//cc expiry year
        WebElement f21 = q.findElement(By.xpath("//td//child::select[@name='cc_exp_year']"));
        drop_Down(f21,12);
// cc cvv no
        WebElement f22 = q.findElement(By.xpath("//td//child::input[@name='cc_cvv']"));
        send_Value(f22, "786");
        screenshot("5");
//book now button
        WebElement f23 = q.findElement(By.xpath("//td//child::input[@value='Book Now']"));
        click_On(f23);
//booked iternity
        WebElement f24 = q.findElement(By.xpath("//tbody//preceding::a[text()='Booked Itinerary']"));
        click_On(f24);
        screenshot("6");
//logout
        WebElement f25 = q.findElement(By.xpath("//tbody//preceding::input[@type='button' and @id='logout']"));;
        click_On(f25);
        screenshot("7");		
	}

}
