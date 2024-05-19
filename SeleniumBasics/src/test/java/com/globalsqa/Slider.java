package com.globalsqa;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String baseUrl = "https://www.globalsqa.com/demo-site/";
		driver.get(baseUrl);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.linkText("Slider")).click();

		// Check messsage shown
		Thread.sleep(3000L);
		String actualMessage = "Select a grid. Hold down the Ctrl key to make multiple non-adjacent selections.";
		String expectedMessage = driver.findElement(By.xpath("//*[@id='post-2673']/div[2]/div/div/div[1]/div/text()")).getText();
		try {
			Assert.assertEquals(expectedMessage, actualMessage);
			System.out.println("Test case 2 is passed");
		} catch (Exception e) {
			System.out.println("Test case 2 is failed");
		}

		Thread.sleep(3000L);

		// Switch to iFrame first
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame lazyloaded")));

		// Handle slider
		WebElement redSlider = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		WebElement greenSlider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement blueSlider = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		// Actions action = new Actions(driver);
		// action.dragAndDropBy(redSlider, 300, 200).perform();

		Point point = redSlider.getLocation();
		int xCord = point.getX();
		int yCord = point.getY();
		System.out.println(xCord + ", " + yCord);

	}

}
