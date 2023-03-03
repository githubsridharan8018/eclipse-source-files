package org.works;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotations extends Base_Frame {

	@BeforeTest
	public static void browserlaunch() {

		browser("chrome");
		urllaunch("https://adactinhotelapp.com");

	}

	@BeforeClass
	private void maximize() throws IOException {
		max();
		screen("1");
	}
	@Test(priority = 1,enabled = true)
	private void page1() throws IOException {

//constructor declaration

		Module1 s = new Module1(web);
		sendvalues(s.getUsername(), "sridharan8018");
		sendvalues(s.getPassword(), "Adactin$8018");
		screen("2");
		clickon(s.getLogin_Btn());
	}
	@Test(priority = 2,dependsOnMethods = "page1",alwaysRun = true)
	private void page2() throws IOException {

//constructor 2

		Module2 t = new Module2(web);
		Dropdown(t.getLocation(), 4);
		Dropdown(t.getHotels(), 2);
		Dropdown(t.getRoomtype(), 2);
		Dropdown(t.getRoomnos(), 1);
		delete(t.getCheckin());
		sendvalues(t.getCheckin(), "30/1/2023");
		delete(t.getCheckout());
		sendvalues(t.getCheckout(), "31/1/2023");
		Dropdown(t.getAdult(), 2);
		Dropdown(t.getChild(), 2);
		screen("3");
		clickon(t.getSearchbtn());
	}
	@Test(priority = 3,description = "radio button" )
	private void page3() throws IOException {

//constructor 3

		Module3 u = new Module3(web);
		clickon(u.getRadiobtn());
		screen("4");
		clickon(u.getContinuebtn());
		
	}
@Test(priority = 4)
 private void page4() throws IOException {


//constructor 4

		Module4 w = new Module4(web);
		sendvalues(w.getFirstname(), "SRIDHARAN");
		sendvalues(w.getLastname(), "M");
		sendvalues(w.getAddress(), "No:8,VINAYAGAR KOIL STREET-608001,CONTACT NO:8056459018");
		sendvalues(w.getCardno(), "1234000088886789");
		Dropdown(w.getCardtype(), 1);
		Dropdown(w.getExpmonth(), 10);
		Dropdown(w.getExpyear(), 8);
		sendvalues(w.getCvv_no(), "786");
		screen("5");

		// clickon(w.getBook_btn());
	}
	@Test(priority = 5)
	private void page5() throws IOException {

//constructor 5	

		Module5 x = new Module5(web);
		clickon(x.getLogout_btn());
		screen("6");
		clickon(x.getAgainlgin());
		screen("7");
	}

	
	
}
