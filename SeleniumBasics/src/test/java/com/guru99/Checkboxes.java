package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement r1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		WebElement r2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
				
		//Radio Button1 is selected
		r1.click();
		System.out.println("Radio 1 is selected");
		
		//Radio Button1 is de-selected and Radio Button2 is selected
		r2.click();
		System.out.println("Radio 2 is selected");
		
		// Selecting CheckBox
		WebElement ch1 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		
		// This will Toggle the Check box 
		ch1.click();
		
		// Check whether the Check box is toggled on
		if(ch1.isSelected())
		{
			System.out.println("Checkbox is Toggled On");
		}
		else
		{
			System.out.println("Checkbox is Toggled OFF");
		}
		
		//Selecting Checkbox and using isSelected Method
		
	}

}
