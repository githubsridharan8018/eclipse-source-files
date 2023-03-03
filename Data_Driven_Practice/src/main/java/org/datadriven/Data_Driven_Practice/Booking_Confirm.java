package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {
	
	public static WebDriver w;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement myitinerary;

	public Booking_Confirm(WebDriver w2) {
		w = w2;
		PageFactory.initElements(w,this);
		
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
