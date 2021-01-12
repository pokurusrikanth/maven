package collections;

import java.util.ArrayList;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listclass {
	WebDriver driver;

	@Test
	public void arraylist() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		String str = driver.findElement(By.xpath(
				"//li[@class='selected']/parent::ul[@class='guestCounter font12 darkText']/ancestor::div[@class='appendBottom20']"))
				.getAttribute("class");
		System.out.println(str);

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(20);
		array.add(10);
		array.add(30);
		array.add(40);
		array.add(90);
		array.add(70);
		array.forEach(action -> System.out.println(action));
		;

		TreeSet<Integer> set = new TreeSet<>();
		int[] digits = { 568, 5869, 634, 1554, 5674, 289 };
		for (int vals : digits) {
			set.add(vals);
		}

		/*
		 * Iterator<Integer> itr = array.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * int[] vals = { 10, 25, 30, 45, 50, 60, 25, 12, 20, 35, 56, 85 };
		 * 
		 * 
		 * 
		 * ArrayList<Integer> array = new ArrayList<Integer>(); array.add(20);
		 * array.add(10); array.add(30); array.add(40); array.add(90); array.add(70);
		 * 
		 * Collections.sort(array); for (Integer integer : array) {
		 * System.out.println(integer); } /* List<Integer> v = Lists.newArrayList(set);
		 * Object[] numbers = set.toArray(); System.out.println(set.size());
		 * System.out.println(v.get(v.size() - 1)); /* HashMap<Character, Integer> val =
		 * new HashMap<>(); String str = "asdfjhflejvelrheiruhjfkfiorh"; for (int i = 0;
		 * i < str.length(); i++) { char mychar = str.charAt(i); if
		 * (val.containsKey(mychar)) { Integer keyvalue = val.get(mychar); Integer num =
		 * keyvalue + 1; val.put(mychar, num);
		 * 
		 * } else { val.put(mychar, 1);
		 * 
		 * } Set<Character> keyvalue = val.keySet(); for (Character character :
		 * keyvalue) { System.out.println(character); } }
		 * 
		 * /* HashSet<String> vals = new HashSet<String>(); vals.add("hduh");
		 * vals.add("hfkjfakj"); Object val = vals.toArray();
		 * 
		 * for (String strings : vals) { System.out.println(strings); }
		 * 
		 * /* ArrayList<String> allvals = new ArrayList<String>(); allvals.add("sri");
		 * allvals.add("ufgekjfb"); allvals.add("fjfkhf"); allvals.add("sjdkeje");
		 * allvals.add("ufgjfb"); allvals.remove(6); // allvals.remove(0);
		 * System.out.println(allvals.size());
		 * 
		 * 
		 * /* allvals.forEach(inp->System.out.println(inp)); /*Iterator<String>
		 * val=allvals.iterator(); while(val.hasNext()) {
		 * System.out.println(val.next()); } /* for (int i = 0; i <= allvals.size() - 1;
		 * i++) { System.out.println(allvals.get(i)); }
		 * 
		 * /* for (String vals : allvals) { System.out.println(vals); }
		 */
	}
}
