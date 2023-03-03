package org.datadriven.Data_Driven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	
public static WebDriver w;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardno;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv_no;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book_btn;
	
	
	public Book_Hotel(WebDriver w2) {
		
		w = w2;
		PageFactory.initElements(w,this);
	}

		//Getters created	
		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardno() {
			return cardno;
		}

		public WebElement getCardtype() {
			return cardtype;
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

		public WebElement getBook_btn() {
			return book_btn;
		}

}
