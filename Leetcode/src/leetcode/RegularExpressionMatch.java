package leetcode;

public class RegularExpressionMatch {

	public static void main(String[] args) {

		System.out.println(isMatch("aa", "a*"));

	}

	public static boolean isMatch(String s, String p) {

		return s.matches(p);

	}

}
