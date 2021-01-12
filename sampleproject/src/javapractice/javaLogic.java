package javapractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class javaLogic {
	@Test
	public void Converting_string_to_int() {
		String num = "1563";
		int finalnum = 0;

		for (int i = 0; i <= num.length() - 1; i++) {

			char mychar = (num.charAt(i));
			int digit = ((int) mychar - 48);
			finalnum = (finalnum * 10) + digit;
		}
		System.out.println(finalnum);

	}

	@Test
	public void swaping_the_values() {
		int[] val = { 12, 5, 6, 14, 16, 19, 10, 55, 60, 15, 3 };
		for (int j = 0; j < val.length; j++) {
			for (int i = 0; i < val.length - (j + 2); i++) {
				int temp;
				if (val[i] > val[i + 1]) {
					temp = val[i];
					val[i + 1] = val[i];
					val[i] = temp;
				}

			}
			System.out.println(val);
		}

	}

	@Test
	public void addition_withoutusing_Arithmeticoperator() {

		/*
		 * int a = 10; int b = 15; for (int i = 1; i <= b; i++) { a++; }
		 * 
		 * System.out.println(a);
		 */
	}

	@Test
	public static void main() {
		// System.out.println(power_Of_Number(5, 3));
		// System.out.println(get_Final_Output(371));
		// System.out.println(sorting_The_Values("Srikanth"));
		System.out.println(Stringcount2("reddygaru"));
	}

	@Test
	public static int Stringcount2(String str) {
		int count = 0;
		try {
			while (!str.isEmpty()) {
				String str1 = str.substring(count, count + 1);
				count++;
			}
		} catch (StringIndexOutOfBoundsException siob) {

		}
		return count++;
	}

	@Test
	public static int stringcount(String str) {

		int count = 0;
		while (!str.isEmpty()) {
			String firstchar = str.substring(0, 1);
			str = str.replace(firstchar, "");

			count++;
		}
		return count++;
	}

	@Test
	public static String sorting_The_Values(String str) {

		char[] allchars = str.toCharArray();
		Arrays.sort(allchars);
		str = new String(allchars);
		return str;
	}

	@Test
	public static int get_Final_Output(int num) {
		int output = 0;
		int length = length_of_number(num);
		while (num != 0) {
			int remainder = num % 10;
			int powerval = power_Of_Number(remainder, length);
			output = output + powerval;
			num /= 10;
		}

		return output;
	}

	@Test
	public static int power_Of_Number(int num, int power) {
		int val = 1;
		for (int i = 1; i <= power; i++) {
			val *= num;
		}
		return val;
	}

	@Test
	public static int length_of_number(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;

		}
		return count++;
		/*
		 * String str = null; return str.valueOf(num).length();
		 */
	}

}
