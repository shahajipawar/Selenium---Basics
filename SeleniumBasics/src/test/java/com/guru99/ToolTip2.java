package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		String expectedTooltip = "What's new in 3.2";
		driver.get(baseUrl);
		
		WebElement download = driver.findElement(By.xpath("//a[@id='download_now']"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(download).build().perform();
		
		WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
		
		String actualTooltip = toolTipElement.getText();
		System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        
		if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();
	}

}
