package javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StringLogics {

	@Test
	public void repeated() {
		String str = "dfukwjweuhjenwkjejvb";
		char[] allchars = str.toCharArray();

		for (int i = 0; i < allchars.length; i++) {
			for (int j = 0; j < allchars.length - 1; j++) {
				if (allchars[j] > allchars[j + 1]) {
					char mychar = allchars[j];
					allchars[j] = allchars[j + 1];
					allchars[j + 1] = mychar;
				}

			}

		}
	}

	@Test
	public void swap_the_string() {

		String str = "...Ayush...Harsh";
		str = str.replaceAll("Ayush", "hsuyA");
		System.out.println(str.replaceAll("Harsh", "hsraH"));

	}

	@Test
	public void swaping_the_String() {

		String str1 = "abc";
		String str2 = "xyz";

		str1 = str1 + str2;
		int len1 = str1.length();
		int len2 = str2.length();

		str2 = str1.substring(0, len1 - len2);
		str1 = str1.substring(len2);
		System.out.println(str2 + "::" + str1);

	}

	@Test
	public void adding_the_numbers_inastring() {
		String strr = "sjjdhjnvuugthghfnmkdolkfo";
		String newstr = "";

		for (int i = 0; i < strr.length(); i++) {
			char mychar = strr.charAt(i);

			if (i % 2 == 0) {
				mychar = Character.toLowerCase(mychar);
			} else {
				mychar = Character.toUpperCase(mychar);
			}
			newstr = newstr + mychar;

		}
		System.out.println(newstr);

		String str = "adf215jrebjk256ergn89re444rg56";
		String num = "0";
		int total = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar >= 48 && mychar <= 57) {
				num = num + mychar;
				if (i == str.length() - 1) {
					total = total + Integer.parseInt(num);
				}
			} else {
				total = total + Integer.parseInt(num);
				num = "0";
			}
		}
		System.out.println(total);
	}

	@Test
	public void reversing_the_words() {

		String message = "Sucess:Order abc123 has been generated successfully";
		String[] vals = message.split(" ");
		System.out.println(vals[1]);

		String str = "this is an example string";
		String[] allvals = str.split(" ");
		str = "";
		for (String string : allvals) {
			str = string + " " + str;
		}
		System.out.println(str);
	}

	@Test
	public void sorting_array() {

		String st = "utyiejvnjfjgfjsdsdjlh";
		char[] allcharsa = st.toCharArray();
		TreeSet<Character> set = new TreeSet<Character>();

		for (Character character : allcharsa) {
			set.add(character);
		}
		st = "";
		for (Character character : set) {
			st = st + character;
		}
		System.out.println(st);

		String str = "otyvbjsdjoruyjkcnnmvbgiuofwuehfbgb";
		char[] allchars = str.toCharArray();
		for (int i = 0; i <= allchars.length - 1; i++) {
			for (int j = 0; j <= allchars.length - 2; j++) {
				if (allchars[j] > allchars[j + 1]) {
					char mychar = allchars[j];
					allchars[j] = allchars[j + 1];
					allchars[j + 1] = mychar;
				}
			}
		}
		str = new String(allchars);

		System.out.println(str);

		String str1 = "suuirbhruouifufdbfhggfkajfhffhjk";
		char[] allcharss = str.toCharArray();
		Arrays.sort(allcharss);
		str1 = new String(allcharss);
		System.out.println(str1);
	}

	@Test
	public void clock_wise_direction() {

		String[] str1 = { "abcd", "bcda", "cdab", "dabc" };
		boolean inorder = true;
		for (int i = 0; i <= str1.length - 2; i++) {
			String firstval = str1[i];
			String secondval = str1[i + 1];
			firstval = firstval.substring(1) + firstval.substring(0, 1);
			if (!firstval.equalsIgnoreCase(secondval)) {
				System.out.println(firstval + "::" + secondval);
				inorder = false;
			} else {
				inorder = true;
				System.out.println(firstval + "::" + secondval);

			}

		}

		String str = "lkdjghiutgdsmvbrughptyjgkhs";
		int len = str.length();
		while (len > 0) {
			String firstchar = str.substring(0, 1);
			int num = 0;

			for (int i = 0; i < str.length(); i++) {
				String eachchar = str.substring(i, i + 1);
				if (firstchar.equalsIgnoreCase(eachchar)) {
					num++;

				}

			}
			System.out.println(firstchar + "::" + num);
			str = str.replace(firstchar, "");
			len = str.length();
		}

	}

	@Test
	public void repeatedchars_in_String() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "qweryqweryqweryqwery";
		Set<Character> key = null;
		for (int i = 0; i < str.length(); i++) {
			char mychar = str.charAt(i);
			if (map.containsKey(mychar)) {
				Integer val = map.get(mychar);
				map.put(mychar, ++val);
			} else {
				map.put(mychar, 1);
			}
			key = map.keySet();

		}
		for (Character character : key) {
			System.out.println(character + " :: " + map.get(character));
		}

	}

	@Test
	public void noofchars_inString() {
		String str = "qweryqweryqweryqweryreddy";
		int distinct = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					distinct++;
				}
			}
			System.out.println(str.charAt(i) + "::" + distinct);

			String d = String.valueOf(str.charAt(i)).trim();
			str = str.replaceAll(d, "");
			distinct = 0;

		}

	}

	@Test
	public void using_replace() {
		String str = "@^%$#534hdfga87(^86JGKjk&^%9875(*&ghggh(&%";
		System.out.println(str.replaceAll("[1-9]", ""));
	}

	@Test
	public void using_indexof() {
		String str = "abchdjkdhabcsgshjabchfjdkjabcdhdjabcjdgdjabc";
		/*
		 * int len1 = str.length(); String wordtofind = "abc"; str =
		 * str.replaceAll(wordtofind, ""); int len2 = str.length(); int total = (len1 -
		 * len2) / wordtofind.length(); System.out.println(total);
		 */
		// String[] allvals=str.split("abc");

		int startpos = 0;
		int count = 0;
		while (true) {
			int res = str.indexOf("abc", startpos);
			if (res >= 0) {
				startpos = res + 1;
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);

	}

	@Test
	public void sum_of_anumbers() {
		String str = "d12hd5gfjh89fhdh56dfjgsdgf95fjhg5";
		String num = "0";
		int sum = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar >= 48 && mychar <= 57) {
				num = num + mychar;
				if (i == str.length() - 1) {
					sum = sum + Integer.parseInt(num);

				}
			} else {
				sum = sum + Integer.parseInt(num);
				num = "0";
			}

		}
		System.out.println(sum);

	}

	@Test
	public void Ascending_order_in_listbox() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://taxmann.com");
		List<WebElement> allcountries = driver.findElements(By.xpath(""));
		boolean isinorder = true;
		for (int i = 1; i <= allcountries.size() - 2; i++) {
			String firstval = allcountries.get(i).getText();
			String secondval = allcountries.get(i + 1).getText();

			if (firstval.compareTo(secondval) > 0) {
				isinorder = false;
				break;
			}
			if (isinorder) {
				System.out.println("countries are in ascending orderlist");
			} else {
				System.out.println("countries are not in ascending order");
			}
			System.out.println(allcountries);
		}

	}

}
