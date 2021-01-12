package String_Methods;

	public class fibonacciSeries {

		/*
		 * public static void main(String[] args) { int num = 5; int a = 0; int b = 1;
		 * int c = 1; System.out.print(a + " " + b); for (int i = 1; i <= num; i++) {
		 * System.out.print(" " + c); a = b; b = c; c = a + b;
		 * 
		 * }
		 * 
		 * }
		 */
		public static void main(String[] args) {
			int num = 100;
			int a = 0;
			int b = 1;
			int c = 1;
			int count = 0;
			System.out.print(a + " " + b);
			while (count < 10) {

				for (int i = 1; i <= num; i++) {
					System.out.print(" " + c);
					a = b;
					b = c;
					c = a + b;
					count++;
					break;
				}

			}

		}


}
