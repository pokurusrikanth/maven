package javapractice;

import org.openqa.selenium.WebDriverException;

public class ColumnInTableLNotFoundException extends WebDriverException {

	private String exceptionmessage;

	public ColumnInTableLNotFoundException(String message) {
		exceptionmessage = message;
	}

	public String getmessage() {
		return exceptionmessage;
	}

}
