package com.guru99;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the site.
		String baseUrl = "https://demo.guru99.com/popup.php";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		String MainWindow = driver.getWindowHandle();
		
		// To handle all new opened window.
		Set<String> s1=driver.getWindowHandles();	
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);

	}

}
