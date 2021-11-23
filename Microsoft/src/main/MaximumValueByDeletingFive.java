package main;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MaximumValueByDeletingFive {

	public static void main(String[] args) {

		int number = 645645;

		String numberInString = Integer.toString(number);

		List<Integer> indexesOfFive = new ArrayList<>();

		for (int i = 0; i < numberInString.length(); i++) {
			if (numberInString.charAt(i) == '5') {
				indexesOfFive.add(i);
			}
		}

		TreeSet<Integer> allPossileValues = new TreeSet<>();

		for (Integer integer : indexesOfFive) {

			StringBuilder stringBuilder = new StringBuilder(numberInString);

			stringBuilder.deleteCharAt(integer);

			allPossileValues.add(Integer.parseInt(stringBuilder.toString()));

		}

		System.out.println(allPossileValues.last());
	}

}
