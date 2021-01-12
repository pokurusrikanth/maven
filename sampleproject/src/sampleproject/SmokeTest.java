package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SmokeTest {
	@Test
	public void testmethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\folder1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		System.out.println("maven method");
	}
}
