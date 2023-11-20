package AssistedProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Test
	public void GetTitle() {

		SoftAssert sf = new SoftAssert();

		String expectedtitle = "Your Store selenium";
		String actualtitle = driver.getTitle();

		// This assertion will fail, captures the assertion and it will continue to run
		// the program

		sf.assertEquals(actualtitle, expectedtitle, "The title does not match");

		driver.findElement(By.name("search")).sendKeys("mac");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

	}
}
