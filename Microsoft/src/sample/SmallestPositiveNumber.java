package sample;

import java.util.TreeSet;

public class SmallestPositiveNumber {

	public static void main(String... arr1) {

		int[] arr = { -1, -3 };

		System.out.println(solution(arr));

	}

	public static int solution(int[] a) {

		TreeSet<Integer> allNumberSet = new TreeSet<>();

		for (int i : a) {
			allNumberSet.add(i);

		}

		for (int i = 1; i < allNumberSet.last(); i++) {
			if (!allNumberSet.contains(i)) {
				return i;
			}

		}

		return allNumberSet.last() + 1 <= 0 ? 1 : allNumberSet.last() + 1;

	}

}
