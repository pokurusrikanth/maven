package String_Methods;

public class Logic1 {

	public static void main(String[] args) {
		String str = "ag10j6jj6a8";
		int len = str.length();
		int total = 0;
		String str1 = "0";

		for (int i = 0; i <= len - 1; i++) {
			char mychar = str.charAt(i);

			if (mychar >= 48 && mychar <= 57) {
				str1 += mychar;
				if (i == len - 1) {
					total = total + Integer.parseInt(str1);

				}

			} else {
				total = total + Integer.parseInt(str1);
				str1 = "0";

			}
		}

		System.out.println(total);

	}

	public static void adding_Digits() {
		String str = "ag6j6jj6a";
		int len = str.length();
		int total = 0;
		for (int i = 0; i <= len - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar >= 48 && mychar <= 57) {
				total = total + mychar - 48;

			}

		}
		System.out.println(total);

	}

}
