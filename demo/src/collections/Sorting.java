package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {

		// using ordering specified in compareTo()
		String[] strArray = { "Hello", "hello", "Hi", "HI", "Hello" }; // has duplicate elements

		Arrays.sort(strArray); // sort in place and mutable
		System.out.println(Arrays.toString(strArray)); // [HI, Hello, Hello, Hi, hello]

		// The array must be sorted for binarySearch()
		System.out.println(Arrays.binarySearch(strArray, "Hello")); // 2
		System.out.println(Arrays.binarySearch(strArray, "HELLO")); // -1 (insertion at index 0)

		// Sort/search a List<Integer> using Collections.sort() and
		// Collections.binarySearch()
		List<Integer> lst = new ArrayList<>();
		lst.add(22); // int auto-box to Integer
		lst.add(11);
		lst.add(44);
		lst.add(11); // duplicate element
		Collections.sort(lst); // sort in place and mutable
		System.out.println(lst); // [11, 11, 22, 44]
		System.out.println(Collections.binarySearch(lst, 22)); // 2
		System.out.println(Collections.binarySearch(lst, 35)); // -4 (insertion at index 3)

	}

}
