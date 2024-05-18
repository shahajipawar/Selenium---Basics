package com.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		//driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back(); //snapdeal
		driver.navigate().forward(); //amazon
		
		driver.navigate().refresh(); //refresh or reload the page

	}

}
