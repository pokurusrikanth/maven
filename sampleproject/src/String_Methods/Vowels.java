package String_Methods;

public class Vowels {

	public static void main(String[] args) {
		String[] val = { "lassireddy", "anil" };

		int total = val.length;
		for (int i = 0; i <= total - 1; i++) {
			String vals = val[i];
			char mychar = vals.toLowerCase().charAt(0);
			if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u') {
				System.out.println(vals);

			}
		}

	}
}
