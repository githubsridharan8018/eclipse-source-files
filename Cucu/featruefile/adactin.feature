Feature: Adactin Hotel

Scenario: Login Functionality

Given User can be able to launch the Url
When  User can be able to enter the username in textbox
And   User can be able to enter the password in textbox
Then  User can be able to click on the login button and it navigates to the search hotel


Scenario: Search Hotel Functionality

When User can be able to select the Location dropdown
And  User can be able to select the Hotel dropdown
And  User can be able to select the Roomtype dropdown 
And  User can be able to select the Number of rooms dropdown
And  User can able to clear the textbox and enter the data in Checkindate textbox
And  User can able to clear the textbox and enter the data in Checkout textbox
And  User can be able to select the Adults per room dropdown
And  User can be able to select the Children per room dropdown
Then User can be able to click the search button and it navigates to the select hotel page

Scenario: Select Hotel Functionality

When User can able to select the Radio button
Then User can able to click the Continue button and it navigates to the Book a hotel page

Scenario: Book A Hotel Functionality

When User can be able to enter the First name in textbox
And  User can be able to enter the Last name in textbox
And  User can be able to enter the Billing address in textbox
And  User can be able to enter the Credit cardno in textbox
And  User can be able to select the Credit card type dropdown
And  User can be able to select the Expiry year and month dropdown
And  User can be able to enter the CVV number in textbox
Then User can be able to click the Book now and it navigates to the Booked Itinerary page

Scenario: Booked Itinerary Functionality

Then User can be able to select the BookedItinerary

Scenario: Cancel Booking Functionality

When User can be able to select the Checkbox option
And user can be able to select the cancelselected button
Then User can be able to click the Logout button


