package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://frontend.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//findElement()  --Returns the single WebElement
		//1
		//WebElement searchbox=driver.findElement(By.id("small-searchterms"));
		//searchbox.sendKeys("xyz");
		
		//2
		//WebElement ele=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement ele=driver.findElement(By.id("//*[@id='small-searchterms']"));
		ele.sendKeys("xyz");
		//System.out.println(ele.getText());
	}

}
