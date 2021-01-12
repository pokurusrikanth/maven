package String_Methods;

import java.util.LinkedHashMap;
import java.util.Set;

public class return_highest_occurred_character_in_a_String {

	public static void main(String[] args) {
		String str = "abbbbbccc";
		int len = str.length();

		LinkedHashMap<Character, Integer> allvalues = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i <= len - 1; i++) {
			char mychar = str.charAt(i);
			if (!allvalues.containsKey(mychar)) {
				allvalues.put(mychar, 1);

			} else {
				int val = allvalues.get(mychar);
				val++;
				allvalues.put(mychar, val);

			}
		}
		Set<Character> addedkeys = allvalues.keySet();
		int max = 0;
		Character mychar = null;
		for (Character key : addedkeys) {
			if (allvalues.get(key) > max) {
				max = allvalues.get(key);
				mychar = key;
			}
		}
		System.out.println("maximum acuuring character is:" + mychar);

	}

}
