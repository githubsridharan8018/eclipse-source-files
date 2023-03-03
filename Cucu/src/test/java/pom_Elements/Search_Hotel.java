package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver web;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	public Search_Hotel(WebDriver web2) {
		this.web = web2;
		PageFactory.initElements(web, this);

	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtypre() {
		return roomtypre;
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

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtypre;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement children;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;

}
