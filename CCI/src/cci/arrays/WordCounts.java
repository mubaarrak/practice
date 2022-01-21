package cci.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordCounts {

	public static void main(String[] args) {

		Map<String, Integer> map = getCountsOfWords("Abc xyz Abc");

		map.forEach((K, V) -> {
			System.out.println(K + " : " + V);
		});
		

	}

	private static Map<String, Integer> getCountsOfWords(String str) {

		Map<String, Integer> map = new HashMap<>();

		if (Objects.isNull(str)) {
			return map;
		}

		String arr[] = str.split(" ");
		
		for (String string : arr) {

			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}

		}

		return map;
	}

}
