package task;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class Logic {

	@Test
	public void removing_adjcent_char() {

		String str = "aaabbcccdddeefghhhhhh ";
		String newstr = " ";
		char allchars[] = str.toCharArray();

		for (int i = 0; i <= allchars.length - 2; i++) {
			char firstchar = allchars[i];
			char secondchar = allchars[i + 1];
			if (firstchar != secondchar) {
				newstr = newstr + firstchar;
			}
		}
		System.out.println(newstr);

	}

	@Test
	public void removing_twoadjacent_chars() {

		String str = "aaabbcccdddeefghhhhhh";
		String str1 = " ";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Set<Character> allkeys = null;
		for (int i = 0; i < str.length(); i++) {
			char mychar = str.charAt(i);
			if (map.containsKey(mychar)) {
				Integer value = map.get(mychar);
				map.put(str.charAt(i), ++value);

			} else {
				map.put(mychar, 1);
			}

		}

		allkeys = map.keySet();
		for (Character character : allkeys) {
			Integer charsval = map.get(character);
			HashMap<Character, Integer> vals = new HashMap<Character, Integer>();
			Set<Character> keyset = vals.keySet();
			if (charsval != 2) {

				vals.put(character, map.get(character));

			} else {
				Integer val = map.get(character);
				vals.put(character, --val);
				str1 = character + str1;
			}
			for (Character eachkey : keyset) {
				System.out.println(eachkey + "::" + vals.get(eachkey));
			}
		}

	}

}
