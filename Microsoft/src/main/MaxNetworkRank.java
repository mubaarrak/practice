package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNetworkRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3");

	}

	public int solution(int[] A, int[] B, int N) {
		// write your code in Java SE 8

		List<Integer> starts = Arrays.stream(A).boxed().collect(Collectors.toList());
		List<Integer> ends = Arrays.stream(B).boxed().collect(Collectors.toList());

		int[] edgeCount = new int[N];
		int m = starts.size();
		int maxRank = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			edgeCount[starts.get(i) - 1]++;
			edgeCount[ends.get(i) - 1]++;
		}

		for (int i = 0; i < m; i++) {
			int rank = edgeCount[starts.get(i) - 1] + edgeCount[ends.get(i) - 1] - 1;
			if (rank > maxRank) {
				maxRank = rank;
			}
		}

		return maxRank;
	}

}
