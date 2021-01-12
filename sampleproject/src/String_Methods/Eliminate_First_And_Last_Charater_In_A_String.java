package String_Methods;


	public class Eliminate_First_And_Last_Charater_In_A_String {

		public static void main(String[] args) {
			String str = "abcdef";
			String newstr = "";

			int len = str.length();
			for (int i = 0; i <= len - 1; i++) {
				char mychar = str.charAt(i);
				if (i == 0 || i == len - 1) {
				} else {
					newstr = newstr + mychar;
				}
			}
			System.out.println(newstr);

		}

}
