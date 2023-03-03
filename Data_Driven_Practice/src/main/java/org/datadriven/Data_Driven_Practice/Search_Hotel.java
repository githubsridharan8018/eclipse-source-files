package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
public static WebDriver w;	
	
//location
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
//hotels
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	//private WebElement hotels;
//Room type
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
//room no's
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomnos;
//check in date
	@FindBy(xpath = "(//input[@maxlength='10'])[1]")
	private WebElement checkin;
//check out date
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;
//no of adults
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;
//no of child
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
//search button
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbtn;
	
	
	public Search_Hotel(WebDriver w2) {
		
		w = w2;
		PageFactory.initElements(w,this);
		
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	

}
