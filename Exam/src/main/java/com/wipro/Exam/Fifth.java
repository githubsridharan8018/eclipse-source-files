package com.wipro.Exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifth {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myitinerary;

//---------------------------------------------
	public Fifth(WebDriver driver2) {
		Fifth.driver = driver2;
		PageFactory.initElements(driver, this);
	}

//-------------------------------------------------
	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
