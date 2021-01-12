package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import javapractice.Singletonclass;

public class Frame {
	WebDriver driver;

	@Test
	public void switchToFrame() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Srikath/Videos/New%20folder/exampleDragDrop.html");
		driver.switchTo().frame("dragdrop");

		// driver.findElement(By.xpath("//a[@class='pull-right']")).click();
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement receiver = driver.findElement(By.xpath("//div[@class='trash']"));
		act.dragAndDrop(source, receiver);
		highLightElement(driver.findElement(By.xpath("//a[text()='Example Source on GitHub']")));
		driver.switchTo().parentFrame();

		driver.switchTo().frame(1);
		highLightElement(driver.findElement(By.xpath("//a[text()='Example Source on GitHub']")));
		// System.out.println(driver.switchTo().defaultContent().getCurrentUrl());
		driver.switchTo().activeElement().sendKeys("srikanth");
		Singletonclass s = Singletonclass.getInstance();

	}

	public void highLightElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);

	}
}
