package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {
	
	public static WebDriver web;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement BookedItinerary;

	public Booking_Confirm(WebDriver web2) {
		this.web=web2;
		PageFactory.initElements(web, this);
		
	}

	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}


}
