package com.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.facebook.com";
		String tagname = "";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		tagname = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagname);
		//driver.close();
		driver.get("http://www.popuptest.com/popuptest2.html");
		driver.quit();  // using QUIT all windows will close
		//System.exit(0);
	}

}
