//Dylan Michalak
//CS1400
//Assignment 6
//11-30-2021

import java.util.Arrays;

public class TaskA {
	
	public static void main(String[] args) {
		int[] testArray = new int[10];
		testArray = new int[] {0, 3, 4, 2, 9, 3, 1, 4, 7, 4};
		System.out.println(numberCount(testArray, 4));
	}
	

	/**
	 * counts the number of times a specific integer appears in an array of integers
	 */
	static private int numberCount (int[] array, int num) {
		if (array.length >= 1) {
			if (array[0] != num)
				return numberCount(Arrays.copyOfRange(array, 1, array.length), num);
			return 1 + numberCount(Arrays.copyOfRange(array, 1, array.length), num);
		}
		return 0;
	}
}
