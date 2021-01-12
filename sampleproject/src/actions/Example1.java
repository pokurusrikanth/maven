package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Example1 {
	private static WebDriver driver;

	@Test
	public static void actionsclass() {
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Srikath/Desktop/Registration.html");
		driver.manage().window().maximize();
		// Actions action = new Actions(driver);
		WebElement perminantcity = driver.findElement(By.id("PermanentCity"));
		WebElement city = driver.findElement(By.id("City"));

		WebElement sportslistbox = driver.findElement(By.id("sports"));
		List<WebElement> sportslist = sportslistbox.findElements(By.tagName("option"));

		String[] sport_to_select = { "cricket", "badminton", "hockey", "volleyball", "rugby" };

		for (WebElement sport : sportslist) {
			for (String sports : sport_to_select) {
				if (sport.getText().equalsIgnoreCase(sports)) {
					sport.click();
				} else {
					System.out.println("given sport is not in the list:" + sports);
				}
			}

		}

	}

	public static int getindexoption(WebElement listbox, String valuetoselect) {
		int index = -1;
		List<WebElement> options = listbox.findElements(By.tagName("option"));
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			if (option.getText().equalsIgnoreCase(valuetoselect)) {
				option.click();
				index = i;
				break;
			}
		}
		return index;
	}

}
