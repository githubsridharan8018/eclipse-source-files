package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Specific_Data {

	public static void main(String[] args) throws IOException  {
		
		File a = new File("C:\\Users\\sridh\\eclipse-workspace\\Excel\\exceldata\\firstdata.xlsx");
		
		FileInputStream b = new FileInputStream(a);
		
		Workbook wb = new XSSFWorkbook(b);
		
		Sheet s = wb.getSheet("Sample");
		
		Row r = s.getRow(13);
		
		Cell c = r.getCell(3);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			String scv = c.getStringCellValue();
			
			System.out.println(scv);
			
		}else if (ct.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			
			int i = (int) d; //narrowing
			
			String valueOf = String.valueOf(i);		
			
			System.out.println(valueOf);
			
		}
		
   }

}
