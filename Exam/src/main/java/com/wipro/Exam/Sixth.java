package com.wipro.Exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sixth {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Search Hotel']")
	private WebElement search_hotel;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout_btn;

//------------------------------------------------------------------------	
	public Sixth(WebDriver driver2) {

		Sixth.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// ------------------------------------------------------------------------------------------
	public WebElement getSearch_hotel() {
		return search_hotel;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
