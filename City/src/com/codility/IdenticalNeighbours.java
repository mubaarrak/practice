package com.codility;

import java.util.*;

/*https://leetcode.com/discuss/interview-question/525986/Microsoft-or-OA-2020-or-Return-strings-that-donot-contain-identical-neighbors
*/


public class IdenticalNeighbours {
	public static String[] solution(int N, int K) {
		if (N == 0) {
			return new String[] { "" };
		}
		ArrayList<String> result = new ArrayList<String>();
		for (String p : solution(N - 1, K)) {  // Origional was K-1
			for (char l : new char[] { 'a', 'b', 'c' }) {
				int pLen = p.length();
				if (pLen == 0 || p.charAt(pLen - 1) != l) {
					result.add(p + l);
				}
			}
		}
		int prefSize = Math.min(result.size(), K);
		return result.subList(0, prefSize).toArray(new String[prefSize]);
	}

	public static void main(String... args) {

		for (String string : solution(2, 4)) {
			System.out.println(string);
		}

	}

}
