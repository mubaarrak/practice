package com.codility;
public class PairOfArrayMemebrsHavingEvenSum {
	public static void main(String[] args) {
		//int nums[] = new int[] { 14, 21, 16, 35, 22 };

		int nums[] = new int[] { 5,5,5,5,5 };

		int ans = 0;

		boolean checkFirstEnd = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (((nums[i] + nums[i + 1]) % 2 == 0)) {
				ans++;
				i++;

			} else if (i == 0) {
				checkFirstEnd = true;
			}

		}

		if (checkFirstEnd) {
			if (((nums[0] + nums[nums.length - 1]) % 2 == 0)) {
				ans++;
			}

		}

		System.out.println(ans);

	}
}