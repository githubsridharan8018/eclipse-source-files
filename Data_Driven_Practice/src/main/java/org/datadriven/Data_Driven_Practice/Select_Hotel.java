package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	// Webdriver as class variable
	public static WebDriver w;
	// radio button
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobtn;

	// continue button
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continuebtn;

	public Select_Hotel(WebDriver w2) {
		w = w2;
		
		PageFactory.initElements(w,this);
	}

	// Getters created
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
