package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
		driver.get(baseUrl);
		//To find data in third row 2nd column of table
		String tableRow = driver.findElement(By.xpath("//tbody/tr[3]/td[2]")).getText();
		System.out.println(tableRow);
		
		//To find data in 6th row 5th column of table
		String tableRow1 = driver.findElement(By.xpath("//tbody/tr[6]/td[5]/font[1]")).getText();
		System.out.println(tableRow1);
		
		driver.close();
	}

}
