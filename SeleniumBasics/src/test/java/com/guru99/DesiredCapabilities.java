package com.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		DesiredCapabilities capabilities = DesiredCapabilities.Chrome();		
	}
	// Pending https://www.guru99.com/desired-capabilities-selenium.html

	private static DesiredCapabilities Chrome() {
		// TODO Auto-generated method stub
		return null;
	}

}
