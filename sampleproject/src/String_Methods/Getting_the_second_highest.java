package String_Methods;

import org.testng.annotations.Test;

public class Getting_the_second_highest {

	@Test
	public void second_highest() {

		int num[] = { 45, 12, 36, 99, 115, 25, 31, 46 };
		int firsthighest = 0, secondhighest = 0, temp = 0;
		for (int i = 0; i < num.length; i++) {
			temp = num[i];
			if (temp > firsthighest) {
				secondhighest = firsthighest;
				firsthighest = temp;
			} else if (firsthighest > temp && secondhighest < temp) {
				secondhighest = temp;
			}

		}

		System.out.println(secondhighest);

	}

}
