//Dylan Michalak
//CS1400
//Assignment 6
//11-30-2021

public class TaskB {
	
	public static void main(String[] args) {
		System.out.println(sum(5)); //should return 1+2+3+4+5 (15)
	}
	
	/**
	 * returns the summation of all values from 1 up to the given integer
	 * @param value
	 * @return
	 */
	public static int sum (int value) {
		if (value < 1)
			return 0;
		return value + sum(value-1);
	}
}
