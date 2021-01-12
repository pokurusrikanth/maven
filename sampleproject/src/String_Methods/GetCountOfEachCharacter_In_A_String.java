package String_Methods;

import java.util.HashMap;
import java.util.Set;

public class GetCountOfEachCharacter_In_A_String {
	public static void main(String[] args) {
		CountOfEachCharacter_Without_UsingHashMap();

	}

	public static void CountOfEachCharacter_Without_UsingHashMap() {
		String str = "aabcbccddjeeff";

		int length = str.length();
		while (length > 0) {
			String firstcahr = str.substring(0, 1);
			int count = 0;
			for (int i = 0; i <= length - 1; i++) {
				String remainingchar = str.substring(i, i + 1);
				if (remainingchar.equalsIgnoreCase(firstcahr)) {
					count++;

				}

			}
			System.out.println(firstcahr + ":" + count);
			str = str.replace(firstcahr, "");
			length = str.length();

		}

	}

	public static void CountOfEachCharacterUsingHashMap() {
		String str = "aabbccddjeeff";
		HashMap<Character, Integer> allvalues = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			char mychar = str.charAt(i);
			if (!allvalues.containsKey(mychar)) {
				allvalues.put(mychar, 1);
			} else {
				int val = allvalues.get(mychar);
				val++;
				allvalues.put(mychar, val);
			}
		}

		Set<Character> alladdedkeys = allvalues.keySet();
		for (Character values : alladdedkeys) {
			System.out.println(values + ":" + allvalues.get(values));
		}

	}

}
