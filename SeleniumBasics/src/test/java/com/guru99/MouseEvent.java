package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);

		WebElement link_home = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_home).build();
		String bgColor = td_home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		bgColor = td_home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();
	}

}
