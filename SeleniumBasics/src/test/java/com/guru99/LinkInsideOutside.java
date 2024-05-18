package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInsideOutside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/block.html";
		driver.get(baseUrl);
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
