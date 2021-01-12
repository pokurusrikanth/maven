package String_Methods;

	public class Find_The_Duplicates_In_A_String {

		public static void main(String[] args) {
			String str = "aabcd";
			int len = str.length();
			for (int i = 0; i <= len - 1; i++) {
				String newstr = str.substring(i, i + 1);
				for (int j = i + 1; j <= len - 1; j++) {
					String newstr1 = str.substring(j, j + 1);
					if (newstr.equals(newstr1)) {
						System.out.println("Duplicate charactre is:" + newstr);
					}
				}
			}
		}


}
