package framework;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

	public static void Launch_Apllication(String browser, String url) {

		try {
			switch (browser.trim().toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				Data.driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				Data.driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				Data.driver = new EdgeDriver();
				break;

			default:
				System.out.println("given browser is invalid" + browser + "pls give chrome edge firefox");
				System.exit(0);
				break;
			}

			Data.driver.get(url);
			Data.driver.manage().window().maximize();
			Data.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Data.driver.findElement(By.name("email"));
			System.out.println("browser has been launched and navigated to loginpage");

		} catch (IllegalStateException | SessionNotCreatedException e) {
			System.out.println("unable to launch the browser as exception has been found " + e.getMessage());
			System.exit(0);

		} catch (NoSuchElementException e) {
			System.out.println("browser has launched not navigated to login page");
		}

	}

}
