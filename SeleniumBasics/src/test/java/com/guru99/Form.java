package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/login.html";
		System.out.println("check1");
		driver.get(baseUrl);
		System.out.println("check2");
		driver.manage().window().maximize();
		
		 // Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		
		// send the values in text fields
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("Values are entered for email & password");
				
		// Deleting values in the text box
		email.clear();
		password.clear();
		System.out.println("Values from email & password are cleared");
				
		// Find the submit button
		WebElement login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		
		// Using click method to submit form
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		login.click();
		System.out.println("Login is done");
		driver.wait();
		//using submit method to submit the form. Submit used on password field
				

	}

}
