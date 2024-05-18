package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributesAsPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		// Using Attributes as Predicates when element is burried deep into the webtable/html code 
		String innerText =driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td[1]")).getText();
		System.out.println(innerText);
		driver.close();
	}

}
