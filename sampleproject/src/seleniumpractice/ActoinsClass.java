package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActoinsClass {
	@Test
	public void actions() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Srikath/Desktop/Registration.html");
		Actions act = new Actions(driver);

		act.clickAndHold().moveByOffset(40, 30).release().build().perform();
		driver.manage().window().maximize();

		/*
		 * act.click(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")))
		 * .perform();
		 * act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")
		 * )).perform();
		 * driver.findElement(By.xpath("//form[@class='_1WMLwI header-form-search']")).
		 * click(); act.keyDown(driver.findElement(By.xpath("//li[@class='_1va75j']")),
		 * Keys.PAGE_DOWN).perform();
		 */
	}

}
