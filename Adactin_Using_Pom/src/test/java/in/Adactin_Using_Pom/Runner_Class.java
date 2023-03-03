package in.Adactin_Using_Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Runner_Class extends Base_Methods {
	
//Webdriver as class variable 
	public static WebDriver web = browser("Edge");

// main method	
	public static void main(String[] args) throws IOException {

//get url 		
	urllaunch("https://adactinhotelapp.com/");
//window maximize		
	max();
	screen("1");
	
//constructor 1 declaration
	
	Module1 s = new Module1(web);
		sendvalues(s.getUsername(),"sridharan8018");
		sendvalues(s.getPassword(), "239259");
		screen("2");
		clickon(s.getLogin_Btn());
		
//constructor 2
		
		Module2 t = new Module2(web);
		Dropdown(t.getLocation(), 4);
		Dropdown(t.getHotels(), 2);
		Dropdown(t.getRoomtype(), 2);
		Dropdown(t.getRoomnos(), 1);
		delete(t.getCheckin());
		sendvalues(t.getCheckin(), "30/12/2022");
		delete(t.getCheckout());
		sendvalues(t.getCheckout(), "31/12/2022");
		Dropdown(t.getAdult(), 2);
		Dropdown(t.getChild(), 2);
		screen("3");
		clickon(t.getSearchbtn());

//constructor 3
		
		Module3 u = new Module3(web);
		clickon(u.getRadiobtn());
		screen("4");
		clickon(u.getContinuebtn());
		
//constructor 4
		
		Module4 w = new Module4(web);
		sendvalues(w.getFirstname(), "SRIDHARAN");
		sendvalues(w.getLastname(), "M");
		sendvalues(w.getAddress(), "No:8,VINAYAGAR KOIL STREET-608001,CONTACT NO:8056459018");
		sendvalues(w.getCardno(),"1234000088886789");
		Dropdown(w.getCardtype(), 1);
		Dropdown(w.getExpmonth(), 10);
		Dropdown(w.getExpyear(),8);
		sendvalues(w.getCvv_no(),"786");
		screen("5");
		
		//clickon(w.getBook_btn());

//constructor 5	
		
		Module5 x = new Module5(web);
		clickon(x.getLogout_btn());
		screen("6");
		clickon(x.getAgainlgin());
		screen("7");
		
	}

}
