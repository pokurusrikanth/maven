package javapractice;

import org.testng.annotations.Test;

public class Pattern {

	public static void main(String[] args) {

	}

	@Test
	public void pattern7() {

		int max = 6;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= max; k++) {
				System.out.print("1");
			}
			max--;
			System.out.println();

		}

	}

	@Test
	public void pattern6() {
		/*
		 * 
		 * * * * * * * * * * *
		 */
		int max = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= max; k++) {
				System.out.print("* ");

			}
			max++;
			System.out.println();

		}
	}

	@Test
	public void pattern5() {

		int max = 6;
		int max1 = 1;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= max - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= max1; k++) {
				System.out.print("*");
			}
			System.out.println();
			max1++;
		}

	}

	@Test
	public void pattern4() {
		/*
		*
		**
		***
		****
		*****
		******
		*/
		int max = 1;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= max; j++) {
				System.out.print("*");
			}
			max++;

			System.out.println();
		}

	}

	@Test
	public void pattern3() {
		int max = 1;

		/*
		******
		 *****
		  ****
		   ***
		    **
		     *
		     */

		for (int k = 1; k <= 6; k++) {

			for (int j = 1; j <= k - 1; j++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= max; i++) {
				System.out.print("*");

			}

			System.out.println();

		}
	}

	@Test
	public void pattern2() {
		int max = 6;

		for (int k = 1; k <= 6; k++) {

			for (int j = 1; j <= k - 1; j++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= max - (k - 1); i++) {
				System.out.print("*");

			}

			System.out.println();
			/*
			 *******
			 *****
			 ****
			 ***
			 **
			 *
			 */

		}

	}

	@Test
	public void pattern1() {
		int max = 9;

		for (int k = 1; k <= 5; k++) {

			for (int j = 1; j <= k - 1; j++) {
				System.out.print(" ");
				/*
				 * *********
				 *******
				 *****
				 ***
				 *
				 */ }
			for (int i = 1; i <= max - (k - 1); i++) {
				System.out.print("*");

			}
			max--;
			System.out.println();

		}

	}

}
