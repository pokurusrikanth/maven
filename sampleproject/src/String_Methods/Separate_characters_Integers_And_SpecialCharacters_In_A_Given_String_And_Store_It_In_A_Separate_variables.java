package String_Methods;


	public class Separate_characters_Integers_And_SpecialCharacters_In_A_Given_String_And_Store_It_In_A_Separate_variables {

		public static void main(String[] args) {
			String str = "abCcd123&*()2*^%$ghy$3";
			String str1 = "";
			String str2 = "";
			String str3 = "";
			int len = str.length();
			for (int i = 0; i <= len - 1; i++) {
				char mychar = str.charAt(i);
				if (mychar >= 'a' && mychar <= 'z' || mychar >= 'A' && mychar <= 'Z') {
					str1 = str1 + mychar;
				} else if (mychar >= 48 && mychar <= 57) {
					str2 = str2 + mychar;

				} else {
					str3 = str3 + mychar;

				}

			}
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
		}


}
