package seleniumpractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumInterview {
	WebDriver driver;

	@Test
	public void testMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("user-data-dir=C://Users//SRIKANTH//AppData//Local//Google//Chrome//User Data");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.setExperimentalOption("prefs", prefs);
		System.out.println(options.getVersion());
		driver = new ChromeDriver(options);
		driver.navigate().to("http://google.com");
	}

	@Test
	public void sendKeysWithMultipleElements() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.switchTo().activeElement().sendKeys("srikanth", Keys.TAB, "reddy", Keys.TAB, "123456");
		System.out.println(driver.findElements(By.tagName("input")).size());

	}

	@Test
	public void placeHolder() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.findElement(By.xpath("//input[@name ='firstname']")).getAttribute("placeholder"));
	}

}
