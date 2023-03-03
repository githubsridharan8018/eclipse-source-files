package com.wipro.Exam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple {

	public static WebDriver driver;

	public static void browseropen(String name) {

		driver = new ChromeDriver();
	}

	public static void passurl(String url) {
		driver.get(null);

	}

	public static void maxwindow() {
		driver.manage().window().maximize();

	}

	public static void send_values(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void element_Clk(WebElement element) {
		element.click();

	}

	public static void picshot(String name) throws IOException {

		TakesScreenshot a = (TakesScreenshot) driver;
		File source = a.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\sridh\\eclipse-workspace\\Exam\\picture\\" + name + ".png");
		FileUtils.copyFile(source, destn);

	}

	public static void dropdwn(WebElement element, int passindex) {
		Select b = new Select(element);
		b.selectByIndex(passindex);

	}

	public static void pop() {

		driver.switchTo().alert().accept();

	}

	public static void browserclose() {

		driver.close();

	}

}
