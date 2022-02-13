package main;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MaxSingleDigitInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -6, -91, 1011, -100, 84, -22, 0, 1, 473 };

		List<Integer> list = Arrays.stream(a).boxed().filter((n) -> Math.abs(n) < 10).collect(Collectors.toList());
		
		TreeSet<Integer> set = new TreeSet<Integer>(list);
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		;

	}

}
