package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	@Test
	public void cogmento() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("nandasele69@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Companies']")).click();
		Webtable table = new Webtable(driver.findElement(By.tagName("table")));
		System.out.println(table.get_column_position("Name"));
		int rownum = table.getrownum_by_text("TestCompanyName", "Name");
		Assert.assertNotEquals(rownum, -1, "value in the table not found");
		List<WebElement> cells = table.get_allelemens_incell(rownum, "Options");
		for (WebElement child : cells) {
			System.out.println(child);
		}
	}

	@Test
	public void Webtable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
		Webtable tableweb = new Webtable(table);

		int rownum = tableweb.getrownum_by_text("fleming", "lastname");
		System.out.println(rownum);
	}

	@Test
	public void check() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Webtable table = new Webtable(driver.findElement(By.xpath("//td[text()='CEO']")));

		driver.findElement(By.xpath("//a[text()='0006']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
		List<WebElement> selected = driver.findElements(
				By.xpath("//table[@id='resultTable']/descendant::input[@type='checkbox' and @checked='true']"));
		List<WebElement> unselected = driver
				.findElements(By.xpath("//table[@id='resultTable']/descendant::input[@type='checkbox']"));
		if (unselected.size() - selected.size() == unselected.size()) {
			System.out.println("check boxes were not selected");
		} else {
			System.out.println("check boxes are selected");
		}
	}

	@Test
	public void selecting_check_boxes() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.xpath("//a[text()='0006']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
		int check_box_count = 0;
		List<WebElement> boxlist = driver
				.findElements(By.xpath("//table[@id='resultTable']/descendant::input[@type='checkbox']"));
		for (int i = 0; i < boxlist.size(); i++) {
			if (boxlist.get(i).isSelected()) {
				check_box_count++;

			}
		}
		if (check_box_count != 0)
			System.out.println(check_box_count++ + "::" + "check boxes were selected");
		else
			System.out.println("check boxes were not selected");
	}

	@Test
	public void xmpath() {
		String empid = "0007";
		String empid1 = "0009";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String colur = driver.findElement(By.xpath("//span[@style='color:red; font-weight:bold; z-index:100;']"))
				.getCssValue("color");
		System.out.println(colur);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.xpath("//a[text()='0006']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();

		driver.findElement(By.xpath("//a[text()='" + empid1 + "']/ancestor::tr/descendant::input")).click();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		boolean isvaluefound = false;
		for (int i = 1; i < allrows.size(); i++) {
			WebElement row = allrows.get(i);
			List<WebElement> allcells = row.findElements(By.tagName("td"));
			if (allcells.get(1).findElement(By.tagName("a")).getText().equalsIgnoreCase(empid)) {
				allcells.get(0).findElement(By.tagName("input")).click();
				System.out.println("empid is selected");
				isvaluefound = true;
			}

		}
		if (isvaluefound) {
			System.out.println("value is found");
		} else {
			System.out.println("value is not found");
		}

	}

}
