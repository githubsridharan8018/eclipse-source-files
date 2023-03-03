package org.datadriven.Data_Driven_Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Runner_Class extends Base_Class {

	public static WebDriver w = browserlaunch("chrome");
	public static Login_Page lp = new Login_Page(w);
	public static Search_Hotel sh = new Search_Hotel(w);
	public static Select_Hotel sl = new Select_Hotel(w);
	public static Book_Hotel bh = new Book_Hotel(w);
	public static Booking_Confirm bc = new Booking_Confirm(w);
	public static cancelBooked cb = new cancelBooked(w);

	public static void main(String[] args) throws IOException, InterruptedException {

//step 1:
		urllaunch("https://adactinhotelapp.com/");
		windowmax();

		String data = Specificdata("C:\\Users\\sridh\\eclipse-workspace\\Data_Driven_Practice\\excelfile\\mydata.xlsx",
				"Sheet1", 1, 1);
		sendvalues(lp.getUsername(), data);

		String data1 = Specificdata("C:\\Users\\sridh\\eclipse-workspace\\Data_Driven_Practice\\excelfile\\mydata.xlsx",
				"Sheet1", 1, 2);
		sendvalues(lp.getPassword(), data1);
		clickon(lp.getLogin_Btn());
//step 2:		
		dropdown(sh.getLocation(), 2);
		dropdown(sh.getHotels(), 3);
		dropdown(sh.getRoomtype(), 2);
		dropdown(sh.getRoomnos(), 4);
		delete(sh.getCheckin());
		sendvalues(sh.getCheckin(), "27/01/2023");
		delete(sh.getCheckout());
		sendvalues(sh.getCheckout(), "30/01/2023");
		dropdown(sh.getAdult(), 2);
		dropdown(sh.getChild(), 3);
		clickon(sh.getSearchbtn());
//step 3:		
		clickon(sl.getRadiobtn());
		clickon(sl.getContinuebtn());
//step 4:		
		sendvalues(bh.getFirstname(), "SRIDHARAN");
		sendvalues(bh.getLastname(), "M");
		sendvalues(bh.getAddress(), "NO:8 VINYAGAR KOIL STREET");
		sendvalues(bh.getCardno(), "1234567887654321");
		dropdown(bh.getCardtype(), 2);
		dropdown(bh.getExpmonth(), 8);
		dropdown(bh.getExpyear(), 11);
		sendvalues(bh.getCvv_no(), "786");
		clickon(bh.getBook_btn());
//step 5:
		clickon(bc.getMyitinerary());
//step 6:		
		clickon(cb.getCheckbox());
		clickon(cb.getCancelselected());
		popup();
		clickon(cb.getLogout());
		clickon(cb.getLoginagain());
		hasnoend();

	}
}
