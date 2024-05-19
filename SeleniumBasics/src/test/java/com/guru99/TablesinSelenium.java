package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		String innertext = driver.findElement(By.xpath("//font[contains(text(),'Always')]")).getText();
		System.out.println(innertext);
		driver.close();
	}

}
