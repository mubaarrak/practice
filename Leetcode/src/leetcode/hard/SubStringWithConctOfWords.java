package leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWithConctOfWords {

	public static void main(String[] args) {

		for (Integer temp : findSubstring("barfoothefoobarman", new String[] { "bar", "foo" })) {

			System.out.print(temp);

		}

	}

	public static List<Integer> findSubstring(String s, String[] words) {

		if (s == null || s.trim().isBlank() || words == null || words.length == 0) {
			return new ArrayList<>();
		}

		int totalWordsLength = words[0].length() * words.length;

		Arrays.sort(words);
	

		return null;

	}

}
