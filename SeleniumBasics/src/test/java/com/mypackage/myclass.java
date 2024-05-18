package com.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String alertMessage = "";
		driver.get("http://output.jsbin.com/usidix/1");
		WebElement ele1 = driver.findElement(By.cssSelector("input[value='Go!']"));
		ele1.click();
		driver.wait(100);
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
		//driver.quit();
	}

}
