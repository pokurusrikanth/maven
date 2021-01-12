package String_Methods;


	public class Display_one_letter_in_lower_case_and_one_letter_in_upper_case_in_String {

		public static void main(String[] args) {
			String str = "anilkumarreddy";
			String order = "";
			int len = str.length();
			for (int i = 0; i <= len - 1; i++) {
				char mychar = str.charAt(i);
				if (i % 2 == 0) {

					mychar = Character.toLowerCase(mychar);
				} else {
					mychar = Character.toUpperCase(mychar);
				}
				order = order + mychar;

			}
			System.out.println(order);
		}

}
