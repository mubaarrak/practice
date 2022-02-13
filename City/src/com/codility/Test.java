package com.codility;

public class Test {
	public static void main(String[] args) {

		int temp[] = { 0, 1, 1, 1, 0, 1, 1, 1, 0, 1 };

		System.out.println(solution(temp));

	}

	static int solution(int[] A) {
		 int n = A.length;
	        int i = n - 1;
	        int result = -1;
	        int k = 0, maximal = 0;
	        while (i > 0) {
	            if (A[i] == 1) {
	                k = k + 1;
	                if (k >= maximal) {
	                    maximal = k;
	                    result = i;
	                }
	            }
	            else
	                k = 0;
	            i = i - 1;
	        }
	        if (A[i] == 1 && k + 1 > maximal)
	            result = 0;
	        return result;
	}
}
