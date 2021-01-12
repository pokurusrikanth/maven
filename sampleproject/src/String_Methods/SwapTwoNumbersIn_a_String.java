package String_Methods;


	public class SwapTwoNumbersIn_a_String {

		public static void main(String[] args) {

			String str = "abc";
			String str1 = "def";
			String str2 = str1;
			// String newstr = str + str1;
			for (int i = 0; i <= str.length() - 1; i++) {
				str1 = "";
				str1 = str.substring(i, i + 1);
				System.out.print(str1);
			}
			System.out.println();

			for (int j = 0; j <= str2.length() - 1; j++) {
				str = "";
				str = str2.substring(j, j + 1);
				System.out.print(str);

			}

		}

}
