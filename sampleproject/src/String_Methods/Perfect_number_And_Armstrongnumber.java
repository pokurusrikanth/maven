package String_Methods;

import org.testng.annotations.Test;

public class Perfect_number_And_Armstrongnumber {

	@Test
	public void perfect_number() {
		int num = 6, total = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total += i;
			}
		}
		if (num == total) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");
		}
	}

	@Test
	public void armstrong_num() {
		int num = 153;
		int len = String.valueOf(num).length();
		int total = 0;
		do {
			int sumofdigit = 1;
			int lastdigit = num % 10;
			for (int i = 1; i <= len; i++) {
				sumofdigit *= lastdigit;
			}
			num = num / 10;

			total += sumofdigit;
		} while (num != 0);

		System.out.println(total);

	}

	@Test
	public void length_of_number() {

		int num = 0;
		int total = 0;
		do {
			num = num / 10;

			total++;
		} while (num != 0);
		System.out.println(total);
	}

	@Test
	public void String_to_int() {
		String str = "814228697";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			char mychar = str.charAt(i);
			num = (num * 10) + mychar - 48;
		}
		System.out.println(num);
	}

	@Test
	public void string_array_to_int() {
		String[] vals = { "81", "5", "1", "2", "5" };
		int total = 0;
		for (String val : vals) {
			if (val.length() == 1) {
				char mychar = val.charAt(0);
				total = (total * 10) + (int) mychar - 48;
			} else {
				for (int i = 0; i <= val.length() - 1; i++) {
					int asc = (int) val.charAt(i);
					total = (total * 10) + (asc - 48);

				}
			}
		}
		System.out.println(total);
	}

	@Test
	public void int_to_string() {
		int num = 814228697;
		String str = "";
		do {
			str = (num % 10) + str;
			num = num / 10;
		} while (num != 0);
		System.out.println(str);
	}
}
