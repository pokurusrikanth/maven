package String_Methods;


	public class count_the_occurrence_of_a_given_character_in_String {

		public static void main(String[] args) {
			String str = "anilredady";
			String str1 = "a";
			int len = str.length();
			int total = 0;
			for (int i = 0; i <= len - 1; i++) {
				String mychar = str.substring(i, i + 1);

				if (str1.equalsIgnoreCase(mychar)) {
					total++;
				}
			}
			System.out.println(total);

		}

}
