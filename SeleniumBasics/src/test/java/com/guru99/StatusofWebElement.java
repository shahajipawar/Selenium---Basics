package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://frontend.nopcommerce.com/");
				
		//isDisplayed() isEnabled()
		
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status:"+searchStore.isDisplayed()); //true
		System.out.println("Enabled status:"+searchStore.isEnabled()); 
		
		//isSelected() -buttons, check boxes, drop-down values
		WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female =driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected()); //False 
		System.out.println(female.isSelected()); //False
		
		male.click(); //selects male radio button
		System.out.println(male.isSelected()); //True
		System.out.println(female.isSelected()); //False
		
		female.click(); //selects female radio button
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //True		

	}

}
