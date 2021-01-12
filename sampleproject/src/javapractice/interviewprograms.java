
package javapractice;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class interviewprograms {

	public static void main(String[] args) {

	}

	@Test
	// REVERSE A STRING with out using string inbuilt function
	public static void reverse_a_string() {

		String str = "selenium testing";

		StringBuilder stb = new StringBuilder();
		stb.append(str);
		stb.reverse();
		System.out.println(stb);

		String stri = "selenium testing";

		String str1 = " ";
		char[] mychar = stri.toCharArray();
		for (int i = mychar.length - 1; i >= 0; i--) {

			str1 = str1 + mychar[i];

		}
		System.out.println(str1);

		String str2 = "automation testing";
		String revstring = "";
		String[] revstr = str2.split("");
		for (int i = revstr.length - 1; i >= 0; i--) {
			revstring = revstring + revstr[i];

		}
		System.out.println(revstring);
	}

	// swaping two numbers without using third variable
	@Test
	public void swaping_two_numbers() {

		int x = 10;
		int y = 15;
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x);
		System.out.println(y);

	}
	// count the number of letters in string using hashmap

	@Test
	public void counting_noof_words_inastring_using_hashmap() {

		String str = "this is done by by this sreekanth";
		String str1[] = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i <= str1.length - 1; i++) {

			if (map.containsKey(str1[i])) {
				int count = map.get(str1[i]);
				map.put(str1[i], count++);
			} else {
				map.put(str1[i], 1);
			}

		}
		Set<String> allkeys = map.keySet();

		for (String key : allkeys) {
			System.out.println(key + "::" + map.get(key));
		}

	}

}
