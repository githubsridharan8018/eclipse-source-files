package in.Adactin_Using_Pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Methods {

//WebDriver static method declaration	
	public static WebDriver web;
//--------------------------------------------------------------------

//browser launch method	
	public static WebDriver browser(String name) {

		if (name.equalsIgnoreCase(name)) {

			web = new ChromeDriver();

		} else if (name.equalsIgnoreCase(name)) {

			web = new EdgeDriver();
		}
		return web;
	}
//-----------------------------------------------------------------------	

//window maximize

	public static void max() {
		web.manage().window().maximize();
	}
//------------------------------------------------------------------------

//TakesScreenshot method

	public static void screen(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot) web;
		File q = t.getScreenshotAs(OutputType.FILE);
		File w = new File("C:\\Users\\sridh\\eclipse-workspace\\Adactin_Using_Pom\\Images\\" + name + ".png");
		FileUtils.copyFile(q, w);

	}
//--------------------------------------------------------------------------

//click method

	public static void clickon(WebElement element) {
		element.click();
	}
//---------------------------------------------------------------------------

//sendkeys method

	public static void sendvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
//----------------------------------------------------------------------------

//Dropdown

	public static void Dropdown(WebElement element, int b) {

		Select a = new Select(element);
		a.selectByIndex(b);
	}
//-----------------------------------------------------------------------------

//Clear method

	public static void delete(WebElement element) {
		element.clear();
	}
//------------------------------------------------------------------------------	

//url method

	public static void urllaunch(String url) {
		web.get(url);
	}

//-------------------------------------------------------------------------------

//Alert

	public static void alrt() {

		web.switchTo().alert().accept();
	}
}
