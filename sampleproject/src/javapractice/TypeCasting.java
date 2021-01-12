package javapractice;

import org.testng.annotations.Test;

public class TypeCasting {

	public static void main(String[] args) {

	}

	@Test
	public void string() {
		String str = "srikanth reddy";
		String newstr = "";
		String[] vals = str.split(" ");
		for (int i = 0; i < vals.length; i++) {
			String firstval = vals[i].subSequence(0, 1).toString().toUpperCase();
			newstr = newstr + " " + vals[i].replaceFirst(vals[i].subSequence(0, 1).toString(), firstval);
		}
		System.out.println(newstr);
	}

	@Test
	public void armstrong_num() {
		int num = 153;
		int length = String.valueOf(num).length();
		int total = 0;
		do {
			int lastdigit = num % 10;
			int sumofdigit = 1;

			for (int i = 1; i <= length; i++) {
				sumofdigit *= lastdigit;
			}
			num = num / 10;
			total += sumofdigit;
		} while (num != 0);

		System.out.println(total);

	}

}
