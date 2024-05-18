package com.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("navList");
		WebElement we = driver.findElement(By.xpath("//html"));
		System.out.println("Display status:"+we.isDisplayed());
		we.click();
		System.out.println("label:" +we.getTagName());
		driver.close();

	}

}
