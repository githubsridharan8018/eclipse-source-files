package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver web;

	public Login_Page(WebDriver web2) {// constructor
		this.web = web2;
		PageFactory.initElements(web, this);
	}

	public static WebDriver getWeb() {
		return web;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgetpwd() {
		return forgetpwd;
	}

	public WebElement getRegiter() {
		return regiter;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@name='login']")
	private WebElement login;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgetpwd;
	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement regiter;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

}
