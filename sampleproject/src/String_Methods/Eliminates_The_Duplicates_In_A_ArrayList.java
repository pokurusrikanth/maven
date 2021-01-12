package String_Methods;

import java.util.ArrayList;
import java.util.Set;

import org.testng.collections.Sets;

public class Eliminates_The_Duplicates_In_A_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("anil");
		alist.add("anil");
		alist.add("anil1");
		alist.add("anil");
		alist.add("anil1");
		alist.add("anil2");
		alist.add("anil2");
		alist.add("anil");
		Set<String> set1 = Sets.newHashSet(alist);
		for (String str : set1) {
			System.out.println(str);
		}
	}

}
