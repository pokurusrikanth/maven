package String_Methods;

import org.testng.annotations.Test;

public class GettingMaxNumber {

	@Test()
	public static void logic1() {

		int num[] = { 45, 12, 36, 56, 115, 25, 31, 46 };
		int temp = 0, max = 0;
		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println(max);

	}

}
