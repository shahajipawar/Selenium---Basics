package com.globalsqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions co = new EdgeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new EdgeDriver(co);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String baseURL = "https://www.globalsqa.com/demo-site/";
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000L);
		driver.findElement(By.linkText("Tabs")).click();
		Thread.sleep(1000L);
		
		//Handle add pop-up
		//driver.findElement(By.className("btn skip")).click();
		//driver.findElement(By.xpath("//*[@class='ns-etvks-e-7']")).click();
		//driver.findElement(By.xpath("//*[@class='btn skip' or text()='Close']")).click();
		//driver.findElement(By.xpath("//svg[viewBox='0 0 48 48' or text()='Close']")).click();
		

		// check label on page
		String expectedTitle = "Accordion And Tabs";
		String actualTitle = driver.findElement(By.xpath("//*[@class='page_heading']/h1")).getText();
		try {
			// Assert.assertEquals(expectedTitle, actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Case 1 passed");
		} catch (Exception e) {
			System.out.println("Case 1 Failed");
		}

		driver.findElement(By.id("Re-Size Accordion")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000L);

		//driver.findElement(By.xpath("//*[@class='ui-accordion ui-widget ui-helper-reset']/h3[4]"));	
	}
}
