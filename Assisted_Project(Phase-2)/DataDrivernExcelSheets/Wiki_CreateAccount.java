package com.datadrivenExcelSheets;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Wiki_CreateAccount {
	WebDriver driver;

	@BeforeClass
	public void openbrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");

	}

	@Test(dataProvider = "testdata")
	public void CreateAccount(String username, String password, String confirmpassword, String email)
			throws InterruptedException {

		driver.findElement(By.id("wpName2")).clear();
		driver.findElement(By.id("wpName2")).sendKeys(username);
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(confirmpassword);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
		Thread.sleep(2000);
	}

	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object input[][] = XLS_DataProvider.getTestData("Sheet1");
		return input;

	}

}