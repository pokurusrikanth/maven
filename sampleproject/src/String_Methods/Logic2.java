package String_Methods;

public class Logic2 {
	public static void main(String[] args) {
		String str = "abcabb";
		String newstr = "";
		String str1 = "";
		int len = str.length();
		for (int i = 0; i <= len - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar == 'a') {
				int num = mychar - 32;
				newstr = newstr + (char) num;
			} else {
				str1 = str1 + newstr + mychar;
				newstr = "";
			}

		}
		System.out.println(str1);

	}

}
