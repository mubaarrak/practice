package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		longestCommonPrefix(new String[] { "aa", "aa" });

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length <= 0)
			return "";

		Set<String> possibleSubStrings = new HashSet<>();

		String pivot = strs[0];

		for (int i = 1; i <= pivot.length(); i++) {
			possibleSubStrings.add(pivot.substring(0, i));
		}

		String answer = "";

		for (String string : possibleSubStrings) {
			boolean flag = false;
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].startsWith(string)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if (flag) {
				answer = string.length() > answer.length() ? string : answer;
			}

		}

		return answer;

	}

}
