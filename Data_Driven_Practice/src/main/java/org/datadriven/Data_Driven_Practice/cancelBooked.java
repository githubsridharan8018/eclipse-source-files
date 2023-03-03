package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancelBooked {
	
	
	public static WebDriver w;
	
	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelselected;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;
	
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement loginagain;


	

	
	public cancelBooked(WebDriver w2) {
		
		w = w2;
		PageFactory.initElements(w,this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelselected() {
		return cancelselected;
	}
		
		public WebElement getLogout() {
			return logout;
		}


		public WebElement getLoginagain() {
			return loginagain;
	}

}
