package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	@Test
	public void css() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("nandasele69@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid ')]")).click();
	}

}
