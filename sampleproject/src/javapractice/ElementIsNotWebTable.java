package javapractice;

import org.openqa.selenium.WebDriverException;

public class ElementIsNotWebTable extends WebDriverException {

	private String exceptionmessage;

	public ElementIsNotWebTable(String message) {
		exceptionmessage = message;
	}

	public String getmessgae() {
		return exceptionmessage;
	}
}
