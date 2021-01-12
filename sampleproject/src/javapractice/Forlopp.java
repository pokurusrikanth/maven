package javapractice;

import org.testng.annotations.Test;

public class Forlopp {

	@Test
	public void ispalindrome() {

	}

	@Test
	public void vowelchars() {
		String str[] = { "rohit", "dhawan", "kohli", "dhoni", "ishan", "warner" };
		for (int i = 0; i < str.length; i++) {
			String val = str[i];
			char firstchar = val.charAt(0);
			if (firstchar == 'a' || firstchar == 'e' || firstchar == 'i' || firstchar == 'o' || firstchar == 'u') {
				System.out.println(val);
				break;
			}
		}
	}

	/*
	 * String str = "ad123djab6a4wadaa85wqd56gha"; int total = 0; for (int i = 0; i
	 * < str.length(); i++) { char mychar = str.charAt(i); if (mychar == 'a') {
	 * total++; } } System.out.println(total);
	 * 
	 * /* String str = "ad123djb64wd85wqd56gh"; String total = "0";
	 * 
	 * int num = 0; for (int i = 0; i < str.length(); i++) {
	 * 
	 * char mychar = str.charAt(i); if (mychar >= 48 && mychar <= 57) { total +=
	 * mychar; } else { num += Integer.parseInt(total); total = "0"; }
	 * 
	 * } System.out.println(num);
	 * 
	 * /* String str1 = "ad6d6s6s5f9"; int res = 0; for (int i = 0; i <
	 * str1.length(); i++) { char mychar = str1.charAt(i);
	 * 
	 * if (mychar >= 48 && mychar <= 57) { res += (mychar - 48); }
	 * 
	 * } System.out.println(res);
	 */

	/*
	 * int total = 0;
	 * 
	 * String str = "3245"; for (int i = 0; i < str.length(); i++) { char mychar =
	 * str.charAt(i); total += (mychar - 48); }
	 * 
	 * // factorial int num = 10; int tota = 1; for (int i = num; i >= 1; i--) {
	 * 
	 * tota *= i; }
	 */

}
