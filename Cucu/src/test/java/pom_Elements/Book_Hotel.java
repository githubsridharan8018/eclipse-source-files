package pom_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	
	public static WebDriver web;
	

	     public Book_Hotel(WebDriver web2) {
	     this.web=web2;
	     PageFactory.initElements(web, this);
	   
	   
	   }
	   
    	public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getLastname() {
			return lastname;
		}
		public WebElement getBilling_address() {
			return billing_address;
		}
		public WebElement getCard_number() {
			return card_number;
		}
		public WebElement getCard_type() {
			return card_type;
		}
		public WebElement getExpmonth() {
			return expmonth;
		}
		public WebElement getExpyear() {
			return expyear;
		}
		public WebElement getCvv_no() {
			return cvv_no;
		}
		public WebElement getBook_now() {
			return book_now;
		}
		
		@FindBy(xpath = "//input[@name='first_name']")
		private WebElement firstname;
	    @FindBy(xpath ="//input[@name='last_name']")
		private WebElement lastname;
	   @FindBy(xpath ="//textarea[@name='address']")
		private WebElement billing_address;
	   @FindBy(xpath = "//input[@name='cc_num']")
		private WebElement card_number;
	   @FindBy(xpath ="//select[@name='cc_type']")
		private WebElement card_type;
	   @FindBy(xpath = "//select[@name='cc_exp_month']")
	   private WebElement expmonth;
	   @FindBy(xpath = "//select[@name='cc_exp_year']")
	   private WebElement expyear;
	   @FindBy(xpath="//input[@name='cc_cvv']")
	   private WebElement cvv_no;
	   @FindBy(xpath="//input[@name='book_now']")
	   private WebElement book_now;
		
		
		
		
		
		
		

}
