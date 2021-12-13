package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println(threeSum(arr));

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums != null && nums.length >= 3) {
			Arrays.sort(nums); // Sort the original array
			for (int i = 0; i < nums.length - 2; i++) {
				if (i > 0 && nums[i] == nums[i - 1]) { // Skip duplicated first number
					continue;
				}
				int low = i + 1;
				int high = nums.length - 1;
				while (low < high) {
					int sum = nums[low] + nums[high] + nums[i];
					if (nums[low] + nums[high] + nums[i] == 0) {
						result.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while (low < high && nums[low] == nums[low + 1]) { // Skip duplicated second number
							low++;
						}
						while (low < high && nums[high] == nums[high - 1]) { // Skip duplicated third number
							high--;
						}
						low++;
						high--;
					} else if (sum < 0) {
						low++;
					} else {
						high--;
					}
				}
			}
		}
		return result;
	}

}
