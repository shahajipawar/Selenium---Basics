package com.guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
		
		// Alert Message handling
		driver.get(baseUrl);
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		
		// Switching to Alert
		Alert alert = driver.switchTo().alert();
		
		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();
		
		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(5000);
		
		// Accepting alert	
		alert.accept();
		System.out.println("Done");

	}

}
