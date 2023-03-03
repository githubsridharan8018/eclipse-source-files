package com.wipro.Exam;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Run extends Simple {

// constructor 
	
	First f1 = new First(driver);
	Second s2 = new Second(driver);
	Third t3 = new Third(driver);
	Fourth f4 = new Fourth(driver);
	Fifth f5 = new Fifth(driver);
	Sixth s6 = new Sixth(driver);
	
	
	@BeforeTest
	public static void browserlaunch() {

		browseropen("chrome");
	}
	
	@AfterTest
	public static void browserexit() {
		browserclose();
	}

	@BeforeMethod
	public void login() {

		send_values(f1.getUsername(), "sridharan8018");
		send_values(f1.getPassword(), "Adactin$8018");
		element_Clk(f1.getLogin());
	}
	@Test
	public void creek() {
		
		dropdwn(s2.getLocation(), 2);
		dropdwn(s2.getHotels(), 1);
		dropdwn(s2.getRoomtype(), 2);
		dropdwn(s2.getRoomnos(), 0);
		send_values(s2.getCheckin(), "24/01/2022");
		send_values(s2.getCheckout(), "26/01/2022");
		dropdwn(s2.getAdult(), 0);
		dropdwn(s2.getChild(), 1);
		
		

	}
	
	@Test
	public void sunshine() {
		dropdwn(s2.getLocation(), 2);
		dropdwn(s2.getHotels(), 2);
		dropdwn(s2.getRoomtype(), 2);
		dropdwn(s2.getRoomnos(), 0);
		send_values(s2.getCheckin(), "24/01/2022");
		send_values(s2.getCheckout(), "26/01/2022");
		dropdwn(s2.getAdult(), 0);
		dropdwn(s2.getChild(), 1);
		
		
		

	}

	@Test
	public void cornice() {
		
		dropdwn(s2.getLocation(), 2);
		dropdwn(s2.getHotels(), 4);
		dropdwn(s2.getRoomtype(), 2);
		dropdwn(s2.getRoomnos(), 0);
		send_values(s2.getCheckin(), "24/01/2022");
		send_values(s2.getCheckout(), "26/01/2022");
		dropdwn(s2.getAdult(), 0);
		dropdwn(s2.getChild(), 1);
		

	}
	
	public void logout() {
		
		

	}
}
