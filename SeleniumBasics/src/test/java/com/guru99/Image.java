package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//click on the "Facebook" logo on the upper left portion
		driver.findElement(By.cssSelector("#ctaCanvas")).click();
		
		System.out.println("Check1");
		driver.wait();
		
		//verify that we are now back on Facebook's homepage
		if(driver.getTitle().equals("Facebook - log in or sign up"))
		{
			System.out.println("We are back at facebook's page");
		}
		else
		{
			System.out.println("We are not on facebook's page");
		}
		driver.close();

	}

}
