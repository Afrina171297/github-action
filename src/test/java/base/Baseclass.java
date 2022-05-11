package base;

	import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.testng.annotations.BeforeMethod;
	//import java.net.MalformedURLException;
	//import java.net.URL;
//import java.util.Scanner;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.remote.CapabilityType;
	//import org.openqa.selenium.remote.DesiredCapabilities;
	//import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.*;

   

//import java.io.File;

	public class Baseclass{
		
     public WebDriver driver;
		
		
	//@BeforeMethod
	@BeforeClass
	public void setUp(){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.tripadvisor.com/");
		System.out.println(driver);
		
	}
	

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
	}


