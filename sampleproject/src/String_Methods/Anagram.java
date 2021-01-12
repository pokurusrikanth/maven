package String_Methods;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {
	@Test
	public void anagram() {
		String val = "srikanth";

		char[] allvals = val.toCharArray();

		Arrays.sort(allvals);
		System.out.println(allvals);
	}

}
