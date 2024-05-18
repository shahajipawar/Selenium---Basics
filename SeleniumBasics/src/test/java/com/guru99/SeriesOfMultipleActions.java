package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeriesOfMultipleActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "http://www.facebook.com/";
		driver.get(baseUrl);
		
		WebElement username = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "Hello").keyUp(username, Keys.SHIFT).doubleClick(username).contextClick().build();
		seriesOfActions.perform();
		driver.close();
	}

}
