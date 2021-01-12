package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EvenMethods {
	public static WebDriver driver;

	public static void enterthevalue(WebElement element, String value) {

		if (element.isDisplayed()) {
			if (element.isEnabled()) {
				if (value != null) {
					element.sendKeys(value);

				} else {
					System.out.println("value is null");
				}
			} else {
				System.out.println("firstname is not enabled");
			}
		} else {
			System.out.println("firstname is not displayed");
		}
	}

	public static void elementclick(WebElement element, String stepname) {
		if (element.isDisplayed()) {
			if (element.isEnabled()) {
				element.click();
				System.out.println("click on companies link");
			} else {
				System.out.println("element is not enabled");
			}
		} else {
			System.out.println("element is not displayed");
		}
	}

}