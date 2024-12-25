package JavaPrograms;

import java.util.Arrays;

public class ArrayPrograms {
	public static void main(String[] args) {
		int a[] = { 1, 5, 6, 4, 3, 2 };
		System.out.println("Second Largest Number in Array :" + secondLargestNumberinArray(a, 5));
	}

	public static int secondLargestNumberinArray(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 2];
	}
}
