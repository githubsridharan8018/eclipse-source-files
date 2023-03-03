package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver w;
	
	@FindBy(xpath = "//input[@type='text']" )
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement loginbutton;

	
	
	public Login_Page(WebDriver w2) {
		
		w = w2;
		PageFactory.initElements(w,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return loginbutton;
	}
}
