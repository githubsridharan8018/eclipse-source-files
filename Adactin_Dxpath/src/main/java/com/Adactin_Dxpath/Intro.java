package com.Adactin_Dxpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Intro { // methods invoking

	public static WebDriver q;

	public static WebDriver browser(String name) {

		if (name.equalsIgnoreCase(name)) {
			q = new ChromeDriver();

		} else if (name.equalsIgnoreCase(name)) {

			q = new EdgeDriver();

		}
		return q;

	}

	public static void url(String url) {
		q.get(url);
	}

	public static void send_Value(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click_On(WebElement element) {
		element.click();

	}

	public static void drop_Down(WebElement element, int i) {

		Select s = new Select(element);

		s.selectByIndex(i);
	}

	public static void delete(WebElement del) {

		del.clear();
	}

	public static void screenshot(String name) throws IOException {// screenshot method

		TakesScreenshot s = (TakesScreenshot) q;

		File src = s.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\sridh\\eclipse-workspace\\Adactin_Dxpath\\usingDyamicXpath\\" + name + ".png");

		FileUtils.copyFile(src, des);
	}

}
