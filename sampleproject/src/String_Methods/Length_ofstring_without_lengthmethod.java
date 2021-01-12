package String_Methods;

import org.testng.annotations.Test;

public class Length_ofstring_without_lengthmethod {

	@Test
	public void lenghth_of_astring() {

		String str = "asdfgh";
		int count = 0;
		while (!str.isEmpty()) {
			String firstchar = str.substring(0, 1);
			str = str.replaceFirst(firstchar, "");
			count++;
		}
		System.out.println(count);
	}

	@Test
	public void string_length() {

		String str = "asdfgh";
		int count = 0;
		try {
			while (true) {

				String str1 = str.substring(count, count + 1);
				count++;

			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("end of string");
		}
		System.out.println(count++);
	}

}
