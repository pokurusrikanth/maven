package String_Methods;


	public class Eliminates_The_Duplicates_In_A_String {

		public static void main(String[] args) {
			String str = "aabbcc";
			String output = "";
			int length = str.length();
			for (int i = 0; i <= length - 1; i++) {
				String sub = str.substring(i, i + 1);
				if (!output.contains(sub)) {
					output = output + sub;
				}
			}
			System.out.println(output);

		}


}
