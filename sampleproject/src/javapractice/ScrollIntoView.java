package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView {

	@Test
	public void ByVisibleElement() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get(
				"https://www.tripadvisor.in/Hotel_Review-g641714-d1156207-Reviews-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");

		WebElement Element = driver.findElement(By.xpath("//a[text()='Write a review']"));

		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		driver.switchTo().window(
				"https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
	}

}
