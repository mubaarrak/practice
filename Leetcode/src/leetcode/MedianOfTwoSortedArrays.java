package leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String... strings) {

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3,4};

		int[] mergedArray = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

		Arrays.sort(mergedArray);

		double mediam;

		if (mergedArray.length % 2 == 0) {

			mediam = (mergedArray[(mergedArray.length / 2) -1] +  mergedArray[(mergedArray.length / 2)]) /  2d;

		} else {
			mediam = mergedArray[mergedArray.length / 2];

		}

		System.out.println(mediam);
		
		System.out.println(5/2);

	}

}
