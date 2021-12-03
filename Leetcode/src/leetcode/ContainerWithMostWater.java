package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] arr = {1,8,6,2,5,4,8,3,7};

		System.out.println(maxArea(arr));

	}

	public static int maxArea(int[] height) {

		int start = 0;
		int end = height.length-1;

		int ans = 0;

		while (start < end) {
			ans = Math.max(ans, Math.min(height[start], height[end]) * (end - start));

			if (height[start] < height[end])
				start++;
			else
				end--;
		}

		return ans;

	}

}
