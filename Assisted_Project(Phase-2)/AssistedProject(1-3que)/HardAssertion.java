package AssistedProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertion {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Test
	public void getTitle() {

		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "The title does not match...");

		// assertTrue

		boolean searchbox = driver.findElement(By.name("search")).isDisplayed();

		// if search box is having True, then assert condition passes
		// if search box is having false, then assert condition fails

		// searchbox = false;

		Assert.assertTrue(searchbox);

		driver.findElement(By.name("search")).sendKeys("mac");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}

}
