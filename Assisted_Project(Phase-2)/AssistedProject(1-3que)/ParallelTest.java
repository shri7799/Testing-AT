package AssistedProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	public void wikiPage1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");

		driver.close();
	}

	@Test
	public void wikiPage2() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");

		driver.close();

	}

	@Test
	public void ninjaPage1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		driver.close();

	}

	@Test
	public void ninjaPage2() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		driver.close();

	}

}
