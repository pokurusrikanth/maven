package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anykeyword {

	@Test
	public void metohd() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/search?q=carona&rlz=1C1CHBD_enIN892IN892&oq=carona&aqs=chrome..69i57.2850j0j8&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='Next']")));

		/*
		 * Actions act = new Actions(driver); act.sendKeys(Keys.PAGE_DOWN).perform();
		 */

		WebElement element = driver.findElement(By.xpath("//span[text()='Next']"));
		try {

			while (element.isDisplayed()) {

				if (element.isDisplayed()) {
					Thread.sleep(5000);
					element.click();

					element = driver.findElement(By.xpath("//span[text()='Next']"));

					alllinks = driver.findElements(By.tagName("a"));
				}
			}

		} catch (NoSuchElementException | StaleElementReferenceException nse) {
			element = driver.findElement(By.xpath("//span[text()='Next']"));

			System.out.println("there is no next page available");

		}

		for (WebElement links : alllinks) {
			System.out.println(links.getAttribute("href"));
		}
		System.out.println(alllinks.size());
	}

}
