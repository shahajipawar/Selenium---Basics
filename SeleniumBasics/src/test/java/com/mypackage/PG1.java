package com.mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
     // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl); 
     // Get the actual value of the title
        actualTitle = driver.getTitle();
        
        /* 
         * Compare Actual & expected title of the page
         */
        if(actualTitle.contentEquals(expectedTitle)) 
        	{
        	System.out.println("Test Passed");
        	}
        else 
        	{
        	System.out.println("Test Failed");
        	}
        	driver.close();
        }  	
	}
