package com.app.testng.dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%25253ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		
	}
	@Parameters({"username","password"})
	@Test
	public void login(String username ,String password) throws InterruptedException {
		driver.findElement(By.id("wpName1")).sendKeys(username);
		
		driver.findElement(By.id("wpPassword1")).sendKeys(password);
		Thread.sleep(3000);
	
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
