package csvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingfromCsvfile {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("C:\\Users\\Srikath\\Documents\\csvfile.csv"));

		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();

	}

}
