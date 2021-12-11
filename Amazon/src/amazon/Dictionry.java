package amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dictionry {

	public static void main(String[] args) {
		String[][] dictionary = { { "Banana", "Mango" }, { "Cat", "Dog" } };

		String firstString = "I Love Banana";
		String secondString = "I Love Mango";

		System.out.println(checkForEqualiity(firstString, secondString, dictionary));

	}

	private static boolean checkForEqualiity(String firstString, String secondString, String[][] dictionary) {

		if (firstString == null || secondString == null)
			return false;

		Map<String, Set<String>> dictionaryMap = new HashMap<>();

		for (int i = 0; i < dictionary.length; i++) {

			Set<String> similarValue = new HashSet<>();

			for (int j = 0; j < dictionary[i].length; j++) {
				similarValue.add(dictionary[i][j]);
			}

			for (String string : similarValue) {
				dictionaryMap.put(string, similarValue);
			}

		}

		String[] firstStringArray = firstString.split(" ");

		String[] secondStringArray = secondString.split(" ");

		if (firstStringArray.length != secondStringArray.length) {
			return false;
		}

		boolean finalAnswer = false;

		for (int i = 0; i < firstStringArray.length; i++) {

			if (firstStringArray[i].equals(secondStringArray[i])) {
				finalAnswer = true;
				continue;
			} else {

				if (dictionaryMap.containsKey(firstStringArray[i])) {
					Set<String> dictionaryValues = dictionaryMap.get(firstStringArray[i]);

					if (dictionaryValues.contains(secondStringArray[i])) {
						finalAnswer = true;
						continue;
					} else {
						return false;
					}
				} else {
					return false;
				}

			}
		}

		return finalAnswer;
	}

}
