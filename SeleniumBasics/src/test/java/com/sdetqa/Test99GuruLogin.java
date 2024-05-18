package com.sdetqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test99GuruLogin {
	String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	Guru99Login objLogin;
    Guru99HomePage objHomePage;
    
    //@BeforeTest
    public void setup(){
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://demo.guru99.com/V4/";
        driver.get(baseUrl);        
        }
    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object
    objLogin = new Guru99Login(driver);

    //Verify login page title
    String loginPageTitle = objLogin.getLoginTitle();
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application
    objLogin.loginToGuru99("mgr123", "mgr!23");

    // go the next page
    objHomePage = new Guru99HomePage(driver);

    //Verify home page
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
}
