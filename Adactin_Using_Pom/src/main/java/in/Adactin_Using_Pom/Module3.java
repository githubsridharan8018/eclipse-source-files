package in.Adactin_Using_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module3 {
	
//Webdriver as class variable	
	public static WebDriver web;
// radio button	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobtn;
	
//continue button	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continuebtn;

public Module3(WebDriver web2) {
	
	this.web = web2;
	PageFactory.initElements(web,this);
	}

	//Getters created
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	

}
