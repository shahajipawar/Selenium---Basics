package com.mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\BrowserDrivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver(); //ChromeDriver driver=new ChromeDriver();
		//driver.get("https://frontend.nopcommerce.com/");
		
		//Firefox Browser
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\BrowserDrivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver(); //FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://frontend.nopcommerce.com/");
		
		//Edge Browser
		//System.setProperty("webdriver.edge.driver", "C:\\Program Files\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver(); //EdgeDriver driver=new EdgeDriver();
		
		//********Using WebDriverManger********////
		//Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Firefox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		//Edge browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
				
		driver.get("https://frontend.nopcommerce.com/");
		
		//driver.getTitle();
		System.out.println("Title of the web page is: "+driver.getTitle());
		System.out.println("URL of the web page is: "+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
