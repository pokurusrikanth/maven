package String_Methods;

import java.util.LinkedHashSet;

public class Eliminates_The_Duplicates_Using_LinkedHashSet {

	public static void main(String[] args) {
		String str = "aabbmmmcc";
		int len = str.length();
		LinkedHashSet<Character> allvalues = new LinkedHashSet<Character>();
		for (int i = 0; i <= len - 1; i++) {
			char mychar = str.charAt(i);
			allvalues.add(mychar);
		}
		for (Character dup : allvalues) {
			System.out.print(dup);
		}

	}

}
