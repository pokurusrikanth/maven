package String_Methods;


	public class Count_a_number_of_vowels_and_consonants_in_a_String {

		public static void main(String[] args) {
			String str = "anilreddy";
			int len = str.length();
			int vowels = 0;
			int consonants = 0;
			for (int i = 0; i <= len - 1; i++) {
				char mychar = str.charAt(i);
				if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
			System.out.println("vowels:" + vowels);
			System.out.println("consonants:" + consonants);

		}


}
