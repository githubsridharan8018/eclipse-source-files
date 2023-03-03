package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancel_Booked {

	public static WebDriver web;
	
	
	@FindBy(xpath = "//input[@value='check_all']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement cancelseleted;

    @FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;
	

	public Cancel_Booked(WebDriver web2) {
		this.web = web2;
		PageFactory.initElements(web, this);

	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelseleted() {
		return cancelseleted;
	}

	public WebElement getLogout() {
		return logout;
	}

}
