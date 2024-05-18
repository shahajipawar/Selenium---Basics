package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/ajax.html");
		
		
		driver.findElement(By.id("no")).click();
		System.out.println("Check1");
		driver.findElement(By.id("buttoncheck")).click();
		driver.wait(100);
		driver.findElement(By.cssSelector("#yes")).click();
		driver.findElement(By.id("buttoncheck")).click();

	}

}
