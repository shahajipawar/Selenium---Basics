package com.globalsqa;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class Frames {
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
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Click Here")).click();
		// driver.findElement(By.xpath("//a[@class='button e.g. button_hilite
		// button_pale small_button'][normalize-space()='Click Here']"));

		// Handle the tabs opened in same browser
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		System.out.println(parentwindow);
		String childWindow = it.next();
		System.out.println(childWindow);

		// Switch to parent window
		driver.switchTo().window(parentwindow);
		System.out.println("Switched to Parent window");

		// Switch to child window and close it
		driver.switchTo().window(childWindow);
		driver.close();
		System.out.println("closed child window and switched to parent window");

		// switch to parent window Open new window
		driver.switchTo().window(parentwindow);
		System.out.println("switched back to parent window");
		Thread.sleep(2000L);
		// driver.findElement(By.id("Open New Window")).click();
		// driver.findElement(By.className("resp-tab-item")).click();
		// driver.findElement(By.cssSelector(".resp-tab-item")).click();
		driver.findElement(By.xpath("//li[@class='resp-tab-item'][1]")).click();

		String expectedText = "Click below button to open a new window now";
		// String actualTest = driver.findElement(By.linkText("Click below button to
		// open a new window now")).getText();
		String actualTest = driver
				.findElement(By.xpath("//strong[normalize-space()='Click below button to open a new window now']"))
				.getText();
		try {
			Assert.assertEquals(actualTest, expectedText);
			System.out.println("Test case 1 is passed");
		} catch (Exception e) {
			System.out.println("Test case 1 is failed");
		}

		// Navigate to iFrame tab
		driver.findElement(By.xpath("//li[@class='resp-tab-item'][2]")).click();

		String actualMessage = "Below is an iFrame. If you want to perform any operation in this window, you will need to enter in this iframe.";
		String expectedMessage = driver.findElement(By.xpath(
				"//strong[normalize-space()='Below is an iFrame. If you want to perform any operation in this window, you will need to enter in this iframe.']"))
				.getText();

		try {
			Assert.assertEquals(expectedMessage, actualMessage);
			System.out.println("Test case 2 is passed");
		} catch (Exception e) {
			System.out.println("Test case 2 is failed");
		}

		
		Thread.sleep(2000L);
		//Count number of iframes on page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		js.executeScript("window.scrollBy(0,200)");
		
		//Switch to required iFrame first		
		
		//Handle drop-down
//		Select testing = new Select(driver.findElement(By.xpath("//span[@id='current_filter']")));
//		testing.selectByVisibleText("AUTOMATION");
//		System.out.println("AUTOMATION");

	}

}
