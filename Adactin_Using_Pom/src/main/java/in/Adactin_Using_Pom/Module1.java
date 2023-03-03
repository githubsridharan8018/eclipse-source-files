package in.Adactin_Using_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module1 {

//Webdriver as class variable	
	public static WebDriver web;
//page 1	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login_Btn;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement Forget_Pass;
//----------------------------------------------------

//constructor module created 

	public Module1(WebDriver web2) {
		this.web = web2;

		PageFactory.initElements(web, this);
	}

	// ----------------------------------------------------
	// Getters method created

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public WebElement getForget_Pass() {
		return Forget_Pass;
	}

}
