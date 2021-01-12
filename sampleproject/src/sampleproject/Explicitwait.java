package sampleproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Explicitwait {

	private WebDriver driver;

	/*
	 * public void waitMethod() { WebDriverWait wait = new WebDriverWait(driver,
	 * 20); wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	 * wait.pollingEvery(Duration.ofSeconds(2));
	 * 
	 * }
	 */
	public void fluentwait() {
		FluentWait<WebDriver> wait = new FluentWait<>(new ChromeDriver());
		wait.withTimeout(Duration.ofSeconds(10));
		wait.withMessage("");
	}

	public void robot() {
		try {
			Robot rt = new Robot();

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void windowhandles() {
		Set<String> winahandles = driver.getWindowHandles();
		for (String handles : winahandles) {
			String title = driver.getTitle();
			if (title.contains("facebook")) {
				break;
			}
		}
		driver.close();
		driver.quit();
		Object[] handles = winahandles.toArray();
		driver.switchTo().window(handles[2].toString());
	}
}
