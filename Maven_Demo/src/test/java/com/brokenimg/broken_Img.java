package com.brokenimg;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_Img {

	public static void main(String[] args) throws MalformedInputException, IOException {
		
		
		WebDriver wd = new ChromeDriver();
		
        wd.get("https://www.flipkart.com/");
		
		List<WebElement> all_img = wd.findElements(By.tagName("img"));
		
		for (WebElement img : all_img) {
			
			String imglink = img.getAttribute("src");
			
			if (imglink == null || imglink.isEmpty()) {
				
				continue;
			}
			
			URL l = new URL(imglink);
			
			URLConnection openConnection = l.openConnection();
			
			HttpsURLConnection http = (HttpsURLConnection) openConnection;
			
			int responseCode = http.getResponseCode();
			
			String responseMessage = http.getResponseMessage();
			
			if (responseCode>=400) {
				
				System.out.println(imglink+ "/"+responseMessage+"/"+responseCode);
			}
			
		
			
		}
		
            
	}

}
