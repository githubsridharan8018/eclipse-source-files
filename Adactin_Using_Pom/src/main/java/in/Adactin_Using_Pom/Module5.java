package in.Adactin_Using_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module5 {
	
//Webdriver as class variable
	
	 public Module5(WebDriver web2) {
		 
		 this.web = web2;
		 PageFactory.initElements(web,this);

	 }

	public static WebDriver web;
	  
	 @FindBy(xpath = "//a[text()='Search Hotel']")
	 private WebElement search_hotel;
	 
	 
	 @FindBy(xpath = "//a[text()='Booked Itinerary")
	 private WebElement bookitinerary;
	 
	 @FindBy(xpath = "//input[@name='current_pass']")
	 private WebElement currentpass;
	 
	 @FindBy(xpath = "//input[@name='new_password']")
	 private WebElement newpass;
	 
	 @FindBy(xpath = "//input[@name='re_password']")
	 private WebElement repass;
	 
	 @FindBy(xpath = "//input[@name='change_password_Submit']")
	 private WebElement changepwdbtn;
	 
	 @FindBy(xpath = "//a[text()='Logout']")
	 private WebElement logout_btn;
	 
	 @FindBy(xpath = "//a[text()='Click here to login again']")
	 private WebElement againlgin;
	
	 
	 
	
public WebElement getAgainlgin() {
		return againlgin;
	}
	// logout
	public WebElement getLogout_btn() {
		return logout_btn;
		
	}
	 
	 
	 

}
