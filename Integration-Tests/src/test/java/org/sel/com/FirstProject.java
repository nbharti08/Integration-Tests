package org.sel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstProject {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void testcaseOne() {
		WebElement element= driver.findElement(By.xpath("//a[@title=\"Software Testing\"]"));
		element.click();
		
	} 
	
	
	@Test 
	public void testcaseTwo() {
		Assert.assertTrue(true);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
