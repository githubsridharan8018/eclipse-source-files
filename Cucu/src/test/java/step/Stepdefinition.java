package step;

import java.io.IOException;

import com.Baseclass.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_Elements.Book_Hotel;
import pom_Elements.Booking_Confirm;
import pom_Elements.Cancel_Booked;
import pom_Elements.Login_Page;
import pom_Elements.Search_Hotel;
import pom_Elements.Select_Hotel;

public class Stepdefinition extends Base_Class {// CODING

	public static Login_Page login = new Login_Page(web);
	public static Search_Hotel search = new Search_Hotel(web);
	public static Select_Hotel select = new Select_Hotel(web);
	public static Book_Hotel book = new Book_Hotel(web);
	public static Booking_Confirm Confirm = new Booking_Confirm(web);
	public static Cancel_Booked cancel = new Cancel_Booked(web);

	@Given("User can be able to launch the Url")
	public void user_can_be_able_to_launch_the_url() {

		geturl("https://adactinhotelapp.com/");
		max();

	}

	@When("User can be able to enter the username in textbox")
	public void user_can_be_able_to_enter_the_username_in_textbox() {

		sendvalues(login.getUsername(), "sridharan8018");

	}

	@When("User can be able to enter the password in textbox")
	public void user_can_be_able_to_enter_the_password_in_textbox() {

		sendvalues(login.getPassword(), "239259");

	}

	@Then("User can be able to click on the login button and it navigates to the search hotel")
	public void user_can_be_able_to_click_on_the_login_button_and_it_navigates_to_the_search_hotel() {

		click(login.getLogin());

	}

	@When("User can be able to select the Location dropdown")
	public void user_can_be_able_to_select_the_location_dropdown() {
		dropdown(search.getLocation(), 2);

	}

	@When("User can be able to select the Hotel dropdown")
	public void user_can_be_able_to_select_the_hotel_dropdown() {
		dropdown(search.getHotels(), 3);
	}

	@When("User can be able to select the Roomtype dropdown")
	public void user_can_be_able_to_select_the_roomtype_dropdown() {
		dropdown(search.getRoomtypre(), 3);
	}

	@When("User can be able to select the Number of rooms dropdown")
	public void user_can_be_able_to_select_the_number_of_rooms_dropdown() {
		dropdown(search.getRoomnos(), 2);
	}

	@When("User can able to clear the textbox and enter the data in Checkindate textbox")
	public void user_can_able_to_clear_the_textbox_and_enter_the_data_in_checkindate_textbox() {
		clear(search.getCheckin());
		sendvalues(search.getCheckin(), "29/12/2022");
	}

	@When("User can able to clear the textbox and enter the data in Checkout textbox")
	public void user_can_able_to_clear_the_textbox_and_enter_the_data_in_checkout_textbox() {
		clear(search.getCheckout());
		sendvalues(search.getCheckout(), "31/12/2022");
	}

	@When("User can be able to select the Adults per room dropdown")
	public void user_can_be_able_to_select_the_adults_per_room_dropdown() {
		dropdown(search.getAdults(), 2);
	}

	@When("User can be able to select the Children per room dropdown")
	public void user_can_be_able_to_select_the_children_per_room_dropdown() {
		dropdown(search.getChildren(), 2);
	}

	@Then("User can be able to click the search button and it navigates to the select hotel page")
	public void user_can_be_able_to_click_the_search_button_and_it_navigates_to_the_select_hotel_page()
			throws IOException, InterruptedException {
		screenshot("2");
		click(search.getSearch());
		Thread.sleep(4000);
	}

	@When("User can able to select the Radio button")
	public void user_can_able_to_select_the_radio_button() {
		click(select.getRadiobutton());

	}

	@Then("User can able to click the Continue button and it navigates to the Book a hotel page")
	public void user_can_able_to_click_the_continue_button_and_it_navigates_to_the_book_a_hotel_page()
			throws IOException, InterruptedException {
		screenshot("3");
		Thread.sleep(4000);
		click(select.getContinue());
	}

	@When("User can be able to enter the First name in textbox")
	public void user_can_be_able_to_enter_the_first_name_in_textbox() {
		sendvalues(book.getFirstname(), "ramya");

	}

	@When("User can be able to enter the Last name in textbox")
	public void user_can_be_able_to_enter_the_last_name_in_textbox() {
		sendvalues(book.getLastname(), "p");

	}

	@When("User can be able to enter the Billing address in textbox")
	public void user_can_be_able_to_enter_the_billing_address_in_textbox() {
		sendvalues(book.getBilling_address(), "No:15,Anna nagar west,chennai-600021");

	}

	@When("User can be able to enter the Credit cardno in textbox")
	public void user_can_be_able_to_enter_the_credit_cardno_in_textbox() {
		sendvalues(book.getCard_number(), "1234567890000000");
	}

	@When("User can be able to select the Credit card type dropdown")
	public void user_can_be_able_to_select_the_credit_card_type_dropdown() {
		dropdown(book.getCard_type(), 1);

	}

	@When("User can be able to select the Expiry year and month dropdown")
	public void user_can_be_able_to_select_the_expiry_year_and_month_dropdown() {
		dropdown(book.getExpmonth(), 11);
		dropdown(book.getExpyear(), 8);
	}

	@When("User can be able to enter the CVV number in textbox")
	public void user_can_be_able_to_enter_the_cvv_number_in_textbox() {
		sendvalues(book.getCvv_no(), "786");
	}

	@Then("User can be able to click the Book now and it navigates to the Booked Itinerary page")
	public void user_can_be_able_to_click_the_book_now_and_it_navigates_to_the_booked_itinerary_page()
			throws IOException, InterruptedException {
		screenshot("4");
		Thread.sleep(4000);
		click(book.getBook_now());
	}

	@Then("User can be able to select the BookedItinerary")
	public void user_can_be_able_to_select_the_booked_itinerary() throws InterruptedException, IOException {
		Thread.sleep(3000);
		screenshot("6");
		click(Confirm.getBookedItinerary());

	}

	@When("User can be able to select the Checkbox option")
	public void user_can_be_able_to_select_the_checkbox_option() {
		click(cancel.getCheckbox());
	}

	@When("user can be able to select the cancelselected button")
	public void user_can_be_able_to_select_the_cancelselected_button() throws InterruptedException {
		click(cancel.getCancelseleted());
		Thread.sleep(4000);
		Alert();
	}

	@Then("User can be able to click the Logout button")
	public void user_can_be_able_to_click_the_logout_button() throws IOException, InterruptedException {
		Thread.sleep(4000);
		click(cancel.getLogout());

		screenshot("7");
	}

}
