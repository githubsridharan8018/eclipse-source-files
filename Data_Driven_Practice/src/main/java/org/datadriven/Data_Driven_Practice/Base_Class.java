package org.datadriven.Data_Driven_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class { // Adactin hotel booking

	public static WebDriver w; // null

	static String value;

	public static WebDriver browserlaunch(String browsername) {

		if (browsername.equalsIgnoreCase(browsername)) {

			w = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase(browsername)) {

			w = new EdgeDriver();

		}

		return w;

	}

	public static void windowmax() {

		w.manage().window().maximize();

	}
	public static void nav() {
		w.navigate();

	}
	
	public static void screen(String name) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot) w;
		File sc = t.getScreenshotAs(OutputType.FILE);
		File dn = new File("C:\\Users\\sridh\\eclipse-workspace\\Data_Driven_Practice\\Screenshot\\" +name +".png");
		FileUtils.copyFile(sc, dn);

	}
	
//	public static void scroll() {
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor) w;
//		js.executeScript("arguments[0].scrollIntoView()",w);
//
//	}

	public static void urllaunch(String url) {
		w.get(url);

	}

	public static void sendvalues(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickon(WebElement element) {

		element.click();

	}

	public static void dropdown(WebElement element, int index) {

		Select a = new Select(element);
		a.selectByIndex(index);

	}

	public static void delete(WebElement element) {

		element.clear();
	}

	public static void popup() {

		w.switchTo().alert().accept();

	}

	public static void hasnoend() {
		w.quit();

	}

	public static String Specificdata(String path,String sheet, int row, int cell) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wk = new XSSFWorkbook(fis);

		Sheet s = wk.getSheet(sheet);

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		CellType ct = c.getCellType();

		if (ct.equals(CellType.STRING)) {

			value = c.getStringCellValue();

		} else if (ct.equals(CellType.NUMERIC)) {

			double ncv = c.getNumericCellValue();

			int q = (int) ncv; // narrowing

			value = String.valueOf(q);

		}
		wk.close();
		return value;
	
	}
	

	

}
