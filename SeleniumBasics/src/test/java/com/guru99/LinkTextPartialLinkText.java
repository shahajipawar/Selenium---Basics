package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/link.html");
		driver.findElement(By.linkText("click here")).click();
		System.out.println("Title of the page is: "+driver.getTitle());
		 		
		driver.get("https://demo.guru99.com/test/accessing-link.html");
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("Title of the page is: "+driver.getTitle());
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		//String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		//System.out.println(theLinkText);
		String theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(theLinkText);		
		driver.close();
	} 
}
