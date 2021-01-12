package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sampleclass extends Cofigurations {
	@Parameters({ "browser", "url" })
	@Test
	public void launchapplication(String browser) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srikath\\eclipse-workspace\\CogmentoAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("email")).sendKeys("nadasele69@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[text()='Login']")).sendKeys(Keys.ENTER);

	}

	@Test
	public void launchapplicatio() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srikath\\eclipse-workspace\\CogmentoAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("email")).sendKeys("nadasele69@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[text()='Login']")).sendKeys(Keys.ENTER);

	}

	@Test
	public void launchapplications() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srikath\\eclipse-workspace\\CogmentoAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("email")).sendKeys("nadasele69@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[text()='Login']")).sendKeys(Keys.ENTER);

	}

	/*
	 * @BeforeGroups(groups = "databse") public void database() {
	 * System.out.println("datbase"); }
	 * 
	 * @AfterGroups(groups = "databse") public void database1() {
	 * System.out.println("datbase1"); }
	 * 
	 * @Test(groups = "datbase")
	 * 
	 * public void creatsalesorder() { System.out.println("we r in test method 1");
	 * }
	 * 
	 * @DataProvider public Object[][] dataprovider() {
	 * 
	 * Object[][] data = new Object[3][3]; data[0][0] = "chrome"; data[0][1] =
	 * "http://facebook.com"; data[0][2] = "test"; data[1][0] = "firefox";
	 * data[1][1] = "http://google.com"; data[1][2] = "test1"; data[2][0] = "ide";
	 * data[2][1] = "http://ide.com"; data[2][2] = "test";
	 * 
	 * return data; }
	 * 
	 * @Test(dataProvider = "dataprovider") public void creatpurchasesorder(String
	 * browser, String url, String test) { System.out.println(browser +
	 * "-----------" + url); }
	 * 
	 * @Test public void creatworksorder() {
	 * System.out.println("we r in test method 3");
	 * 
	 * }
	 */
}
