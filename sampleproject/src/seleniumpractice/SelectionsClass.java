package seleniumpractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectionsClass {
 
	
	@Test
	public void selections() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Srikath/Desktop/Registration.html");
		driver.manage().window().maximize();
		String[] sports_to_select= {"Cricket","Badminton","hockey","volleyball"};
		Select listbox=new Select(driver.findElement(By.id("sports")));
		List<WebElement> sportoptions=driver.findElements(By.tagName("option"));
		listbox.deselectAll();

		for (String selectedsport : sports_to_select) {
		try {
			listbox.selectByVisibleText(selectedsport);
		}catch(NoSuchElementException nse) {
			System.out.println("given sport is not in the list:"+nse.getMessage()+selectedsport);
		}	
				
			}
		
	}
	@Test
	public static void listboxselections() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Srikath/Desktop/Registration.html");
		String[] sports= {"cricket","volleyball","badminton","coco"};
		for (String sporttoselect : sports) {
			WebElement sport=driver.findElement(By.id("sports"));
			List<WebElement> sportoptions=sport.findElements(By.tagName("option"));
			for (String sportoption : sports) {
				
					if (sportoption.trim().equalsIgnoreCase(sporttoselect)) {
						break;
					}else {
						System.out.println(sporttoselect);
						break;
					}
					
				
			}
		}
	}
	
	
	public static void close_proceses() {
		
		String[] proceses= {"chrome.exe","chromedriver.exe","geckoexe","edge.exe"};
		for (String procesesname : proceses) {
			try {
				Runtime.getRuntime().exec("taskkill /F /IM "+procesesname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
