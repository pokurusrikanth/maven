package javapractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CommonMethods {
	@Test
	public static void selectValueInTheList(WebElement listbox, String valuetoselect) {

		List<WebElement> alloptions = listbox.findElements(By.tagName("option"));
		boolean iselementfound = false;
		for (WebElement opt : alloptions) {
			String opttext = opt.getText();

			if (opttext.equalsIgnoreCase(valuetoselect)) {
				opt.click();
				iselementfound = true;
				break;
			}
		}
		if (!iselementfound) {
			throw new ColumnInTableLNotFoundException("value" + valuetoselect + "in the list not found");
		}
	}

}
