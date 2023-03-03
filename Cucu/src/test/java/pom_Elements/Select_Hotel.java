package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver web;

	public Select_Hotel(WebDriver web2) {
		this.web = web2;
		PageFactory.initElements(web, this);

	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Continue;

}
