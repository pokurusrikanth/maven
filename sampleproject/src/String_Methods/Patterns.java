package String_Methods;

import org.testng.annotations.Test;

public class Patterns {

	@Test
	public void printin_rightangle_triangle() {
		int max = 1;

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= max; k++) {
				System.out.print("* ");
			}
			max++;
			System.out.println();
		}
		System.out.println("....................");

		max = 6;

		for (int i = 1; i <= 6; i++) {

			for (int k = 0; k <= max - i; k++) {
				System.out.print("");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("............");

		max = 0;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= max; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 6 - i; j++) {
				System.out.print("* ");
			}
			max++;
			System.out.println();
		}

		System.out.println("............");

		max = 6;

		for (int i = 1; i <= 6; i++) {

			for (int k = 1; k <= max; k++) {
				System.out.print("");
			}
			for (int j = 1; j <= max; j++) {
				System.out.print("*");
			}
			max--;
			System.out.println();
		}
		System.out.println("............");

		int totalrows = 7;
		int totalcolumns = 7;

		for (int rownum = 1; rownum <= totalrows; rownum++) {

			for (int colnum = 1; colnum <= totalcolumns; colnum++) {

				if (rownum == 1 || colnum == 1 || rownum == totalrows || colnum == totalcolumns) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();

		}
		System.out.println(".................");

		for (int rownum = 1; rownum <= totalrows; rownum++) {
			for (int colnum = 1; colnum <= totalcolumns; colnum++) {
				if (colnum == 1 || colnum == totalcolumns || rownum == totalrows / 2 + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println(".................");

		for (int rownum = 1; rownum <= totalrows; rownum++) {
			for (int colnum = 1; colnum <= totalcolumns; colnum++) {
				if (rownum == 1 || colnum == 1 || colnum == totalcolumns || rownum == totalrows / 2 + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println(".................");

		for (int rownum = 1; rownum <= totalrows; rownum++) {
			for (int colnum = 1; colnum <= totalcolumns; colnum++) {
				if (colnum == totalcolumns / 2 + 1 || rownum == totalrows || rownum == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println(".................");

	}

	@Test
	public void printing_x() {

		int totalrows = 7;
		int totalcolumns = 7;
		for (int rownum = 1; rownum <= totalrows; rownum++) {
			for (int colnum = 1; colnum <= totalcolumns; colnum++) {
				if (rownum == colnum || colnum == totalcolumns - (rownum - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

	@Test
	public void printing_p() {

		int totalrows = 7;
		int totalcolumns = 7;
		for (int rownum = 1; rownum <= totalrows; rownum++) {
			for (int colnum = 1; colnum <= totalcolumns; colnum++) {
				if (rownum == 1 || colnum == 1 || rownum == totalrows / 2 + 1
						|| (colnum == totalcolumns && rownum <= totalrows / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
