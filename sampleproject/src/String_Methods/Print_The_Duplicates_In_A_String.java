package String_Methods;


	public class Print_The_Duplicates_In_A_String {

		public static void main(String[] args) {
			String str = "abcbaa";

			int length = str.length();
			while (length > 0) {
				int count = 0;
				String str1 = str.substring(0, 1);
				for (int i = 0; i <= length - 1; i++) {
					String newstr = str.substring(i, i + 1);
					if (str1.equalsIgnoreCase(newstr)) {
						count++;

					}

				}
				if (count > 1) {
					System.out.println(str1);
				}

				str = str.replace(str1, "");
				length = str.length();

			}

		}


}
