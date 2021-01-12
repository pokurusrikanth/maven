package javapractice;

import java.sql.DriverManager;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Debugging {

	@Test
	public void difference() {

		int count = 0;
		for (int i = 1; i <= 10; i++) {
			count = +count + i + 2;
		}
		System.out.println(count);

		DriverManager.getConnection("")
		
		/*
		 * String url = null; WebDriverManager.chromedriver().setup(); WebDriver driver
		 * = new ChromeDriver(); driver.get(url);
		 * 
		 * /* Scanner scn = new Scanner(System.in); Random ran = new Random();
		 * 
		 * System.out.println("enter the first number"); int val1 = ran.nextInt(1000);
		 * System.out.println("enter the second number"); int val2 = ran.nextInt(1000);
		 * int count = 0; for (int i = val1; i <= val2; i++) { count++; }
		 * 
		 * System.out.println("difference of a number" + count++); scn.close();
		 */
	}

}
