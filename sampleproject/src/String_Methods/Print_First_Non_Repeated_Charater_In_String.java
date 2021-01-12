package String_Methods;

public class Print_First_Non_Repeated_Charater_In_String {

	public static void main(String[] args) {
		String str = "abcbcbmc";

		int length = str.length();
		over: while (length > 0) {
			int count = 0;
			String str1 = str.substring(0, 1);
			for (int i = 0; i <= length - 1; i++) {
				char mychar = str.charAt(i);
				String newstr = str.substring(i, i + 1);
				if (str1.equalsIgnoreCase(newstr)) {
					count++;

				}

			}
			if (count == 1) {
				System.out.println(str1);
				break over;
			}

			str = str.replace(str1, "");
			length = str.length();

		}
	}

}
