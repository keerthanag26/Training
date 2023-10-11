package array;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		//int[] a = new int[size]
		int array[] = { 30,20,10, 40, 50 };

		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i : array) {
			System.out.println(i);
		}
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; i++) {
				int k = array[i];
				array[i] = array[j];
				
			}
		}
		
		int[] array2 = {  20, 30, 40, 50 };
		
		
		
		System.out.println("Arrays are equals? "+Arrays.equals(array, array2));
	}

}
