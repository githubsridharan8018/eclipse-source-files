package com.wipro.Exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third {
	// Webdriver as class variable
	public static WebDriver driver;

	// radio button
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobtn;

	// continue button
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continuebtn;
//------------------------------------------------------------------------------------------	

	public Third(WebDriver driver2) {
		Third.driver = driver2;
		PageFactory.initElements(driver,this);
	}
//-----------------------------------------------
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
