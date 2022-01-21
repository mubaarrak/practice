package com.codility;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 6, 7, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (Integer item : set) {
			System.out.println(item);
		}

	}

}
