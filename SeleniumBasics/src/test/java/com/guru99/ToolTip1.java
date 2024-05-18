package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/social-icon.html";
		driver.get(baseUrl);
		String expectedTooltip = "Github";
		
		// Find the Github icon at the top right of the header
		WebElement Github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
		System.out.println("Element found!");
		
		//get the value of the "title" attribute of the github icon
		String actualTooltip = Github.getAttribute("Title");
				
		//Assert the tooltip's value is as expected 
		if(actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test case passed!");
		}
		driver.close();
	}

}
